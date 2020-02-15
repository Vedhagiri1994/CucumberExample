package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {

	WebDriver driver;
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user is enters the valid username and password$")
	public void user_is_enters_the_valid_username_and_password() throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	   
	}

	@Then("^The user should be navigate to home page$")
	public void the_user_should_be_navigate_to_home_page() throws Throwable {
	
		boolean status = driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
		Assert.assertTrue(status);
	}

}
