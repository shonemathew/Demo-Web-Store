package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Pages.HomePage;
import Utilities.ConfigReader;
import Utilities.ListenerUtils;
import Utilities.WaitUtils;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeSuite
    public void setup()
    {
        driver = new ChromeDriver();
        ListenerUtils.driver = driver;
        driver.manage().window().maximize();
    	WaitUtils.Implicit(driver);
        driver.get(ConfigReader.getProperty("url"));
    }

    @AfterSuite
    public void teardown()
    {
        HomePage home = new HomePage(driver);
        home.clickLogout();
    	WaitUtils.Implicit(driver);
        driver.quit();
    }
}
