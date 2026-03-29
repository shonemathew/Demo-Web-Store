package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.ProductPage;
import Utilities.FakerUtils;
import Utilities.RetryAnalyzer;

public class ProductTest extends BaseTest {

	    @Test(retryAnalyzer = RetryAnalyzer.class)
	    public void productTest()
	    {
	    	
	    	ProductPage product = new ProductPage(driver);
	    	
	    	String city = FakerUtils.getCity();
	        String address = FakerUtils.getFullAddress();
	        String zipcode = FakerUtils.getZipCode();
	        String phone = FakerUtils.getPhoneNumber();
	        
	    	product.product(city, address, zipcode, phone);
	    	
	    }
}
