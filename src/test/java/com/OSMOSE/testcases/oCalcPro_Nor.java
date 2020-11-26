package com.OSMOSE.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.Login;
import com.OSMOSE.pages.OU.OsmoseServicesPage;
import com.OSMOSE.pages.OU.oCalcProPage;
import com.OSMOSE.utilities.Utilities;

public class oCalcPro_Nor extends BaseTest {

	Page p = new Page();

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp",priority = 0, description = "Verify the login functionality")
	public void ocalcloginTestNormal(Hashtable<String, String> data) throws InterruptedException {
		Login lo = new Login();
		lo.doLogin(data.get("username"), data.get("password"));
		Page.click("submit_XPATH");
		String element = Page.getText("verify_ID");
		Assert.assertEquals(element, "Mohammed Junaid");
	}

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

	// US-101212-101307-Verify UI and Layout of the O-Calc Pro landing page for
	// Prospective User
	// US-101212-101314-Verify the Tiles displayed in the Prospective User O-Calc
	// Pro landing page
	@Test(priority = 2, enabled = true, description = "Verify presence of Get Started With Ocalc Pro card")
	public void verifyPresenceOfGetStartedWithOcalcPro() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Get Started with Ocalc Pro card presence verification
		Assert.assertTrue(Page.isVisible("GetStartedWithOcalcProCard_XPATH"));
	}

	// US-101212-101307-Verify UI and Layout of the O-Calc Pro landing page for
	// Prospective User
	// US-101212-101314-Verify the Tiles displayed in the Prospective User O-Calc
	// Pro landing page
	@Test(priority = 3, enabled = true, description = "Verify presence of Products card on OcalcPro page")
	public void verifyPresenceOfProductsCard() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Products presence verification
		Assert.assertTrue(Page.isVisible("OcalcProductsCard_XPATH"));
	}

	// US-101212-101307-Verify UI and Layout of the O-Calc Pro landing page for
	// Prospective User
	// US-101212-101314-Verify the Tiles displayed in the Prospective User O-Calc
	// Pro landing page
	@Test(priority = 4, enabled = true, description = "Verify presence of Knowledge Base card on OcalcPro page")
	public void verifyPresenceOfKnowledgeBaseCard() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Knowledge Base presence verification
		Assert.assertTrue(Page.isVisible("OcalcKnowledgeBaseCard_XPATH"));
	}

	// US-101212-101307-Verify UI and Layout of the O-Calc Pro landing page for
	// Prospective User
	// US-101212-101314-Verify the Tiles displayed in the Prospective User O-Calc
	// Pro landing page
	@Test(priority = 5, enabled = true, description = "Verify presence of Announcements card on OcalcPro page")
	public void verifyPresenceOfAnnouncementsCard() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Announcements presence verification
		Assert.assertTrue(Page.isVisible("OcalcAnnouncementsCard_XPATH"));
	}

	// US-101212-101307-Verify UI and Layout of the O-Calc Pro landing page for
	// Prospective User
	// US-101212-101314-Verify the Tiles displayed in the Prospective User O-Calc
	// Pro landing page
	@Test(priority = 6, enabled = true, description = "Verify presence of Training Options card on OcalcPro page")
	public void verifyPresenceOfTrainingOptionsCard() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Training Options presence verification
		Assert.assertTrue(Page.isVisible("OcalcTrainingOptionsCard_XPATH"));
	}

	// US-101214-101355-Verify the Content displayed in Get Started With O-Calc Pro
	// Tile for Prospective User O-Calc Pro landing page
	@Test(priority = 7, enabled = true, description = "Verify contents on Get Started With Ocalc Pro card")
	public void verifyContentsOfGetStartedWithOcalcPro() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Get Started with Ocalc Pro card Header text Presence verification
		Assert.assertTrue(Page.isVisible("GetStartedTxt_XPATH"));
		Assert.assertEquals(Page.getText("GetStartedTxt_XPATH"),
				"O-Calc Pro takes the guesswork out of load calculation for line design, pole replacement, and joint-use loading.");
		// Get Started with Ocal Pro card Learn More presence verification
		Assert.assertTrue(Page.isVisible("GetStartedLearnMoreLink_XPATH"));
		Assert.assertEquals(Page.getText("GetStartedLearnMoreLink_XPATH"), "Learn More");
		// Get Started with Ocal Pro card 30 days trial presence verification
		Assert.assertTrue(Page.isVisible("GetStarted30DaysBtn_XPATH"));
		// Get Started with Ocal Pro card Request a Demo presence verification
		Assert.assertTrue(Page.isVisible("GetStartedReqDemo_XPATH"));
		// Get Started with Ocal Pro card Contact O-Calc Support presence verification
		Assert.assertTrue(Page.isVisible("GetStartedContactOcalcPro_XPATH"));
		Assert.assertEquals(Page.getText("GetStartedContactOcalcPro_XPATH"), "Contact O-Calc Pro Support");
	}

	// US-101212-101315-Verify the Content displayed in Product for Prospective User
	// O-Calc Pro landing page
	// US-101215-101368-Verify the Content displayed in Product Tile in O-Calc Pro
	// landing page
	@Test(priority = 8, enabled = true, description = "Verify contents on Products card")
	public void verifyContentsOfProductsCard() throws InterruptedException {
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

	// US-101212-101319-Verify the Content displayed in Knowledge Base Tile for
	// Prospective User O-Calc Pro landing page
	@Test(priority = 9, enabled = true, description = "Verify contents on Knowledge Base card")
	public void verifyContentsOfKBCard() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Training videos presence verification
		Assert.assertTrue(Page.isVisible("KBTraining_XPATH"));
		Assert.assertEquals(Page.getText("KBTraining_XPATH"), "Training Videos");
		// Wiki Page presence verification
		Assert.assertTrue(Page.isVisible("KBWikiPage_XPATH"));
		Assert.assertEquals(Page.getText("KBWikiPage_XPATH"), "Wiki Page");
	}

	// US-101212-101341-Verify the Content displayed in Announcements Tile for
	// Prospective User O-Calc Pro landing page
	@Test(priority = 10, enabled = true, description = "Verify contents on Announcements card")
	public void verifyContentsOfAnnouncements() throws InterruptedException {
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

	// US-101212-101343-Verify the Content displayed in Training Options Tile for
	// Prospective User O-Calc Pro landing page
	@Test(priority = 11, enabled = true, description = "Verify contents on Training Options card")
	public void verifyContentsOfTrainingOptions() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Training Options Current Public Presence verification
		Assert.assertTrue(Page.isVisible("TrainingCurrent_XPATH"));
		Assert.assertEquals(Page.getText("TrainingCurrent_XPATH"), "Current Public Classes");
		// Training Options Request Quote Presence verification
		Assert.assertTrue(Page.isVisible("TrainingRequestQuote_XPATH"));
		Assert.assertEquals(Page.getText("TrainingRequestQuote_XPATH"), "Request quote for Private Training class");
	}

	@Test(priority = 12, enabled = true, description = "Verify click on Learn More on Get Started With Ocalc Pro card")
	public void verifyLearnMoreClickonGetStartedWithOcalcProcard() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the Header text
		Assert.assertEquals(Page.getText("GetStartedLearnMoreHeaderTxt_XPATH"), "O-Calc Pro");
		// Verification of close button
		WebElement closeBtn = Page.findelement("GetStartedLearnMoreCloseBtn_XPATH");
		Assert.assertTrue(closeBtn.isDisplayed());
		// Verification of the Back button
		WebElement BackBtn = Page.findelement("GetStartedLearnMoreBackTxt_XPATH");
		Assert.assertTrue(BackBtn.isDisplayed());
		// Verification of Back btn text
		Assert.assertEquals(Page.getText("GetStartedLearnMoreBackTxt_XPATH"), "Back");
		Page.iFrames(1);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of Structural Analysis text
		Assert.assertEquals(Page.getText("GetStartedStructuralTxt_XPATH"),
				"Structural Analysis Software for Utility Poles");
		Page.click("GetStartedLearnMoreoCalProBrochure_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.closeTab(1);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.switchToparentWindow();
		Page.iFrames(1);
		Page.click("GetStartedLearnMoreProfServicesBtn_XPATH");
		Page.driver.switchTo().defaultContent();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("GetStartedLearnMoreCloseBtn_XPATH");
	}

	// US-101214-101363-Verify the 30 Day Free Trial button functionality in Get
	// Started With O-Calc Pro Tile for Prospective User O-Calc Pro landing page
	@Test(priority = 13, enabled = true, description = "Verify click on 30 days Trial button on Get Started With Ocalc Pro card")
	public void verify30daysbtnClickonGetStartedWithOcalcProcard() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.click30daysTrialBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of the Back button
		// WebElement BackBtn =
		// Page.driver.findElement(By.xpath("//a[@id='OCalTrialCloseBtn']"));
		// Assert.assertTrue(BackBtn.isDisplayed());
		// Verification of Back btn text
		// Assert.assertEquals(Page.getText("30daysBackTxt_XPATH"), "Back");
		Page.iFrames(1);
		// Verification of Header text
		Assert.assertEquals(Page.getText("30daysHeaderTxt_XPATH"), "O-Calc® Pro Trial Version");
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
		// Page.click("30daysBackBtn_XPATH");
		// Verification of close button
		Assert.assertTrue(Page.isVisible("30daysCloseBtn_XPATH"));
		Page.click("30daysCloseBtn_XPATH");
	}

	// US-101214-101366-Verify the Request A Live Demo button functionality in Get
	// Started With O-Calc Pro Tile for Prospective User O-Calc Pro landing page
	@Test(priority = 14, enabled = true, description = "Verify click on Request Demo button on Get Started With Ocalc Pro card")
	public void verifyRequstDemoClickonGetStartedWithOcalcProcard() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickRequestDemoTrialBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of the Back button
		// WebElement BackBtn =
		// Page.driver.findElement(By.xpath("//a[@id='OCalTrialCloseBtn']"));
		// Assert.assertTrue(BackBtn.isDisplayed());
		// Verification of Back btn text
		// Assert.assertEquals(Page.getText("DemoBackTxt_XPATH"), "Back");
		Page.iFrames(1);
		// Verification of Header text
		Assert.assertEquals(Page.getText("DemoHeaderTxt_XPATH"), "O-Calc® Pro Live Demo");
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
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		// Page.click("DemoBackBtn_XPATH");
		// Verification of close button
		Assert.assertTrue(Page.isVisible("DemoCloseBtn_XPATH"));
		Page.click("DemoCloseBtn_XPATH");
	}

	// US-101214-101367-Verify the Contact O-Calc Pro Support link functionality in
	// Get Started With O-Calc Pro Tile for Prospective User O-Calc Pro landing page
	@Test(priority = 15, enabled = true, description = "Verify click on Contact O-calc Support on Get Started With Ocalc Pro card")
	public void verifyocalcSupportClickonGetStartedWithOcalcProcard() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ocal.clickContactoCalcSupportLink();
		// Verification of header text
		Assert.assertTrue(Page.isVisible("oCalcProContactUsHeaderTxt_XPATH"));
		Assert.assertEquals(Page.getText("oCalcProContactUsHeaderTxt_XPATH"), "Contact Us");
		// Verification of Default value on subject field
		String defaultValue = Page.getdefaultValuefromdropdown("oCalcProContactUsFormSubjectdd_XPATH");
		Assert.assertEquals(defaultValue, "O-Calc Pro Support");
		Page.click("oCalcProContactUscloseBtn_XPATH");
	}

	// US-101215-101369-Verify by clicking on Product title in Product Tile in
	// O-Calc Pro landing page
	@Test(priority = 16, enabled = true, description = "Verify click on Products card")
	public void verifyProductsClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ocal.clickProducts();
		// Verification of header text
		Assert.assertTrue(Page.isVisible("oCalcProductsHeaderTxt_XPATH"));
		Assert.assertEquals(Page.getText("oCalcProductsHeaderTxt_XPATH"), "Pole and Line Products");
		// Verification of the heading on the products
		Page.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='projectHeading']//h3[text()='O-Calc Pro']")));
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
		ocal.clickoCalcNavigation();
	}

	// US-101215-101370-Verify Request License Quote link functionality in Product
	// Tile in O-Calc Pro landing page
	@Test(priority = 17, enabled = true, description = "Verify click on Request License Quote on Products card and submit quote")
	public void verifyRequestLicenseQuoteClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ocal.clickRequestLicenseQuote();
		Page.wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//div[@class='prdDetailhs2']//h3[text()=' O-Calc License '])[1]")));
		// Verification of header text
		Assert.assertTrue(Page.isVisible("oCalcLicenseTxt_XPATH"));
		Assert.assertEquals(Page.getText("oCalcLicenseTxt_XPATH"), "O-Calc License");
		Assert.assertTrue(Page.isVisible("oCalcLicenseDescription_XPATH"));
		Assert.assertEquals(Page.getText("oCalcLicenseDescription_XPATH"), "O-Calc License description");
		Assert.assertTrue(Page.isVisible("oCalcCallNowTxt_XPATH"));
		Assert.assertEquals(Page.getText("oCalcCallNowTxt_XPATH"), "(716) 319-3423");
		ocal.RequestLicenseProductQuoteSubmission();
		ocal.clickoCalcNavigation();
	}

	// US-101215-101371-Verify Request Private training quote link functionality in
	// Product Tile in O-Calc Pro landing page
	@Test(priority = 18, enabled = true, description = "Verify click on Request CVT Quote on Products card and submit quote")
	public void verifyRequestCVTQuoteClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
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
		ocal.clickoCalcNavigation();
	}

	// US-101215-101372-Verify Request CVT Quote link functionality in Product Tile
	// in O-Calc Pro landing page
	@Test(priority = 19, enabled = true, description = "Verify click on Request Training Quote on Products card and submit quote")
	public void verifyRequestTrainingQuoteClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
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
		ocal.clickoCalcNavigation();
	}

	@Test(priority = 20, enabled = true, description = "Verify click on Current Public classes on Training Options")
	public void verifyCurrentPublicClassesClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
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
		/*Page.click("oCalCurrentPublicClassesFlyerBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.closeTab(1);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.switchToparentWindow();*/
		Page.driver.switchTo().defaultContent();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("oCalCurrentPublicClassesCloseBtn_XPATH");
	}

	@Test(priority = 21, enabled = true, description = "Verify click on Request Quote for Private Training classes on Training Options")
	public void verifyRequestQuoteForPrivateTrainingClassesClick() throws InterruptedException {
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

	@Test(priority = 22, enabled = true, description = "Verify click on an Announcement")
	public void verifyClickOnAnAnnouncement() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
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

	@Test(priority = 23, enabled = true, description = "Verify click on Knowledge Base card")
	public void verifyKBClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickKnowledgeBase();
		// Verification of header text
		Assert.assertTrue(Page.isVisible("KnowledgeBaseFirstHeaderTxt_XPATH"));
		Assert.assertEquals(Page.getText("KnowledgeBaseFirstHeaderTxt_XPATH"), "Knowledge Base");
		Assert.assertTrue(Page.isVisible("oCalcProKBVideosResultsSection_XPATH"));
		Assert.assertTrue(Page.isVisible("ocalcProKBDocumentResultsSection_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertTrue(Page.isVisible("OcalPopularFilter1_XPATH"));
		Assert.assertTrue(Page.isVisible("OcalPopularFilter2_XPATH"));
		Assert.assertTrue(Page.isVisible("OcalPopularFilter3_XPATH"));
		Assert.assertTrue(Page.isVisible("OcalvideoContent_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ocal.clickocalOnAVideo();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		ocal.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.clickocalOnADocument();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ocal.closeTab(1);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.switchToparentWindow();
		ocal.clickoCalcNavigation();
	}

	@Test(priority = 24, enabled = true, description = "Verify click on Training Videos link on Knowledge Base card")
	public void verifyKBTrainingVideosClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		ocal.clickKBTrainingVideos();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of header text
		Assert.assertTrue(Page.isVisible("KnowledgeBaseFirstHeaderTxt_XPATH"));
		Assert.assertEquals(Page.getText("KnowledgeBaseFirstHeaderTxt_XPATH"), "Knowledge Base");
		Assert.assertTrue(Page.isVisible("oCalcProKBVideosResultsSection_XPATH"));
		Page.click("ocalVideosSeeMorelnk_XPATH");
		Assert.assertTrue(Page.isVisible("OcalSeeMoreVideoContent_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ocal.clickocalOnASeeMoreVideo();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.clickBoxCloseBtn();
		ocal.clickoCalcNavigation();
	}

	@Test(priority = 25, enabled = true, description = "Verify click on Wiki Page on Knowledge Base card")
	public void verifyKBWikiPageClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickKBWikiPage();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of header text
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
		ocal.clickoCalcNavigation();
	}

	@Test(priority = 26, enabled = true, description = "Verify that Search results section will be organized into separate grouped based on the popular query selected")
	public void verifySearchResultsAreGrouped() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		ocal.clickKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		ocal.clickOCalcProIntroduction();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Assert.assertTrue(Page.isVisible("oCalcProKBVideosResultsSection_XPATH"));
		/*
		 * WebElement ImageResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		 * Assert.assertTrue(ImageResultsSection.isDisplayed()); WebElement
		 * DocumentResultsSection = Page.driver
		 * .findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		 * Assert.assertTrue(DocumentResultsSection.isDisplayed());
		 */
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ocal.clickoCalcNavigation();
	}

	@Test(priority = 27, enabled = true, description = "Verify that Search results section will be organized into separate grouped based on the popular query selected")
	public void verifyTrainingVideosAreGrouped() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickKBTrainingVideos();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		ocal.clickOCalcProIntroduction();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Assert.assertTrue(Page.isVisible("oCalcProKBVideosResultsSection_XPATH"));
		/*
		 * WebElement ImageResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		 * Assert.assertTrue(ImageResultsSection.isDisplayed()); WebElement
		 * DocumentResultsSection = Page.driver
		 * .findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		 * Assert.assertTrue(DocumentResultsSection.isDisplayed());
		 */
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ocal.clickoCalcNavigation();
	}

	@Test(priority = 28, enabled = true, description = "Verify presence of License Management tile for Prospective User")
	public void verifyPresenceOfLicenseManagementPerspective() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// License Management card presence verification
		Assert.assertFalse(Page.isVisible("LicensedUserLicenseManagementCard_XPATH"));
	}

}
