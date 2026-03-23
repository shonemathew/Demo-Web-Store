package Tests;

	import org.testng.annotations.Test;
	import Base.BaseTest;
	import Pages.HomePage;
	import Pages.LoginPage;
import Utilities.TestData;

	public class LoginTest extends BaseTest {

	    @Test
	    public void loginTest()
	    {
	        HomePage home = new HomePage(driver);

	        home.clickLogin();

	        LoginPage login = new LoginPage(driver);

	        login.login(TestData.email,TestData.password);
	        
	                
	    }
	}


