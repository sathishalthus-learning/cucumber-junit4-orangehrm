package org.cucumber.drivers;

import org.cucumber.helpers.AppConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	private static WebDriver webDriver=null;
	
	private static void invokeDriver() {
		System.out.println("INITIALIZING WEBDRIVER...");
		
		switch(AppConstants.BROWSER_NAME) {
		case "chrome":
			webDriver = new ChromeDriver();break;
		default: System.out.println("invalid browser");
		}

	}
	
	public static WebDriver getBrowser() {
		System.out.println("GETTING WEBDRIVER...");
		if(webDriver==null) {
			invokeDriver();
		}
		return webDriver;
	}

}
