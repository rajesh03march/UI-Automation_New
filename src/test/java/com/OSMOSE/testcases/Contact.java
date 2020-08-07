package com.OSMOSE.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.ContactPage;
import com.OSMOSE.pages.OU.HomeOU;
import com.OSMOSE.pages.OU.ProductPage;

public class Contact extends BaseTest {
	@Test(priority = 0, description = "Verification of the presence of Contact Us Menu items.")
	public void verifyContactUsMenuContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.clickOnOU360();
		cp.clickContactUsMainMenudd();
		Assert.assertEquals(Page.getText("ContactUsMenu_XPATH"), "Contact Us");
		Assert.assertEquals(Page.getText("ViewContactsMenu_XPATH"), "View Contacts");
	}

	@Test(priority = 1, enabled = true, description = "Verification of the Header content on View Contacts Menu item")
	public void verifyViewContactsHeaderContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.ClickViewContactsMenu();
		Assert.assertEquals(Page.getText("ProductsContactstxt_XPATH"), "Products Contacts");
		//Assert.assertEquals(Page.getText("ManageAllContacts_XPATH"), "Manage all your contacts in one place");
	}

	@Test(priority = 2, enabled = true, description = "Verification of the content on a contact card")
	public void verifyViewContactsContactCardContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		Assert.assertEquals(Page.getText("ContactCardName_XPATH"), "Simth, John (Simth)");
		Assert.assertEquals(Page.getText("ContactCardDesignation_XPATH"), "Project Manager");
		Assert.assertEquals(Page.getText("ContactCardDivision_XPATH"), "Sales");
		Assert.assertEquals(Page.getText("ContactCardEmail_XPATH"), "john.simth@osmose.com");
		Assert.assertEquals(Page.getText("ContactCardMobile_XPATH"), "1 (555) 444-3321");
		Assert.assertEquals(Page.getText("ContactCardFax_XPATH"), "1 (555) 444-3321");
	}

	@Test(priority = 3, enabled = true, description = "Verification of the Header content on Contact Us Menu item")
	public void verifyContactUsHeaderContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.clickContactUsMainMenudd();
		cp.ClickContactUsMenu();
		// Verifying the presence of Back Button
		Assert.assertTrue(Page.isElementPresent(
				By.xpath("//div[@id='app']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a/i")));
		Assert.assertEquals(Page.getText("ContactUsHeaderTxt_XPATH"), "Contact Us");
		Assert.assertEquals(Page.getText("ContactUsOsmoseUtilitiesTxt_XPATH"), "Osmose Utilities Services, Inc.");
	}

	@Test(priority = 4, enabled = true, description = "Verification of the click on Back button")
	public void verifyClickOnBackButton() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.ClickOnBackButton();
	}

	@Test(priority = 5, enabled = true, description = "Verify that user is able to click on View On Google Map")
	public void verifyContactUsClickOnGoogleMap() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.clickContactUsMainMenudd();
		cp.ClickContactUsMenu();
		cp.clickOnAtlantaMap();
		Thread.sleep(5000);
		Assert.assertEquals(Page.getText("ViewOnGoogleMapTxt_XPATH"), "View on Google Map");
		Thread.sleep(5000);
		Page.click("ViewOnGoogleMapCloseBtn_XPATH");
		cp.clickOnBuffaloMap();
		Thread.sleep(5000);
		Assert.assertEquals(Page.getText("ViewOnGoogleMapTxt_XPATH"), "View on Google Map");
		Thread.sleep(5000);
		Page.click("ViewOnGoogleMapCloseBtn_XPATH");
		cp.clickOnSyracuseMap();
		Thread.sleep(5000);
		Assert.assertEquals(Page.getText("ViewOnGoogleMapTxt_XPATH"), "View on Google Map");
		Thread.sleep(5000);
		Page.click("ViewOnGoogleMapCloseBtn_XPATH");
	}

	@Test(priority = 6, enabled = true, description = "Verification of the contents under General Inquiries section")
	public void verifyContactUsGeneralInquiriesContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		Assert.assertEquals(Page.getText("ContactUsGeneralInquiriesTxt_XPATH"), "General Inquiries");
		Assert.assertEquals(Page.getText("ContactUsGeneralInquiriesPhone_XPATH"), "770.632.6700");
	}

	@Test(priority = 7, enabled = true, description = "Verification of the contents under Sales-Products section")
	public void verifyContactUsSalesProductsContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		Assert.assertEquals(Page.getText("ContactUsSalesProductsTxt_XPATH"), "Sales - Products");
		Assert.assertEquals(Page.getText("ContactUsSalesProductsPhone_XPATH"), "770.632.6700 Option 3");
		Assert.assertEquals(Page.getText("ContactUsSalesProductsEmail_XPATH"), "products@osmose.com");
	}

	@Test(priority = 8, enabled = true, description = "Verification of the contents under Sales-Services section")
	public void verifyContactUsSalesServicesContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		Assert.assertEquals(Page.getText("ContactUsSalesServicesTxt_XPATH"), "Sales - Services");
		Assert.assertEquals(Page.getText("ContactUsSalesServicesPhone_XPATH"), "770.632.6700");
		Assert.assertEquals(Page.getText("ContactUsSalesServicesToTxt_XPATH"),
				"to find an Osmose representative in your area");
	}

	@Test(priority = 9, enabled = true, description = "Verification of the contents under O-Calc Pro section")
	public void verifyContactUsOCalcProContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		Assert.assertEquals(Page.getText("ContactUsOcalcProTxt_XPATH"), "O-Calc Pro");
		Assert.assertEquals(Page.getText("ContactUsOcalcProPhone_XPATH"), "770.632.6700");
		Assert.assertEquals(Page.getText("ContactUsOcalcProEmail_XPATH"), "technicalsupport@osmose.com");
	}

	@Test(priority = 10, enabled = true, description = "Verification of the contents inside Queries form")
	public void verifyContactUsQueryFormContents() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		Assert.assertEquals(Page.getText("ContactUsFormTxt_XPATH"),
				"For more queries, please complete the form below and someone will be in touch with you as quickly as possible.");
		// Verifying the presence of Email Textbox
		Assert.assertTrue(Page.isElementPresent(
				By.xpath("//div[@id='app']/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div/form/input[1]")));
		// Verifying the presence of Phone Textbox
		Assert.assertTrue(Page.isElementPresent(
				By.xpath("//div[@id='app']/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div/form/input[2]")));
		// Verifying the presence of Email Radio Button
		Assert.assertTrue(Page.isElementPresent(By.xpath(
				"//div[@id='app']/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div/form/div[1]/div[2]/input")));
		// Verifying the presence of Phone Radio Button
		Assert.assertTrue(Page.isElementPresent(By.xpath(
				"//div[@id='app']/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div/form/div[1]/div[3]/input")));
		// Verifying the presence of Subject Dropdown
		Assert.assertTrue(Page.isElementPresent(
				By.xpath("//div[@id=\"app\"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div/form/select")));
		// Verifying the presence of Message TextArea
		Assert.assertTrue(Page.isElementPresent(
				By.xpath("//div[@id=\"app\"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div/form/textarea")));
		// Verifying the presence of Submit Button
		Assert.assertTrue(Page.isElementPresent(By
				.xpath("//div[@id=\"app\"]/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div/form/div[2]/button")));
	}

	@Test(priority = 11, enabled = true, description = "Verification of Form submission with 'Request for Information' subject")
	public void verifyFormSubmissionWith_RequestForInformation() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.submitWithRequestForInformation();
		cp.clickCloseOnThankYouFormSubmission();
	}

	@Test(priority = 12, enabled = true, description = "Verification of Pop up that is displayed after Form submission")
	public void verifyFormSubmissionThankYouPopUp() throws InterruptedException {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.submitWithRequestForInformation();
		Thread.sleep(4000);
		Assert.assertEquals(Page.getText("FormSubmissionThankYouPopUptxt_XPATH"), "Thank You");
		Thread.sleep(4000);
		Assert.assertEquals(Page.getText("FormSubmissionThankYouPopUpInfotxt_XPATH"),
				"Your contact request was sent successfully");
		// Verifying the presence of Close button
		Assert.assertTrue(
				Page.isElementPresent(By.xpath("//div[@id='quoteSubmitted___BV_modal_body_']/div/div/div[2]/button")));
		Thread.sleep(3000);
		cp.clickCloseOnThankYouFormSubmission();
	}

	@Test(priority = 13, enabled = true, description = "Verification of Form submission with 'Project Support' subject")
	public void verifyFormSubmissionWith_ProjectSupport() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.submitWithProjectSupport();
		cp.clickCloseOnThankYouFormSubmission();
	}

	@Test(priority = 14, enabled = true, description = "Verification of Form submission with 'Technical Support' subject")
	public void verifyFormSubmissionWith_TechnicalSupport() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.submitWithTechnicalSupport();
		cp.clickCloseOnThankYouFormSubmission();
	}

	@Test(priority = 15, enabled = true, description = "Verification of Form submission with 'Other' subject")
	public void verifyFormSubmissionWith_Other() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		cp.submitWithOther();
		cp.clickCloseOnThankYouFormSubmission();
	}
	
	@Test(priority = 15, enabled = true, description = "Verification of Form submission with 'Other' subject")
	public void verifyFormSubmissionErrorMessage() {
		ProductPage pp = new ProductPage();
		ContactPage cp = pp.goContact();
		Page.click("ContactUsFormSubmitBtn_XPATH");
		//Verifying Error message
		Assert.assertEquals(Page.getText("FormSubmissionErrorMessageTxt_XPATH"),
				"All fields are mandatory");
		
	}

}
