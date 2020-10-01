package com.OSMOSE.pages.OU;

import com.OSMOSE.base.Page;

public class oCalcProPage extends Page{
	
	public void clickOnOU360() throws InterruptedException {
		Thread.sleep(1000);
		ClickActions("OcalcOsmoseLogo_XPATH");
	}
	
	public void clickoCalcNavigation() {
		click("OcalcNavigation_XPATH");		
	}
	
	public void clickoCalcCard() {
		click("OcalcCard_XPATH");	
	}
	
	public void clickLearnMore() {
		click("GetStartedLearnMoreLink_XPATH");
	}
	
	public void click30daysTrialBtn() {
		click("GetStarted30DaysBtn_XPATH");
	}
	
	public void clickRequestDemoTrialBtn() {
		click("GetStartedReqDemo_XPATH");
	}
	
	public void clickContactoCalcSupportLink() {
		click("GetStartedContactOcalcPro_XPATH");
	}
	
	public void clickProducts() {
		click("OcalcProductsCard_XPATH");
	}

	public void clickRequestLicenseQuote() {
		click("ProductsRequestLicense_XPATH");
	}
	
	public void clickRequestCVTQuote() {
		click("ProductsRequestCVT_XPATH");
	}
	
	public void clickRequestTrainingQuote() {
		click("ProductsRequestPrivate_XPATH");
	}
	
	public void clickKnowledgeBase() {
		click("OcalcKnowledgeBaseCard_XPATH");
	}
	
	public void RequestLicenseProductQuoteSubmission() throws InterruptedException {
		Thread.sleep(1000);
		selectbyindex("oCalProductSizeDD_XPATH", 1);
		click("oCalProductEnterQuantity_XPATH");
		clear("oCalProductEnterQuantity_XPATH");
		type("oCalProductEnterQuantity_XPATH", "8");
		click("oCalProductAddButton_XPATH");
		click("oCalProductViewCartButton_XPATH");
		click("oCalProductSubmitQuoteReqBtn_XPATH");
		click("oCalProductSubmitBtn_XPATH");
		click("oCalProductSubmittedCloseBtn_XPATH");
	}
	
	public void RequestCVTProductQuoteSubmission() throws InterruptedException {
		Thread.sleep(1000);
		selectbyindex("oCalProductSizeDD_XPATH", 1);
		click("oCalProductEnterQuantity_XPATH");
		clear("oCalProductEnterQuantity_XPATH");
		type("oCalProductEnterQuantity_XPATH", "8");
		click("oCalProductAddButton_XPATH");
		click("oCalProductViewCartButton_XPATH");
		click("oCalProductSubmitQuoteReqBtn_XPATH");
		click("oCalProductSubmitBtn_XPATH");
		click("oCalProductSubmittedCloseBtn_XPATH");
	}
	
	public void RequestTrainingProductQuoteSubmission() throws InterruptedException {
		Thread.sleep(1000);
		selectbyindex("oCalProductSizeDD_XPATH", 1);
		click("oCalProductEnterQuantity_XPATH");
		clear("oCalProductEnterQuantity_XPATH");
		type("oCalProductEnterQuantity_XPATH", "8");
		click("oCalProductAddButton_XPATH");
		click("oCalProductViewCartButton_XPATH");
		click("oCalProductSubmitQuoteReqBtn_XPATH");
		click("oCalProductSubmitBtn_XPATH");
		click("oCalProductSubmittedCloseBtn_XPATH");
	}
	
	public void clickoCalcProLogoForLicensedUser() {
		click("oCalProLogoForLicensedUser_XPATH");
	}
	
	public void click30daysTrialBtnLicensedUser() {
		click("Tutorial30DaysBtn_XPATH");
	}
	
	public void clickRequestDemoTrialBtnLicensedUser() {
		click("TutorialReqDemo_XPATH");
	}
	
	public void clickContactoCalcSupportLinkLicensedUser() {
		click("TutorialContactOcalcPro_XPATH");
	}

}
