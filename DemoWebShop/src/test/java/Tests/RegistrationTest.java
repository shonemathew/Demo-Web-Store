package Tests;

import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.HomePage;
import Pages.RegistrationPage;
import Utilities.DataProviders;
import Utilities.TestData;

	

	public class RegistrationTest extends BaseTest {

		@Test(dataProvider = "registrationData", dataProviderClass = DataProviders.class)
	    public void registerTest(String firstName, String lastName, String email, String password) {
	        Pages.HomePage home = new HomePage(driver);

	        home.clickRegister();

	        RegistrationPage register = new RegistrationPage(driver);

//	        String email = "user" + System.currentTimeMillis() + "@gmail.com";
//	        String password = "user" + System.currentTimeMillis();
//	        
	        register.register(firstName, lastName, email, password, password);
	        
	        home.clickLogout();
	        
	        TestData.email = email;
	        TestData.password = password;

	    }
	}


