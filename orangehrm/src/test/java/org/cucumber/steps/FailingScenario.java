package org.cucumber.steps;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class FailingScenario {
	
	@Given("given a scenario")
	public void given_a_scenario() {
	    //
		System.out.println("Scenario is given");
	}

	@When("execute a scenario")
	public void execute_a_scenario() {
	    //
		System.out.println("Executing scenario");
	}

	@Then("validate scenario fails")
	public void validate_scenario_fails() {
	    // 
		Assert.fail();
	}

}
