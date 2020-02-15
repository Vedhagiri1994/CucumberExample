package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefWithData {
	
	WebDriver driver;
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	   
	}

	@When("^user is enters the valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_is_enters_the_valid_credentials_and(String userName, String passWord) throws Throwable {
		    driver.findElement(By.id("txtUsername")).sendKeys(userName);
		    driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		
	}

	@When("^clicks the login button$")
	public void clicks_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	    
	}

	@Then("^The user should see the home page$")
	public void the_user_should_see_the_home_page() throws Throwable {
		boolean status = driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
		Assert.assertTrue(status);
	   
	}

}
