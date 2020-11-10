package com.OSMOSE.pages.OU;

import com.OSMOSE.base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class oCalcProPage extends Page {

	Page p = new Page();

	public void clickOnOU360() throws InterruptedException {
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
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		selectbyindex("oCalProductSizeDD_XPATH", 1);
		click("oCalProductEnterQuantity_XPATH");
		clear("oCalProductEnterQuantity_XPATH");
		type("oCalProductEnterQuantity_XPATH", "8");
		click("oCalProductAddButton_XPATH");
		click("oCalProductViewCartButton_XPATH");
		click("oCalProductSubmitQuoteReqBtn_XPATH");
		click("oCalProductSubmitBtn_XPATH");
		Page.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='btn btnMidBlue btn-link' and text()='CLOSE']")));
		click("oCalProductSubmittedCloseBtn_XPATH");
	}

	public void RequestCVTProductQuoteSubmission() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		selectbyindex("oCalProductSizeDD_XPATH", 1);
		click("oCalProductEnterQuantity_XPATH");
		clear("oCalProductEnterQuantity_XPATH");
		type("oCalProductEnterQuantity_XPATH", "8");
		click("oCalProductAddButton_XPATH");
		click("oCalProductViewCartButton_XPATH");
		click("oCalProductSubmitQuoteReqBtn_XPATH");
		click("oCalProductSubmitBtn_XPATH");
		Page.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='btn btnMidBlue btn-link' and text()='CLOSE']")));
		click("oCalProductSubmittedCloseBtn_XPATH");
	}

	public void RequestTrainingProductQuoteSubmission() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		selectbyindex("oCalProductSizeDD_XPATH", 1);
		click("oCalProductEnterQuantity_XPATH");
		clear("oCalProductEnterQuantity_XPATH");
		type("oCalProductEnterQuantity_XPATH", "8");
		click("oCalProductAddButton_XPATH");
		click("oCalProductViewCartButton_XPATH");
		click("oCalProductSubmitQuoteReqBtn_XPATH");
		click("oCalProductSubmitBtn_XPATH");
		Page.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='btn btnMidBlue btn-link' and text()='CLOSE']")));
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

	public void DifferentProductQuoteSubmission() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		selectbyindex("oCalProductSizeDD_XPATH", 1);
		click("oCalProductEnterQuantity_XPATH");
		clear("oCalProductEnterQuantity_XPATH");
		type("oCalProductEnterQuantity_XPATH", "8");
		click("oCalProductAddButton_XPATH");
		click("oCalProductViewCartButton_XPATH");
		click("oCalProductContinueShoppingBtn_XPATH");
		scrollbyjavaexecutor();
		click("oCalPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		click("oCalPoleRestorationProduct_XPATH");
		selectbyindex("oCalProductSizeDD_XPATH", 1);
		click("oCalProductEnterQuantity_XPATH");
		clear("oCalProductEnterQuantity_XPATH");
		type("oCalProductEnterQuantity_XPATH", "8");
		click("oCalProductAddButton_XPATH");
		click("oCalProductViewCartButton_XPATH");
		click("oCalProductSubmitQuoteReqBtn_XPATH");
		click("oCalProductSubmitBtn_XPATH");
	}

	public void OcalProductQuoteSubmission() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		selectbyindex("oCalProductSizeDD_XPATH", 1);
		click("oCalProductEnterQuantity_XPATH");
		clear("oCalProductEnterQuantity_XPATH");
		type("oCalProductEnterQuantity_XPATH", "8");
		click("oCalProductAddButton_XPATH");
		click("oCalProductViewCartButton_XPATH");
		click("oCalProductSubmitQuoteReqBtn_XPATH");
		click("oCalProductSubmitBtn_XPATH");
	}

	public void clickSubmitWithQuotedStatus() throws Exception {
		click("oCalAdmin_XPATH");
		click("oCalManageQuotes_XPATH");
		Page.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@col-id='quoteId' and @aria-colindex='1']/a)[1]")));
		click("oCalFirstQuote_XPATH");
		selectbyindex("oCalManageQuoteStatus_XPATH", 2);
		click("oCalManageQuoteBrowse_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Runtime.getRuntime().exec("C:\\Users\\AC38373\\Downloads\\AutoITScripts\\ManageQuoteUpload.exe");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		click("oCalManageQuoteUploadBtn_XPATH");
		click("oCalManageQuoteSubmitBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread25000"))));
		//Page.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='heading']//a[@class='btnLink']")));
		click("oCalManageQuoteBackBtn_XPATH");
	}

	public void clickMyQuotes() {
		click("oCalMyQuotesBtn_XPATH");
	}

	public void clickPayWithCreditCard() {
		Page.click("oCalApprovalPayWithCCBtn_XPATH");
	}
	
	public void clickIhaveCopiedMyReceiptChkBox() {
		Page.click("OcalApprovalReceiptTxt_XPATH");
	}
	
	public void ClickApprove() {
		type("oCalpasteReceiptdetailsTextArea_XPATH","Automation Testing");
		type("oCalApprovalAndTxtBox_XPATH","123");
		type("oCalApprovalOrTxtBox_XPATH","123");
		click("oCalApprovalApproveBtn_XPATH");
	}
	
	public void NonOcalcProductQuoteSubmission() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		scrollbyjavaexecutor();
		click("oCalPoleRestoration_XPATH");
		click("oCalPoleRestorationProduct_XPATH");
		selectbyindex("oCalProductSizeDD_XPATH", 1);
		click("oCalProductEnterQuantity_XPATH");
		clear("oCalProductEnterQuantity_XPATH");
		type("oCalProductEnterQuantity_XPATH", "8");
		click("oCalProductAddButton_XPATH");
		click("oCalProductViewCartButton_XPATH");
		click("oCalProductSubmitQuoteReqBtn_XPATH");
		click("oCalProductSubmitBtn_XPATH");
		Page.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='btn btnMidBlue btn-link' and text()='CLOSE']")));
		click("oCalProductSubmittedCloseBtn_XPATH");
	}
	
	public void clickCurrentPublicClasses() {
		click("TrainingCurrent_XPATH");
	}
	
	public void clickRequestQuoteForPrivateTrainingClasses() {
		click("TrainingRequestQuote_XPATH");
	}
	
	public void clickFAQ() {
		click("TutorialFAQ_XPATH");
	}
	
	public void clickSubmitIssue() {
		click("TutorialSubmitIssue_XPATH");
	}
	
	public void clickBoxCloseBtn() {
		click("ocalBoxCloseBtn_XPATH");
	}
	
	public void clickocalOnAVideo() {
		ClickActions("ocalVideosVideoClick_XPATH");
	}
	
	public void clickocalOnASeeMoreVideo() {
		ClickActions("ocalVideosSeeMoreVideoClick_XPATH");
	}
	
	public void clickocalOnADocument() {
		ClickActions("ocalDocumentsDocument_XPATH");
	}
	
	public void clickocalOnASeeMoreDocument() {
		ClickActions("ocalDocumentSeeMoreDocumentClick_XPATH");
	}
	
	public void clickKBTrainingVideos() {
		click("KBTraining_XPATH");
	}
	
	public void clickKBWikiPage() {
		click("KBWikiPage_XPATH");
	}
	
	public void clickOCalcProIntroduction() {
		click("OCalcIntroduction_XPATH");
	}
	
	public void clickLicenseManagement() {
		click("LicensedUserLicenseManagementCard_XPATH");
	}
	
	public void clickLicenseTransferBtn() {
		type("TransferPopUpFirstName_XPATH","First");
		type("TransferPopUpLastName_XPATH","Last");
		type("TransferPopUpEmail_XPATH","email@gmail.com");
		type("TransferPopUpPhone_XPATH","1234567890");
		click("TransferPopUpTransferBtn_XPATH");
	}
	
	public void RenewProductQuoteSubmission() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("oCalProductAddButton_XPATH");
		click("oCalProductViewCartButton_XPATH");
		click("oCalProductSubmitQuoteReqBtn_XPATH");
	}

}
