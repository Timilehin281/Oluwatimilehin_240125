package QA_APP.Pages;

import QA_APP.BaseClasses.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {
    public LoginPage(AndroidDriver driver) {
        super( driver );
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wemabank.alat.office.alat_qa_test:id/email_input\")")
    private WebElement emailField;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wemabank.alat.office.alat_qa_test:id/password_input\")")
    private WebElement passwordField;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wemabank.alat.office.alat_qa_test:id/loginBtn\")")
    private WebElement loginBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wemabank.alat.office.alat_qa_test:id/text_input_password_toggle\")")
    private WebElement viewPassword;
    @AndroidFindBy(accessibility = "Navigate up")
    private WebElement backBtn;


    public void enterEmail(String email) {
        sendKeys(emailField, email);
    }

    public void enterPassword(String password) {
        sendKeys(passwordField, password);
    }

    public void clickLoginBtn() {
        click(loginBtn);
    }
}
