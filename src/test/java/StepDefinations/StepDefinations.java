package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinations {

	static WebDriver driver;
	
	@Given("User Hit Amazon Url")
	public void user_hit_amazon_url() {
	  ChromeOptions co = new ChromeOptions();
	  co.setBrowserVersion("122");
      driver = new ChromeDriver(co);
      driver.manage().window().maximize();
      driver.get("https://www.amazon.in/");
	}

	@Then("Amazon Application is Open")
	public void amazon_application_is_open() {
	  String  url = driver.getCurrentUrl();
	  System.out.println("Current Page URL"  +url);
	  driver.quit();
	}
	
	@Then("User Verify Page Header")
	public void user_verify_page_header() {
	 System.out.println("Landed on Login Page");
	}

}
