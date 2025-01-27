package utils.Helper;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name = "loginCredentials")
    public Object[][] credentials() {
        return new Object[][] {
                {"test@user1.com"},
                {"test@user2.com"},
                {"test@user3.com"}
        };
    }
}

