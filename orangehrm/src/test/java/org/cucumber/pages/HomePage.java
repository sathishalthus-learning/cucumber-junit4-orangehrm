package org.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	private static HomePage HomePageInstance;
	
	private HomePage() {
		
	}
	
	public static HomePage getInstance() {
		if(HomePageInstance==null) {
			HomePageInstance=new HomePage();
		}
		return HomePageInstance;
	}
	
	@FindBy(name="username")
	private static WebElement userName;
	
	@FindBy(name="password")
	private static WebElement passWord;
	
	@FindBy(tagName = "button")
	private static WebElement loginButton;
	
	public void loginWithValidCredentials() {
		userName.sendKeys("Admin");
		passWord.sendKeys("admin123");
		loginButton.click();
	}
}
