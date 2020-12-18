package com.OSMOSE.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.ContactPage;
import com.OSMOSE.pages.OU.KnowledgeBasePage;
import com.OSMOSE.pages.OU.OsmoseServicesPage;
import com.OSMOSE.pages.OU.oCalcProPage;

public class oCalcPro_Licensed extends BaseTest {

	Page p = new Page();

	// US-101212-101307-Verify UI and Layout of the O-Calc Pro landing page for
	// Prospective User
	// US-101214-101744-Verify System is displaying O-Cal Pro tile and Menu item in
	// home page
	@Test(priority = 1, enabled = true, description = "Verify the click on oCalcPro menu and card Navigation")
	public void verifyoCalcProNavigationClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.clickoCalcNavigation();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("OcalcProHeaderTxt_XPATH"), "Structural Analysis Software for Utility Poles");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(Page.isVisible("oCalProLogoForLicensedUser_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("OcalcOsmoseLogo_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.clickoCalcCard();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("OcalcProHeaderTxt_XPATH"), "Structural Analysis Software for Utility Poles");
	}

	// US-101213-101344-Verify UI and Layout of the O-Calc Pro landing page for
	// Licensed User
	// US-101213-101345-Verify the Tiles displayed in the O-Calc Pro landing page
	// for Licensed User
	@Test(priority = 2, enabled = true, description = "Verify presence of License Management card on OcalcPro page for Licensed User")
	public void verifyPresenceOfLicenseMgmtCard() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		// License Management presence verification
		Assert.assertTrue(Page.isVisible("LicensedUserLicenseManagementCard_XPATH"));
	}

	// US-101213-101344-Verify UI and Layout of the O-Calc Pro landing page for
	// Licensed User
	// US-101213-101345-Verify the Tiles displayed in the O-Calc Pro landing page
	// for Licensed User
	@Test(priority = 3, enabled = true, description = "Verify presence of Products card on OcalcPro page for Licensed User")
	public void verifyPresenceOfProductsCardLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Products presence verification
		Assert.assertTrue(Page.isVisible("OcalcProductsCard_XPATH"));
	}

	// US-101213-101344-Verify UI and Layout of the O-Calc Pro landing page for
	// Licensed User
	// US-101213-101345-Verify the Tiles displayed in the O-Calc Pro landing page
	// for Licensed User
	@Test(priority = 4, enabled = true, description = "Verify presence of Knowledge Base card on OcalcPro page for Licensed User")
	public void verifyPresenceOfKnowledgeBaseCardLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Knowledge Base presence verification
		Assert.assertTrue(Page.isVisible("OcalcKnowledgeBaseCard_XPATH"));
	}

	// US-101213-101344-Verify UI and Layout of the O-Calc Pro landing page for
	// Licensed User
	// US-101213-101345-Verify the Tiles displayed in the O-Calc Pro landing page
	// for Licensed User
	@Test(priority = 5, enabled = true, description = "Verify presence of Announcements card on OcalcPro page for Licensed User")
	public void verifyPresenceOfAnnouncementsCardLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Announcements presence verification
		Assert.assertTrue(Page.isVisible("OcalcAnnouncementsCard_XPATH"));
	}

	// US-101213-101344-Verify UI and Layout of the O-Calc Pro landing page for
	// Licensed User
	// US-101213-101345-Verify the Tiles displayed in the O-Calc Pro landing page
	// for Licensed User
	@Test(priority = 6, enabled = true, description = "Verify presence of Training Options card on OcalcPro page for Licensed User")
	public void verifyPresenceOfTrainingOptionsCardLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Training Options presence verification
		Assert.assertTrue(Page.isVisible("OcalcTrainingOptionsCard_XPATH"));
	}

	// US-101213-101344-Verify UI and Layout of the O-Calc Pro landing page for
	// Licensed User
	// US-101213-101345-Verify the Tiles displayed in the O-Calc Pro landing page
	// for Licensed User
	@Test(priority = 7, enabled = true, description = "Verify presence of Tutorial, Live Demo & support card on OcalcPro page for Licensed User")
	public void verifyPresenceOfTutorialLiveDemoCardLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Training Options presence verification
		Assert.assertTrue(Page.isVisible("LicensedUserTutorialCard_XPATH"));
	}

	// US-101213-101347-Verify the Content displayed in Training Options Tile for
	// Licensed User O-Calc Pro landing page
	@Test(priority = 8, enabled = true, description = "Verify contents on Training Options card for Licensed User")
	public void verifyContentsOfTrainingOptionsLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Training Options Current Public Presence verification
		Assert.assertTrue(Page.isVisible("TrainingCurrent_XPATH"));
		Assert.assertEquals(Page.getText("TrainingCurrent_XPATH"), "Current Public Classes");
		// Training Options Request Quote Presence verification
		Assert.assertTrue(Page.isVisible("TrainingRequestQuote_XPATH"));
		Assert.assertEquals(Page.getText("TrainingRequestQuote_XPATH"), "Request quote for Private Training class");
	}

	// US-101213-101348-Verify the Content displayed in Product for Licensed User
	// O-Calc Pro landing page
	@Test(priority = 9, enabled = true, description = "Verify contents on Products card for Licensed User")
	public void verifyContentsOfProductsCardLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Request License quote presence verification
		Assert.assertTrue(Page.isVisible("ProductsRequestLicense_XPATH"));
		Assert.assertEquals(Page.getText("ProductsRequestLicense_XPATH"), "Request License Quote");
		// Request CVT quote presence verification
		Assert.assertTrue(Page.isVisible("ProductsRequestCVT_XPATH"));
		Assert.assertEquals(Page.getText("ProductsRequestCVT_XPATH"), "Request CVT Quote");
		// Request Private Training quote presence verification
		Assert.assertTrue(Page.isVisible("ProductsRequestPrivate_XPATH"));
		Assert.assertEquals(Page.getText("ProductsRequestPrivate_XPATH"), "Request Private Training Quote");
	}

	// US-101213-101349-Verify the Content displayed in Knowledge Base Tile for
	// Licensed User O-Calc Pro landing page
	@Test(priority = 10, enabled = true, description = "Verify contents on Knowledge Base card for Licensed User")
	public void verifyContentsOfKBCardLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Training videos presence verification
		Assert.assertTrue(Page.isVisible("KBTraining_XPATH"));
		Assert.assertEquals(Page.getText("KBTraining_XPATH"), "Training Videos");
		// Wiki Page presence verification
		Assert.assertTrue(Page.isVisible("KBWikiPage_XPATH"));
		Assert.assertEquals(Page.getText("KBWikiPage_XPATH"), "Wiki Page");
	}

	// US-101213-101353-Verify the Content displayed in Announcements Tile for
	// Licensed User O-Calc Pro landing page
	@Test(priority = 11, enabled = true, description = "Verify contents on Announcements card for Licensed User")
	public void verifyContentsOfAnnouncementsLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Announcements First Announcement Presence verification
		Assert.assertTrue(Page.isVisible("AnnouncementFirst_XPATH"));
		System.out.println("First Announcement is:" + Page.getText("AnnouncementFirst_XPATH"));
		// Announcements Second Announcement Presence verification
		Assert.assertTrue(Page.isVisible("AnnouncementSecond_XPATH"));
		System.out.println("Second Announcement is:" + Page.getText("AnnouncementSecond_XPATH"));
		// Announcements Show All Button presence
		Assert.assertTrue(Page.isVisible("AnnouncementShowAll_XPATH"));
		Page.click("AnnouncementShowAll_XPATH");
		// Announcements Third Announcement Presence verification
		Assert.assertTrue(Page.isVisible("AnnouncementThird_XPATH"));
		System.out.println("Third Announcement is:" + Page.getText("AnnouncementThird_XPATH"));
		// Announcements Fourth Announcement Presence verification
		Assert.assertTrue(Page.isVisible("AnnouncementFourth_XPATH"));
		System.out.println("Fourth Announcement is:" + Page.getText("AnnouncementFourth_XPATH"));
		// Announcements Fifth Announcement Presence verification
		Assert.assertTrue(Page.isVisible("AnnouncementFifth_XPATH"));
		System.out.println("Fifth Announcement is:" + Page.getText("AnnouncementFifth_XPATH"));
		// Announcements Sixth Announcement Presence verification
		Assert.assertTrue(Page.isVisible("AnnouncementSixth_XPATH"));
		System.out.println("Sixth Announcement is:" + Page.getText("AnnouncementSixth_XPATH"));
		// Announcements Show Less Button presence
		Assert.assertTrue(Page.isVisible("AnnouncementShowLess_XPATH"));
		Page.click("AnnouncementShowLess_XPATH");
	}

	// US-101213-101350-Verify the Content displayed in License Management Tile for
	// Licensed User O-Calc Pro landing page
	@Test(priority = 12, enabled = true, description = "Verify contents on License Management card for Licensed User")
	public void verifyContentsOfLicenseMgmtLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// License Management Active status Presence verification
		Assert.assertTrue(Page.isVisible("oCalProLicenseMgmtActive_XPATH"));
		System.out.println("Active Section: " + Page.getText("oCalProLicenseMgmtActive_XPATH"));
		// License Management Expired status Presence verification
		Assert.assertTrue(Page.isVisible("oCalProLicenseMgmtExpired_XPATH"));
		System.out.println("Expired Section: " + Page.getText("oCalProLicenseMgmtExpired_XPATH"));
		// License Management Expiring Soon status Presence verification
		Assert.assertTrue(Page.isVisible("oCalProLicenseMgmtExpiringSoon_XPATH"));
		System.out.println("Expiring Section: " + Page.getText("oCalProLicenseMgmtExpiringSoon_XPATH"));
		// License Management Active Inactive Presence verification
		Assert.assertTrue(Page.isVisible("oCalProLicenseMgmtInactive_XPATH"));
		System.out.println("Inactive Section: " + Page.getText("oCalProLicenseMgmtInactive_XPATH"));
	}

	// US-101213-101352-Verify the Content displayed in Tutorial, Live Demo &
	// Support Tile for Licensed User O-Calc Pro landing page
	@Test(priority = 13, enabled = true, description = "Verify contents on Tutotial, Live Demo and Support card")
	public void verifyContentsOfTutorialLiveDemoLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// 30 days trial Presence verification
		Assert.assertTrue(Page.isVisible("Tutorial30DaysBtn_XPATH"));
		Assert.assertEquals(Page.getText("Tutorial30DaysBtn_XPATH"), "30 DAY FREE TRIAL");
		// Request Demo presence verification
		Assert.assertTrue(Page.isVisible("TutorialReqDemo_XPATH"));
		Assert.assertEquals(Page.getText("TutorialReqDemo_XPATH"), "REQUEST A LIVE DEMO");
		// FAQ presence verification
		Assert.assertTrue(Page.isVisible("TutorialFAQ_XPATH"));
		Assert.assertEquals(Page.getText("TutorialFAQ_XPATH"), "FAQ");
		// Submit Issue presence verification
		Assert.assertTrue(Page.isVisible("TutorialSubmitIssue_XPATH"));
		Assert.assertEquals(Page.getText("TutorialSubmitIssue_XPATH"), "Submit Issue / Feature Request");
		// Feature Request presence verification
		/*
		 * Assert.assertTrue(Page.driver.findElement(By.
		 * xpath("//a[@id='OCalFeaReqLink' and text()='Feature Request']"))
		 * .isDisplayed());
		 * Assert.assertEquals(Page.getText("TutorialFeatureRequest_XPATH"),
		 * "Feature Request");
		 */
		// Contact O-Calc Pro Support presence verification
		Assert.assertTrue(Page.isVisible("TutorialContactOcalcPro_XPATH"));
		Assert.assertEquals(Page.getText("TutorialContactOcalcPro_XPATH"), "Contact O-Calc Pro Support");
	}

	@Test(priority = 14, enabled = true, description = "Verify click on Products card for Licensed User")
	public void verifyProductsClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickProducts();
		// Verification of header text
		Assert.assertTrue(Page.isVisible("oCalcProductsHeaderTxt_XPATH"));
		Assert.assertEquals(Page.getText("oCalcProductsHeaderTxt_XPATH"), "Pole and Line Products");
		Page.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='projectHeading']//h3[text()='O-Calc Pro']")));
		// Verification of the heading on the products
		Assert.assertTrue(Page.isVisible("oCalcProductsHeadingTxt_XPATH"));
		Assert.assertEquals(Page.getText("oCalcProductsHeadingTxt_XPATH"), "O-Calc Pro");
		// Verification of ocalc-pro License product presence
		Assert.assertTrue(Page.isVisible("ProductsoCalcLicense_XPATH"));
		Assert.assertEquals(Page.getText("ProductsoCalcLicense_XPATH"), "O-Calc License");
		// Verification of ocalc-pro CVT product presence
		Assert.assertTrue(Page.isVisible("ProductsoCalcCVT_XPATH"));
		Assert.assertEquals(Page.getText("ProductsoCalcCVT_XPATH"), "O-Calc CVT");
		// Verification of ocalc-pro Training product presence
		Assert.assertTrue(Page.isVisible("ProductsoCalcTraining_XPATH"));
		Assert.assertEquals(Page.getText("ProductsoCalcTraining_XPATH"), "O-Calc Training");
		Page.driver.navigate().back();
	}

	@Test(priority = 15, enabled = true, description = "Verify click on Request License Quote on Products card and submit quote for Licensed User")
	public void verifyRequestLicenseQuoteClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ocal.clickRequestLicenseQuote();
		Page.wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//div[@class='prdDetailhs2']//h3[text()=' O-Calc License '])[1]")));
		// Verification of header text
		// Thread.sleep((Long.parseLong(p.config.getProperty("Thread25000"))));
		Assert.assertTrue(Page.isVisible("oCalcLicenseTxt_XPATH"));
		Assert.assertEquals(Page.getText("oCalcLicenseTxt_XPATH"), "O-Calc License");
		Assert.assertTrue(Page.isVisible("oCalcLicenseDescription_XPATH"));
		Assert.assertEquals(Page.getText("oCalcLicenseDescription_XPATH"), "O-Calc License description");
		ocal.RequestLicenseProductQuoteSubmission();
		Page.driver.navigate().back();
	}

	@Test(priority = 16, enabled = true, description = "Verify click on Request CVT Quote on Products card and submit quote for Licensed User")
	public void verifyRequestCVTQuoteClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ocal.clickRequestCVTQuote();
		Page.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//div[@class='prdDetailhs2']//h3[text()=' O-Calc CVT '])[1]")));
		// Verification of header text
		Assert.assertTrue(Page.isVisible("oCalcCVTTxt_XPATH"));
		Assert.assertEquals(Page.getText("oCalcCVTTxt_XPATH"), "O-Calc CVT");
		Assert.assertTrue(Page.isVisible("oCalcCVTDescription_XPATH"));
		Assert.assertEquals(Page.getText("oCalcCVTDescription_XPATH"), "O-Calc CVT description");
		ocal.RequestCVTProductQuoteSubmission();
		Page.driver.navigate().back();
	}

	@Test(priority = 17, enabled = true, description = "Verify click on Request Training Quote on Products card and submit quote for Licensed User")
	public void verifyRequestTrainingQuoteClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ocal.clickRequestTrainingQuote();
		Page.wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//div[@class='prdDetailhs2']//h3[text()=' O-Calc Training '])[1]")));
		// Verification of header text
		Assert.assertTrue(Page.isVisible("oCalcRequestTrainingTxt_XPATH"));
		Assert.assertEquals(Page.getText("oCalcRequestTrainingTxt_XPATH"), "O-Calc Training");
		Assert.assertTrue(Page.isVisible("oCalcRequestTrainingDescription_XPATH"));
		Assert.assertEquals(Page.getText("oCalcRequestTrainingDescription_XPATH"), "O-Calc Training description");
		ocal.RequestTrainingProductQuoteSubmission();
		Page.driver.navigate().back();
	}

	@Test(priority = 18, enabled = true, description = "Verify click on 30 days Trial button for Licensed User")
	public void verify30daysbtnClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		ocal.click30daysTrialBtnLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of the Back button
		// WebElement BackBtn =
		// Page.driver.findElement(By.xpath("//a[@id='OCalTrialCloseBtn']"));
		// Assert.assertTrue(BackBtn.isDisplayed());
		// Verification of Back btn text
		// Assert.assertEquals(Page.getText("LicensedUser30daysBackTxt_XPATH"), "Back");
		Page.iFrames(1);
		// Verification of Header text
		Assert.assertEquals(Page.getText("LicensedUser30daysHeaderTxt_XPATH"), "O-Calc® Pro Trial Version");
		// Verification of FirstName field
		Assert.assertTrue(Page.isVisible("30daysFirstName_XPATH"));
		// Verification of LastName field
		Assert.assertTrue(Page.isVisible("30daysLastName_XPATH"));
		// Verification of Company field
		Assert.assertTrue(Page.isVisible("30daysCompany_XPATH"));
		// Verification of Title field
		Assert.assertTrue(Page.isVisible("30daysTitle_XPATH"));
		// Verification of BusinessEmail field
		Assert.assertTrue(Page.isVisible("30daysBusinessEmail_XPATH"));
		// Verification of Phone field
		Assert.assertTrue(Page.isVisible("30daysPhone_XPATH"));
		// Verification of Country field
		Assert.assertTrue(Page.isVisible("30daysCountry_XPATH"));
		// Verification of State field
		Assert.assertTrue(Page.isVisible("30daysState_XPATH"));
		// Verification of RequestTrialBtn button
		Assert.assertTrue(Page.isVisible("30daysRequestTrialBtn_XPATH"));
		Page.driver.switchTo().defaultContent();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		// Page.click("LicensedUser30daysBackBtn_XPATH");
		// Verification of close button
		Assert.assertTrue(Page.isVisible("LicensedUser30daysCloseBtn_XPATH"));
		Page.click("LicensedUser30daysCloseBtn_XPATH");
	}

	@Test(priority = 19, enabled = true, description = "Verify click on Request Demo button for Licensed User")
	public void verifyRequstDemoClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickRequestDemoTrialBtnLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of the Back button
		// WebElement BackBtn =
		// Page.driver.findElement(By.xpath("//a[@id='OCalTrialCloseBtn']"));
		// Assert.assertTrue(BackBtn.isDisplayed());
		// Verification of Back btn text
		// Assert.assertEquals(Page.getText("LicensedUserDemoBackTxt_XPATH"), "Back");
		Page.iFrames(1);
		// Verification of Header text
		Assert.assertEquals(Page.getText("LicensedUserDemoHeaderTxt_XPATH"), "O-Calc® Pro Live Demo");
		// Verification of FirstName field
		Assert.assertTrue(Page.isVisible("DemoFirstName_XPATH"));
		// Verification of LastName field
		Assert.assertTrue(Page.isVisible("DemoLastName_XPATH"));
		// Verification of Company field
		Assert.assertTrue(Page.isVisible("DemoCompany_XPATH"));
		// Verification of Title field
		Assert.assertTrue(Page.isVisible("DemoTitle_XPATH"));
		// Verification of BusinessEmail field
		Assert.assertTrue(Page.isVisible("DemoBusinessEmail_XPATH"));
		// Verification of Phone field
		Assert.assertTrue(Page.isVisible("DemoPhone_XPATH"));
		// Verification of Country field
		Assert.assertTrue(Page.isVisible("DemoCountry_XPATH"));
		// Verification of State field
		Assert.assertTrue(Page.isVisible("DemoState_XPATH"));
		// Verification of RequestTrialBtn button
		Assert.assertTrue(Page.isVisible("DemoRequestTrialBtn_XPATH"));
		Page.driver.switchTo().defaultContent();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Page.click("LicensedUserDemoBackBtn_XPATH");
		// Verification of close button
		Assert.assertTrue(Page.isVisible("LicensedUserDemoCloseBtn_XPATH"));
		Page.click("LicensedUserDemoCloseBtn_XPATH");
	}

	@Test(priority = 20, enabled = true, description = "Verify click on Contact O-calc Support for Licensed User")
	public void verifyocalcSupportClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickContactoCalcSupportLinkLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of header text
		Assert.assertTrue(Page.isVisible("oCalcProContactUsHeaderTxt_XPATH"));
		Assert.assertEquals(Page.getText("oCalcProContactUsHeaderTxt_XPATH"), "Contact Us");
		// Verification of Default value on subject field
		String defaultValue = Page.getdefaultValuefromdropdown("oCalcProContactUsFormSubjectdd_XPATH");
		Assert.assertEquals(defaultValue, "O-Calc Pro Support");
		Page.click("oCalcProContactUscloseBtn_XPATH");
		// Page.driver.navigate().back();
	}

	@Test(priority = 21, enabled = true, description = "Verify adding OcalPro and other products to cart and quote submission")
	public void verifyDifferentProductsQuoteCreate() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickRequestLicenseQuote();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='projectHeading']//h3[text()='O-Calc Pro']")));
		ocal.DifferentProductQuoteSubmission();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(Page.getText("oCalProductQuoteSubmittedPopup_XPATH"), "Quote Request Submitted");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("oCalProductSubmittedCloseBtn_XPATH");
		Page.driver.navigate().back();
	}

	@Test(priority = 22, enabled = true, description = "Verify presence of Credit Card details")
	public void verifyPresenceOfCreditCardOptions() throws Exception {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		ocal.clickRequestLicenseQuote();
		// Thread.sleep((Long.parseLong(p.config.getProperty("Thread15000"))));
		Page.wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//div[@class='prdDetailhs2']//h3[text()=' O-Calc License '])[1]")));
		// Verification of header text for O-calc Products
		Assert.assertEquals(Page.getText("oCalcLicenseTxt_XPATH"), "O-Calc License");
		Assert.assertEquals(Page.getText("oCalcLicenseDescription_XPATH"), "O-Calc License description");
		ocal.OcalProductQuoteSubmission();
		// Thread.sleep((Long.parseLong(p.config.getProperty("Thread25000"))));
		Page.wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//h5[@id='quoteSubmitted___BV_modal_title_' and text()='Quote Request Submitted']")));
		Assert.assertEquals(Page.getText("oCalProductQuoteSubmittedPopup_XPATH"), "Quote Request Submitted");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("oCalProductSubmittedCloseBtn_XPATH");
		ocal.clickSubmitWithQuotedStatus();
		ocal.clickMyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread25000"))));
		Page.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@id='Approve' and text()='APPROVE'])[1]")));
		Page.click("oCalMyQuotesApproveBtn_XPATH");
		// Verification of Pay with Credit Card Button
		Assert.assertTrue(Page.isVisible("oCalApprovalPayWithCCBtn_XPATH"));
		Assert.assertEquals(Page.getText("oCalApprovalPayWithCCBtn_XPATH"), "PAY WITH CREDIT CARD");
		// Verification of 'I have copied my Receipt' Checkbox and text
		Assert.assertEquals(Page.getText("OcalApprovalReceiptTxt_XPATH"), "I have copied my receipt");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("oCalApprovalCloseBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		ocal.clickOnOU360();
	}

	@Test(priority = 23, enabled = true, dependsOnMethods = "verifyPresenceOfCreditCardOptions", description = "Verify click on Pay with Credit Card button")
	public void verifyClickOnPaywithCCBtn() throws Exception {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("ProCard_XPATH");
		ocal.clickMyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread25000"))));
		Page.click("oCalMyQuotesApproveBtn_XPATH");
		ocal.clickPayWithCreditCard();
		// Verification of Pay be Credit card Steps pop-up
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertEquals(Page.getText("oCalPayCCStepsHeaderTxt_XPATH"), "Pay By Credit Card Steps");
		Assert.assertTrue(Page.isVisible("oCalPayCCMakePymtBtn_XPATH"));
		Assert.assertEquals(Page.getText("oCalPayCCMakePymtBtn_XPATH"), "MAKE PAYMENT");
	}

	@Test(priority = 24, enabled = true, dependsOnMethods = "verifyPresenceOfCreditCardOptions", description = "Verify click on Make Payment button and close pop-up")
	public void verifyClickMakePaymentBtn() throws Exception {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("oCalPayCCMakePymtBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.closeTab(1);
		ocal.switchToparentWindow();
		ocal.clickPayWithCreditCard();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("oCalPayCCCloseBtn_XPATH");

	}

	@Test(priority = 25, enabled = true, dependsOnMethods = "verifyPresenceOfCreditCardOptions", description = "Verify click on I have copied my receipt Checkbox and Approval")
	public void verifyClickIhaveCopiedMyReceiptChkBox() throws Exception {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickIhaveCopiedMyReceiptChkBox();
		// Verification of Textarea 'Please copy and paste the details from your receipt
		// here'
		Assert.assertTrue(Page.isVisible("oCalpasteReceiptdetailsTextArea_XPATH"));
		ocal.ClickApprove();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of Approved pop-up details
		Assert.assertEquals(Page.getText("oCalApprovedPopUpHeaderTxt_XPATH"), "Approved!");
		Assert.assertEquals(Page.getText("oCalApprovedPopUpTxt_XPATH"),
				"Thank you for submitting your request. We will contact you with an order confirmation shortly.");
		Page.click("oCalApprovedPopUpCloseBtn_XPATH");
	}

	@Test(priority = 26, enabled = true, dependsOnMethods = "verifyPresenceOfCreditCardOptions", description = "Verify Credit card details are not present for Non-Ocalc Product")
	public void verifyCCDetailsForNonOCalcProduct() throws Exception {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.NonOcalcProductQuoteSubmission();
		ocal.clickSubmitWithQuotedStatus();
		ocal.clickMyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread25000"))));
		Page.click("oCalMyQuotesApproveBtn_XPATH");
		// Verification of Pay with Credit Card Button
		Assert.assertFalse(Page.isElementPresent(By.xpath("oCalApprovalPayWithCCBtn_XPATH")));
		Page.click("oCalApprovalCloseBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.clickOnOU360();
	}

	@Test(priority = 27, enabled = true, description = "Verify presence of CC Receipt on My Quotes Screen")
	public void verifyPresenceOfCCReceipt() throws Exception {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.clickoCalcCard();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		ocal.clickRequestLicenseQuote();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		// Verification of header text for O-calc Products
		Assert.assertEquals(Page.getText("oCalcLicenseTxt_XPATH"), "O-Calc License");
		ocal.OcalProductQuoteSubmission();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertEquals(Page.getText("oCalProductQuoteSubmittedPopup_XPATH"), "Quote Request Submitted");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("oCalProductSubmittedCloseBtn_XPATH");
		ocal.clickSubmitWithQuotedStatus();
		ocal.clickMyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread25000"))));
		Page.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//button[@id='Approve' and text()='APPROVE'])[1]")));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		Page.click("oCalMyQuotesApproveBtn_XPATH");
		ocal.clickIhaveCopiedMyReceiptChkBox();
		ocal.ClickApprove();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of Approved pop-up details
		Assert.assertEquals(Page.getText("oCalApprovedPopUpHeaderTxt_XPATH"), "Approved!");
		Page.click("oCalApprovedPopUpCloseBtn_XPATH");
		ocal.clickMyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread25000"))));
		// Verification of CC Receipt field
		Page.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"(//div[@class='ccReceiptbtn btn-light relative float-left clearfix' and text()=' CC Receipt '])[1]")));
		Assert.assertTrue(Page.isVisible("oCalMyQuotesCCReceipt_XPATH"));
		Page.click("oCalMyQuotesCCReceipt_XPATH");
		// Verification of CC receipt field text
		Assert.assertEquals(Page.getText("oCalMyQuotesCCReceiptTxt_XPATH"), "Automation Testing");
		Page.click("oCalMyQuotesCloseBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// ocal.clickOnOU360();
		// Page.driver.navigate().back();
		ocal.clickoCalcNavigation();
	}

	@Test(priority = 28, enabled = true, description = "Verify click on Current Public classes on Training Options for a licensed User")
	public void verifyCurrentPublicClassesClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		ocal.clickCurrentPublicClasses();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the Back button
		Assert.assertTrue(Page.isVisible("oCalCurrentPublicClassBackBtn_XPATH"));
		// Verification of Back btn text
		Assert.assertEquals(Page.getText("oCalCurrentPublicClassBackBtn_XPATH"), "Back");
		// Verification of the Header text
		Assert.assertEquals(Page.getText("oCalCurrentPublicClassesHeaderTxt_XPATH"), "O-Calc Pro Classes");
		// Verification of close button
		Assert.assertTrue(Page.isVisible("oCalCurrentPublicClassesCloseBtn_XPATH"));
		Page.iFrames(1);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of O-Calc® Pro Training text
		Assert.assertEquals(Page.getText("oCalCurrentPublicClassesHeading_XPATH"), "O-Calc® Pro Training");
		/*
		 * Page.click("oCalCurrentPublicClassesFlyerBtn_XPATH");
		 * Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		 * ocal.closeTab(1);
		 * Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		 * ocal.switchToparentWindow();
		 */
		Page.driver.switchTo().defaultContent();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("oCalCurrentPublicClassesCloseBtn_XPATH");
	}

	@Test(priority = 29, enabled = true, description = "Verify click on Request Quote for Private Training classes on Training Options for Licensed User")
	public void verifyRequestQuoteForPrivateTrainingClassesClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickRequestQuoteForPrivateTrainingClasses();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		// Verification of header text
		Assert.assertTrue(Page.isVisible("oCalcRequestTrainingTxt_XPATH"));
		Assert.assertEquals(Page.getText("oCalcRequestTrainingTxt_XPATH"), "O-Calc Training");
		Assert.assertTrue(Page.isVisible("oCalcRequestTrainingDescription_XPATH"));
		Assert.assertEquals(Page.getText("oCalcRequestTrainingDescription_XPATH"), "O-Calc Training description");
		ocal.RequestTrainingProductQuoteSubmission();
		ocal.clickoCalcNavigation();
	}

	@Test(priority = 30, enabled = true, description = "Verify click on an Announcement for Licensed User")
	public void verifyClickOnAnAnnouncementLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Announcements First Announcement Presence verification
		Assert.assertTrue(Page.isVisible("AnnouncementFirst_XPATH"));
		Page.click("AnnouncementFirst_XPATH");
		// Verification of close button
		Assert.assertTrue(Page.isVisible("AnnouncementCloseBtn_XPATH"));
		// Verification of the Back button
		Assert.assertTrue(Page.isVisible("AnnouncementFirstBackTxt_XPATH"));
		// Verification of Back btn text
		Assert.assertEquals(Page.getText("AnnouncementFirstBackTxt_XPATH"), "Back");
		// Verification of the Header text
		System.out.println(
				"The header text of First Announcement is: " + Page.getText("AnnouncementFirstHeaderTxt_XPATH"));
		Page.click("AnnouncementCloseBtn_XPATH");
	}

	@Test(priority = 31, enabled = true, description = "Verify Contents of FAQ for Licensed User")
	public void verifyContentsOfFAQLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickFAQ();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the Header text
		Assert.assertEquals(Page.getText("FAQHeaderTxt_XPATH"), "O-Calc® Pro FAQ");
		// Verification of close button
		Assert.assertTrue(Page.isVisible("FAQCloseBtn_XPATH"));
		// Verification of First category
		Assert.assertTrue(Page.isVisible("FAQFirstCategory_XPATH"));
		// Verification of the presence of First FAQ
		Assert.assertTrue(Page.isVisible("FAQFirst_XPATH"));
		System.out.println("First FAQ is: " + Page.getText("FAQFirst_XPATH"));
		// Verification of the presence of Second FAQ
		Assert.assertTrue(Page.isVisible("FAQSecond_XPATH"));
		System.out.println("Second FAQ is: " + Page.getText("FAQSecond_XPATH"));
		Page.click("FAQFirstCategory_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertFalse(Page.findelement("FAQFirst_XPATH").isDisplayed());
		Assert.assertFalse(Page.findelement("FAQSecond_XPATH").isDisplayed());
		Page.click("FAQCloseBtn_XPATH");
	}

	@Test(priority = 32, enabled = true, description = "Verify clicking on an FAQ for Licensed User")
	public void verifyFAQClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickFAQ();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("FAQFirst_XPATH");
		// Verification of the click on an FAQ
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertEquals(Page.getText("FAQFirstLink_XPATH"), "http://www.o-calcpro.com/LineDesign/");
		Assert.assertEquals(Page.getText("FAQSecondLink_XPATH"), "https://www.youtube.com/user/ocalcproinfo");
		Page.click("FAQFirstLink_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.closeTab(1);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.switchToparentWindow();
		Page.click("FAQSecondLink_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.closeTab(1);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.switchToparentWindow();
		Page.click("FAQFirst_XPATH");
		Page.click("FAQCloseBtn_XPATH");
	}

	@Test(priority = 33, enabled = true, description = "Verify clicking on Submit Issue / Feature Request for Licensed User")
	public void verifySubmitIssueClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickSubmitIssue();
		// Verification of close button
		Assert.assertTrue(Page.isVisible("SubmitIssueCloseBtn_XPATH"));
		// Verification of the Back button
		Assert.assertTrue(Page.isVisible("AnnouncementFirstBackTxt_XPATH"));
		// Verification of Back btn text
		Assert.assertEquals(Page.getText("AnnouncementFirstBackTxt_XPATH"), "Back");
		// Verification of the Header text
		Assert.assertEquals(Page.getText("SubmitIssueHeaderTxt_XPATH"), "Submit Issue / Feature Request");
		Page.click("SubmitIssueCloseBtn_XPATH");
	}

	@Test(priority = 34, enabled = true, description = "Verify click on Knowledge Base card for Licensed User")
	public void verifyKBClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		ocal.clickKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		// Verification of header text
		Page.scrollbyjavaexecutor();
		Assert.assertTrue(Page.isVisible("KnowledgeBaseFirstHeaderTxt_XPATH"));
		Assert.assertEquals(Page.getText("KnowledgeBaseFirstHeaderTxt_XPATH"), "Knowledge Base");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertTrue(Page.isVisible("OcalPopularFilter1_XPATH"));
		Assert.assertTrue(Page.isVisible("OcalPopularFilter2_XPATH"));
		Assert.assertTrue(Page.isVisible("OcalPopularFilter3_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.navigate().back();
	}

	@Test(priority = 35, enabled = true, description = "Verify click on Training Videos link on Knowledge Base card for Licensed User")
	public void verifyKBTrainingVideosClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		ocal.clickKBTrainingVideos();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		// Verification of header text
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.driver.navigate().back();
		} else {
			Assert.assertTrue(Page.isVisible("KnowledgeBaseFirstHeaderTxt_XPATH"));
			Assert.assertEquals(Page.getText("KnowledgeBaseFirstHeaderTxt_XPATH"), "Knowledge Base");
			Assert.assertTrue(Page.isVisible("oCalcProKBVideosResultsSection_XPATH"));
			Page.click("ocalVideosSeeMorelnk_XPATH");
			Assert.assertTrue(Page.isVisible("OcalSeeMoreVideoContent_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			ocal.clickocalOnASeeMoreVideo();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
			ocal.clickBoxCloseBtn();
			Page.driver.navigate().back();
		}
	}

	@Test(priority = 36, enabled = true, description = "Verify click on Wiki Page on Knowledge Base card for Licensed User")
	public void verifyKBWikiPageClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		ocal.clickKBWikiPage();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		// Verification of header text
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.driver.navigate().back();
		} else {
			Assert.assertTrue(Page.isVisible("KnowledgeBaseFirstHeaderTxt_XPATH"));
			Assert.assertEquals(Page.getText("KnowledgeBaseFirstHeaderTxt_XPATH"), "Knowledge Base");
			Assert.assertTrue(Page.isVisible("ocalcProKBDocumentResultsSection_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Page.click("ocalDocumentsSeeMorelnk_XPATH");
			Assert.assertTrue(Page.isVisible("OcalSettingOwnershipDocContent_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			ocal.clickocalOnASeeMoreDocument();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
			ocal.closeTab(1);
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
			ocal.switchToparentWindow();
			Page.click("ocalDocumentMorelnk_XPATH");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
			ocal.closeTab(1);
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
			ocal.switchToparentWindow();
			Page.driver.navigate().back();
		}
	}

	@Test(priority = 37, enabled = true, description = "Verify that Search results section will be organized into separate grouped based on the popular query selected for licensed user")
	public void verifySearchResultsAreGroupedLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		ocal.clickKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.driver.navigate().back();
		} else {
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
			ocal.clickOCalcProIntroduction();
			Assert.assertTrue(Page.isVisible("oCalcProKBImagesResultsSection_XPATH"));
			Assert.assertTrue(Page.isVisible("oCalcProKBVideosResultsSection_XPATH"));
			Assert.assertTrue(Page.isVisible("ocalcProKBDocumentResultsSection_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Page.driver.navigate().back();
		}
	}

	@Test(priority = 38, enabled = true, description = "Verify that Search results section will be organized into separate grouped based on the popular query selected for licensed user")
	public void verifyTrainingVideosAreGroupedLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ocal.clickKBTrainingVideos();
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.driver.navigate().back();
		} else {
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
			// ocal.clickOCalcProIntroduction();
			Assert.assertTrue(Page.isVisible("oCalcProKBVideosResultsSection_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Page.driver.navigate().back();
		}
	}

	@Test(priority = 39, enabled = true, description = "Verify the Contents of License Management Pop-up")
	public void verifyContentsLicenseManagementPopUp() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.clickLicenseManagement();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertEquals(Page.getText("LicenseManagementHeaderText_XPATH"),
				"LICENSE MANAGEMENT | Osmose Utilities Services, Inc");
		Assert.assertTrue(Page.isVisible("ShowTourBtn_XPATH"));
		Assert.assertFalse(Page.findelement("RenewBtn_XPATH").isEnabled());
		Assert.assertFalse(Page.findelement("TransferBtn_XPATH").isEnabled());
		Assert.assertFalse(Page.findelement("ResendBtn_XPATH").isEnabled());
		Assert.assertFalse(Page.findelement("UpdateContactBtn_XPATH").isEnabled());
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(Page.findelement("RenewBtn_XPATH").isEnabled());
		Assert.assertTrue(Page.findelement("TransferBtn_XPATH").isEnabled());
		Assert.assertTrue(Page.findelement("ResendBtn_XPATH").isEnabled());
		Assert.assertTrue(Page.findelement("UpdateContactBtn_XPATH").isEnabled());

	}

	@Test(priority = 40, enabled = true, description = "Verify the presence of SkipTour, Next, Previous, ExitTour buttons")
	public void verifyPresenceOfSkipTourNextPreviousExitTour() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("ShowTourBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		/*
		 * WebElement SkipTour = Page.driver.findElement(By.
		 * xpath("(//button[@class='ml-4 btn twoButtons' and text()=' Skip Tour '])[1]")
		 * ); Assert.assertTrue(SkipTour.isDisplayed());
		 */
		Assert.assertTrue(Page.isVisible("NextBtn_XPATH"));
		Page.click("NextBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		/*
		 * WebElement Previous = Page.driver.findElement(By.
		 * xpath("(//button[@class='ml-4 btn btnRounded' and text()=' Previous '])[1]"))
		 * ; Assert.assertTrue(Previous.isDisplayed());
		 */
		Assert.assertTrue(Page.isVisible("ExitTour_XPATH"));
	}

	@Test(priority = 41, enabled = true, description = "Verify the Click on Next and Previous buttons")
	public void verifyClickOnNextPreviousbtns() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Assert.assertTrue(Page.isVisible("NextBtn1_XPATH"));
		Assert.assertTrue(Page.isVisible("PreviousBtn_XPATH"));
		Assert.assertTrue(Page.isVisible("ExitTour_XPATH"));
		Page.click("PreviousBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(Page.isVisible("ExitTour1_XPATH"));
	}

	@Test(priority = 42, enabled = true, description = "Verify the Click on Skip Tour and Exit Tour buttons")
	public void verifyClickOnSkipTourExitTourbtns() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Assert.assertTrue(Page.isVisible("ExitTour1_XPATH"));
		Page.click("ExitTour1_XPATH");
		Page.click("ShowTourBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(Page.isVisible("NextBtn_XPATH"));
		Page.click("NextBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(Page.isVisible("ExitTour_XPATH"));
		Page.click("ExitTour_XPATH");
	}

	@Test(priority = 43, enabled = true, description = "verify that only Renew Button is Enabled On multiple record selection")
	public void verifyOnlyRenewBtnIsEnabledOnMultipleRecordSelection() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Assert.assertTrue(Page.isEnabled("RenewBtn_XPATH"));
		Assert.assertTrue(Page.isEnabled("TransferBtn_XPATH"));
		Assert.assertTrue(Page.isEnabled("ResendBtn_XPATH"));
		Assert.assertTrue(Page.isEnabled("UpdateContactBtn_XPATH"));
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(Page.isEnabled("RenewBtn_XPATH"));
		Assert.assertTrue(Page.isEnabled("TransferBtn_XPATH"));
		Assert.assertTrue(Page.isEnabled("ResendBtn_XPATH"));
		Assert.assertTrue(Page.isEnabled("UpdateContactBtn_XPATH"));
		Page.click("LicenseManagementSecondCheckBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(Page.isEnabled("RenewBtn_XPATH"));
		Assert.assertFalse(Page.findelement("TransferBtn_XPATH").isEnabled());
		Assert.assertFalse(Page.findelement("ResendBtn_XPATH").isEnabled());
		Assert.assertFalse(Page.findelement("UpdateContactBtn_XPATH").isEnabled());
		Page.click("LicenseManagementSecondCheckBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(Page.isEnabled("RenewBtn_XPATH"));
		Assert.assertTrue(Page.isEnabled("TransferBtn_XPATH"));
		Assert.assertTrue(Page.isEnabled("ResendBtn_XPATH"));
		Assert.assertTrue(Page.isEnabled("UpdateContactBtn_XPATH"));
	}

	@Test(priority = 44, enabled = true, description = "Verify the Filter functionality of Contact Name column")
	public void verifyFilterContactName() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("LicenseManagementContactNameCol_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("LicenseManagementContactNameCol_XPATH");
		System.out.println("First Name in the Contact Name is: " + Page.getText("LicenseManagementFirstName_XPATH"));
		System.out.println("Second Name in the Contact Name is: " + Page.getText("LicenseManagementSecondName_XPATH"));
		Page.click("LicenseManagementContactNameCol_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		System.out.println("First Name in the Contact Name is: " + Page.getText("LicenseManagementFirstName_XPATH"));
		System.out.println("Second Name in the Contact Name is: " + Page.getText("LicenseManagementSecondName_XPATH"));
	}

	@Test(priority = 45, enabled = true, description = "Verify the Filter functionality of License key column")
	public void verifyFilterLicenseKey() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("LicenseManagementLicenseKeyFilter_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertTrue(Page.isVisible("LicenseManagementLicenseKeySearchBox_XPATH"));
		Page.type("LicenseManagementLicenseKeySearch_XPATH", "GKR72ZPB3QW4G8N");
		Page.findelement("LicenseManagementLicenseKeySearch_XPATH").sendKeys(Keys.ENTER);
		Page.click("LicenseManagementHeaderText_XPATH");
		System.out.println("License Key is: " + Page.getText("LicensKeyValue_XPATH"));
		Page.click("LicenseManagementLicenseKeyFilter_XPATH");
		Page.click("LicenseManagementLicenseKeyResetBtn_XPATH");
		Page.click("LicenseManagementHeaderText_XPATH");
	}

	@Test(priority = 46, enabled = true, description = "Verify the Filter functionality of Status column")
	public void verifyFilterStatus() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("LicenseManagementStatusFilter_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertTrue(Page.isVisible("StatusFilterSelectAllChkBox_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("StatusFilterSelectAllChkBox_XPATH");
		Assert.assertTrue(Page.isVisible("StatusFilterActiveChkBox_XPATH"));
		Page.click("StatusFilterActiveChkBox_XPATH");
		Page.click("LicenseManagementHeaderText_XPATH");
		Assert.assertEquals(Page.getText("StatusFilterValue_XPATH"), "ACTIVE");
		Page.click("LicenseManagementStatusFilter_XPATH");
		Page.click("LicenseManagementStatusResetBtn_XPATH");
		Page.click("LicenseManagementHeaderText_XPATH");
	}

	@Test(priority = 47, enabled = true, description = "Verify the Filter functionality of Exp Token column")
	public void verifyFilterExpToken() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("LicenseManagementExpTokenFilter_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertTrue(Page.isVisible("LicenseManagementExpTokenFilterSearchBox_XPATH"));
		Page.type("LicenseManagementExpTokenSearch_XPATH", "UA9PKT57ZZ");
		Page.findelement("LicenseManagementExpTokenSearch_XPATH").sendKeys(Keys.ENTER);
		Page.click("LicenseManagementHeaderText_XPATH");
		System.out.println("The Exp Token is: " + Page.getText("LicensKeyValue1_XPATH"));
		Page.click("LicenseManagementExpTokenFilter_XPATH");
		Page.click("LicenseManagementLicenseKeyResetBtn_XPATH");
		Page.click("LicenseManagementHeaderText_XPATH");
	}

	@Test(priority = 48, enabled = true, description = "Verify the Filter functionality of License Type column")
	public void verifyFilterLicenseType() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("LicenseManagementLicenseTypeFilter_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertTrue(Page.isVisible("FilterLicenseTypeSelectAllChkBox_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("FilterLicenseTypeSelectAllChkBox_XPATH");
		Assert.assertTrue(Page.isVisible("FilterLicenseTypeSingleUserChkBx_XPATH"));
		Page.click("FilterLicenseTypeSingleUserChkBx_XPATH");
		Page.click("LicenseManagementHeaderText_XPATH");
		Assert.assertEquals(Page.getText("LicenseTypeValue_XPATH"), "Single User");
		Page.click("LicenseManagementLicenseTypeFilter_XPATH");
		Page.click("LicenseManagementLicenseTypeResetBtn_XPATH");
		Page.click("LicenseManagementHeaderText_XPATH");
	}

	@Test(priority = 49, enabled = true, description = "Verify the Filter functionality of License Type column when Site is selected as license type")
	public void verifyFilterLicenseTypeSite() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("LicenseManagementLicenseTypeFilter_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertTrue(Page.isVisible("FilterLicenseTypeSelectAllChkBox_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("FilterLicenseTypeSelectAllChkBox_XPATH");
		Assert.assertTrue(Page.isVisible("FilterLicenseTypeSiteChkBx_XPATH"));
		Page.click("FilterLicenseTypeSiteChkBx_XPATH");
		Page.click("LicenseManagementHeaderText_XPATH");
		Assert.assertEquals(Page.getText("LicenseTypeValue_XPATH"), "Site");
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		Assert.assertTrue(Page.isEnabled("RenewBtn_XPATH"));
		Assert.assertFalse(Page.findelement("TransferBtn_XPATH").isEnabled());
		Assert.assertFalse(Page.findelement("ResendBtn_XPATH").isEnabled());
		Assert.assertFalse(Page.findelement("UpdateContactBtn_XPATH").isEnabled());
		Page.click("LicenseManagementSecondCheckBox_XPATH");
		Assert.assertTrue(Page.isEnabled("RenewBtn_XPATH"));
		Assert.assertFalse(Page.findelement("TransferBtn_XPATH").isEnabled());
		Assert.assertFalse(Page.findelement("ResendBtn_XPATH").isEnabled());
		Assert.assertFalse(Page.findelement("UpdateContactBtn_XPATH").isEnabled());
		Page.click("LicenseManagementLicenseTypeFilter_XPATH");
		Page.click("LicenseManagementLicenseTypeResetBtn_XPATH");
		Page.click("LicenseManagementHeaderText_XPATH");
	}

	@Test(priority = 50, enabled = true, description = "Verify the Filter functionality of Purchase Date column")
	public void verifyFilterPurchaseDate() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("LicenseManagementPurchaseDateFilter_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertTrue(Page.isVisible("LicenseManagementPurchaseDateSearch_XPATH"));
		Page.type("LicenseManagementPurchaseDateSearch_XPATH", "10/07/2019");
		Page.click("LicenseManagementPurchaseDateORradio_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Actions action = new Actions(Page.driver);
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Page.click("LicenseManagementPurchaseDateNotEqualoption_XPATH");
		Page.type("LicenseManagementPurchaseDate1Search_XPATH", "10/07/2019");
		Page.click("LicenseManagementHeaderText_XPATH");
		System.out.println("Purchase Date is: " + Page.getText("PurchaseDateValue_XPATH"));
		Page.click("LicenseManagementPurchaseDateFilter_XPATH");
		Page.click("LicenseManagementPurchaseDateResetBtn_XPATH");
		Page.click("LicenseManagementHeaderText_XPATH");
	}

	@Test(priority = 51, enabled = true, description = "Verify the Filter functionality of Expiration Date column")
	public void verifyFilterExpirationDate() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Assert.assertEquals(Page.getText("LicenseManagementExpirationDateFilterName_XPATH"), "Expiration Date");
		Page.click("LicenseManagementExpirationDateFilter_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertTrue(Page.isVisible("LicenseManagementExpirationDateSearch_XPATH"));
		Page.type("LicenseManagementExpirationDateSearch_XPATH", "04/29/2022");
		Page.click("LicenseManagementExpirationDateORradio_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Actions action = new Actions(Page.driver);
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Page.click("LicenseManagementExpirationDateNotEqualoption_XPATH");
		Page.type("LicenseManagementExpirationDate1Search_XPATH", "10/07/2019");
		Page.click("LicenseManagementHeaderText_XPATH");
		System.out.println("Expiration Date: " + Page.getText("ExpirationDateValue_XPATH"));
		Page.click("LicenseManagementExpirationDateFilter_XPATH");
		Page.click("LicenseManagementExpirationDateResetBtn_XPATH");
		Page.click("LicenseManagementHeaderText_XPATH");
		Page.click("LicenseManagementCloseBtn_XPATH");
		Page.driver.navigate().back();
	}

	@Test(priority = 52, enabled = true, description = "Verify transfer button pop up UI")
	public void verifyTransferBtn() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickLicenseManagement();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		// Transfer button contents presence verification
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertTrue(Page.isEnabled("TransferBtn_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("TransferBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertTrue(Page.isVisible("TransferPopUpHeaderTxt_XPATH"));
		Assert.assertEquals(Page.getText("TransferPopUpHeaderTxt_XPATH"), "TRANSFER LICENSE");
		Assert.assertTrue(Page.isVisible("TransferPopUpCloseBtn_XPATH"));
		Assert.assertTrue(Page.isVisible("TransferPopUpHeader_XPATH"));
		Assert.assertEquals(Page.getText("TransferPopUpHeader_XPATH"),
				"Enter the details of the person you are transferring the license to.");
		Assert.assertTrue(Page.isVisible("TransferPopUpFirstName_XPATH"));
		Assert.assertTrue(Page.isVisible("TransferPopUpLastName_XPATH"));
		Assert.assertTrue(Page.isVisible("TransferPopUpEmail_XPATH"));
		Assert.assertTrue(Page.isVisible("TransferPopUpPhone_XPATH"));
		Assert.assertTrue(Page.isVisible("TransferPopUpTransferBtn_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		Page.click("TransferPopUpCloseBtn_XPATH");
	}

	@Test(priority = 53, enabled = true, description = "Verify that error message is displayed on clicking on Transfer License without filling the details")
	public void verifyTransferErrorMsg() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("TransferBtn_XPATH");
		Page.click("TransferPopUpTransferBtn_XPATH");
		Assert.assertEquals(Page.getText("TransferPopUpErrorMsg_XPATH"), "Fields marked with * are mandatory");
		Page.click("TransferPopUpCloseBtn_XPATH");
	}

	@Test(priority = 54, enabled = true, description = "Verify click on Transfer License Button")
	public void verifyClickTransferLicenseBtn() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("TransferBtn_XPATH");
		ocal.clickLicenseTransferBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertEquals(Page.getText("TransferCompleteTxt_XPATH"), "TRANSFER COMPLETE!");
		Assert.assertEquals(Page.getText("TransferCompletePopUptxt_XPATH"),
				"A notification has been sent to email@gmail.com");
		Assert.assertTrue(Page.isVisible("TransferCompletePopUpCloseBtn_XPATH"));
		Page.click("TransferCompletePopUpCloseBtn_XPATH");
	}

	@Test(priority = 55, enabled = true, description = "Verify Resend button functionality")
	public void verifyClickResend() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(Page.isEnabled("ResendBtn_XPATH"));
		Page.click("ResendBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of the contents of Resend pop-up
		Assert.assertEquals(Page.getText("ResendPopUpHeaderTxt_XPATH"), "RESEND COMPLETE!");
		System.out.println("Resend PopUp text is: " + Page.getText("ResendCompletePopUptxt_XPATH"));
		Assert.assertTrue(Page.isVisible("ResendCompletePopUpCloseBtn_XPATH"));
		Page.click("ResendCompletePopUpCloseBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	@Test(priority = 56, enabled = true, description = "Verify Update Contact button pop up UI")
	public void verifyUpdateContactBtn() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Update Contact button contents presence verification
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(Page.isEnabled("UpdateContactBtn_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("UpdateContactBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertTrue(Page.isVisible("UpdateContactPopUpHeaderTxt_XPATH"));
		Assert.assertEquals(Page.getText("UpdateContactPopUpHeaderTxt_XPATH"), "UPDATE CONTACT");
		Assert.assertTrue(Page.isVisible("UpdateContactPopUpCloseBtn_XPATH"));
		Assert.assertTrue(Page.isVisible("UpdateContactPopUpHeader_XPATH"));
		Assert.assertEquals(Page.getText("UpdateContactPopUpHeader_XPATH"),
				"Enter the contact details to be updated for the license.");
		Assert.assertTrue(Page.isVisible("TransferPopUpFirstName_XPATH"));
		System.out.println("The FirstName in UpdateContact is: "
				+ Page.getAttributeValue("TransferPopUpFirstName_XPATH", "value"));
		Assert.assertTrue(Page.isVisible("TransferPopUpLastName_XPATH"));
		System.out.println(
				"The LastName in UpdateContact is: " + Page.getAttributeValue("TransferPopUpLastName_XPATH", "value"));
		Assert.assertTrue(Page.isVisible("TransferPopUpEmail_XPATH"));
		System.out.println(
				"The Email in UpdateContact is: " + Page.getAttributeValue("TransferPopUpEmail_XPATH", "value"));
		Assert.assertTrue(Page.isVisible("TransferPopUpPhone_XPATH"));
		System.out.println(
				"The Phone in UpdateContact is: " + Page.getAttributeValue("TransferPopUpPhone_XPATH", "value"));
		Assert.assertTrue(Page.isVisible("UpdateContactPopUpUpdateContactInfoBtn_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		Page.click("UpdateContactPopUpCloseBtn_XPATH");
	}

	@Test(priority = 57, enabled = true, description = "Verify click on Update Contact Button")
	public void verifyClickUpdateContactBtn() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("UpdateContactBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("UpdateContactPopUpUpdateContactInfoBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertEquals(Page.getText("UpdateCompleteTxt_XPATH"), "UPDATE COMPLETE!");
		System.out.println("Update Contact Complete PopUp text is: " + Page.getText("UpdateCompletePopUptxt_XPATH"));
		Assert.assertTrue(Page.isVisible("UpdateCompletePopUpCloseBtn_XPATH"));
		Page.click("UpdateCompletePopUpCloseBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("LicenseManagementCloseBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
	}

	@Test(priority = 58, enabled = true, description = "Verify click on Renew Button functionality")
	public void verifyClickRenewBtn() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickLicenseManagement();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("RenewBtn_XPATH");
		Page.wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//div[@class='prdDetailhs2']//h3[text()=' O-Calc License '])[1]")));
		// Verification of header text
		Assert.assertTrue(Page.isVisible("oCalcLicenseTxt_XPATH"));
		Assert.assertEquals(Page.getText("oCalcLicenseTxt_XPATH"), "O-Calc License");
		Assert.assertTrue(Page.isVisible("oCalcLicenseDescription_XPATH"));
		Assert.assertEquals(Page.getText("oCalcLicenseDescription_XPATH"), "O-Calc License description");
		System.out.println("The Prepopulated Size is: " + Page.getdefaultValuefromdropdown("RenewSizeDD_XPATH"));
		System.out.println(
				"The Prepopulated Quantity is: " + Page.getAttributeValue("oCalProductEnterQuantity_XPATH", "value"));
		ocal.RenewProductQuoteSubmission();
		System.out.println(
				"The Prepopulated Comments is: " + Page.getAttributeValue("RenewQuoteComments_XPATH", "value"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("oCalProductSubmitBtn_XPATH");
	}

}
