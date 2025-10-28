package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;

public class Conversion {

    public static String getCountry(String countryShort)
    {
        LinkedHashMap<String, String> countries = new LinkedHashMap<>();

        countries.put("IN", "India");
        countries.put("US", "United States");
        countries.put("UK", "United Kingdom");
        countries.put("CA", "Canada");
        countries.put("AU", "Australia");
        countries.put("NZ", "New Zealand");
        countries.put("SG", "Singapore");
        countries.put("AE", "United Arab Emirates");
        countries.put("SA", "Saudi Arabia");
        countries.put("JP", "Japan");
        countries.put("CN", "China");
        countries.put("KR", "South Korea");
        countries.put("DE", "Germany");
        countries.put("FR", "France");
        countries.put("IT", "Italy");
        countries.put("ES", "Spain");
        countries.put("NL", "Netherlands");
        countries.put("SE", "Sweden");
        countries.put("NO", "Norway");
        countries.put("CH", "Switzerland");
        countries.put("BR", "Brazil");
        countries.put("MX", "Mexico");
        countries.put("ZA", "South Africa");
        countries.put("RU", "Russia");
        countries.put("ID", "Indonesia");
        countries.put("DZ", "Algeria");

        return  countries.get(countryShort);

    }

    public static String getGender(String genderId)
    {
        LinkedHashMap<String, String> gender = new LinkedHashMap<>();

        gender.put("0","Male");
        gender.put("1","Female");
        gender.put("2","Other");

        return gender.get(genderId);

    }


    public static String convertDate(String dbDateStr) throws ParseException // 2025-10-14 - yyyy-MM-dd
    {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dbDateStr);

        // 14-Oct-2025 - dd-MMM-yyyy ( Note: check your pattern & use it accordingly)

        return  new SimpleDateFormat("dd-MMM-yyyy").format(date);
    }
}
