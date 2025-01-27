package QA_APP.BaseClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import static utils.DesiredCaps.SamsungA32;
import static utils.DesiredCaps.emulator;

public class TestBase {
    public static AndroidDriver driver;
    public static DesiredCapabilities caps;

    FileInputStream fis;
    public Properties testData;
    String testData_filepath = "src/test/java/utils/testdata.properties";

    public TestBase() {
        loadPropFile();
    }

    public void loadPropFile() {
        testData = new Properties();
        try {
            fis = new FileInputStream( testData_filepath );
            testData.load( fis );
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    @BeforeClass
    public void setup() {

        String device = testData.getProperty("device2");
        if(device.equals("samsungA32")) {
            System.out.println("Samsung A32 is starting...");
            SamsungA32();
        }else if(device.equals("emulator")) {
            System.out.println("Emulator is starting...");
            emulator();
        }

        try {
            driver = new AndroidDriver( new URL( "http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(40));
        } catch ( MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void sleep(int seconds) {
        try{
            Thread.sleep(seconds * 1000L);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public WebDriverWait waitForElement(int seconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(seconds));
    }
    public void clearField(WebElement el) {
        el.clear();
    }

    @AfterClass
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }

}
