package com.OSMOSE.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.Login;
import com.OSMOSE.pages.OU.OsmoseServicesPage;
import com.OSMOSE.pages.OU.oCalcProPage;

public class oCalcPro_Nor extends BaseTest {

	Page p = new Page();

	@Test(priority = 0, description = "Verify the login functionality")
	public void loginTest() throws InterruptedException {
		Login lo = new Login();
		Page.type("email_XPATH", "rajesh.yadav@centurylink.com");
		Page.type("password_XPATH", "Hyde@2317");
		Page.click("submit_XPATH");
		String element = Page.getText("verify_ID");
		Assert.assertEquals(element, "Rajesh Yadav");
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

	// US-101212-101307-Verify UI and Layout of the O-Calc Pro landing page for
	// Prospective User
	// US-101212-101314-Verify the Tiles displayed in the Prospective User O-Calc
	// Pro landing page
	@Test(priority = 2, enabled = true, description = "Verify presence of Get Started With Ocalc Pro card")
	public void verifyPresenceOfGetStartedWithOcalcPro() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Get Started with Ocalc Pro card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//h5[@class='m-0 showPointer' and text()='Get Started With O-Calc Pro']"))
				.isDisplayed());
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
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//h5[@id='OCalProductsTile' and text()='Products ']")).isDisplayed());
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
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//h5[@class='m-0 crspointer' and text()='Knowledge Base ']")).isDisplayed());
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
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Announcements ']")).isDisplayed());
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
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Training Options ']")).isDisplayed());
	}

	// US-101214-101355-Verify the Content displayed in Get Started With O-Calc Pro
	// Tile for Prospective User O-Calc Pro landing page
	@Test(priority = 7, enabled = true, description = "Verify contents on Get Started With Ocalc Pro card")
	public void verifyContentsOfGetStartedWithOcalcPro() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// Get Started with Ocalc Pro card Header text Presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@class='mt-2 mb-2 font12px' and text()=' O-Calc Pro takes the guesswork out of load calculation for line design, pole replacement, and joint-use loading. ']"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("GetStartedTxt_XPATH"),
				"O-Calc Pro takes the guesswork out of load calculation for line design, pole replacement, and joint-use loading.");
		// Get Started with Ocal Pro card Learn More presence verification
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//a[@id='OCalOpenLrnMore' and text()='Learn More']")).isDisplayed());
		Assert.assertEquals(Page.getText("GetStartedLearnMoreLink_XPATH"), "Learn More");
		// Get Started with Ocal Pro card 30 days trial presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//button[@id='OCaltrialDwnldBtn' and @class='btnRounded']"))
				.isDisplayed());
		// Get Started with Ocal Pro card Request a Demo presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//button[@id='OCalReqDemoPageBtn' and @class='btnRounded']")).isDisplayed());
		// Get Started with Ocal Pro card Contact O-Calc Support presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//a[@id='OCalContSupportLink' and text()='Contact O-Calc Pro Support']"))
				.isDisplayed());
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

	// US-101212-101319-Verify the Content displayed in Knowledge Base Tile for
	// Prospective User O-Calc Pro landing page
	@Test(priority = 9, enabled = true, description = "Verify contents on Knowledge Base card")
	public void verifyContentsOfKBCard() throws InterruptedException {
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

	// US-101212-101341-Verify the Content displayed in Announcements Tile for
	// Prospective User O-Calc Pro landing page
	@Test(priority = 10, enabled = true, description = "Verify contents on Announcements card")
	public void verifyContentsOfAnnouncements() throws InterruptedException {
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

	// US-101212-101343-Verify the Content displayed in Training Options Tile for
	// Prospective User O-Calc Pro landing page
	@Test(priority = 11, enabled = true, description = "Verify contents on Training Options card")
	public void verifyContentsOfTrainingOptions() throws InterruptedException {
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

	@Test(priority = 12, enabled = true, description = "Verify click on Learn More on Get Started With Ocalc Pro card")
	public void verifyLearnMoreClickonGetStartedWithOcalcProcard() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the Header text
		Assert.assertEquals(Page.getText("GetStartedLearnMoreHeaderTxt_XPATH"), "O-Calc Pro");
		// Verification of close button
		WebElement closeBtn = Page.driver.findElement(By.xpath("//button[@class='close' and @type='button']"));
		Assert.assertTrue(closeBtn.isDisplayed());
		// Verification of the Back button
		WebElement BackBtn = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Back ']"));
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
		// Page.click("30daysBackBtn_XPATH");
		// Verification of close button
		WebElement closeBtn = Page.driver.findElement(By.xpath("//button[@class='close' and @type='button']"));
		Assert.assertTrue(closeBtn.isDisplayed());
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
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		// Page.click("DemoBackBtn_XPATH");
		// Verification of close button
		WebElement closeBtn = Page.driver.findElement(By.xpath("//button[@class='close' and @type='button']"));
		Assert.assertTrue(closeBtn.isDisplayed());
		Page.click("DemoCloseBtn_XPATH");
	}

	// US-101214-101367-Verify the Contact O-Calc Pro Support link functionality in
	// Get Started With O-Calc Pro Tile for Prospective User O-Calc Pro landing page
	@Test(priority = 15, enabled = true, description = "Verify click on Contact O-calc Support on Get Started With Ocalc Pro card")
	public void verifyocalcSupportClickonGetStartedWithOcalcProcard() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickContactoCalcSupportLink();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verification of header text
		WebElement ContactUsHeaderTxt = Page.driver
				.findElement(By.xpath("//h5[@class='text-center' and text()=' Contact Us ']"));
		Assert.assertTrue(ContactUsHeaderTxt.isDisplayed());
		Assert.assertEquals(Page.getText("oCalcProContactUsHeaderTxt_XPATH"), "Contact Us");
		// Verification of Default value on subject field
		String defaultValue = Page.getdefaultValuefromdropdown("oCalcProContactUsFormSubjectdd_XPATH");
		Assert.assertEquals(defaultValue, "O-Calc Pro Support");
		Page.click("oCalcProContactUscloseBtn_XPATH");
		// ocal.clickoCalcNavigation();
	}

	// US-101215-101369-Verify by clicking on Product title in Product Tile in
	// O-Calc Pro landing page
	@Test(priority = 16, enabled = true, description = "Verify click on Products card")
	public void verifyProductsClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickProducts();
		// Verification of header text
		WebElement HeaderTxt = Page.driver
				.findElement(By.xpath("//p[@class='mb-0' and text()='Pole and Line Products']"));
		Assert.assertTrue(HeaderTxt.isDisplayed());
		Assert.assertEquals(Page.getText("oCalcProductsHeaderTxt_XPATH"), "Pole and Line Products");
		// Verification of the heading on the products
		Page.wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='projectHeading']//h3[text()='O-Calc Pro']")));
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
		ocal.clickoCalcNavigation();
	}

	// US-101215-101370-Verify Request License Quote link functionality in Product
	// Tile in O-Calc Pro landing page
	@Test(priority = 17, enabled = true, description = "Verify click on Request License Quote on Products card and submit quote")
	public void verifyRequestLicenseQuoteClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickRequestLicenseQuote();
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
		WebElement callNowTxt = Page.driver.findElement(By.xpath("(//a[contains(text(),'(716) 319-3423')])[1]"));
		Assert.assertTrue(callNowTxt.isDisplayed());
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
		ocal.clickoCalcNavigation();
	}

	// US-101215-101372-Verify Request CVT Quote link functionality in Product Tile
	// in O-Calc Pro landing page
	@Test(priority = 19, enabled = true, description = "Verify click on Request Training Quote on Products card and submit quote")
	public void verifyRequestTrainingQuoteClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
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
		ocal.clickoCalcNavigation();
	}

	@Test(priority = 20, enabled = true, description = "Verify click on Current Public classes on Training Options")
	public void verifyCurrentPublicClassesClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// ocal.clickoCalcCard();
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

	@Test(priority = 21, enabled = true, description = "Verify click on Request Quote for Private Training classes on Training Options")
	public void verifyRequestQuoteForPrivateTrainingClassesClick() throws InterruptedException {
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
		ocal.clickoCalcNavigation();
	}

	@Test(priority = 22, enabled = true, description = "Verify click on an Announcement")
	public void verifyClickOnAnAnnouncement() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
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

	@Test(priority = 23, enabled = true, description = "Verify click on Knowledge Base card")
	public void verifyKBClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
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
		 * Assert.assertTrue(OcalPopularFilter3.isDisplayed());
		 */
		/*
		 * WebElement videoContent = Page.driver.findElement(By.xpath(
		 * "(//div[@class='Vplay']//img[@alt='play'])[1]"));
		 * Assert.assertTrue(videoContent.isDisplayed());
		 * Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		 * ocal.clickocalOnAVideo();
		 * Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		 * ocal.clickBoxCloseBtn();
		 */
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
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
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
		ocal.clickoCalcNavigation();
	}

	@Test(priority = 25, enabled = true, description = "Verify click on Wiki Page on Knowledge Base card")
	public void verifyKBWikiPageClick() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		ocal.clickKBWikiPage();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
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
		ocal.clickoCalcNavigation();
	}

	@Test(priority = 26, enabled = true, description = "Verify that Search results section will be organized into separate grouped based on the popular query selected")
	public void verifySearchResultsAreGrouped() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
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

		/*
		 * WebElement noresults = Page.driver .findElement(By.
		 * xpath("//div[contains(text(),'No results match your search criteria')]"));
		 * String text = noresults.getText(); String newtext =
		 * text.substring(text.indexOf('\n') + 1); Assert.assertEquals(newtext,
		 * "No results match your search criteria.");
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
		/*
		 * ocal.clickOCalcProIntroduction();
		 * Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		 * WebElement VideoResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		 * Assert.assertTrue(VideoResultsSection.isDisplayed()); WebElement
		 * ImageResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		 * Assert.assertTrue(ImageResultsSection.isDisplayed()); WebElement
		 * DocumentResultsSection = Page.driver
		 * .findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		 * Assert.assertTrue(DocumentResultsSection.isDisplayed());
		 */
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ocal.clickoCalcNavigation();
	}

	@Test(priority = 28, enabled = true, description = "Verify presence of License Management tile for Prospective User")
	public void verifyPresenceOfLicenseManagementPerspective() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		// License Management card presence verification
		// Assert.assertFalse(Page.driver.findElement(By.xpath("//h5[@class='m-0
		// crspointer' and text()='License Management ']")).isDisplayed());
		Assert.assertFalse(Page.isElementPresent(By.xpath("LicensedUserLicenseManagementCard_XPATH")));
	}

}
