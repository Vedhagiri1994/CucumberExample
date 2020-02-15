package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksClass {
	
	//WebDriver driver;
	
	@Given("^Thanos has the Infinity Stones$")
	public void thanos_has_the_Infinity_Stones() throws Throwable {
		System.out.println("Thanos has the Infinity Stones");
		/*System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");  */
	}

	@When("^Thonos snaps his fingers$")
	public void thonos_snaps_his_fingers() throws Throwable {
	    System.out.println("Thonos snaps his fingers");
	}

	@Then("^Half of the living things died$")
	public void half_of_the_living_things_died() throws Throwable {
		System.out.println("Half of the living things died");
	    
	}


}
