package com.OSMOSE.pages.OU;

import com.OSMOSE.base.Page;

public class JointUsePage extends Page{
	
	Page p = new Page();

	public void clickOnOU360() throws InterruptedException {
		ClickActions("JuOsmoseLogo_XPATH");
	}

	public void clickJUNavigation() {
		click("JUNavigation_XPATH");
	}

	public void clickJUCard() {
		click("JUCard_XPATH");
	}


}
