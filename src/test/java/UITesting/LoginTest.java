package UITesting;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenUrl;

import static util.UIUtil.*;

public class LoginTest extends OpenUrl {

    Login login;

    @BeforeClass
    public void init() {
        login = new Login(driver);
    }

    @Test
    public void checkTxtUsernameAvailability() {
        boolean expected = true;
        boolean actual = false;
        try {
            actual = login.txtUsername.isDisplayed();
        } catch (Exception e) {

        }
        Assert.assertEquals(actual, expected, "element not available");
    }

    @Test
    public void checkTxtPasswordAvailability() {
        boolean expected = true;
        boolean actual = checkAvailability(login.txtPassword);
        Assert.assertEquals(actual, expected, "element not available");

    }

    @Test
    public void checkTxtPasswordEnability() {
        boolean expected = true;
        boolean actual = checkEnability(login.txtPassword);
        Assert.assertEquals(actual, expected, "element not enabled");

    }


    @Test
    public void checkLblEmailSpelling() {
        String expected = "Email";
        String actual = checkSpelling(login.lblEmail);
        Assert.assertEquals(actual, expected, "wrong spelling");

    }

    @Test
    public void checkTxtUsernameWatermark() {
        String expected = "Email";
        String actual = checkWatermark(login.txtUsername);
        Assert.assertEquals(actual, expected, "wrong watermark");

    }

    @Test
    public void checkLblEmailFontSize() {
        String expected = "14px";
        String actual = checkStyle(login.lblEmail,"font-size");
        Assert.assertEquals(actual, expected, "wrong font size");

    }

    @Test
    public void checkLblEmailFontFamily() {
        String expected = "-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";
        String actual = checkStyle(login.lblEmail,"font-family");
        Assert.assertEquals(actual, expected, "wrong font-family");

    }

    @Test
    public void checkBtnLoginColor() {
        String expected = "#2C8EDD";
        String actual = checkColor(login.btnLogin,"background-color");
        Assert.assertEquals(actual, expected, "wrong background-color");

    }

}