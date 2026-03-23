package Pages;




	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.*;

	import Utilities.WaitUtils;

	public class LoginPage {

	    WebDriver driver;

	    public LoginPage(WebDriver driver)
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(id="Email")
	    WebElement email;

	    @FindBy(id="Password")
	    WebElement password;

	    @FindBy(xpath="//input[@value='Log in']")
	    WebElement loginButton;

	    public void login(String userEmail, String userPassword)
	    {
	        WaitUtils.VisibilityofElement(driver, email);
	        email.sendKeys(userEmail);
	        WaitUtils.VisibilityofElement(driver, password);
	        password.sendKeys(userPassword);
	        WaitUtils.ElementClickable(driver, loginButton);
	        loginButton.click();

	    }
	}



