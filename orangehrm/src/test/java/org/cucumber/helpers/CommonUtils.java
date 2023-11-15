package org.cucumber.helpers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.cucumber.drivers.DriverFactory;
import org.cucumber.pages.DashboardPage;
import org.cucumber.pages.HomePage;
import org.openqa.selenium.support.PageFactory;

public class CommonUtils {
	
	public static void loadProperties() {
		//
		FileReader reader=null;
		//
		try {
			reader = new FileReader("src/test/resources/config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//
		Properties properties = new Properties();
		try {
			properties.load(reader);
		} catch (Exception e) {		
			e.printStackTrace();
		}
		//
		AppConstants.BROWSER_NAME = properties.getProperty("browser");
		System.out.println("Browser Selected is : "+ AppConstants.BROWSER_NAME);
		
	}

	public static void initPages() {
		System.out.println("Initializing Pages...");
		PageFactory.initElements(DriverFactory.getBrowser(), HomePage.getInstance());
		PageFactory.initElements(DriverFactory.getBrowser(), DashboardPage.getInstance());
	}
}
