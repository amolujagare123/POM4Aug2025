package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class UIUtil {

    public static boolean  checkAvailability(WebElement element)
    {

        boolean result = false;
        try {
            result = element.isDisplayed();
        }
        catch (Exception e)
        {

        }
        return result;
    }

    public static boolean  checkEnability(WebElement element)
    {

        boolean result = false;
        try {
            result = element.isEnabled();
        }
        catch (Exception e)
        {

        }
        return result;
    }


    public static String  checkSpelling(WebElement element)
    {

        String result = "";
        try {
            result = element.getText();
        }
        catch (Exception e)
        {

        }
        return result;
    }

    public static String  checkWatermark(WebElement element)
    {

        String result = "";
        try {
            result = element.getAttribute("placeholder");
        }
        catch (Exception e)
        {

        }
        return result;
    }

    public static String  checkStyle(WebElement element,String cssProperty)
    {

        String result = "";
        try {
            result = element.getCssValue(cssProperty);
        }
        catch (Exception e)
        {

        }
        return result;
    }

    public static String checkColor(WebElement element,String colorProperty)
    {
        String rgbColor = checkStyle(element, colorProperty);

        return  Color.fromString(rgbColor).asHex().toUpperCase();
    }

}
