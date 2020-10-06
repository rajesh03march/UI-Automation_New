package com.OSMOSE.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.ContactPage;
import com.OSMOSE.pages.OU.ProductPage;

public class Contact extends BaseTest {
	
	Page p = new Page();
	
	@Test(priority = 0, description = "Verification of the presence of Contact Us Menu items.")
	public void verifyContactUsMenuContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.clickContactUsMainMenudd();
		Assert.assertEquals(Page.getText("ContactUsMenu_XPATH"), "Contact Us");
		Assert.assertEquals(Page.getText("ViewContactsMenu_XPATH"), "View Contacts");
	}

	@Test(priority = 1, enabled = true, description = "Verification of the presence Project Group")
	public void verifyPresenceOfProjectGroup() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		WebElement ProjectGroup = Page.driver.findElement(By.xpath("//a[@id='o360projectSel__BV_toggle_']"));
		Assert.assertTrue(ProjectGroup.isDisplayed());
	}
	
	@Test(priority = 2, enabled = true, description = "Verification of the content on a contact card on City Of Columbia-Colombiapit")
	public void verifyCityOfColumbiaContactCardContents() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.navigateToColombiapit();
		cp.clickContactUsMainMenudd();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		cp.ClickViewContactsMenu();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("CityOfColumbiaContactstxt_XPATH"), "COLOMBIAPIT Contacts");
		Assert.assertEquals(Page.getText("ContractsTxt_XPATH"), "Contracts");
		Assert.assertEquals(Page.getText("ContactsEmail_XPATH"), "OsmoseContracts@Osmose.com");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}
	
	@Test(priority = 3, enabled = true, description = "Verification of the content on a contact card on Georgia Power Company-Georgia Power Company Distribution Change")
	public void verifyGeorgiaPowerCompanyContactCardContents() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.navigateToGeorgiaPowerCompanyDistributionChange();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		cp.clickContactUsMainMenudd();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		cp.ClickViewContactsMenu();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Assert.assertEquals(Page.getText("GeorgiaContactstxt_XPATH"), "Georgia Power Company Distribution Change Contacts");
		Assert.assertEquals(Page.getText("GeorgiaContactCardName_XPATH"), "Heartsill,Jason Shane");
		Assert.assertEquals(Page.getText("GeorgiaContactCardDesignation_XPATH"), "Director Business Development");
		Assert.assertEquals(Page.getText("GeorgiaContactCardEmail_XPATH"), "sheartsill@osmose.com");
		Assert.assertEquals(Page.getText("GeorgiaContactCardMobile_XPATH"), "(901) 494-2129");
		Assert.assertEquals(Page.getText("ContractsTxt_XPATH"), "Contracts");
		Assert.assertEquals(Page.getText("ContactsEmail_XPATH"), "OsmoseContracts@Osmose.com");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
	}
	
	@Test(priority = 4, enabled = true, description = "Verification of the content on a contact card on Grand Electric-GrandElectric")
	public void verifyGrandElectricContactCardContents() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.navigateToGrandElectric();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		cp.clickContactUsMainMenudd();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		cp.ClickViewContactsMenu();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("GrandElectricContactstxt_XPATH"), "Grand Electric Contacts");
		Assert.assertEquals(Page.getText("ContractsTxt_XPATH"), "Contracts");
		Assert.assertEquals(Page.getText("ContactsEmail_XPATH"), "OsmoseContracts@Osmose.com");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}
	
	@Test(priority = 5, enabled = true, description = "Verification of the content on a contact card on Idaho Power Company-Idaho Power Inspection")
	public void verifyIdahoPowerInspectionContactCardContents() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.navigateToIdahoPowerCompanyInspection();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		cp.clickContactUsMainMenudd();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		cp.ClickViewContactsMenu();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("IdahoPowerCompanyInspectionContactstxt_XPATH"), "Idaho Power Inspection Contacts");
		Assert.assertEquals(Page.getText("IdahoPowerCompanyInspectionContactCardName_XPATH"), "Marker,James");
		Assert.assertEquals(Page.getText("IdahoPowerCompanyInspectionContactCardDesignation_XPATH"), "Director Business Development");
		Assert.assertEquals(Page.getText("IdahoPowerCompanyInspectionContactCardEmail_XPATH"), "jmarker@osmose.com");
		Assert.assertEquals(Page.getText("IdahoPowerCompanyInspectionContactCardMobile_XPATH"), "(425) 422-2147");
		Assert.assertEquals(Page.getText("ContractsTxt_XPATH"), "Contracts");
		Assert.assertEquals(Page.getText("ContactsEmail_XPATH"), "OsmoseContracts@Osmose.com");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}
	
	@Test(priority = 6, enabled = true, description = "Verification of the content on a contact card on Idaho Power Company-Idaho Power Restoration")
	public void verifyIdahoPowerRestorationContactCardContents() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.navigateToIdahoPowerCompanyRestoration();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		cp.clickContactUsMainMenudd();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		cp.ClickViewContactsMenu();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("IdahoPowerCompanyRestorationContactstxt_XPATH"), "Idaho Power Restoration Contacts");
		Assert.assertEquals(Page.getText("IdahoPowerCompanyRestorationContactCardName_XPATH"), "Marker,James");
		Assert.assertEquals(Page.getText("IdahoPowerCompanyRestorationContactCardDesignation_XPATH"), "Director Business Development");
		Assert.assertEquals(Page.getText("IdahoPowerCompanyRestorationContactCardEmail_XPATH"), "jmarker@osmose.com");
		Assert.assertEquals(Page.getText("IdahoPowerCompanyRestorationContactCardMobile_XPATH"), "(425) 422-2147");
		Assert.assertEquals(Page.getText("ContractsTxt_XPATH"), "Contracts");
		Assert.assertEquals(Page.getText("ContactsEmail_XPATH"), "OsmoseContracts@Osmose.com");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}
	
	@Test(priority = 7, enabled = true, description = "Verification of the content on a contact card on Oncur - Oncur Distribution")
	public void verifyOncurDistributionContactCardContents() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.navigateToOncor();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		cp.clickContactUsMainMenudd();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		cp.ClickViewContactsMenu();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("OncurDistributionContactstxt_XPATH"), "Oncor Distribution Contacts");
		Assert.assertEquals(Page.getText("OncurDistributionContactCardName_XPATH"), "Howell-Burke,Joshua Aaron");
		Assert.assertEquals(Page.getText("OncurDistributionContactCardDesignation_XPATH"), "Director Business Development");
		Assert.assertEquals(Page.getText("OncurDistributionContactCardEmail_XPATH"), "jhowellburke@osmose.com");
		Assert.assertEquals(Page.getText("OncurDistributionContactCardMobile_XPATH"), "(470) 398-2083");
		Assert.assertEquals(Page.getText("ContractsTxt_XPATH"), "Contracts");
		Assert.assertEquals(Page.getText("ContactsEmail_XPATH"), "OsmoseContracts@Osmose.com");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}
	
	@Test(priority = 8, enabled = true, description = "Verification of the content on a contact card on Pacific Gas And Electric Co-Pacific Gas And Electric Transmission")
	public void verifyPacificGasAndElectricCoContactCardContents() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.navigateToPacificGasAndElectricCo();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		cp.clickContactUsMainMenudd();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		cp.ClickViewContactsMenu();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("PacificGasAndElectricCoContactstxt_XPATH"), "Pacific Gas & Electric Transmission Contacts");
		Assert.assertEquals(Page.getText("PacificGasAndElectricCoContactCardName_XPATH"), "Ballaseux,George J");
		Assert.assertEquals(Page.getText("PacificGasAndElectricCoContactCardDesignation_XPATH"), "Director Business Development");
		Assert.assertEquals(Page.getText("PacificGasAndElectricCoContactCardEmail_XPATH"), "gballaseux@osmose.com");
		Assert.assertEquals(Page.getText("PacificGasAndElectricCoContactCardMobile_XPATH"), "(303) 564-1584");
		Assert.assertEquals(Page.getText("ContractsTxt_XPATH"), "Contracts");
		Assert.assertEquals(Page.getText("ContactsEmail_XPATH"), "OsmoseContracts@Osmose.com");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}
	
	@Test(priority = 9, enabled = true, description = "Verification of the content on a contact card on Pedernales Elec Coop-Pedernales EC Dev")
	public void verifyPedernalesElecCoopContactCardContents() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.navigateToPedernalesElecCoop();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		cp.clickContactUsMainMenudd();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		cp.ClickViewContactsMenu();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("PedernalesElecCoopContactstxt_XPATH"), "Pedernales EC Dev Contacts");
		Assert.assertEquals(Page.getText("PedernalesElecCoopContactCardName_XPATH"), "Spaulding,Kevin L");
		Assert.assertEquals(Page.getText("PedernalesElecCoopContactCardDesignation_XPATH"), "Director Business Development");
		Assert.assertEquals(Page.getText("PedernalesElecCoopContactCardEmail_XPATH"), "kspaulding@osmose.com");
		Assert.assertEquals(Page.getText("PedernalesElecCoopContactCardMobile_XPATH"), "(361) 550-3914");
		Assert.assertEquals(Page.getText("ContractsTxt_XPATH"), "Contracts");
		Assert.assertEquals(Page.getText("ContactsEmail_XPATH"), "OsmoseContracts@Osmose.com");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}
	
	// 
	@Test(priority = 10, enabled = true, description = "Verification of the content on a contact card on Puget Sound Energy-Puget Sound Energy Inspection")
	public void verifyPugetSoundEnergyInspectionContactCardContents() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.navigateToPugetSoundEnergyInspection();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		cp.clickContactUsMainMenudd();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		cp.ClickViewContactsMenu();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("PugetSoundEnergyInspectionContactstxt_XPATH"), "Puget Sound Energy Inspection Contacts");
		Assert.assertEquals(Page.getText("PugetSoundEnergyInspectionContactCardName_XPATH"), "Marker,James");
		Assert.assertEquals(Page.getText("PugetSoundEnergyInspectionContactCardDesignation_XPATH"), "Director Business Development");
		Assert.assertEquals(Page.getText("PugetSoundEnergyInspectionContactCardEmail_XPATH"), "jmarker@osmose.com");
		Assert.assertEquals(Page.getText("PugetSoundEnergyInspectionContactCardMobile_XPATH"), "(425) 422-2147");
		Assert.assertEquals(Page.getText("ContractsTxt_XPATH"), "Contracts");
		Assert.assertEquals(Page.getText("ContactsEmail_XPATH"), "OsmoseContracts@Osmose.com");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}
	
	@Test(priority = 11, enabled = true, description = "Verification of the content on a contact card on Puget Sound Energy-Puget Sound Energy Restoration")
	public void verifyPugetSoundEnergyRestorationContactCardContents() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.navigateToPugetSoundEnergyRestoration();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		cp.clickContactUsMainMenudd();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		cp.ClickViewContactsMenu();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("PugetSoundEnergyRestorationContactstxt_XPATH"), "Puget Sound Energy Restoration Contacts");
		Assert.assertEquals(Page.getText("PugetSoundEnergyRestorationContactCardName_XPATH"), "Marker,James");
		Assert.assertEquals(Page.getText("PugetSoundEnergyRestorationContactCardDesignation_XPATH"), "Director Business Development");
		Assert.assertEquals(Page.getText("PugetSoundEnergyRestorationContactCardEmail_XPATH"), "jmarker@osmose.com");
		Assert.assertEquals(Page.getText("PugetSoundEnergyRestorationContactCardMobile_XPATH"), "(425) 422-2147");
		Assert.assertEquals(Page.getText("ContractsTxt_XPATH"), "Contracts");
		Assert.assertEquals(Page.getText("ContactsEmail_XPATH"), "OsmoseContracts@Osmose.com");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	@Test(priority = 12, enabled = true, description = "Verification of the Header content on Contact Us Menu item")
	public void verifyContactUsHeaderContents() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.clickContactUsMainMenudd();
		cp.ClickContactUsMenu();
		// Verifying the presence of Back Button
		//Assert.assertTrue(Page.isElementPresent(By.xpath("//div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a/i")));
		Assert.assertEquals(Page.getText("ContactUsHeaderTxt_XPATH"), "Contact Us");
		Assert.assertEquals(Page.getText("ContactUsOsmoseUtilitiesTxt_XPATH"), "Osmose Utilities Services, Inc.");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
	}

	// Keep this false always
	@Test(priority = 13, enabled = false, description = "Verification of the click on Back button")
	public void verifyClickOnBackButton() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.ClickOnBackButton();
	}

	@Test(priority = 14, enabled = true, description = "Verify that user is able to click on View On Google Map")
	public void verifyContactUsClickOnGoogleMap() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.clickContactUsMainMenudd();
		cp.ClickContactUsMenu();
		cp.clickOnAtlantaMap();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(Page.getText("ViewOnGoogleMapTxt_XPATH"), "View on Google Map");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("ViewOnGoogleMapCloseBtn_XPATH");
		cp.clickOnBuffaloMap();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(Page.getText("ViewOnGoogleMapTxt_XPATH"), "View on Google Map");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("ViewOnGoogleMapCloseBtn_XPATH");
		cp.clickOnSyracuseMap();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(Page.getText("ViewOnGoogleMapTxt_XPATH"), "View on Google Map");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("ViewOnGoogleMapCloseBtn_XPATH");
	}

	@Test(priority = 15, enabled = true, description = "Verification of the contents under General Inquiries section")
	public void verifyContactUsGeneralInquiriesContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		Assert.assertEquals(Page.getText("ContactUsGeneralInquiriesTxt_XPATH"), "General Inquiries");
		Assert.assertEquals(Page.getText("ContactUsGeneralInquiriesPhone_XPATH"), "(770) 632-6700");
	}

	@Test(priority = 16, enabled = true, description = "Verification of the contents under Sales-Products section")
	public void verifyContactUsSalesProductsContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		Assert.assertEquals(Page.getText("ContactUsSalesProductsTxt_XPATH"), "Sales - Products");
		Assert.assertEquals(Page.getText("ContactUsSalesProductsPhone_XPATH"), "(770) 632-6700 Option 3");
		Assert.assertEquals(Page.getText("ContactUsSalesProductsEmail_XPATH"), "products@osmose.com");
	}

	@Test(priority = 17, enabled = true, description = "Verification of the contents under Sales-Services section")
	public void verifyContactUsSalesServicesContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		Assert.assertEquals(Page.getText("ContactUsSalesServicesTxt_XPATH"), "Sales - Services");
		Assert.assertEquals(Page.getText("ContactUsSalesServicesPhone_XPATH"), "(770) 632-6700");
		Assert.assertEquals(Page.getText("ContactUsSalesServicesToTxt_XPATH"),
				"to find an Osmose representative in your area");
	}

	@Test(priority = 18, enabled = true, description = "Verification of the contents under O-Calc Pro section")
	public void verifyContactUsOCalcProContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		Assert.assertEquals(Page.getText("ContactUsOcalcProTxt_XPATH"), "O-Calc Pro");
		Assert.assertEquals(Page.getText("ContactUsOcalcProPhone_XPATH"), "(770) 632-6700");
		Assert.assertEquals(Page.getText("ContactUsOcalcProEmail_XPATH"), "technicalsupport@osmose.com");
	}

	@Test(priority = 19, enabled = true, description = "Verification of the contents inside Queries form")
	public void verifyContactUsQueryFormContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		Assert.assertEquals(Page.getText("ContactUsFormTxt_XPATH"),
				"For more queries, please complete the form below and someone will be in touch with you as quickly as possible.");
		// Verifying the presence of Email Textbox
		Assert.assertTrue(Page.isElementPresent(
				By.xpath("//input[@type='email']")));
		// Verifying the presence of Phone Textbox
		Assert.assertTrue(Page.isElementPresent(
				By.xpath("//input[@type='text' and @placeholder='PHONE NUMBER']")));
		// Verifying the presence of Email Radio Button
		Assert.assertTrue(Page.isElementPresent(By.xpath(
				"//input[@id='Email']")));
		// Verifying the presence of Phone Radio Button
		Assert.assertTrue(Page.isElementPresent(By.xpath(
				"//input[@id='Phone']")));
		// Verifying the presence of Subject Dropdown
		Assert.assertTrue(Page.isElementPresent(
				By.xpath("//select[@class='inputCst cstSelect custom-select']")));
		// Verifying the presence of Message TextArea
		Assert.assertTrue(Page.isElementPresent(
				By.xpath("//textarea[@placeholder='MESSAGE']")));
		// Verifying the presence of Submit Button
		Assert.assertTrue(Page.isElementPresent(By
				.xpath("//button[contains(text(),'SUBMIT')]")));
	}

	// Keep this false always
	@Test(priority = 20, enabled = false, description = "Verification of Form submission with 'Request for Information' subject")
	public void verifyFormSubmissionWith_RequestForInformation() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.submitWithRequestForInformation();
		cp.clickCloseOnThankYouFormSubmission();
	}

	// Keep this false always
	@Test(priority = 21, enabled = false, description = "Verification of Pop up that is displayed after Form submission")
	public void verifyFormSubmissionThankYouPopUp() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.submitWithRequestForInformation();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		Assert.assertEquals(Page.getText("FormSubmissionThankYouPopUptxt_XPATH"), "Thank You");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		Assert.assertEquals(Page.getText("FormSubmissionThankYouPopUpInfotxt_XPATH"),
				"Your contact request was sent successfully");
		// Verifying the presence of Close button
		Assert.assertTrue(
				Page.isElementPresent(By.xpath("//div[@id='quoteSubmitted___BV_modal_body_']/div/div/div[2]/button")));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		cp.clickCloseOnThankYouFormSubmission();
	}

	// Keep this false always
	@Test(priority = 22, enabled = false, description = "Verification of Form submission with 'Project Support' subject")
	public void verifyFormSubmissionWith_ProjectSupport() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.submitWithProjectSupport();
		cp.clickCloseOnThankYouFormSubmission();
	}

	// Keep this false always
	@Test(priority = 23, enabled = false, description = "Verification of Form submission with 'Technical Support' subject")
	public void verifyFormSubmissionWith_TechnicalSupport() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.submitWithTechnicalSupport();
		cp.clickCloseOnThankYouFormSubmission();
	}

	// Keep this false always
	@Test(priority = 24, enabled = false, description = "Verification of Form submission with 'Other' subject")
	public void verifyFormSubmissionWith_Other() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.submitWithOther();
		cp.clickCloseOnThankYouFormSubmission();
	}

	@Test(priority = 25, enabled = true, description = "Verification of Required fields validation message")
	public void verifyFormSubmissionErrorMessage() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		Page.click("ContactUsFormSubmitBtn_XPATH");
		// Verifying Error message
		Assert.assertEquals(Page.getText("FormSubmissionErrorMessageTxt_XPATH"), "All fields are mandatory");
	}

}
