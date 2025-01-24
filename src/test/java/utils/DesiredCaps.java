package utils;

import QA_APP.BaseClasses.TestBase;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DesiredCaps extends TestBase {

    public static void emulator() {
        caps = new DesiredCapabilities();
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("app", System.getProperty("user.dir") + "/src/test/resources/QAtestbuild22ndJan.apk");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "uiautomator2");
    }

    public static void SamsungA32() {
        caps = new DesiredCapabilities();
        caps.setCapability("udid", "RZ8T30532KZ");
        caps.setCapability("app", System.getProperty("user.dir") + "/src/test/resources/QAtestbuild22ndJan.apk");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "uiautomator2");
    }
}
