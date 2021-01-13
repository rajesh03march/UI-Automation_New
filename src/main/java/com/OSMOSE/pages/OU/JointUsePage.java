package com.OSMOSE.pages.OU;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.OSMOSE.base.Page;

public class JointUsePage extends Page {

	Page p = new Page();
	Actions actions = new Actions(Page.driver);

	public void clickOnOU360() throws InterruptedException {
		ClickActions("JuOsmoseLogo_XPATH");
	}

	public void clickJUNavigation() {
		click("JUNavigation_XPATH");
	}

	public void clickJUCard() {
		click("JUCard_XPATH");
	}

	public void AddWiredNewAttachment(String AppName, String township, String Structures, String Cables)
			throws Exception {

		for (int i = 0; i <= 18; i++) {
			actions.sendKeys(Keys.TAB).build().perform();
		}
		type("CreateApplicationName_XPATH", AppName);
		
		for (int j = 0; j <= 2; j++) {
			actions.sendKeys(Keys.TAB).build().perform();
		}
		actions.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		actions.sendKeys(Keys.ENTER).build().perform();
		actions.sendKeys(Keys.TAB).build().perform();
		type("Township_XPATH", township);
		
		for (int j = 0; j < 2; j++) {
			actions.sendKeys(Keys.TAB).build().perform();
		}
		type("NoOfStructure_XPATH", Structures);
		
		for (int j = 0; j < 3; j++) {
			actions.sendKeys(Keys.TAB).build().perform();
		}
		type("CableStrandName_XPATH", Cables);
		
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		click("RequiredSketchesChkBx_XPATH");
		ClickActions("JUUploadbtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Runtime.getRuntime().exec("C:\\Users\\AC38373\\Downloads\\AutoITScripts\\JUNewApplication.exe");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("SaveAndSubmitBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		System.out.println("The saved application number is: " + Page.getText("ApplicationNumber_XPATH"));
	}
	
	public void navigateToColombiapit() throws InterruptedException {
		click("ProjectGroupMenu_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("JUCityOfColumbia_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("JUColombiapit_XPATH");
	}
	
	public void saveChanges() throws Exception {
		Page.click("ApplicationName_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.type("AgreementNumber_XPATH", "123");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("RequiredSketchesChkBx_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("ActionsBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("SaveChanges_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
	}
	
	public void acceptChanges() throws Exception {
		Page.click("ActionsBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("Accept_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("JUAcceptFileSelection_XPATH");
		Page.click("JUAcceptBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
	}
}
