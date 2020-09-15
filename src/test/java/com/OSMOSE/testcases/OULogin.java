package com.OSMOSE.testcases;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.HomeOU;
import com.OSMOSE.pages.OU.Login;
import com.OSMOSE.utilities.Utilities;
import org.apache.poi.hssf.record.HideObjRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Hashtable;
import java.util.Properties;

public class OULogin extends BaseTest {
	
	public static Properties config = new Properties();

	@Test(priority = 0, enabled = true, description = "Verify the Osmose University card on home page")
	public void verifyOUCard() {
		Assert.assertEquals(Page.getText("OUCard_XPATH"), "Osmose University");
	}
	
	@Test(priority = 1, enabled = true, description = "Verify the Knowledge Base card on home page")
	public void verifyKnowledgeBaseCard() {
		Assert.assertEquals(Page.getText("KBCard_XPATH"), "Knowledge Base");
	}

	@Test(priority = 2, enabled = true, description = "Verify the Products card on home page")
	public void verifyProductCard() {
		Assert.assertEquals(Page.getText("ProCard_XPATH"), "Products");
	}
	
	@Test(priority = 3, enabled = true, description = "Verify the Contact Us Main menu on home page")
	public void verifyContactUs() {
		Assert.assertEquals(Page.getText("ContactUsMainMenudd_XPATH"), "CONTACT US");
	}

	@Test(priority = 4, enabled = true, description = "Verify the hyperlinks on Osmose University Card")
	public void verifyHyperlinks() throws InterruptedException {
		Assert.assertEquals(Page.getText("OUCartliveeventlink_XPATH"), "LIVE EVENTS");
		Assert.assertEquals(Page.getText("OUCartWebinarLink_XPATH"), "WEBINARS");
		Assert.assertEquals(Page.getText("OUCartOcalcLink_XPATH"), "O-CALC TRAINING");
	}

	@Test(priority = 5, enabled = true, description = "Verify the Video links on Osmose University Card")
	public void verifyVideoLinks() {
		Assert.assertEquals(Page.getAttributeValue("OUCartVideo1_CSS", "alt"), "Wood Technical Seminar");
		Assert.assertEquals(Page.getAttributeValue("OUCarrVideo2_CSS", "alt"), "Steel Technical Seminar");
	}
	
	@Test(priority = 6, enabled = true, description = "Verify the click on Osmose University Navigation")
	public void verifyOsmoseUniversityNavigationClick() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.clickOsmoseUniversityNavigation();
		Thread.sleep(3000);
		//Thread.sleep(Integer.parseInt(config.getProperty("Thread1000")));
		Assert.assertEquals(Page.getText("OsmoseUniversityTxt_XPATH"), "Osmose University");
		Page.click("OUHomePage_XPATH");
		
	}

	@Test(priority = 7, enabled = true, description = "Verify that Live Events link is clickable")
	public void verifyLiveEventCLick() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.clickLiveEventLink();
		Assert.assertEquals(Page.getText("LiveEvent_XPATH"), "LIVE EVENTS");
		Page.driver.navigate().back();

	}

	@Test(priority = 8, enabled = true, description = "Verify that Webinars link is clickable")
	public void verifyWebinarsClick() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.clickWebinarLink();
		Assert.assertEquals(Page.getText("WEBINAR_XPATH"), "WEBINARS");
		Page.driver.navigate().back();
	}

	@Test(priority = 9, enabled = true, description = "Verify that O-CALC TRAINING link is clickable")
	public void verifyOCalcClick() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.clickOCalcLInk();
		Assert.assertEquals(Page.getText("O-CALCTRAINING_XPATH"), "O-CALC TRAINING");
		Page.driver.navigate().back();
	}

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 10, enabled = true, description = "Verify that Live Events button is displayed")
	public void clickOnOuLink(Hashtable<String, String> data) throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.clickOULink();
		String element = Page.getText("LiveEvent_XPATH");
		Assert.assertEquals(element, "LIVE EVENTS");
	}

	@Test(priority = 11, enabled = true, description = "Verify the text 'Steel Technical Seminar' OsmoseUniversity page")
	public void verifyLiveEventsSTS() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.clickOnLiveEventsSTS();
		String element = Page.getText("SteelTechnicalSeminar_XPATH");
		Assert.assertEquals(element, "Steel Technical Seminar");
	}

	@Test(priority = 12, enabled = true, description = "Verify the text 'Joint Use Seminar' on OsmoseUniversity page")
	public void verifyLiveEventsJUS() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.clickOnLiveEventsJUS();
		String element = Page.getText("JointUseSeminar_XPATH");
		Assert.assertEquals(element, "Joint Use Seminar");

	}

	@Test(priority = 13, enabled = true, description = "Verify the text 'Wood Pole Technical Seminar' on OsmoseUniversity page")
	public void verifyLiveEventsWPTS() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.clickOnLiveEventsWPTS();
		String element = Page.getText("WoodPoleTechnicalSeminar_XPATH");
		Assert.assertEquals(element, "Wood Pole Technical Seminar");
	}

	@Test(priority = 14, dependsOnMethods = "verifyLiveEventsWPTS", enabled = true, description = "Verify that user is able to click on 'Details and Registration' and enter details")
	public void verifyDETAILSANDREGISTRATION() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.clickOnSTSDetailsAndRegistration();
		Assert.assertEquals(Page.getAttributeValue("FIRSTNAME_XPATH", "value"), "Rajesh");
		Assert.assertEquals(Page.getAttributeValue("LASTNAME_XPATH", "value"), "Yadav");
		Assert.assertEquals(Page.getAttributeValue("COMPANY_XPATH", "value"), "Centurylink");
		Assert.assertEquals(Page.getAttributeValue("STATE_XPATH", "value"), "Nevada");
		Assert.assertEquals(Page.getAttributeValue("TITLE_XPATH", "value"), "Technical Lead");
		Assert.assertEquals(Page.getAttributeValue("EMAIL_XPATH", "value"), "rajesh.yadav@centurylink.com");
		Assert.assertEquals(Page.getAttributeValue("PHONE_XPATH", "value"), "9971236668");
	}

	@Test(priority = 15, enabled = true, description = "Verify that Webinars button is displayed")
	public void verifyClickingTheWebinars() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.clickWebinars();
		Assert.assertEquals(Page.getText("WEBINAR_XPATH"), "WEBINARS");
		Assert.assertEquals(Page.getText("UPCOMING_XPATH"),"UPCOMING");
		Assert.assertEquals(Page.getText("HISTORICAL_XPATH"),"HISTORICAL");
	}

	// Keep this false always
	@Test(priority = 16, enabled = false)
	public void verifyUpcomingWebinarsPage() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.selectUpcoming();
		String value = Page.getText("OUW_XPATH");
		Assert.assertEquals(value, "Osmose University Webinars");
	}

	// Keep this false always
	@Test(priority = 17, dependsOnMethods = "verifyClickingTheWebinars", enabled = false)
	public void verifySteelStructuresProtected() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.steelStructuresProtected();
		String value = Page.getText("SSP_XPATH");
		Assert.assertEquals(value, "Are Your Steel Structures Protected? Are You Sure?");
	}

	// Keep this false always
	@Test(priority = 18, dependsOnMethods = "verifySteelStructuresProtected", enabled = false)
	public void verifyContactAndStray() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.ContactAndStray();
		String value = Page.getText("ContactAndStray_XPATH");
		Assert.assertEquals(value, "Contact and Stray Voltage Mitigation in Underground Distribution Systems");
	}

	// Keep this false always
	@Test(priority = 19, dependsOnMethods = "verifyContactAndStray", enabled = false)
	public void steelStructuresProtectedMOREINFOREGISTRATION() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.steelStructuresProtectedMOREINFOREGISTRATION();
		Assert.assertEquals(Page.getAttributeValue("REGISTER_XPATH", "value"), "Register");
	}

	// Keep this false always
	@Test(priority = 20, dependsOnMethods = "steelStructuresProtectedMOREINFOREGISTRATION", enabled = false)
	public void ContactAndStrayMOREINFOREGISTRATION() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.ContactAndStrayMOREINFOREGISTRATION();
		Assert.assertEquals(Page.getAttributeValue("FirstName_XPATH", "value"), "Rajesh");
	}

	@Test(priority = 21, enabled = true, description = "Verify that O-CALC Training button is displayed")
	public void verifyOClacTrainingButton() throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.OCALCTRAINING();
		Assert.assertEquals(Page.getText("PrivateTraining_XPATH"), "Private Training Seminars");
		Page.driver.switchTo().defaultContent();
		//Page.click("OUHomePage_XPATH");
	}
	
	//US-100560-100646-Verify the search functionality in Historical Webinars page
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 22, enabled = true, description = "Verify the Search on Webinars - Historical and its contents")
	public void verifySearchWebinarsHistorical(Hashtable<String, String> data) throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.clickWebinars();
		Page.click("HISTORICAL_XPATH");
		Thread.sleep(3000);
		//Verification of the presence of Search Bar
		WebElement historicalSearchBar = Page.driver.findElement(By.xpath("//input[@class='inputSearch form-control']"));
		Assert.assertTrue(historicalSearchBar.isDisplayed());
		//Verification of Videos Text
		Assert.assertEquals(Page.getText("HistoricalVideos_XPATH"), "Videos");
		Page.type("historicalSearchBar_XPATH", data.get("TypeHistoricalSearchBar"));
		Page.driver.findElement(By.xpath("//input[@class='inputSearch form-control']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement videoContent = Page.driver.findElement(By.xpath("//div[@class='vTitle' and contains(text(), 'Osmose Fire-Guard')]"));
		Assert.assertTrue(videoContent.isDisplayed());
		Assert.assertEquals(Page.getText("HistoricalVideContent_XPATH"), "Osmose Fire-Guard");
		Page.click("ClearSearchBtn_XPATH");
	}
	
	//US-100560-100648-Verify the search functionality in  Historical Webinars page  for Invalid input
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 23, enabled = true, description = "Verify the Invalid search on Webinars - Historical and its contents")
	public void verifyInvalidSearchHistorical(Hashtable<String, String> data) throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.clickWebinars();
		Page.click("HISTORICAL_XPATH");
		Page.type("historicalSearchBar_XPATH", data.get("TypeHistoricalSearchBarInvalid"));
		Page.driver.findElement(By.xpath("//input[@class='inputSearch form-control']")).sendKeys(Keys.ENTER);
		WebElement noresults = Page.driver.findElement(By.xpath("//div[@class='text-center dismissCountDown']/div[1]"));
		System.out.println(noresults.getText());
		Page.click("SearchBoxClear_XPATH");
	}
	
	//US-100560-100648-Verify the Sorting Order of the Search Results in the Historical Webinar page
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 24, enabled = true, description = "Verify the Sort on Webinars - Historical and its contents")
	public void verifySortWebinarsHistorical(Hashtable<String, String> data) throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.clickWebinars();
		Page.click("HISTORICAL_XPATH");
		Thread.sleep(3000);
		//Verification of the presence of Search Bar
		WebElement historicalSearchBar = Page.driver.findElement(By.xpath("//input[@class='inputSearch form-control']"));
		Assert.assertTrue(historicalSearchBar.isDisplayed());
		//Verification of Videos Text
		Assert.assertEquals(Page.getText("HistoricalVideos_XPATH"), "Videos");
		Page.type("historicalSearchBar_XPATH", data.get("TypeHistoricalSearchBarSort"));
		Page.driver.findElement(By.xpath("//input[@class='inputSearch form-control']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement videoContent = Page.driver.findElement(By.xpath("//div[@class='vTitle' and contains(text(), 'Osmose Fire-Guard')]"));
		Assert.assertTrue(videoContent.isDisplayed());
		Assert.assertEquals(Page.getText("HistoricalVideContent_XPATH"), "Osmose Fire-Guard");
		Page.click("SearchBoxClear_XPATH");
	}
	
	//US-100560-100649-Verify the Clear search functionality in Historical Webinars page
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 25, enabled = true, description = "Verify the Sort on Webinars - Historical and its contents")
	public void verifyClearSearchHistorical(Hashtable<String, String> data) throws InterruptedException {
		Login Lo = new Login();
		HomeOU ou = Lo.goHomeOU();
		ou.clickWebinars();
		Page.click("HISTORICAL_XPATH");
		Page.type("historicalSearchBar_XPATH", data.get("TypeHistoricalClearSearch"));
		Page.driver.findElement(By.xpath("//input[@class='inputSearch form-control']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Page.click("SearchBoxClear_XPATH");
		Page.type("historicalSearchBar_XPATH", data.get("TypeHistoricalClearSearch"));
		Page.driver.findElement(By.xpath("//input[@class='inputSearch form-control']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Page.click("ClearSearchBtn_XPATH");
	}

}
