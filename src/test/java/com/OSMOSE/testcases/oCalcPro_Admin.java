package com.OSMOSE.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.Login;
import com.OSMOSE.pages.OU.OsmoseServicesPage;
import com.OSMOSE.pages.OU.oCalcProPage;
import com.OSMOSE.utilities.Utilities;

public class oCalcPro_Admin extends BaseTest {

	Page p = new Page();

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp",priority = 0, description = "Verify the login functionality")
	public void ocalcloginTestAdmin(Hashtable<String, String> data) throws InterruptedException {
		Login lo = new Login();
		lo.doLogin(data.get("username"), data.get("password"));
		/*Page.type("email_XPATH", "shanthling.kodli@centurylink.com");
		Page.type("password_XPATH", "Denver*235");*/
		Page.click("submit_XPATH");
		String element = Page.getText("verify_ID");
		Assert.assertEquals(element, "Shanthling Kodli");
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
		WebElement OcalcProHeaderImg = Page.findelement("oCalProLogoForLicensedUser_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(OcalcProHeaderImg.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("OcalcOsmoseLogo_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.clickoCalcCard();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("OcalcProHeaderTxt_XPATH"), "Structural Analysis Software for Utility Poles");
	}


	@Test(priority = 2, enabled = true, description = "Verify presence of License Management tile for Admin User")
	public void verifyPresenceOfLicenseManagementAdmin() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// License Management card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//h5[@class='m-0 crspointer pointer-events' and text()='License Management ']")).isDisplayed());
	}
	
	@Test(priority = 3, enabled = true, description = "Verify Click on License Management tile for Admin User")
	public void verifyLicenseManagementClickAdmin() throws InterruptedException {
		OsmoseServicesPage os = new OsmoseServicesPage();
		oCalcProPage ocal = os.gooCalcPro();
		Page.ClickActions("LicensedUserLicenseManagementCardAdmin_XPATH");
		Assert.assertFalse(Page.isElementPresent(By.xpath("LicenseManagementHeaderText_XPATH")));
	}

}
