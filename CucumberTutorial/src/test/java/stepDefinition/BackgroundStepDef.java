package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundStepDef {
	
	@Given("^The Student finished high school$")
	public void the_Student_finished_high_school() throws Throwable {
	   System.out.println("The Student finished high school");
	}

	@Given("^the student finished higher secondary$")
	public void the_student_finished_higher_secondary() throws Throwable {
	   System.out.println("the student finished higher secondary"); 
	}

	@Given("^the Student applied for the medical cource$")
	public void the_Student_applied_for_the_medical_cource() throws Throwable {
	   System.out.println("the Student applied for the medical cource");
	}

	@When("^the student cleared the entrance exam$")
	public void the_student_cleared_the_entrance_exam() throws Throwable {
	   System.out.println("the student cleared the entrance exam");
	}

	@Then("^the student is eligible for joining any medical institute$")
	public void the_student_is_eligible_for_joining_any_medical_institute() throws Throwable {
	    System.out.println("the student is eligible for joining any medical institute");
	}

	@Given("^the Student applied for the Engineering cource$")
	public void the_Student_applied_for_the_Engineering_cource() throws Throwable {
	    System.out.println("the Student applied for the Engineering cource");
	}

	@When("^the student has a sayable cut off$")
	public void the_student_has_a_sayable_cut_off() throws Throwable {
	    System.out.println("the student has a sayable cut off");
	}

	@Then("^the student is eligible for joining any Engineering institute$")
	public void the_student_is_eligible_for_joining_any_Engineering_institute() throws Throwable {
	   System.out.println("the student is eligible for joining any Engineering institute");
	}



}
