package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithExamples {
	
	WebDriver driver;
	
	@Given("^Procced to login page$")
	public void procced_to_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^User enter \"([^\"]*)\" and passWord \"([^\"]*)\"$")
	public void user_enter_and_passWord(String userName, String passWord) throws Throwable {
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);   
	}

	@When("^clicked button$")
	public void clicked_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}


}
