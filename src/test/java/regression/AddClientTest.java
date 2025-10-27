package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddClient;
import pages.Login;
import pages.Menu;
import util.DoLogin;

import static util.ConfigReader.*;


public class AddClientTest extends DoLogin {


    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setClientName("John");
        addClient.setClientSurname("Doe");
        addClient.setLanguage("English");
        addClient.setStreetAddress1("123 Park Avenue");
        addClient.setStreetAddress2("Suite 101");
        addClient.setCity("Pune");
        addClient.setState("Maharashtra");
        addClient.setZipCode("411001");
        addClient.setCountry("France");
        addClient.setGender("Female");
        addClient.setBirthdate("05-Sep-1985");
        addClient.setPhoneNumber("0201234567");
        addClient.setFaxNumber("0209876543");
        addClient.setMobileNumber("9876543210");
        addClient.setEmailAddress("john.doe@test.com");
        addClient.setWebAddress("www.johndoe.com");

        addClient.setVatId("GSTIN12345");
        addClient.setTaxCode("TX001");

        addClient.clickSave();
    }

}
