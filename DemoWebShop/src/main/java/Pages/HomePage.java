package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import Utilities.WaitUtils;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(linkText = "Register")
    WebElement registerLink;

    @FindBy(linkText = "Log out")
    WebElement logoutLink;

    public void clickLogin()
    {
        WaitUtils.ElementClickable(driver, loginLink);
        loginLink.click();
    }

    public void clickRegister()
    {
        WaitUtils.ElementClickable(driver, registerLink);
        registerLink.click();
    }
    public void clickLogout()
    {
        WaitUtils.ElementClickable(driver, logoutLink);
        logoutLink.click();
    }
}
