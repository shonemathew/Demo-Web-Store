package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    static
    {
        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\Shone\\Desktop\\Demo Web Shop\\Code\\DemoWebShop\\src\\test\\resources\\config.properties");

            prop = new Properties();

            prop.load(fis);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key)
    {
        return prop.getProperty(key);
    }
}

