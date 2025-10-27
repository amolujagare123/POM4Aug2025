package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.Login;
import util.OpenUrl;

import static util.ConfigReader.getUrl;

public class ForgotPasswordTest extends OpenUrl {

    @Test
    public void forgotPasswordTest()
    {

        Login login = new Login(driver);
        login.clickForgotPassword();

        ForgotPassword forgotPassword = new ForgotPassword(driver);
        forgotPassword.seEmail("amol@gmail.com");
        forgotPassword.clickReset();



    }
}
