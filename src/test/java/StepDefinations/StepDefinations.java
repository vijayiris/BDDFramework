package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinations {

	static WebDriver driver;
	
	@Given("User Hit Amazon Url")
	public void user_hit_amazon_url() {
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.amazon.in/");
	}

	@Then("Amazon Application is Open")
	public void amazon_application_is_open() {
	  String  url = driver.getCurrentUrl();
	  System.out.println("Current Page URL"  +url);
	  driver.quit();
	}

}
