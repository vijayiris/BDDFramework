package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import PageObject.POLaunchingAmazonApp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinations{
	

	public static WebDriver driver  = new ChromeDriver();
	POLaunchingAmazonApp launchAmazonAppObj = new POLaunchingAmazonApp(driver);
	

	
	@Given("User Hit Amazon Url")
	public void user_hit_amazon_url() {
		//launchAmazonAppObj = new POLaunchingAmazonApp(driver);
		launchAmazonAppObj.user_hit_amazon_url();
	}

	@Then("Amazon Application is Open")
	public void amazon_application_is_open() {
		launchAmazonAppObj.amazon_application_is_open();
	}
	
	@Then("User Verify Page Header")
	public void user_verify_page_header() {
	 System.out.println("Landed on Login Page");
	}
	
	@Then("User Enters LoginID")
	public void user_enters_login_id() {
		launchAmazonAppObj.user_enters_login_id();
	}
	@Then("User Enters Password")
	public void user_enters_password() throws InterruptedException {
		launchAmazonAppObj.user_enters_password();
	}
	@Then("User verifies the Home Page")
	public void user_verifies_the_home_page() {
		launchAmazonAppObj.user_verifies_the_home_page();
	}

}
