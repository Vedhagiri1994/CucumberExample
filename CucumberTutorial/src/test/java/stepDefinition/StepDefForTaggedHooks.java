package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefForTaggedHooks {
	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable {
		System.out.println("This is the First step");
	    
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
		System.out.println("This is the Second step");
	   
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
		System.out.println("This is the Third step");
	    
	}

}
