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

public class oCalcPro extends BaseTest {

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
		WebElement OcalcProHeaderImg = Page.driver
				.findElement(By.xpath("//img[@id='logoOcalProWelcom' and @class='ocalcLogo']"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(OcalcProHeaderImg.isDisplayed());
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
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//h5[@class='m-0 crspointer' and text()='License Management ']")).isDisplayed());
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
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//h5[@id='OCalProductsTile' and text()='Products ']")).isDisplayed());
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
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//h5[@class='m-0 crspointer' and text()='Knowledge Base ']")).isDisplayed());
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
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Announcements ']")).isDisplayed());
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
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Training Options ']")).isDisplayed());
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
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Tutorial, Live Demo & Support ']")).isDisplayed());
	}

	// US-101213-101347-Verify the Content displayed in Training Options Tile for
	// Licensed User O-Calc Pro landing page
	@Test(priority = 8, enabled = true, description = "Verify contents on Training Options card for Licensed User")
	public void verifyContentsOfTrainingOptionsLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Training Options Current Public Presence verification
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//a[@id='OCalPublicClasses' and text()='Current Public Classes']"))
						.isDisplayed());
		Assert.assertEquals(Page.getText("TrainingCurrent_XPATH"), "Current Public Classes");
		// Training Options Request Quote Presence verification
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//a[@id='OCalQuoteTraining' and text()='Request quote for Private Training class']"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("TrainingRequestQuote_XPATH"), "Request quote for Private Training class");
	}

	// US-101213-101348-Verify the Content displayed in Product for Licensed User
	// O-Calc Pro landing page
	@Test(priority = 9, enabled = true, description = "Verify contents on Products card for Licensed User")
	public void verifyContentsOfProductsCardLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Request License quote presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//a[@id='OCalReqLicence' and text()='Request License Quote']")).isDisplayed());
		Assert.assertEquals(Page.getText("ProductsRequestLicense_XPATH"), "Request License Quote");
		// Request CVT quote presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//a[@id='OCalCVTQuote' and text()='Request CVT Quote']"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("ProductsRequestCVT_XPATH"), "Request CVT Quote");
		// Request Private Training quote presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//a[@id='OCalTrainingQuote' and text()='Request Private Training Quote']"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("ProductsRequestPrivate_XPATH"), "Request Private Training Quote");
	}

	// US-101213-101349-Verify the Content displayed in Knowledge Base Tile for
	// Licensed User O-Calc Pro landing page
	@Test(priority = 10, enabled = true, description = "Verify contents on Knowledge Base card for Licensed User")
	public void verifyContentsOfKBCardLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Training videos presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//a[@id='OCalTrainingVideos' and text()='Training Videos']")).isDisplayed());
		Assert.assertEquals(Page.getText("KBTraining_XPATH"), "Training Videos");
		// Wiki Page presence verification
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//a[@id='OCalWikiPage' and text()='Wiki Page']")).isDisplayed());
		Assert.assertEquals(Page.getText("KBWikiPage_XPATH"), "Wiki Page");
	}

	// US-101213-101353-Verify the Content displayed in Announcements Tile for
	// Licensed User O-Calc Pro landing page
	@Test(priority = 11, enabled = true, description = "Verify contents on Announcements card for Licensed User")
	public void verifyContentsOfAnnouncementsLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Announcements First Announcement Presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//a[@id='OCalProSeminar'])[1]")).isDisplayed());
		System.out.println("First Announcement is:" + Page.getText("AnnouncementFirst_XPATH"));
		// Announcements Second Announcement Presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//a[@id='OCalProSeminar'])[2]")).isDisplayed());
		System.out.println("Second Announcement is:" + Page.getText("AnnouncementSecond_XPATH"));
		// Announcements Show All Button presence
		Assert.assertTrue(Page.driver.findElement(By.xpath("//div[@id='OCalToggleAnnc']")).isDisplayed());
		Page.click("AnnouncementShowAll_XPATH");
		// Announcements Third Announcement Presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//a[@id='OCalProSeminar'])[3]")).isDisplayed());
		System.out.println("Third Announcement is:" + Page.getText("AnnouncementThird_XPATH"));
		// Announcements Fourth Announcement Presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//a[@id='OCalProSeminar'])[4]")).isDisplayed());
		System.out.println("Fourth Announcement is:" + Page.getText("AnnouncementThird_XPATH"));
		// Announcements Fifth Announcement Presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//a[@id='OCalProSeminar'])[5]")).isDisplayed());
		System.out.println("Fifth Announcement is:" + Page.getText("AnnouncementThird_XPATH"));
		// Announcements Sixth Announcement Presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//a[@id='OCalProSeminar'])[6]")).isDisplayed());
		System.out.println("Sixth Announcement is:" + Page.getText("AnnouncementThird_XPATH"));
		// Announcements Show Less Button presence
		Assert.assertTrue(Page.driver.findElement(By.xpath("//span[@class='SHOWLESS']")).isDisplayed());
		Page.click("AnnouncementShowLess_XPATH");
	}

	// US-101213-101350-Verify the Content displayed in License Management Tile for
	// Licensed User O-Calc Pro landing page
	@Test(priority = 12, enabled = true, description = "Verify contents on License Management card for Licensed User")
	public void verifyContentsOfLicenseMgmtLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// License Management Active status Presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//div[@class='col-6 col-sm-6 mb-3' and text()=' Active ']"))
				.isDisplayed());
		System.out.println("Active Section: " + Page.getText("oCalProLicenseMgmtActive_XPATH"));
		// License Management Expired status Presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//div[@class='col-6 col-sm-6 mb-3' and text()=' Expired ']")).isDisplayed());
		System.out.println("Expired Section: " + Page.getText("oCalProLicenseMgmtExpired_XPATH"));
		// License Management Expiring Soon status Presence verification
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//div[@class='col-6 col-sm-6 mb-2' and text()=' Expiring Soon ']"))
						.isDisplayed());
		System.out.println("Expiring Section: " + Page.getText("oCalProLicenseMgmtExpiringSoon_XPATH"));
		// License Management Active Inactive Presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//div[@class='col-6 col-sm-6 mb-2' and text()=' Inactive ']")).isDisplayed());
		System.out.println("Inactive Section: " + Page.getText("oCalProLicenseMgmtInactive_XPATH"));
	}

	// US-101213-101352-Verify the Content displayed in Tutorial, Live Demo &
	// Support Tile for Licensed User O-Calc Pro landing page
	@Test(priority = 13, enabled = true, description = "Verify contents on Tutotial, Live Demo and Support card")
	public void verifyContentsOfTutorialLiveDemoLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// 30 days trial Presence verification
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//button[@id='OCalTrialButton' and @class='btnRounded w-100 mt-3']"))
						.isDisplayed());
		Assert.assertEquals(Page.getText("Tutorial30DaysBtn_XPATH"), "30 DAY FREE TRIAL");
		// Request Demo presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//button[@id='OCalLiveDemoButton' and @class='btnRounded w-100 mt-2']"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("TutorialReqDemo_XPATH"), "REQUEST A LIVE DEMO");
		// FAQ presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//a[@id='OCalFAQLink' and text()='FAQ']")).isDisplayed());
		Assert.assertEquals(Page.getText("TutorialFAQ_XPATH"), "FAQ");
		// Submit Issue presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//a[@id='OCalSubIssueLink' and text()='Submit Issue / Feature Request']"))
				.isDisplayed());
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
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//a[@id='OCalSupportLink' and text()='Contact O-Calc Pro Support']"))
						.isDisplayed());
		Assert.assertEquals(Page.getText("TutorialContactOcalcPro_XPATH"), "Contact O-Calc Pro Support");
	}

	@Test(priority = 14, enabled = true, description = "Verify click on Products card for Licensed User")
	public void verifyProductsClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickProducts();
		// Verification of header text
		WebElement HeaderTxt = Page.driver
				.findElement(By.xpath("//p[@class='mb-0' and text()='Pole and Line Products']"));
		Assert.assertTrue(HeaderTxt.isDisplayed());
		Assert.assertEquals(Page.getText("oCalcProductsHeaderTxt_XPATH"), "Pole and Line Products");
		Page.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='projectHeading']//h3[text()='O-Calc Pro']")));
		// Verification of the heading on the products
		WebElement HeadingTxt = Page.driver
				.findElement(By.xpath("//div[@class='projectHeading']//h3[text()='O-Calc Pro']"));
		Assert.assertTrue(HeadingTxt.isDisplayed());
		Assert.assertEquals(Page.getText("oCalcProductsHeadingTxt_XPATH"), "O-Calc Pro");
		// Verification of ocalc-pro License product presence
		WebElement OCalcLicense = Page.driver
				.findElement(By.xpath("//div[@title='O-Calc License']//div[text()='O-Calc License']"));
		Assert.assertTrue(OCalcLicense.isDisplayed());
		Assert.assertEquals(Page.getText("ProductsoCalcLicense_XPATH"), "O-Calc License");
		// Verification of ocalc-pro CVT product presence
		WebElement OCalcCVT = Page.driver.findElement(By.xpath("//div[@title='O-Calc CVT']//div[text()='O-Calc CVT']"));
		Assert.assertTrue(OCalcCVT.isDisplayed());
		Assert.assertEquals(Page.getText("ProductsoCalcCVT_XPATH"), "O-Calc CVT");
		// Verification of ocalc-pro Training product presence
		WebElement OCalcTraining = Page.driver
				.findElement(By.xpath("//div[@title='O-Calc Training']//div[text()='O-Calc Training']"));
		Assert.assertTrue(OCalcTraining.isDisplayed());
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
		WebElement LicenseTxt = Page.driver
				.findElement(By.xpath("(//div[@class='prdDetailhs2']//h3[text()=' O-Calc License '])[1]"));
		// Thread.sleep((Long.parseLong(p.config.getProperty("Thread25000"))));
		Assert.assertTrue(LicenseTxt.isDisplayed());
		Assert.assertEquals(Page.getText("oCalcLicenseTxt_XPATH"), "O-Calc License");
		WebElement LicenseDescTxt = Page.driver
				.findElement(By.xpath("(//div[@class='prdDetailhs2']//p[text()=' O-Calc License description '])[1]"));
		Assert.assertTrue(LicenseDescTxt.isDisplayed());
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
		WebElement CVTTxt = Page.driver
				.findElement(By.xpath("(//div[@class='prdDetailhs2']//h3[text()=' O-Calc CVT '])[1]"));
		Assert.assertTrue(CVTTxt.isDisplayed());
		Assert.assertEquals(Page.getText("oCalcCVTTxt_XPATH"), "O-Calc CVT");
		WebElement CVTDescTxt = Page.driver
				.findElement(By.xpath("(//div[@class='prdDetailhs2']//p[text()=' O-Calc CVT description '])[1]"));
		Assert.assertTrue(CVTDescTxt.isDisplayed());
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
		WebElement TrainingTxt = Page.driver
				.findElement(By.xpath("(//div[@class='prdDetailhs2']//h3[text()=' O-Calc Training '])[1]"));
		Assert.assertTrue(TrainingTxt.isDisplayed());
		Assert.assertEquals(Page.getText("oCalcRequestTrainingTxt_XPATH"), "O-Calc Training");
		WebElement TrainingDescTxt = Page.driver
				.findElement(By.xpath("(//div[@class='prdDetailhs2']//p[text()=' O-Calc Training description '])[1]"));
		Assert.assertTrue(TrainingDescTxt.isDisplayed());
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
		WebElement FirstName = Page.driver.findElement(By.xpath("//input[@id='a100001_l100001_e100009_first_name']"));
		Assert.assertTrue(FirstName.isDisplayed());
		// Verification of LastName field
		WebElement LastName = Page.driver.findElement(By.xpath("//input[@id='a100001_l100001_e100010_last_name']"));
		Assert.assertTrue(LastName.isDisplayed());
		// Verification of Company field
		WebElement Company = Page.driver.findElement(By.xpath("//input[@id='a100001_l100001_e100011_company']"));
		Assert.assertTrue(Company.isDisplayed());
		// Verification of Title field
		WebElement Title = Page.driver.findElement(By.xpath("//input[@id='a100001_l100001_e100012_title']"));
		Assert.assertTrue(Title.isDisplayed());
		// Verification of BusinessEmail field
		WebElement BusinessEmail = Page.driver
				.findElement(By.xpath("//input[@id='a100001_l100001_e100014_business_email']"));
		Assert.assertTrue(BusinessEmail.isDisplayed());
		// Verification of Phone field
		WebElement Phone = Page.driver.findElement(By.xpath("//input[@id='a100001_l100001_e100013_phone']"));
		Assert.assertTrue(Phone.isDisplayed());
		// Verification of Country field
		WebElement Country = Page.driver.findElement(By.xpath("//input[@id='a100001_l100001_e100015_country']"));
		Assert.assertTrue(Country.isDisplayed());
		// Verification of State field
		WebElement State = Page.driver.findElement(By.xpath("//input[@id='a100001_l100001_e100016_state']"));
		Assert.assertTrue(State.isDisplayed());
		// Verification of RequestTrialBtn button
		WebElement RequestTrialBtn = Page.driver
				.findElement(By.xpath("//input[@id='a100001_submit_btn' and @value='Request Trial']"));
		Assert.assertTrue(RequestTrialBtn.isDisplayed());
		Page.driver.switchTo().defaultContent();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		// Page.click("LicensedUser30daysBackBtn_XPATH");
		// Verification of close button
		WebElement closeBtn = Page.driver.findElement(By.xpath("//button[@class='close' and @type='button']"));
		Assert.assertTrue(closeBtn.isDisplayed());
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
		WebElement FirstName = Page.driver.findElement(By.xpath("//input[@id='a100035_l100019_e100193_first_name']"));
		Assert.assertTrue(FirstName.isDisplayed());
		// Verification of LastName field
		WebElement LastName = Page.driver.findElement(By.xpath("//input[@id='a100035_l100019_e100194_last_name']"));
		Assert.assertTrue(LastName.isDisplayed());
		// Verification of Company field
		WebElement Company = Page.driver.findElement(By.xpath("//input[@id='a100035_l100019_e100195_company']"));
		Assert.assertTrue(Company.isDisplayed());
		// Verification of Title field
		WebElement Title = Page.driver.findElement(By.xpath("//input[@id='a100035_l100019_e100196_title']"));
		Assert.assertTrue(Title.isDisplayed());
		// Verification of BusinessEmail field
		WebElement BusinessEmail = Page.driver
				.findElement(By.xpath("//input[@id='a100035_l100019_e100197_business_email']"));
		Assert.assertTrue(BusinessEmail.isDisplayed());
		// Verification of Phone field
		WebElement Phone = Page.driver.findElement(By.xpath("//input[@id='a100035_l100019_e100198_phone']"));
		Assert.assertTrue(Phone.isDisplayed());
		// Verification of Country field
		WebElement Country = Page.driver.findElement(By.xpath("//input[@id='a100035_l100019_e100199_country']"));
		Assert.assertTrue(Country.isDisplayed());
		// Verification of State field
		WebElement State = Page.driver.findElement(By.xpath("//input[@id='a100035_l100019_e100200_state']"));
		Assert.assertTrue(State.isDisplayed());
		// Verification of RequestTrialBtn button
		WebElement RequestTrialBtn = Page.driver
				.findElement(By.xpath("//input[@id='a100035_submit_btn' and @value='Request Demo']"));
		Assert.assertTrue(RequestTrialBtn.isDisplayed());
		Page.driver.switchTo().defaultContent();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Page.click("LicensedUserDemoBackBtn_XPATH");
		// Verification of close button
		WebElement closeBtn = Page.driver.findElement(By.xpath("//button[@class='close' and @type='button']"));
		Assert.assertTrue(closeBtn.isDisplayed());
		Page.click("LicensedUserDemoCloseBtn_XPATH");
	}

	@Test(priority = 20, enabled = true, description = "Verify click on Contact O-calc Support for Licensed User")
	public void verifyocalcSupportClickLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickContactoCalcSupportLinkLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of header text
		WebElement ContactUsHeaderTxt = Page.driver
				.findElement(By.xpath("//h5[@class='text-center' and text()=' Contact Us ']"));
		Assert.assertTrue(ContactUsHeaderTxt.isDisplayed());
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
		WebElement oCalApprovalPayWithCCBtn = Page.driver.findElement(
				By.xpath("//button[@class='btn btn-link mb-2 cstBtnOne w-100' and text()=' PAY WITH CREDIT CARD ']"));
		Assert.assertTrue(oCalApprovalPayWithCCBtn.isDisplayed());
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
		WebElement MakePymtBtn = Page.driver
				.findElement(By.xpath("//button[@class='btn cstBtnOne btn-link padMP' and text()=' MAKE PAYMENT ']"));
		Assert.assertTrue(MakePymtBtn.isDisplayed());
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
		WebElement pasteReceiptdetails = Page.driver.findElement(By.xpath(
				"//textarea[@class='form-control font12px txtBC' and @placeholder='Please copy and paste the details from your receipt here']"));
		Assert.assertTrue(pasteReceiptdetails.isDisplayed());
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
		WebElement CCReceipt = Page.driver.findElement(By.xpath(
				"(//div[@class='ccReceiptbtn btn-light relative float-left clearfix' and text()=' CC Receipt '])[1]"));
		Page.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"(//div[@class='ccReceiptbtn btn-light relative float-left clearfix' and text()=' CC Receipt '])[1]")));
		Assert.assertTrue(CCReceipt.isDisplayed());
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
		WebElement BackBtn = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Back ']"));
		Assert.assertTrue(BackBtn.isDisplayed());
		// Verification of Back btn text
		Assert.assertEquals(Page.getText("oCalCurrentPublicClassBackBtn_XPATH"), "Back");
		// Verification of the Header text
		Assert.assertEquals(Page.getText("oCalCurrentPublicClassesHeaderTxt_XPATH"), "O-Calc Pro Classes");
		// Verification of close button
		WebElement closeBtn = Page.driver.findElement(By.xpath("//button[@class='close' and @type='button']"));
		Assert.assertTrue(closeBtn.isDisplayed());
		Page.iFrames(1);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of O-Calc® Pro Training text
		Assert.assertEquals(Page.getText("oCalCurrentPublicClassesHeading_XPATH"), "O-Calc® Pro Training");
		Page.click("oCalCurrentPublicClassesFlyerBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.closeTab(1);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.switchToparentWindow();
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
		WebElement TrainingTxt = Page.driver
				.findElement(By.xpath("(//div[@class='prdDetailhs2']//h3[text()=' O-Calc Training '])[1]"));
		Assert.assertTrue(TrainingTxt.isDisplayed());
		Assert.assertEquals(Page.getText("oCalcRequestTrainingTxt_XPATH"), "O-Calc Training");
		WebElement TrainingDescTxt = Page.driver
				.findElement(By.xpath("(//div[@class='prdDetailhs2']//p[text()=' O-Calc Training description '])[1]"));
		Assert.assertTrue(TrainingDescTxt.isDisplayed());
		Assert.assertEquals(Page.getText("oCalcRequestTrainingDescription_XPATH"), "O-Calc Training description");
		ocal.RequestTrainingProductQuoteSubmission();
		Page.driver.navigate().back();
	}

	@Test(priority = 30, enabled = true, description = "Verify click on an Announcement for Licensed User")
	public void verifyClickOnAnAnnouncementLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		// Announcements First Announcement Presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//a[@id='OCalProSeminar'])[1]")).isDisplayed());
		Page.click("AnnouncementFirst_XPATH");
		// Verification of close button
		WebElement closeBtn = Page.driver.findElement(By.xpath("//button[@class='close' and @type='button']"));
		Assert.assertTrue(closeBtn.isDisplayed());
		// Verification of the Back button
		WebElement BackBtn = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Back ']"));
		Assert.assertTrue(BackBtn.isDisplayed());
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
		WebElement closeBtn = Page.driver.findElement(By.xpath("//button[@class='close' and @type='button']"));
		Assert.assertTrue(closeBtn.isDisplayed());
		// Verification of First category
		WebElement FirstCat = Page.driver
				.findElement(By.xpath("//a[@aria-controls='Category-0' and text()='Getting Started']"));
		Assert.assertTrue(FirstCat.isDisplayed());
		// Verification of the presence of First FAQ
		WebElement FAQFirst = Page.driver.findElement(By.xpath("//a[@aria-controls='category-0-accordion-0']"));
		Assert.assertTrue(FAQFirst.isDisplayed());
		System.out.println("First FAQ is: " + Page.getText("FAQFirst_XPATH"));
		// Verification of the presence of Second FAQ
		WebElement FAQSecond = Page.driver.findElement(By.xpath("//a[@aria-controls='category-0-accordion-1']"));
		Assert.assertTrue(FAQSecond.isDisplayed());
		System.out.println("Second FAQ is: " + Page.getText("FAQSecond_XPATH"));
		FirstCat.click();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertFalse(FAQFirst.isDisplayed());
		Assert.assertFalse(FAQSecond.isDisplayed());
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
		WebElement FAQFirstLink = Page.driver.findElement(By
				.xpath("//a[@rel ='noopener noreferrer nofollow' and text()='http://www.o-calcpro.com/LineDesign/']"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertEquals(FAQFirstLink.getText(), "http://www.o-calcpro.com/LineDesign/");
		WebElement FAQSecondLink = Page.driver
				.findElement(By.xpath("//a[text()='https://www.youtube.com/user/ocalcproinfo']"));
		Assert.assertEquals(FAQSecondLink.getText(), "https://www.youtube.com/user/ocalcproinfo");
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
		WebElement closeBtn = Page.driver.findElement(By.xpath("//button[@class='close' and @type='button']"));
		Assert.assertTrue(closeBtn.isDisplayed());
		// Verification of the Back button
		WebElement BackBtn = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Back ']"));
		Assert.assertTrue(BackBtn.isDisplayed());
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
		// Verification of header text
		WebElement HeaderTxt = Page.driver.findElement(By.xpath("//p[@class='mb-0' and text()='Knowledge Base']"));
		Assert.assertTrue(HeaderTxt.isDisplayed());
		Assert.assertEquals(Page.getText("KnowledgeBaseFirstHeaderTxt_XPATH"), "Knowledge Base");
		/*
		 * WebElement VideoResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		 * Assert.assertTrue(VideoResultsSection.isDisplayed());
		 */
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		/*
		 * WebElement OcalPopularFilter1 = Page.driver
		 * .findElement(By.xpath("//*[contains(text(),'Introduction to Pole Modeling')]"
		 * )); Assert.assertTrue(OcalPopularFilter1.isDisplayed()); WebElement
		 * OcalPopularFilter2 = Page.driver
		 * .findElement(By.xpath("//*[contains(text(),'Advanced Pole Modeling')]"));
		 * Assert.assertTrue(OcalPopularFilter2.isDisplayed()); WebElement
		 * OcalPopularFilter3 =
		 * Page.driver.findElement(By.xpath("//*[contains(text(),'Line Design')]"));
		 * Assert.assertTrue(OcalPopularFilter3.isDisplayed()); WebElement videoContent
		 * = Page.driver.findElement(By.xpath(
		 * "(//div[@class='Vplay']//img[@alt='play'])[1]"));
		 * Assert.assertTrue(videoContent.isDisplayed());
		 * Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		 * ocal.clickocalOnAVideo();
		 * Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		 * ocal.clickBoxCloseBtn();
		 */
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.clickocalOnADocument();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.closeTab(1);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.switchToparentWindow();
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
		/*
		 * WebElement HeaderTxt = Page.driver.findElement(By.
		 * xpath("//p[@class='mb-0' and text()='Knowledge Base']"));
		 * Assert.assertTrue(HeaderTxt.isDisplayed());
		 * Assert.assertEquals(Page.getText("KnowledgeBaseFirstHeaderTxt_XPATH"),
		 * "Knowledge Base"); WebElement VideoResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		 * Assert.assertTrue(VideoResultsSection.isDisplayed());
		 * Page.click("ocalVideosSeeMorelnk_XPATH"); WebElement videoContent =
		 * Page.driver.findElement(By.xpath(
		 * "(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		 * Assert.assertTrue(videoContent.isDisplayed());
		 * Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		 * ocal.clickocalOnASeeMoreVideo();
		 * Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		 * ocal.clickBoxCloseBtn();
		 */

		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
		Page.driver.navigate().back();
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
		WebElement HeaderTxt = Page.driver.findElement(By.xpath("//p[@class='mb-0' and text()='Knowledge Base']"));
		Assert.assertTrue(HeaderTxt.isDisplayed());
		Assert.assertEquals(Page.getText("KnowledgeBaseFirstHeaderTxt_XPATH"), "Knowledge Base");
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("ocalDocumentsSeeMorelnk_XPATH");
		WebElement DocumentContent = Page.driver
				.findElement(By.xpath("//div[@class='docBox m-0 mb-2']//a[text()='Setting Ownership']"));
		Assert.assertTrue(DocumentContent.isDisplayed());
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

	@Test(priority = 37, enabled = true, description = "Verify that Search results section will be organized into separate grouped based on the popular query selected for licensed user")
	public void verifySearchResultsAreGroupedLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		ocal.clickKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		// ocal.clickOCalcProIntroduction();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		/*
		 * WebElement VideoResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		 * Assert.assertTrue(VideoResultsSection.isDisplayed()); WebElement
		 * ImageResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		 * Assert.assertTrue(ImageResultsSection.isDisplayed());
		 */
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.navigate().back();
	}

	@Test(priority = 38, enabled = true, description = "Verify that Search results section will be organized into separate grouped based on the popular query selected for licensed user")
	public void verifyTrainingVideosAreGroupedLicensedUser() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		ocal.clickKBTrainingVideos();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		// ocal.clickOCalcProIntroduction();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		/*WebElement VideoResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());*/
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ocal.clickoCalcNavigation();
	}

	@Test(priority = 39, enabled = true, description = "Verify the Contents of License Management Pop-up")
	public void verifyContentsLicenseManagementPopUp() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		//ocal.clickoCalcProLogoForLicensedUser();
		ocal.clickLicenseManagement();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertEquals(Page.getText("LicenseManagementHeaderText_XPATH"),
				"LICENSE MANAGEMENT | PacifiCorp");
		WebElement ShowTourBtn = Page.driver
				.findElement(By.xpath("//button[@id='OCalShowTourBtn' and text()=' SHOW TOUR ']"));
		Assert.assertTrue(ShowTourBtn.isDisplayed());
		WebElement RenewBtn = Page.driver.findElement(By.xpath("//button[@id='OCalRenewBtn' and text()=' RENEW ']"));
		Assert.assertFalse(RenewBtn.isEnabled());
		WebElement TransferBtn = Page.driver
				.findElement(By.xpath("//button[@id='OCalTranfBtn' and text()=' TRANSFER ']"));
		Assert.assertFalse(TransferBtn.isEnabled());
		WebElement ResendBtn = Page.driver.findElement(By.xpath("//button[@id='OCalResendBtn' and text()=' RESEND ']"));
		Assert.assertFalse(ResendBtn.isEnabled());
		WebElement UpdateContactBtn = Page.driver
				.findElement(By.xpath("//button[@id='OCalUpdContactBtn' and text()=' UPDATE CONTACT ']"));
		Assert.assertFalse(UpdateContactBtn.isEnabled());
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(RenewBtn.isEnabled());
		Assert.assertTrue(TransferBtn.isEnabled());
		Assert.assertTrue(ResendBtn.isEnabled());
		Assert.assertTrue(UpdateContactBtn.isEnabled());

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
		WebElement Next = Page.driver
				.findElement(By.xpath("(//button[@class='ml-4 btn twoButtons' and text()=' Next '])[1]"));
		Assert.assertTrue(Next.isDisplayed());
		Next.click();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		/*
		 * WebElement Previous = Page.driver.findElement(By.
		 * xpath("(//button[@class='ml-4 btn btnRounded' and text()=' Previous '])[1]"))
		 * ; Assert.assertTrue(Previous.isDisplayed());
		 */
		WebElement ExitTour = Page.driver
				.findElement(By.xpath("//button[@class='ml-4 btn btnRounded exitButton' and text()=' Exit Tour ']"));
		Assert.assertTrue(ExitTour.isDisplayed());
	}

	@Test(priority = 41, enabled = true, description = "Verify the Click on Next and Previous buttons")
	public void verifyClickOnNextPreviousbtns() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		WebElement Next = Page.driver
				.findElement(By.xpath("//button[@class='ml-4 btn btnRounded' and text()=' Next ']"));
		Assert.assertTrue(Next.isDisplayed());
		WebElement Previous = Page.driver
				.findElement(By.xpath("(//button[@class='ml-4 btn btnRounded' and text()=' Previous '])[1]"));
		Assert.assertTrue(Previous.isDisplayed());
		WebElement ExitTour = Page.driver
				.findElement(By.xpath("//button[@class='ml-4 btn btnRounded exitButton' and text()=' Exit Tour ']"));
		Assert.assertTrue(ExitTour.isDisplayed());
		Previous.click();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		WebElement ExitTour1 = Page.driver
				.findElement(By.xpath("//button[@class='ml-4 btn twoButtons' and text()=' Exit Tour ']"));
		Assert.assertTrue(ExitTour1.isDisplayed());
	}

	@Test(priority = 42, enabled = true, description = "Verify the Click on Skip Tour and Exit Tour buttons")
	public void verifyClickOnSkipTourExitTourbtns() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		WebElement ExitTour1 = Page.driver
				.findElement(By.xpath("//button[@class='ml-4 btn twoButtons' and text()=' Exit Tour ']"));
		Assert.assertTrue(ExitTour1.isDisplayed());
		ExitTour1.click();
		Page.click("ShowTourBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		WebElement Next = Page.driver
				.findElement(By.xpath("(//button[@class='ml-4 btn twoButtons' and text()=' Next '])[1]"));
		Assert.assertTrue(Next.isDisplayed());
		Next.click();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		WebElement ExitTour = Page.driver
				.findElement(By.xpath("//button[@class='ml-4 btn btnRounded exitButton' and text()=' Exit Tour ']"));
		Assert.assertTrue(ExitTour.isDisplayed());
		ExitTour.click();
	}

	@Test(priority = 43, enabled = true, description = "verify that only Renew Button is Enabled On multiple record selection")
	public void verifyOnlyRenewBtnIsEnabledOnMultipleRecordSelection() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		WebElement RenewBtn = Page.driver.findElement(By.xpath("//button[@id='OCalRenewBtn' and text()=' RENEW ']"));
		Assert.assertTrue(RenewBtn.isEnabled());
		WebElement TransferBtn = Page.driver
				.findElement(By.xpath("//button[@id='OCalTranfBtn' and text()=' TRANSFER ']"));
		Assert.assertTrue(TransferBtn.isEnabled());
		WebElement ResendBtn = Page.driver.findElement(By.xpath("//button[@id='OCalResendBtn' and text()=' RESEND ']"));
		Assert.assertTrue(ResendBtn.isEnabled());
		WebElement UpdateContactBtn = Page.driver
				.findElement(By.xpath("//button[@id='OCalUpdContactBtn' and text()=' UPDATE CONTACT ']"));
		Assert.assertTrue(UpdateContactBtn.isEnabled());
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(RenewBtn.isEnabled());
		Assert.assertTrue(TransferBtn.isEnabled());
		Assert.assertTrue(ResendBtn.isEnabled());
		Assert.assertTrue(UpdateContactBtn.isEnabled());
		Page.click("LicenseManagementSecondCheckBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(RenewBtn.isEnabled());
		Assert.assertFalse(TransferBtn.isEnabled());
		Assert.assertFalse(ResendBtn.isEnabled());
		Assert.assertFalse(UpdateContactBtn.isEnabled());
		Page.click("LicenseManagementSecondCheckBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(RenewBtn.isEnabled());
		Assert.assertTrue(TransferBtn.isEnabled());
		Assert.assertTrue(ResendBtn.isEnabled());
		Assert.assertTrue(UpdateContactBtn.isEnabled());
	}

	@Test(priority = 44, enabled = true, description = "Verify the Filter functionality of Contact Name column")
	public void verifyFilterContactName() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("LicenseManagementContactNameCol_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("LicenseManagementContactNameCol_XPATH");
		WebElement FirstName = Page.driver.findElement(By.xpath("(//div[@ref='eCellWrapper'])[1]"));
		System.out.println("First Name in the Contact Name is: " + FirstName.getText());
		WebElement SecondName = Page.driver.findElement(By.xpath("(//div[@ref='eCellWrapper'])[2]"));
		System.out.println("Second Name in the Contact Name is: " + SecondName.getText());
		Page.click("LicenseManagementContactNameCol_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		WebElement FirstNameAfterSort = Page.driver.findElement(By.xpath("(//div[@ref='eCellWrapper'])[1]"));
		System.out.println("First Name in the Contact Name is: " + FirstNameAfterSort.getText());
		WebElement SecondNameAfterSort = Page.driver.findElement(By.xpath("(//div[@ref='eCellWrapper'])[2]"));
		System.out.println("Second Name in the Contact Name is: " + SecondNameAfterSort.getText());
	}

	@Test(priority = 45, enabled = true, description = "Verify the Filter functionality of License key column")
	public void verifyFilterLicenseKey() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("LicenseManagementLicenseKeyFilter_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		WebElement SearchBox = Page.driver
				.findElement(By.xpath("(//input[@ref='eInput' and @placeholder='Search...'])[1]"));
		Assert.assertTrue(SearchBox.isDisplayed());
		Page.type("LicenseManagementLicenseKeySearch_XPATH", "GKR72ZPB3QW4G8N");
		Page.driver.findElement(By.xpath("(//input[@ref='eInput'])[10]")).sendKeys(Keys.ENTER);
		Page.click("LicenseManagementHeaderText_XPATH");
		WebElement LicenseKeyValue1 = Page.driver.findElement(By.xpath("(//div[@col-id='licenseKey'])[2]"));
		System.out.println("License Key is: " + LicenseKeyValue1.getText());
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
		WebElement SelectAllChkBx = Page.driver.findElement(By.xpath("//span[@ref='eSelectAllLabel']"));
		Assert.assertTrue(SelectAllChkBx.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		SelectAllChkBx.click();
		WebElement ActiveChkBx = Page.driver.findElement(By.xpath("(//span[@ref='eFilterItemValue'])[1]"));
		Assert.assertTrue(ActiveChkBx.isDisplayed());
		ActiveChkBx.click();
		Page.click("LicenseManagementHeaderText_XPATH");
		WebElement StatusValue = Page.driver.findElement(By.xpath("//span[@class='rag-element']"));
		Assert.assertEquals(StatusValue.getText(), "ACTIVE");
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
		WebElement SearchBox = Page.driver
				.findElement(By.xpath("(//input[@ref='eInput' and @placeholder='Search...'])[1]"));
		Assert.assertTrue(SearchBox.isDisplayed());
		Page.type("LicenseManagementExpTokenSearch_XPATH", "UA9PKT57ZZ");
		Page.driver.findElement(By.xpath("(//input[@ref='eInput'])[10]")).sendKeys(Keys.ENTER);
		Page.click("LicenseManagementHeaderText_XPATH");
		WebElement LicenseKeyValue1 = Page.driver.findElement(By.xpath("(//div[@col-id='expirationToken'])[2]"));
		System.out.println("The Exp Token is: " + LicenseKeyValue1.getText());
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
		WebElement SelectAllChkBx = Page.driver.findElement(By.xpath("//span[@ref='eSelectAllLabel']"));
		Assert.assertTrue(SelectAllChkBx.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		SelectAllChkBx.click();
		WebElement SingleUserChkBx = Page.driver.findElement(By.xpath("(//span[@ref='eFilterItemValue'])[1]"));
		Assert.assertTrue(SingleUserChkBx.isDisplayed());
		SingleUserChkBx.click();
		Page.click("LicenseManagementHeaderText_XPATH");
		WebElement LicenseTypeValue = Page.driver.findElement(By.xpath("(//div[@col-id='licenseTypeName'])[2]"));
		Assert.assertEquals(LicenseTypeValue.getText(), "Single User");
		Page.click("LicenseManagementLicenseTypeFilter_XPATH");
		Page.click("LicenseManagementLicenseTypeResetBtn_XPATH");
		Page.click("LicenseManagementHeaderText_XPATH");
	}

	@Test(priority = 49, enabled = false, description = "Verify the Filter functionality of License Type column when Site is selected as license type")
	public void verifyFilterLicenseTypeSite() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("LicenseManagementLicenseTypeFilter_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		WebElement SelectAllChkBx = Page.driver.findElement(By.xpath("//span[@ref='eSelectAllLabel']"));
		Assert.assertTrue(SelectAllChkBx.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		SelectAllChkBx.click();
		WebElement SiteChkBx = Page.driver.findElement(By.xpath("(//span[@ref='eFilterItemValue'])[2]"));
		Assert.assertTrue(SiteChkBx.isDisplayed());
		SiteChkBx.click();
		Page.click("LicenseManagementHeaderText_XPATH");
		WebElement LicenseTypeValue = Page.driver.findElement(By.xpath("(//div[@col-id='licenseTypeName'])[2]"));
		Assert.assertEquals(LicenseTypeValue.getText(), "Site");
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		WebElement RenewBtn = Page.driver.findElement(By.xpath("//button[@id='OCalRenewBtn' and text()=' RENEW ']"));
		Assert.assertTrue(RenewBtn.isEnabled());
		WebElement TransferBtn = Page.driver
				.findElement(By.xpath("//button[@id='OCalTranfBtn' and text()=' TRANSFER ']"));
		Assert.assertFalse(TransferBtn.isEnabled());
		WebElement ResendBtn = Page.driver.findElement(By.xpath("//button[@id='OCalResendBtn' and text()=' RESEND ']"));
		Assert.assertFalse(ResendBtn.isEnabled());
		WebElement UpdateContactBtn = Page.driver
				.findElement(By.xpath("//button[@id='OCalUpdContactBtn' and text()=' UPDATE CONTACT ']"));
		Assert.assertFalse(UpdateContactBtn.isEnabled());
		Page.click("LicenseManagementSecondCheckBox_XPATH");
		Assert.assertTrue(RenewBtn.isEnabled());
		Assert.assertFalse(TransferBtn.isEnabled());
		Assert.assertFalse(ResendBtn.isEnabled());
		Assert.assertFalse(UpdateContactBtn.isEnabled());
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
		WebElement purchaseDate = Page.driver
				.findElement(By.xpath("(//input[@ref='eInput' and @placeholder='yyyy-mm-dd'])[1]"));
		Assert.assertTrue(purchaseDate.isDisplayed());
		Page.type("LicenseManagementPurchaseDateSearch_XPATH", "10/07/2019");
		Page.click("LicenseManagementPurchaseDateORradio_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Actions action = new Actions(Page.driver);
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Page.click("LicenseManagementPurchaseDateNotEqualoption_XPATH");
		Page.type("LicenseManagementPurchaseDate1Search_XPATH", "10/07/2019");
		Page.click("LicenseManagementHeaderText_XPATH");
		WebElement PurchaseDateValue = Page.driver.findElement(By.xpath("(//div[@col-id='purchaseDate'])[2]//span"));
		System.out.println("Purchase Date is: " + PurchaseDateValue.getText());
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
		WebElement expirationDate = Page.driver
				.findElement(By.xpath("(//input[@ref='eInput' and @placeholder='yyyy-mm-dd'])[1]"));
		Assert.assertTrue(expirationDate.isDisplayed());
		Page.type("LicenseManagementExpirationDateSearch_XPATH", "04/29/2022");
		Page.click("LicenseManagementExpirationDateORradio_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Actions action = new Actions(Page.driver);
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Page.click("LicenseManagementExpirationDateNotEqualoption_XPATH");
		Page.type("LicenseManagementExpirationDate1Search_XPATH", "10/07/2019");
		Page.click("LicenseManagementHeaderText_XPATH");
		WebElement ExpirationDateValue = Page.driver
				.findElement(By.xpath("(//div[@col-id='expirationDate'])[2]//span"));
		System.out.println("Expiration Date: " + ExpirationDateValue.getText());
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
		WebElement TransferBtn1 = Page.driver
				.findElement(By.xpath("//button[@id='OCalTranfBtn' and text()=' TRANSFER ']"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertTrue(TransferBtn1.isEnabled());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("TransferBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		WebElement TransferBtnHeaderTxt = Page.driver.findElement(By.xpath("//h3[text()=' TRANSFER LICENSE ']"));
		Assert.assertTrue(TransferBtnHeaderTxt.isDisplayed());
		Assert.assertEquals(Page.getText("TransferPopUpHeaderTxt_XPATH"), "TRANSFER LICENSE");
		WebElement CloseBtn = Page.driver
				.findElement(By.xpath("//div[@class='crsPointer closeSMPanel' and text()=' X ']"));
		Assert.assertTrue(CloseBtn.isDisplayed());
		WebElement HeaderTxt = Page.driver.findElement(By.xpath(
				"//p[contains(text(),' Enter the details of the person you are transferring the license to. ')]"));
		Assert.assertTrue(HeaderTxt.isDisplayed());
		Assert.assertEquals(Page.getText("TransferPopUpHeader_XPATH"),
				"Enter the details of the person you are transferring the license to.");
		WebElement FirstName = Page.driver
				.findElement(By.xpath("//input[@id='OCalFnameInput' and @placeholder='*First Name']"));
		Assert.assertTrue(FirstName.isDisplayed());
		WebElement LastName = Page.driver
				.findElement(By.xpath("//input[@id='OCalLnameInput' and @placeholder='*Last Name']"));
		Assert.assertTrue(LastName.isDisplayed());
		WebElement Email = Page.driver
				.findElement(By.xpath("//input[@id='OCalEmailInput' and @placeholder='*Email Address']"));
		Assert.assertTrue(Email.isDisplayed());
		WebElement Phone = Page.driver
				.findElement(By.xpath("//input[@id='OCalPhoneInput' and @placeholder='Phone Number']"));
		Assert.assertTrue(Phone.isDisplayed());
		WebElement TransferLicenseBtn = Page.driver
				.findElement(By.xpath("//button[@id='OCalTrnfLicBtn' and text()=' TRANSFER LICENSE ']"));
		Assert.assertTrue(TransferLicenseBtn.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		Page.click("TransferPopUpCloseBtn_XPATH");
	}

	@Test(priority = 53, enabled = true, description = "Verify that error message is displayed on clicking on Transfer License without filling the details")
	public void verifyTransferErrorMsg() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("TransferBtn_XPATH");
		Page.click("TransferPopUpTransferBtn_XPATH");
		WebElement ErrorMsg = Page.driver
				.findElement(By.xpath("//*[contains(text(),' Fields marked with * are mandatory ')]"));
		Assert.assertEquals(ErrorMsg.getText(), "Fields marked with * are mandatory");
		Page.click("TransferPopUpCloseBtn_XPATH");
	}

	@Test(priority = 54, enabled = true, description = "Verify click on Transfer License Button")
	public void verifyClickTransferLicenseBtn() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("TransferBtn_XPATH");
		ocal.clickLicenseTransferBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertEquals(Page.getText("TransferCompleteTxt_XPATH"), "TRANSFER COMPLETE!");
		Assert.assertEquals(Page.getText("TransferCompletePopUptxt_XPATH"),
				"A notification has been sent to email@gmail.com");
		WebElement CloseBtn = Page.driver.findElement(By.xpath("//button[@id='OCalTrnfCmpBtn' and text()=' CLOSE ']"));
		Assert.assertTrue(CloseBtn.isDisplayed());
		Page.click("TransferCompletePopUpCloseBtn_XPATH");
	}

	@Test(priority = 55, enabled = true, description = "Verify Resend button functionality")
	public void verifyClickResend() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		WebElement ResendBtn = Page.driver.findElement(By.xpath("//button[@id='OCalResendBtn' and text()=' RESEND ']"));
		Assert.assertTrue(ResendBtn.isEnabled());
		Page.click("ResendBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of the contents of Resend pop-up
		WebElement Headertxt = Page.driver.findElement(By.xpath("//*[contains(text(),' RESEND COMPLETE! ')]"));
		Assert.assertEquals(Page.getText("ResendPopUpHeaderTxt_XPATH"), "RESEND COMPLETE!");
		WebElement ResendPopUpTxt = Page.driver
				.findElement(By.xpath("//div[@id='tranferCompleted___BV_modal_body_']//p"));
		System.out.println("Resend PopUp text is: " + ResendPopUpTxt.getText());
		WebElement CloseBtn = Page.driver.findElement(By.xpath("//button[@id='OCalTrnfCmpBtn' and text()=' CLOSE ']"));
		Assert.assertTrue(CloseBtn.isDisplayed());
		Page.click("ResendCompletePopUpCloseBtn_XPATH");
	}

	@Test(priority = 56, enabled = true, description = "Verify Update Contact button pop up UI")
	public void verifyUpdateContactBtn() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Update Contact button contents presence verification
		WebElement UpdateContactBtn = Page.driver
				.findElement(By.xpath("//button[@id='OCalUpdContactBtn' and text()=' UPDATE CONTACT ']"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(UpdateContactBtn.isEnabled());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("UpdateContactBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		WebElement UpdateContactBtnHeaderTxt = Page.driver.findElement(By.xpath("//h3[text()=' UPDATE CONTACT ']"));
		Assert.assertTrue(UpdateContactBtnHeaderTxt.isDisplayed());
		Assert.assertEquals(Page.getText("UpdateContactPopUpHeaderTxt_XPATH"), "UPDATE CONTACT");
		WebElement CloseBtn = Page.driver
				.findElement(By.xpath("//div[@class='crsPointer closeSMPanel' and text()=' X ']"));
		Assert.assertTrue(CloseBtn.isDisplayed());
		WebElement HeaderTxt = Page.driver.findElement(
				By.xpath("//p[contains(text(),' Enter the contact details to be updated for the license. ')]"));
		Assert.assertTrue(HeaderTxt.isDisplayed());
		Assert.assertEquals(Page.getText("UpdateContactPopUpHeader_XPATH"),
				"Enter the contact details to be updated for the license.");
		WebElement FirstName = Page.driver
				.findElement(By.xpath("//input[@id='OCalFnameInput' and @placeholder='*First Name']"));
		Assert.assertTrue(FirstName.isDisplayed());
		System.out.println("The FirstName in UpdateContact is: " + FirstName.getAttribute("value"));
		WebElement LastName = Page.driver
				.findElement(By.xpath("//input[@id='OCalLnameInput' and @placeholder='*Last Name']"));
		Assert.assertTrue(LastName.isDisplayed());
		System.out.println("The LastName in UpdateContact is: " + LastName.getAttribute("value"));
		WebElement Email = Page.driver
				.findElement(By.xpath("//input[@id='OCalEmailInput' and @placeholder='*Email Address']"));
		Assert.assertTrue(Email.isDisplayed());
		System.out.println("The Email in UpdateContact is: " + Email.getAttribute("value"));
		WebElement Phone = Page.driver
				.findElement(By.xpath("//input[@id='OCalPhoneInput' and @placeholder='Phone Number']"));
		Assert.assertTrue(Phone.isDisplayed());
		System.out.println("The Phone in UpdateContact is: " + Phone.getAttribute("value"));
		WebElement TransferLicenseBtn = Page.driver
				.findElement(By.xpath("//button[@id='OCalTrnfLicBtn' and text()=' UPDATE CONTACT INFO ']"));
		Assert.assertTrue(TransferLicenseBtn.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		Page.click("UpdateContactPopUpCloseBtn_XPATH");
	}

	@Test(priority = 57, enabled = true, description = "Verify click on Update Contact Button")
	public void verifyClickUpdateContactBtn() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("UpdateContactBtn_XPATH");
		Page.click("UpdateContactPopUpUpdateContactInfoBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertEquals(Page.getText("UpdateCompleteTxt_XPATH"), "UPDATE COMPLETE!");
		WebElement UpdateCompletePopUptxt = Page.driver
				.findElement(By.xpath("//div[@id='tranferCompleted___BV_modal_body_']//p"));
		System.out.println("Update Contact Complete PopUp text is: " + UpdateCompletePopUptxt.getText());
		WebElement CloseBtn = Page.driver.findElement(By.xpath("//button[@id='OCalTrnfCmpBtn' and text()=' CLOSE ']"));
		Assert.assertTrue(CloseBtn.isDisplayed());
		Page.click("UpdateCompletePopUpCloseBtn_XPATH");
	}

	@Test(priority = 58, enabled = true, description = "Verify click on Renew Button functionality")
	public void verifyClickRenewBtn() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.click("LicenseManagementFirstCheckBox_XPATH");
		Page.click("RenewBtn_XPATH");
		Page.wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//div[@class='prdDetailhs2']//h3[text()=' O-Calc License '])[1]")));
		// Verification of header text
		WebElement LicenseTxt = Page.driver
				.findElement(By.xpath("(//div[@class='prdDetailhs2']//h3[text()=' O-Calc License '])[1]"));
		Assert.assertTrue(LicenseTxt.isDisplayed());
		Assert.assertEquals(Page.getText("oCalcLicenseTxt_XPATH"), "O-Calc License");
		WebElement LicenseDescTxt = Page.driver
				.findElement(By.xpath("(//div[@class='prdDetailhs2']//p[text()=' O-Calc License description '])[1]"));
		Assert.assertTrue(LicenseDescTxt.isDisplayed());
		Assert.assertEquals(Page.getText("oCalcLicenseDescription_XPATH"), "O-Calc License description");
		System.out.println("The Prepopulated Size is: " + Page.getdefaultValuefromdropdown("RenewSizeDD_XPATH"));
		WebElement AddTxtBox = Page.driver.findElement(
				By.xpath("//input[@id='selectQuantity' and @title='Please enter quantity between 1 and 999']"));
		System.out.println("The Prepopulated Quantity is: " + AddTxtBox.getAttribute("value"));
		ocal.RenewProductQuoteSubmission();
		WebElement QuoteComments = Page.driver.findElement(By.xpath("//textarea[@id='commentQuotes']"));
		System.out.println("The Prepopulated Comments is: " + QuoteComments.getAttribute("value"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("oCalProductSubmitBtn_XPATH");
	}
	
	@Test(priority = 59, enabled = true, description = "Verify presence of License Management card on OcalcPro page for Licensed User")
	public void verifyPresenceOfLicenseMgmtCard1() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcProLogoForLicensedUser();
		// License Management presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//h5[@class='m-0 crspointer' and text()='License Management ']")).isDisplayed());
	}

}
