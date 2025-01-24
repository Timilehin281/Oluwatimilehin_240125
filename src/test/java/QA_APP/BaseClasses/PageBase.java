package QA_APP.BaseClasses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {

    private final AndroidDriver driver;

    public PageBase(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this );
        this.driver = driver;
    }

    public WebDriverWait waitForElement(int seconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(seconds));
    }

    public void click(WebElement el) {
        waitForElement(40).until(ExpectedConditions.elementToBeClickable(el));
        el.click();
    }

    public void sendKeys(WebElement el, String text) {
        waitForElement(40).until(ExpectedConditions.visibilityOf(el));
        el.sendKeys(text);
    }


}
