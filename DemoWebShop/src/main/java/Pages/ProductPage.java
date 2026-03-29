package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utilities.WaitUtils;

public class ProductPage {

	
	WebDriver driver;

    public ProductPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")
    WebElement books;

    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
    WebElement Add_to_cart;

    @FindBy(xpath="//*[@id=\"topcartlink\"]/a/span[1]")
    WebElement Cart;

    @FindBy(id="termsofservice")
	WebElement termsofservice;

    @FindBy(id="checkout")
    WebElement Checkout;

    @FindBy(xpath="//*[@id=\"BillingNewAddress_CountryId\"]/option[99]")
    WebElement Country;

    @FindBy(id="BillingNewAddress_City")
    WebElement City;

    @FindBy(id="BillingNewAddress_Address1")
    WebElement Address;

    @FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement Zipcode;

    @FindBy(id="BillingNewAddress_PhoneNumber")
    WebElement Phone;
    
    @FindBy(xpath="//*[@id=\"billing-buttons-container\"]/input")
    WebElement ShippingBilling;
    
    @FindBy(xpath="//*[@id=\"shipping-buttons-container\"]/input")
    WebElement ShippingAddress;
    
    @FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/input")
    WebElement ShippingMethod;
    
    @FindBy(xpath="//*[@id=\"payment-method-buttons-container\"]/input")
    WebElement PaymentMethod;
    
    @FindBy(xpath="//input[@class=\"button-1 payment-info-next-step-button\"]")    
    WebElement PaymentInfo;
    
    @FindBy(xpath="//*[@id=\"confirm-order-buttons-container\"]/input")
    WebElement ConfirmOrder;
    
    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")
    WebElement Continue;
    
 
    @Test
    public void product(String city, String address, String zipcode, String phone)
    {
    	
        WaitUtils.ElementClickable(driver, books);
        books.click();

        WaitUtils.ElementClickable(driver, Add_to_cart);
        Add_to_cart.click();

        WaitUtils.ElementClickable(driver, Cart);
        Cart.click();

        WaitUtils.ElementClickable(driver, termsofservice);
        termsofservice.click();

        WaitUtils.ElementClickable(driver, Checkout);
        Checkout.click();
        
        WaitUtils.ElementClickable(driver, Country);
        Country.click();
        
        WaitUtils.VisibilityofElement(driver, City);
        City.sendKeys(city);
        
        WaitUtils.VisibilityofElement(driver, Address);
        Address.sendKeys(address);
        
        WaitUtils.VisibilityofElement(driver, Zipcode);
        Zipcode.sendKeys(zipcode);
        
        WaitUtils.VisibilityofElement(driver, Phone);
        Phone.sendKeys(phone);

        WaitUtils.ElementClickable(driver, ShippingBilling);
        ShippingBilling.click();

        WaitUtils.ElementClickable(driver, ShippingAddress);
        ShippingAddress.click();
        
        WaitUtils.ElementClickable(driver, ShippingMethod);
        ShippingMethod.click();

        WaitUtils.ElementClickable(driver, PaymentMethod);
        PaymentMethod.click();

        WaitUtils.ElementClickable(driver, PaymentInfo);
        PaymentInfo.click();
        
        WaitUtils.ElementClickable(driver, ConfirmOrder);
        ConfirmOrder.click();
        
        WaitUtils.ElementClickable(driver, Continue);
        Continue.click();
        
    }
}
