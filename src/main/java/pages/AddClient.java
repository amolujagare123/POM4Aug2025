package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {

    WebDriver driver;

    // Constructor
    public AddClient(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ---------------- PERSONAL INFORMATION ----------------
    @FindBy(id = "client_name")
    private WebElement txtClientName;

    @FindBy(id = "client_surname")
    private WebElement txtClientSurname;

    // ---------------- ADDRESS INFORMATION ----------------
    @FindBy(id = "client_address_1")
    private WebElement txtStreetAddress1;

    @FindBy(id = "client_address_2")
    private WebElement txtStreetAddress2;

    @FindBy(id = "client_city")
    private WebElement txtCity;

    @FindBy(id = "client_state")
    private WebElement txtState;

    @FindBy(id = "client_zip")
    private WebElement txtZipCode;

    // ---------------- CONTACT INFORMATION ----------------
    @FindBy(id = "client_phone")
    private WebElement txtPhoneNumber;

    @FindBy(id = "client_fax")
    private WebElement txtFaxNumber;

    @FindBy(id = "client_mobile")
    private WebElement txtMobileNumber;

    @FindBy(id = "client_email")
    private WebElement txtEmailAddress;

    @FindBy(id = "client_web")
    private WebElement txtWebAddress;

    // ---------------- TAX INFORMATION ----------------
    @FindBy(id = "client_vat_id")
    private WebElement txtVatId;

    @FindBy(id = "client_tax_code")
    private WebElement txtTaxCode;

    // ---------------- BUTTONS ----------------
    @FindBy(id = "btn-submit")
    private WebElement btnSave;

    // -------- Drop downs ----------

    @FindBy(id="select2-client_language-container")
    WebElement containerLanguage;
    @FindBy(xpath = "//input[@aria-label='Search']")
    WebElement search;

    public void setLanguage(String language)
    {
        containerLanguage.click();
        search.sendKeys(language);
        search.sendKeys(Keys.ENTER);
    }
    @FindBy(xpath = "//span[@id='select2-client_country-container']")
    WebElement countryContainer;

    public void setCountry(String country)
    {
        countryContainer.click();
        search.sendKeys(country);

        driver.findElement(By.xpath("//li[normalize-space()='"+country+"']")).click();

    }

    @FindBy(xpath = "//span[@id='select2-client_gender-container']") 
    WebElement genderContainer;

    public void setGender(String country)
    {
        genderContainer.click();
        driver.findElement(By.xpath("//li[normalize-space()='"+country+"']")).click();

    }

    @FindBy(xpath = "//input[@id='client_birthdate']")
    WebElement txtBirthdate;

    public void setBirthdate(String birthdate)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','"+birthdate+"')",txtBirthdate);
    }

    // ---------------- ACTION METHODS ----------------

    // Personal Information
    public void setClientName(String name) {
        txtClientName.sendKeys(name);
    }

    public void setClientSurname(String surname) {
        txtClientSurname.sendKeys(surname);
    }

    // Address
    public void setStreetAddress1(String address1) {
        txtStreetAddress1.sendKeys(address1);
    }

    public void setStreetAddress2(String address2) {
        txtStreetAddress2.sendKeys(address2);
    }

    public void setCity(String city) {
        txtCity.sendKeys(city);
    }

    public void setState(String state) {
        txtState.sendKeys(state);
    }

    public void setZipCode(String zip) {
        txtZipCode.sendKeys(zip);
    }

    // Contact Info
    public void setPhoneNumber(String phone) {
        txtPhoneNumber.sendKeys(phone);
    }

    public void setFaxNumber(String fax) {
        txtFaxNumber.sendKeys(fax);
    }

    public void setMobileNumber(String mobile) {
        txtMobileNumber.sendKeys(mobile);
    }

    public void setEmailAddress(String email) {
        txtEmailAddress.sendKeys(email);
    }

    public void setWebAddress(String web) {
        txtWebAddress.sendKeys(web);
    }

    // Tax Info
    public void setVatId(String vatId) {
        txtVatId.sendKeys(vatId);
    }

    public void setTaxCode(String taxCode) {
        txtTaxCode.sendKeys(taxCode);
    }

    // Save button
    public void clickSave() {
        btnSave.click();
    }
}
