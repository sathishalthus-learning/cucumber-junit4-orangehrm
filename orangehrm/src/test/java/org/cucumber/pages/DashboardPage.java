package org.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	
	private static DashboardPage dashboardPageInstance;
	
	private DashboardPage() {
		
	}
	
	public static DashboardPage getInstance() {
		if(dashboardPageInstance==null) {
			dashboardPageInstance=new DashboardPage();
		}
		return dashboardPageInstance;
	}
	
	@FindBy(tagName = "h6")
	private static WebElement headerTitle;
	
	public String getHeaderTitle() {
		return headerTitle.getText();
		
	}
}
