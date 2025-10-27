package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import static util.ConfigReader.getUrl;

public class OpenUrl {

    public static WebDriver driver;

    @BeforeClass
    public void openUrl() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());
    }

    /*public static WebDriver getDriver() {
        return driver;
    }*/
}
