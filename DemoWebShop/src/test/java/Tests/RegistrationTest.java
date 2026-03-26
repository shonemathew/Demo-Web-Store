package Tests;

import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.HomePage;
import Pages.RegistrationPage;
import Utilities.FakerUtils;
import Utilities.RetryAnalyzer;
import Utilities.TestData;

	

	public class RegistrationTest extends BaseTest {

		//@Test(dataProvider = "registrationData", dataProviderClass = DataProviders.class)
		
//	    public void registerTest(String firstName, String lastName, String email, String password) {
		
		
		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void registerTest() {
	        Pages.HomePage home = new HomePage(driver);

	        home.clickRegister();

	        RegistrationPage register = new RegistrationPage(driver);

//	        String email = "user" + System.currentTimeMillis() + "@gmail.com";
//	        String password = "user" + System.currentTimeMillis();
	        
	        String fname = FakerUtils.getFirstName();
	        String lname = FakerUtils.getLastName();
	        String email = FakerUtils.getEmail();
	        String password = FakerUtils.getPassword();
	        String confirmPassword = FakerUtils.getConfirmPassword(password);

//	        register.register(fname, lname, email, password, confirmPassword);
	        
	        register.register(fname, lname, email, password, password);
	        
	        home.clickLogout();
	        
	        TestData.email = email;
	        TestData.password = password;

	    }
	}

	
	

