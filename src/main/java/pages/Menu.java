package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {

    public Menu(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Dashboard")
    public WebElement menuDashboard;

    @FindBy(xpath = "//span[text()='Clients']")
    public WebElement menuClients;

    @FindBy(xpath = "//span[text()='Quotes']")
    public WebElement menuQuotes;

    // ---------------- CLIENTS SUB-MENUS ----------------
    @FindBy(xpath = "//a[contains(@href,'clients/form')]")
    public WebElement subAddClient;

    @FindBy(xpath = "//a[contains(@href,'clients/index')]")
    public WebElement subViewClients;

    // ---------------- QUOTES SUB-MENUS ----------------
    @FindBy(xpath = "//a[contains(@class,'create-quote')]")
    public WebElement subCreateQuote;

    @FindBy(xpath = "//a[contains(@href,'quotes/index')]")
    public WebElement subViewQuotes;

    // 1️⃣ Click Dashboard directly
    public void clickDashboard() {
        menuDashboard.click();
    }


    // 3️⃣ Click Add Client submenu (opens after clicking main menu)
    public void clickAddClient() {
        menuClients.click();     // expand dropdown
        subAddClient.click();    // click submenu
    }

    // 4️⃣ Click View Clients submenu
    public void clickViewClients() {
        menuClients.click();
        subViewClients.click();
    }

    // 5️⃣ Click Create Quote submenu
    public void clickCreateQuote() {
        menuQuotes.click();
        subCreateQuote.click();
    }

    // 6️⃣ Click View Quotes submenu
    public void clickViewQuotes() {
        menuQuotes.click();
        subViewQuotes.click();
    }
}
