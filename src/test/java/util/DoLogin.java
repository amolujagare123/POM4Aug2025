package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.Login;

import static util.ConfigReader.*;

public class DoLogin extends OpenUrl {


    @BeforeClass
    public void doLogin()
    {
        Login login = new Login(driver);
        login.setUsername(getUsername());
        login.setPassword(getPassword());
        login.clickLogin();
    }
}
