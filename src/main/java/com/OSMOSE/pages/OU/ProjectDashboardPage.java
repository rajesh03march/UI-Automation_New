package com.OSMOSE.pages.OU;

import com.OSMOSE.base.Page;


public class ProjectDashboardPage extends Page {
	Page p = new Page();

	public void clickPDNavigation() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread12000"))));
		click("ProjectDashboardMenu_XPATH");
	}

	public void clickPDCard() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread12000"))));
		click("PDCard_XPATH");
	
	
}
	public void navigateToOncor() throws InterruptedException {
		click("ProjectGroupMenu_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("PDOncor_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("PDOncorDistribution_XPATH");
	}
}