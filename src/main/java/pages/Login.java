package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
   /* WebDriver driver;
    WebElement element = driver.findElement(By.id("email"));*/

    @FindBy (id="email")
    WebElement txtUsername;

    @FindBy (id="password")
    WebElement txtPassword;

    @FindBy(xpath = "//button")
    WebElement btnLogin;

    @FindBy(xpath = "//a[normalize-space()='I forgot my password']")
    WebElement forgotPassword;

    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setUsername(String username)
    {
        txtUsername.sendKeys(username);
    }

    public void setPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }

    public void clickForgotPassword()
    {
        forgotPassword.click();
    }


}
