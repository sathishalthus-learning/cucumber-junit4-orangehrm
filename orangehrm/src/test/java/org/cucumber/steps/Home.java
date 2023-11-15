package org.cucumber.steps;

import java.time.Duration;

import org.cucumber.drivers.DriverFactory;
import org.cucumber.pages.DashboardPage;
import org.cucumber.pages.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class Home {
	
	public WebDriver driver=DriverFactory.getBrowser();
	
	@Given("user navigated to homepage")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("given level");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@When("provides login credentials")
	public void i_complete_action() throws InterruptedException {
		System.out.println("when level");	
		HomePage.getInstance().loginWithValidCredentials();
		Thread.sleep(Duration.ofSeconds(5));
	}

	@Then("validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("then level");
		Assert.assertTrue(DashboardPage.getInstance().getHeaderTitle().contains("Dashboard"));
	}

}
