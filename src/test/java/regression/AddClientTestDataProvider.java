package regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AddClient;
import pages.Menu;
import util.DoLogin;

import java.io.IOException;

import static util.ForDataProvider.getMyData;

public class AddClientTestDataProvider extends DoLogin {


    @Test(dataProvider = "getData")
    public void addClientTest(
            String clientName,
            String clientSurname,
            String language,
            String streetAddress1,
            String streetAddress2,
            String city,
            String state,
            String zipCode,
            String country,
            String gender,
            String birthdate,
            String phoneNumber,
            String faxNumber,
            String mobileNumber,
            String emailAddress,
            String webAddress,
            String vatId,
            String taxCode,
            String expected,
            String xpathActual

    ) {

        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setClientName(clientName);
        addClient.setClientSurname(clientSurname);
        addClient.setLanguage(language);
        addClient.setStreetAddress1(streetAddress1);
        addClient.setStreetAddress2(streetAddress2);
        addClient.setCity(city);
        addClient.setState(state);
        addClient.setZipCode(zipCode);
        addClient.setCountry(country);
        addClient.setGender(gender);
        addClient.setBirthdate(birthdate);
        addClient.setPhoneNumber(phoneNumber);
        addClient.setFaxNumber(faxNumber);
        addClient.setMobileNumber(mobileNumber);
        addClient.setEmailAddress(emailAddress);
        addClient.setWebAddress(webAddress);
        addClient.setVatId(vatId);
        addClient.setTaxCode(taxCode);

        addClient.clickSave();


        String actual = "";

        try {
            actual = driver.findElement(By.xpath(xpathActual)).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected);
    }

    @DataProvider
    Object[][] getData() throws IOException {
        return getMyData("Data/Client_DataProvider.xlsx","Sheet1");
    }

}
