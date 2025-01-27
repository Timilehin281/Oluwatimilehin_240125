package QA_APP.Tests;

import QA_APP.BaseClasses.TestBase;
import QA_APP.Pages.LoginPage;
import QA_APP.Pages.WelcomePage;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static utils.extentReports.ExtentTestManager.startTest;

public class LoginTest extends TestBase {
    WelcomePage welcomePage;
    LoginPage loginPage;

    public void initializer() {
        welcomePage = new WelcomePage(driver);
        loginPage = new LoginPage(driver);
    }
    @Test(priority = 1, description = "Validate that user can login with valid credentials")
    public void verify_user_can_login_successfully_wth_first_email(Method method) {
        startTest(method.getName(), method.getAnnotation(Test.class).description(), "Login");
        initializer();
        welcomePage.clickLoginBtn();
        loginPage.enterEmail(testData.getProperty("email1"));
        loginPage.enterPassword( testData.getProperty("password"));
        loginPage.clickLoginBtn();
    }

    @Test(priority = 2, description = "Validate that user can login with valid credentials")
    public void verify_user_can_login_successfully_wth_second_email(Method method) {
        startTest(method.getName(), method.getAnnotation(Test.class).description(), "Login");
        initializer();
        welcomePage.clickLoginBtn();
        loginPage.enterEmail(testData.getProperty("email2"));
        loginPage.enterPassword( testData.getProperty("password"));
        loginPage.clickLoginBtn();
    }

    @Test(priority = 3, description = "Validate that user can login with valid credentials")
    public void verify_user_can_login_successfully_wth_third_email(Method method) {
        startTest(method.getName(), method.getAnnotation(Test.class).description(), "Login");
        initializer();
        welcomePage.clickLoginBtn();
        loginPage.enterEmail(testData.getProperty("email3"));
        loginPage.enterPassword( testData.getProperty("password"));
        loginPage.clickLoginBtn();
    }
}
