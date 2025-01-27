package QA_APP.Pages;

import QA_APP.BaseClasses.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class WelcomePage extends PageBase {
    public WelcomePage(AndroidDriver driver) {
        super( driver );
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wemabank.alat.office.alat_qa_test:id/loginBtn\")")
    private WebElement loginBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wemabank.alat.office.alat_qa_test:id/gettingStartedBtn\")")
    private WebElement getStartedBtn;


    public void clickLoginBtn() {
        click(loginBtn);
    }
}
