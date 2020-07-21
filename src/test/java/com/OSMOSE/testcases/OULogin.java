package com.OSMOSE.testcases;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.HomeOU;
import com.OSMOSE.pages.OU.Login;
import com.OSMOSE.pages.OU.OU;
import com.OSMOSE.utilities.Utilities;
import org.apache.poi.hssf.record.HideObjRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class OULogin extends BaseTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 0, description = "Verify the login functionality")
	public void loginTest(Hashtable<String, String> data) throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.doLogin(data.get("username"), data.get("password"));
		String element = Page.getText("verify_ID");
		Assert.assertEquals(element, "Rajesh Yadav");
	}

	@Test(dependsOnMethods = "loginTest", priority = 1, enabled = true, description = "Verify the Osmose University card on home page")
	public void verifyOUCard() {

		Assert.assertEquals(Page.getText("OUCard_XPATH"), "Osmose University");
	}

	@Test(dependsOnMethods = "loginTest", priority = 2, enabled = true, description = "Verify the Products card on home page")
	public void verifyProductCard() {
		Assert.assertEquals(Page.getText("ProCard_XPATH"), "Products");
	}
	
	@Test(dependsOnMethods = "loginTest", priority = 3, enabled = true, description = "Verify the Contact Us Main menu on home page")
	public void verifyContactUs() {
		Assert.assertEquals(Page.getText("ContactUsMainMenudd_XPATH"), "CONTACT US");
	}

	@Test(dependsOnMethods = "loginTest", priority = 4, enabled = true, description = "Verify the hyperlinks on Osmose University Card")
	public void verifyHyperlinks() throws InterruptedException {
		Assert.assertEquals(Page.getText("OUCartliveeventlink_XPATH"), "LIVE EVENTS");
		Assert.assertEquals(Page.getText("OUCartWebinarLink_XPATH"), "WEBINARS");
		Assert.assertEquals(Page.getText("OUCartOcalcLink_XPATH"), "O-CALC TRAINING");
	}

	@Test(dependsOnMethods = "loginTest", priority = 5, enabled = true, description = "Verify the Video links on Osmose University Card")
	public void verifyVideoLinks() {
		Assert.assertEquals(Page.getAttributeValue("OUCartVideo1_CSS", "alt"), "Wood Technical Seminar");
		Assert.assertEquals(Page.getAttributeValue("OUCarrVideo2_CSS", "alt"), "Steel Technical Seminar");
	}

	@Test(dependsOnMethods = "loginTest", priority = 6, enabled = true, description = "Verify that Live Events link is clickable")
	public void verifyLiveEventCLick() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.clickLiveEventLink();
		Assert.assertEquals(Page.getText("LiveEvent_XPATH"), "LIVE EVENTS");
		Page.driver.navigate().back();

	}

	@Test(dependsOnMethods = "loginTest", priority = 7, enabled = true, description = "Verify that Webinars link is clickable")
	public void verifyWebinarsClick() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.clickWebinarLink();
		Assert.assertEquals(Page.getText("WEBINAR_XPATH"), "WEBINARS");
		Page.driver.navigate().back();
	}

	@Test(dependsOnMethods = "loginTest", priority = 8, enabled = true, description = "Verify that O-CALC TRAINING link is clickable")
	public void verifyOCalcClick() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.clickOCalcLInk();
		Assert.assertEquals(Page.getText("O-CALCTRAINING_XPATH"), "O-CALC TRAINING");
		Page.driver.navigate().back();
	}

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 9, enabled = true, description = "Verify that Live Events button is displayed")
	public void clickOnOuLink(Hashtable<String, String> data) throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.clickOULink();
		String element = Page.getText("LiveEvent_XPATH");
		Assert.assertEquals(element, "LIVE EVENTS");
	}

	@Test(priority = 10, enabled = true, description = "Verify the text 'Steel Technical Seminar' OsmoseUniversity page")
	public void verifyLiveEventsSTS() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.clickOnLiveEventsSTS();
		String element = Page.getText("SteelTechnicalSeminar_XPATH");
		Assert.assertEquals(element, "Steel Technical Seminar");
	}

	@Test(priority = 11, enabled = true, description = "Verify the text 'Joint Use Seminar' on OsmoseUniversity page")
	public void verifyLiveEventsJUS() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.clickOnLiveEventsJUS();
		String element = Page.getText("JointUseSeminar_XPATH");
		Assert.assertEquals(element, "Joint Use Seminar");

	}

	@Test(priority = 12, enabled = true, description = "Verify the text 'Wood Pole Technical Seminar' on OsmoseUniversity page")
	public void verifyLiveEventsWPTS() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.clickOnLiveEventsWPTS();
		String element = Page.getText("WoodPoleTechnicalSeminar_XPATH");
		Assert.assertEquals(element, "Wood Pole Technical Seminar");
	}

	@Test(priority = 13, dependsOnMethods = "verifyLiveEventsWPTS", enabled = true, description = "Verify that user is able to click on 'Details and Registration' and enter details")
	public void verifyDETAILSANDREGISTRATION() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.clickOnSTSDetailsAndRegistration();
		Assert.assertEquals(Page.getAttributeValue("FIRSTNAME_XPATH", "value"), "Rajesh");
		Assert.assertEquals(Page.getAttributeValue("LASTNAME_XPATH", "value"), "Yadav");
		Assert.assertEquals(Page.getAttributeValue("COMPANY_XPATH", "value"), "Centurylink");
		Assert.assertEquals(Page.getAttributeValue("STATE_XPATH", "value"), "Nevada");
		Assert.assertEquals(Page.getAttributeValue("TITLE_XPATH", "value"), "Technical Lead");
		Assert.assertEquals(Page.getAttributeValue("EMAIL_XPATH", "value"), "rajesh.yadav@centurylink.com");
		Assert.assertEquals(Page.getAttributeValue("PHONE_XPATH", "value"), "9971236668");
	}

	@Test(priority = 14, enabled = true, description = "Verify that Webinars button is displayed")
	public void verifyClickingTheWebinars() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.clickWebinars();
		Assert.assertEquals(Page.getText("WEBINAR_XPATH"), "WEBINARS");
		// Assert.assertEquals(Page.getText("UPCOMING_XPATH"),"UPCOMING");
		// Assert.assertEquals(Page.select("",""),"HISTORICAL");
	}

	@Test(priority = 15, enabled = false)
	public void verifyUpcomingWebinarsPage() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.selectUpcoming();
		String value = Page.getText("OUW_XPATH");
		Assert.assertEquals(value, "Osmose University Webinars");
	}

	@Test(priority = 16, dependsOnMethods = "verifyClickingTheWebinars", enabled = false)
	public void verifySteelStructuresProtected() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.steelStructuresProtected();
		String value = Page.getText("SSP_XPATH");
		Assert.assertEquals(value, "Are Your Steel Structures Protected? Are You Sure?");
	}

	@Test(priority = 17, dependsOnMethods = "verifySteelStructuresProtected", enabled = false)
	public void verifyContactAndStray() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.ContactAndStray();
		String value = Page.getText("ContactAndStray_XPATH");
		Assert.assertEquals(value, "Contact and Stray Voltage Mitigation in Underground Distribution Systems");
	}

	@Test(priority = 18, dependsOnMethods = "verifyContactAndStray", enabled = false)
	public void steelStructuresProtectedMOREINFOREGISTRATION() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.steelStructuresProtectedMOREINFOREGISTRATION();
		Assert.assertEquals(Page.getAttributeValue("REGISTER_XPATH", "value"), "Register");
	}

	@Test(priority = 19, dependsOnMethods = "steelStructuresProtectedMOREINFOREGISTRATION", enabled = false)
	public void ContactAndStrayMOREINFOREGISTRATION() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.ContactAndStrayMOREINFOREGISTRATION();
		Assert.assertEquals(Page.getAttributeValue("FirstName_XPATH", "value"), "Rajesh");
	}

	@Test(priority = 20, enabled = true, description = "Verify that O-CALC Training button is displayed")
	public void verifyOClacTrainingButton() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ou.OCALCTRAINING();
		Assert.assertEquals(Page.getText("PrivateTraining_XPATH"), "Private Training Seminars");
		Page.driver.switchTo().defaultContent();

	}

}
