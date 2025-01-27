package QA_APP.Pages;

import QA_APP.BaseClasses.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

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
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wemabank.alat.office.alat_qa_test:id/status_btn_text\")")
    private WebElement doneBtn;
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/*/android.widget.TextView")
    private List<WebElement> errorMessages;


    public void enterEmail(String email) {
        sendKeys( emailField, email );
    }

    public void enterPassword(String password) {
        sendKeys( passwordField, password );
    }

    public void clickLoginBtn() {
        click( loginBtn );
    }

    public void clickDone() {
        click( doneBtn );
    }
    public WebElement getDoneBtn() {
        return doneBtn;
    }
    public void clearEmailField() {
        emailField.clear();
    }
    public void clearPasswordField() {
        passwordField.clear();
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }
    public List<WebElement> getErrorMessages() {
        return errorMessages;
    }
}


