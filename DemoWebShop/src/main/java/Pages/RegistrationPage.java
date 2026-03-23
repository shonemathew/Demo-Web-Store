package Pages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.*;
	import org.testng.annotations.Test;
	import Utilities.WaitUtils;

	public class RegistrationPage {


	    WebDriver driver;

	    public RegistrationPage(WebDriver driver)
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(id="gender-male")
	    WebElement gender;

	    @FindBy(id="FirstName")
	    WebElement firstName;

	    @FindBy(id="LastName")
	    WebElement lastName;

	    @FindBy(id="Email")
		public static WebElement email;

	    @FindBy(id="Password")
	    public static WebElement password;

	    @FindBy(id="ConfirmPassword")
	    WebElement confirmPassword;

	    @FindBy(id="register-button")
	    WebElement registerButton;
	    

	    @Test
	    public void register(String fname, String lname, String emailId, String pass, String confirmpass)
	    {
	    	
	        WaitUtils.ElementClickable(driver, gender);
	        gender.click();
	        WaitUtils.VisibilityofElement(driver, firstName);
	        firstName.sendKeys(fname);
	        WaitUtils.VisibilityofElement(driver, lastName);
	        lastName.sendKeys(lname);
	        WaitUtils.VisibilityofElement(driver, email);
	        email.sendKeys(emailId);
	        WaitUtils.VisibilityofElement(driver, password);
	        password.sendKeys(pass);
	        WaitUtils.VisibilityofElement(driver, confirmPassword);
	        confirmPassword.sendKeys(confirmpass);
	        WaitUtils.ElementClickable(driver, registerButton);
	        registerButton.click();
	    }
	}
