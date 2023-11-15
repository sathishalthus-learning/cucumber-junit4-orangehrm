package org.cucumber.hooks;

import java.time.Duration;

import org.cucumber.drivers.DriverFactory;
import org.cucumber.helpers.CommonUtils;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
//import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
//import io.cucumber.java.BeforeAll;

public class AppHooks {
	
	public WebDriver driver;
	
//	@BeforeAll
//	public void beforeAll() {
//		System.out.println("BEFORE ALL...");
//	}
	
	@Before
	public void beforeScenario() {
		System.out.println("BEFORE SCENARIO...");
		CommonUtils.loadProperties();
		driver = DriverFactory.getBrowser();
		CommonUtils.initPages();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("BEFORE STEP...");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("AFTER STEP");
	}
	
	@After
	public void afterScenario() {
		System.out.println("AFTER SCENARIO...");
		driver.quit();
	}
	
//	@AfterAll
//	public void afterAll() {
//		System.out.println("AFTER ALL...");
//	}

}
