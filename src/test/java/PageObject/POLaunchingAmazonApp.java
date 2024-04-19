package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POLaunchingAmazonApp {
	
	public WebDriver driver;
	

	public POLaunchingAmazonApp(WebDriver rDriver)
	{
		this.driver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	
	@FindBy(id="SearchEmail")
	WebElement emailAdd;

	@FindBy(id="search-customers")
	WebElement searchBtn;
	
	@FindBy(id="nav-link-accountList")
	WebElement signInLink;
	
	@FindBy(id="ap_email")
	WebElement emailOrMobileNumberField;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	
	
	
	
	
	public void user_hit_amazon_url() {
		
//		  ChromeOptions co = new ChromeOptions();
//		  co.setBrowserVersion("123");
	   //   driver = new ChromeDriver(co);
	      driver.manage().window().maximize();
	      driver.get("https://www.amazon.in/");
		
	}
	
	public void amazon_application_is_open() {
		
		  String  url = driver.getCurrentUrl();
		  System.out.println("Current Page URL"  +url);
		  //driver.quit();
	}
	
	public void user_enters_login_id() {
		 
		signInLink.click();
		emailOrMobileNumberField.sendKeys("9871374939");
		continueBtn.click();
	}
	
	public void user_enters_password() throws InterruptedException {
		
		password.sendKeys("Pass#word2");
		Thread.sleep(2000);
	}
	
	public void user_verifies_the_home_page() {
		System.out.println("User is on Home Page after login");  
	}
	

}
