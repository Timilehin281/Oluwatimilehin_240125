package QA_APP.Tests;

import QA_APP.BaseClasses.TestBase;
import QA_APP.Pages.LoginPage;
import QA_APP.Pages.WelcomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Helper.DataProviderClass;

import java.lang.reflect.Method;

import static utils.extentReports.ExtentTestManager.startTest;

public class LoginTest extends TestBase {
    WelcomePage welcomePage;
    LoginPage loginPage;
    Logger log = LogManager.getLogger( this );

    public void initializer() {
        welcomePage = new WelcomePage( driver );
        loginPage = new LoginPage( driver );
    }

    @Test(priority = 1, description = "Validate that user can login with valid credentials", dataProviderClass = DataProviderClass.class, dataProvider = "loginCredentials")
    public void verify_user_can_login_successfully_with_email(Method method, String email) {
        startTest( method.getName(), method.getAnnotation( Test.class ).description(), "Login" );

        System.out.println( "The current email is " + email );

        initializer();
        welcomePage.clickLoginBtn();
        loginPage.enterEmail( email );
        loginPage.enterPassword( testData.getProperty( "password" ) );
        loginPage.clickLoginBtn();

        try {
            waitForElement( 10 ).until( ExpectedConditions.visibilityOf( loginPage.getDoneBtn() ) );
            loginPage.clickDone();
//            clearField(loginPage.getEmailField());
//            clearField(loginPage.getPasswordField());
            driver.navigate().back();
            Assert.fail( "The username or password is invalid" );
        } catch (TimeoutException e) {
            log.info( "User is able to log in successfully" );
            System.out.println( "User is able to log in successfully" );
            e.printStackTrace();
        }

    }

    @Test(priority = 2, description = "Validate that user cannot login with blank credentials")
    public void Verify_User_Cannot_login_with_blank_credentials(Method method) {

        startTest( method.getName(), method.getAnnotation( Test.class ).description(), "Login" );

        welcomePage.clickLoginBtn();
        loginPage.enterEmail("");
        loginPage.enterPassword("");
        loginPage.clickLoginBtn();

        for(WebElement errorMessage : loginPage.getErrorMessages()) {
            System.out.println("The is the error message: " + errorMessage.getText());
        }

    }

    //    @Test(priority = 2, description = "Validate that user can login with valid credentials")
    public void verify_user_can_login_successfully_wth_second_email(Method method) {
        startTest( method.getName(), method.getAnnotation( Test.class ).description(), "Login" );
        initializer();
        welcomePage.clickLoginBtn();
        loginPage.enterEmail( testData.getProperty( "email2" ) );
        loginPage.enterPassword( testData.getProperty( "password" ) );
        loginPage.clickLoginBtn();

    }

    //    @Test(priority = 3, description = "Validate that user can login with valid credentials")
    public void verify_user_can_login_successfully_wth_third_email(Method method) {
        startTest( method.getName(), method.getAnnotation( Test.class ).description(), "Login" );
        initializer();
        welcomePage.clickLoginBtn();
        loginPage.enterEmail( testData.getProperty( "email3" ) );
        loginPage.enterPassword( testData.getProperty( "password" ) );
        loginPage.clickLoginBtn();
    }
}
