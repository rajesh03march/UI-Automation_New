package com.OSMOSE.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OSMOSE.base.Page;

import com.OSMOSE.pages.OU.KnowledgeBasePage;
import com.OSMOSE.pages.OU.OsmoseServicesPage;

public class OsmoseServices extends BaseTest {
	
	Page p = new Page();

	//
	@Test(priority = 0, enabled = true, description = "Verify the presence of My Osmose Services Card on Home Page")
	public void verifyMyOsmoseServicesCardClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verifying the presence of My Osmose Services card on Home Page
		Assert.assertTrue(Page.isVisible("MyOsmoseServicesCard_XPATH"));
		osp.clickMyOsmoseServices();
		// Verifying the Header Text displayed on My Osmose Services Page
		Assert.assertEquals(Page.getText("MyOsmoseServicesFirstHeader_XPATH"), "My Osmose Services");
		osp.navigateToColombiapit();
	}

	// US-97721-98088-Verify Content displayed on the My Osmose Services page
	// US-99512-99702-Verify Learn More link functionality, when "Wood | Inspection
	// & Treatment " tile is inactive for logged in user
	@Test(priority = 1, enabled = true, description = "Verify the presence of Wood Inspection and Treatment and click on Learn More button")
	public void verifyWoodInspectionandTreatmentLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verifying the presence of Wood Inspection and Treatment card
		Assert.assertTrue(Page.isVisible("MOSWoodInspectionAndTreatmentCard_XPATH"));
		osp.clickWoodInspectionandTreatmentLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verifying the Header text of Wood Inspection and treatment
		Assert.assertEquals(Page.getText("WoodInspectionAndTreatmentPopupHeaderTxt_XPATH"),
				"Wood | Inspection & Treatment");
		osp.clickLearnMorePopupCloseButton();
	}

	// US-97721-98088-Verify Content displayed on the My Osmose Services page
	// US-99512-99700-Verify Learn More link functionality,when "Wood | Restoration"
	// tile is inactive for logged in user
	@Test(priority = 2, enabled = true, description = "Verify the presence of Wood Restoration and click on Learn More button")
	public void verifyWoodRestorationLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		// Verifying the presence of Wood Restoration card
		Assert.assertTrue(Page.isVisible("MOSWoodRestorationCard_XPATH"));
		osp.clickWoodRestorationLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verifying the Header text of Wood Rstoration
		Assert.assertEquals(Page.getText("WoodRestorationPopupHeaderTxt_XPATH"), "Wood | Restoration");
		osp.clickLearnMorePopupCloseButton();
	}

	// US-97721-98088-Verify Content displayed on the My Osmose Services page
	// US-99512-99701-Verify Learn More link functionality, when "O-Calc" tile is
	// inactive for logged in user
	@Test(priority = 3, enabled = true, description = "Verify the presence of OCalc Pro and click on Learn More button")
	public void verifyOcalcProLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		// Verifying the presence of Wood Restoration card
		Assert.assertTrue(Page.isVisible("OcalcProCard_XPATH"));
		osp.clickOcalProLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verifying the Header text of OcalPro
		Assert.assertEquals(Page.getText("OcalcProPopupHeaderTxt_XPATH"), "O-Calc Pro");
		osp.clickLearnMorePopupCloseButton();
	}

	// US-97721-98088-Verify Content displayed on the My Osmose Services page
	// US-99512-99703-Verify Learn More link functionality, when "Steel & Concrete |
	// Assessment " tile is inactive for logged in user
	@Test(priority = 4, enabled = true, description = "Verify the presence of Steel & Concrete | Assessment and click on Learn More button")
	public void verifySteelandConcreteAssessmentLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		// Verifying the presence of Steel & Concrete | Assessment card
		Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentCard_XPATH"));
		osp.clickSteelandConcreteAssessmentLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verifying the Header text of Steel & Concrete | Assessment
		Assert.assertEquals(Page.getText("SteelandConcreteAssessmentPopupHeaderTxt_XPATH"),
				"Steel & Concrete | Assessment");
		osp.clickLearnMorePopupCloseButton();
	}

	// US-97721-98088-Verify Content displayed on the My Osmose Services page
	// US-99512-99704-Verify Learn More link functionality, when "Steel & Concrete |
	// Restoration" tile is inactive for logged in user
	@Test(priority = 5, enabled = true, description = "Verify the presence of Steel & Concrete | Restoration and click on Learn More button")
	public void verifySteelandConcreteRestorationLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		// Verifying the presence of Steel & Concrete | Restoration card
		Assert.assertTrue(Page.isVisible("MOSSteelandConcreteRestorationCard_XPATH"));
		osp.clickSteelandConcreteRestorationLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verifying the Header text of Steel & Concrete | Restoration
		Assert.assertEquals(Page.getText("SteelandConcreteRestorationPopupHeaderTxt_XPATH"),
				"Steel & Concrete | Restoration");
		osp.clickLearnMorePopupCloseButton();
	}

	// US-97721-98088-Verify Content displayed on the My Osmose Services page
	// US-99512-99705-Verify Learn More link functionality, when "Overhead" tile is
	// inactive for logged in user
	@Test(priority = 6, enabled = true, description = "Verify the presence of Overhead and click on Learn More button")
	public void verifyOverheadLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		// Verifying the presence of Overhead card
		Assert.assertTrue(Page.isVisible("OverheadCard_XPATH"));
		osp.clickOverheadLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verifying the Header text of Overhead
		Assert.assertEquals(Page.getText("OverheadPopupHeaderTxt_XPATH"), "Overhead");
		osp.clickLearnMorePopupCloseButton();
	}

	// US-97721-98088-Verify Content displayed on the My Osmose Services page
	// US-99512-99706-Verify Learn More link functionality,when "Underground" tile
	// is inactive for logged in user
	@Test(priority = 7, enabled = true, description = "Verify the presence of Underground and click on Learn More button")
	public void verifyUndergroundLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		// Verifying the presence of Underground card
		Assert.assertTrue(Page.isVisible("UndergroundCard_XPATH"));
		osp.clickUndergroundLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verifying the Header text of Underground
		Assert.assertEquals(Page.getText("UndergroundPopupHeaderTxt_XPATH"), "Underground");
		osp.clickLearnMorePopupCloseButton();
	}

	// US-97721-98088-Verify Content displayed on the My Osmose Services page
	// US-99512-99707-Verify Learn More link functionality, when "Joint Use" tile is
	// inactive for logged in user
	@Test(priority = 8, enabled = true, description = "Verify the presence of JointUse and click on Learn More button")
	public void verifyJointUseLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		// Verifying the presence of JointUse card
		Assert.assertTrue(Page.isVisible("JointUseCard_XPATH"));
		osp.clickJointUseLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verifying the Header text of JointUse
		Assert.assertEquals(Page.getText("JointUsePopupHeaderTxt_XPATH"), "Joint Use");
		osp.clickLearnMorePopupCloseButton();
	}

	// US-97721-98088-Verify Content displayed on the My Osmose Services page
	// US-99512-99709-Verify Learn More link functionality, when "Stray Voltage"
	// tile is inactive for logged in user
	@Test(priority = 9, enabled = true, description = "Verify the presence of StrayVoltage and click on Learn More button")
	public void verifyStrayVoltageLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		// Verifying the presence of Stray Voltage card
		Assert.assertTrue(Page.isVisible("StrayVoltageCard_XPATH"));
		osp.clickStrayVoltageLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verifying the Header text of Stray Voltage
		Assert.assertEquals(Page.getText("StrayVoltagePopupHeaderTxt_XPATH"), "Stray Voltage");
		osp.clickLearnMorePopupCloseButton();
	}

	// US-97721-98088-Verify Content displayed on the My Osmose Services page
	// US-99512-99708-Verify Learn More link functionality, when "Technical
	// Services" tile is inactive for logged in user
	@Test(priority = 10, enabled = true, description = "Verify the presence of Engineering Services and click on Learn More button")
	public void verifyEngineeringServicesLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		// Verifying the presence of Engineering Services card
		Assert.assertTrue(Page.isVisible("EngineeringServicesCard_XPATH"));
		osp.clickEngineeringServicesLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verifying the Header text of Engineering Services
		Assert.assertEquals(Page.getText("EngineeringServicesPopupHeaderTxt_XPATH"), "Engineering Services");
		osp.clickLearnMorePopupCloseButton();
	}

	// Keep this false always
	// US-97721-98088-Verify Content displayed on the My Osmose Services page
	// US-99512-99710-Verify Learn More link functionality,when "Products" tile is
	// inactive for logged in user
	@Test(priority = 11, enabled = false, description = "Verify the presence of Products and click on Learn More button")
	public void verifyProductsLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		// Verifying the presence of Products card
		Assert.assertTrue(Page.isVisible("ProductsCard_XPATH"));
		osp.clickProductsLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verifying the Header text of Products
		Assert.assertEquals(Page.getText("ProductsPopupHeaderTxt_XPATH"), "Products");
		osp.clickLearnMorePopupCloseButton();
	}

	// US-97721-98088-Verify Content displayed on the My Osmose Services page
	// US-99512-99711-Verify Learn More link functionality,when "Map View" tile is
	// inactive for logged in user
	@Test(priority = 12, enabled = true, description = "Verify the presence of Storm Service and click on Learn More button")
	public void verifyStormServiceLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		// Verifying the presence of Storm Service card
		Assert.assertTrue(Page.isVisible("StormServiceCard_XPATH"));
		osp.clickStormServiceCardLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verifying the Header text of Storm Service
		Assert.assertEquals(Page.getText("StormServicePopupHeaderTxt_XPATH"), "Storm Service");
		osp.clickLearnMorePopupCloseButton();
	}

	@Test(priority = 13, enabled = false, description = "Verification of the click on Products in products card")
	public void VerifyProductclick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Page.click("ProductCardFirstProduct_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		WebElement ProductFirstTxt = Page.driver
				.findElement(By.xpath("//h3[contains(text(),' MP500-EXT® Preservative Paste ')]"));
		Assert.assertEquals(ProductFirstTxt.getText(), "MP500-EXT® Preservative Paste");
		Page.click("CloseButtonMOS_XPATH");
		osp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickMyOsmoseServices();
		Page.click("ProductCardSecondProduct_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		WebElement ProductSecondTxt = Page.driver
				.findElement(By.xpath("//h3[contains(text(),' Demo_MP500-EXT® Preservative Paste ')]"));
		Assert.assertEquals(ProductSecondTxt.getText(), "Demo_MP500-EXT® Preservative Paste");
		Page.click("CloseButtonMOS_XPATH");
		osp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickMyOsmoseServices();
		Page.click("ProductCardThirdProduct_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		WebElement ProductThirdTxt = Page.driver
				.findElement(By.xpath("//h3[contains(text(),' TEST-MP500-EXT® Preservative Paste ')]"));
		Assert.assertEquals(ProductThirdTxt.getText(), "TEST-MP500-EXT® Preservative Paste");
		Page.click("CloseButtonMOS_XPATH");
		osp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickMyOsmoseServices();
		Page.click("ProductCardFourthProduct_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		WebElement ProductFourthTxt = Page.driver.findElement(By.xpath("//h3[contains(text(),' Demo_MITC-FUME® ')]"));
		Assert.assertEquals(ProductFourthTxt.getText(), "Demo_MITC-FUME®");
		Page.click("CloseButtonMOS_XPATH");
		osp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickMyOsmoseServices();
	}

	// Keep this false always
	@Test(priority = 14, enabled = false, description = "Verification of the click on View Map card")
	public void VerifyViewMapclick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		osp.navigateToPedernalesElecCoop();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread15000"))));
		Page.click("MapViewCard_XPATH");
		Assert.assertTrue(Page.isVisible("MOSMapView_XPATH"));
		Assert.assertTrue(Page.isVisible("MOSDataGrid_XPATH"));
	}

	@Test(priority = 15, enabled = true, description = "Verification of the click on Wood Inspection and Treatment card")
	public void VerifyWoodInspectionAndTreatmentclick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		osp.navigateToPedernalesElecCoop();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread15000"))));
		Page.scrollbyjavaexecutor();
		osp.clickWoodInspection();
		Assert.assertEquals(Page.getText("MOSInspectionSummary_XPATH"), "Inspection Summary");
		Assert.assertEquals(Page.getText("MOSRejectionAnalysis_XPATH"), "Reject Analysis");
		Assert.assertEquals(Page.getText("MOSRestorationStatus_XPATH"), "Restoration Status");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		//Page.click("ErrorPopUp_XPATH");
	}

	@Test(priority = 16, enabled = true, description = "Verify the click on Videos under Wood Inspection and Treatment card")
	public void verifyClickonWoodTreatmentVideos() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.navigate().back();
		osp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickMyOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread20000"))));
		osp.clickWoodTreatmentVideos();
		/*Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		WebElement BackButtonVideos = Page.driver
				.findElement(By.xpath("//i[@class='fas fa-chevron-circle-left colorBlue font16px']"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0']")).getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of video
		WebElement VideoContent = Page.driver.findElement(By.xpath("(//img[@class='w-100'])[1]"));
		Assert.assertTrue(VideoContent.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));*/
		
		String text = Page.getText("NoResults_XPATH");
		String newtext = text.substring(text.indexOf('\n')+1);
		Assert.assertEquals(newtext,"No results match your search criteria.");
	}

	@Test(priority = 17, enabled = true, description = "Verify the click on Project Profiles under Wood Inspection and Treatment card")
	public void verifyClickonWoodTreatmentProjectProfiles() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.navigate().back();
		osp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickMyOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		osp.clickWoodTreatmentProjectProfiles();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		/*
		 * // Verify the presence of Back Button WebElement BackBtnProjectProfiles =
		 * Page.driver .findElement(By.
		 * xpath("//i[@class='fas fa-chevron-circle-left colorBlue font16px']"));
		 * Assert.assertTrue(BackBtnProjectProfiles.isDisplayed()); Thread.sleep(3000);
		 * // Verify the presence Document header text String DocumentHeaderTxt =
		 * Page.driver
		 * .findElement(By.xpath("//h5[contains(text(),'Documents')]")).getText();
		 * Assert.assertEquals(DocumentHeaderTxt, "Documents"); Thread.sleep(3000); //
		 * Verification of the presence of document WebElement DocumentContent =
		 * Page.driver .findElement(By.xpath("(//div[@class='docBox m-0 mb-2']/a)[1]"));
		 * Assert.assertTrue(DocumentContent.isDisplayed()); Thread.sleep(3000);
		 */

		String text = Page.getText("NoResults_XPATH");
		String newtext = text.substring(text.indexOf('\n')+1);
		Assert.assertEquals(newtext,"No results match your search criteria.");
	}
	
	@Test(priority = 18, enabled = true, description = "Verify the click on MAP under Wood Inspection and Treatment card")
	public void verifyClickonWoodTreatmentMAP() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.navigate().back();
		osp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickMyOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		osp.clickWoodTreatmentMAP();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertTrue(Page.isVisible("MOSMapView_XPATH"));
		Assert.assertTrue(Page.isVisible("MOSDataGrid_XPATH"));
	}

	@Test(priority = 19, enabled = true, description = "Verification of the click on Wood Restoration card")
	public void VerifyWoodRestorationclick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Page.driver.navigate().back();
		osp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickMyOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		osp.clickWoodRestoration();
		Assert.assertEquals(Page.getText("MOSInspectionSummary_XPATH"), "Inspection Summary");
		Assert.assertEquals(Page.getText("MOSRejectionAnalysis_XPATH"), "Reject Analysis");
		Assert.assertEquals(Page.getText("MOSRestorationStatus_XPATH"), "Restoration Status");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		//Page.click("ErrorPopUp_XPATH");
	}

	@Test(priority = 20, enabled = true, description = "Verify the click on Videos under Wood Restoration card")
	public void verifyClickonWoodRestorationVideos() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.navigate().back();
		osp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickMyOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread20000"))));
		osp.clickWoodRestorationVideos();
		// Verify the presence of Back Button
		/*
		 * WebElement BackButtonVideos = Page.driver .findElement(By.
		 * xpath("//i[@class='fas fa-chevron-circle-left colorBlue font16px']"));
		 * Assert.assertTrue(BackButtonVideos.isDisplayed()); Thread.sleep(3000); //
		 * Verify the presence Videos header text String VideosHeaderTxt = Page.driver
		 * .findElement(By.xpath("//h5[@class='m-0']")).getText();
		 * Assert.assertEquals(VideosHeaderTxt, "Videos"); Thread.sleep(3000); //
		 * Verification of the presence of video WebElement VideoContent = Page.driver
		 * .findElement(By.xpath("(//img[@class='w-100'])[1]"));
		 * Assert.assertTrue(VideoContent.isDisplayed()); Thread.sleep(3000);
		 */
		String text = Page.getText("NoResults_XPATH");
		String newtext = text.substring(text.indexOf('\n')+1);
		Assert.assertEquals(newtext,"No results match your search criteria.");
	}

	@Test(priority = 21, enabled = true, description = "Verify the click on Project Profiles under Wood Restoration card")
	public void verifyClickonWoodRestorationProjectProfiles() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.navigate().back();
		osp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickMyOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		osp.clickWoodRestorationProjectProfiles();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*
		 * WebElement BackBtnProjectProfiles = Page.driver .findElement(By.
		 * xpath("//i[@class='fas fa-chevron-circle-left colorBlue font16px']"));
		 * Assert.assertTrue(BackBtnProjectProfiles.isDisplayed()); Thread.sleep(3000);
		 * // Verify the presence Document header text String DocumentHeaderTxt =
		 * Page.driver
		 * .findElement(By.xpath("//h5[contains(text(),'Documents')]")).getText();
		 * Assert.assertEquals(DocumentHeaderTxt, "Documents"); Thread.sleep(3000); //
		 * Verification of the presence of document WebElement DocumentContent =
		 * Page.driver .findElement(By.xpath("(//div[@class='docBox m-0 mb-2']/a)[1]"));
		 * Assert.assertTrue(DocumentContent.isDisplayed()); Thread.sleep(3000);
		 */
		String text = Page.getText("NoResults_XPATH");
		String newtext = text.substring(text.indexOf('\n')+1);
		Assert.assertEquals(newtext,"No results match your search criteria.");
	}
	
	@Test(priority = 22, enabled = true, description = "Verify the click on MAP under Wood Restoration and Treatment card")
	public void verifyClickonWoodRestorationMAP() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.navigate().back();
		osp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickMyOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		osp.clickWoodRestorationMAP();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertTrue(Page.isVisible("MOSMapView_XPATH"));
		Assert.assertTrue(Page.isVisible("MOSDataGrid_XPATH"));
	}

	@Test(priority = 23, enabled = true, description = "Verify the click on Videos under Underground card")
	public void verifyClickonUndergroundVideos() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.navigate().back();
		osp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickMyOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		osp.clickUndergroundVideos();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*
		 * WebElement BackButtonVideos = Page.driver .findElement(By.
		 * xpath("//i[@class='fas fa-chevron-circle-left colorBlue font16px']"));
		 * Assert.assertTrue(BackButtonVideos.isDisplayed()); Thread.sleep(3000); //
		 * Verify the presence Videos header text String VideosHeaderTxt = Page.driver
		 * .findElement(By.xpath("//h5[@class='m-0']")).getText();
		 * Assert.assertEquals(VideosHeaderTxt, "Videos"); Thread.sleep(3000); //
		 * Verification of the presence of video WebElement VideoContent = Page.driver
		 * .findElement(By.xpath("(//img[@class='w-100'])[1]"));
		 * Assert.assertTrue(VideoContent.isDisplayed()); Thread.sleep(3000);
		 */
		String text = Page.getText("NoResults_XPATH");
		String newtext = text.substring(text.indexOf('\n')+1);
		Assert.assertEquals(newtext,"No results match your search criteria.");
	}

	@Test(priority = 24, enabled = true, description = "Verify the click on Project Profiles under Underground card")
	public void verifyClickonUndergroundProjectProfiles() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.navigate().back();
		osp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickMyOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		osp.clickUnderstandProjectProfiles();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*
		 * WebElement BackBtnProjectProfiles = Page.driver .findElement(By.
		 * xpath("//i[@class='fas fa-chevron-circle-left colorBlue font16px']"));
		 * Assert.assertTrue(BackBtnProjectProfiles.isDisplayed()); Thread.sleep(3000);
		 * // Verify the presence Document header text String DocumentHeaderTxt =
		 * Page.driver
		 * .findElement(By.xpath("//h5[contains(text(),'Documents')]")).getText();
		 * Assert.assertEquals(DocumentHeaderTxt, "Documents"); Thread.sleep(3000); //
		 * Verification of the presence of document WebElement DocumentContent =
		 * Page.driver .findElement(By.xpath("(//div[@class='docBox m-0 mb-2']/a)[1]"));
		 * Assert.assertTrue(DocumentContent.isDisplayed()); Thread.sleep(3000);
		 */
		String text = Page.getText("NoResults_XPATH");
		String newtext = text.substring(text.indexOf('\n')+1);
		Assert.assertEquals(newtext,"No results match your search criteria.");
	}

	@Test(priority = 25, enabled = true, description = "Verify the pop-up after click on Underground card")
	public void verifyPopUpUnderground() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.navigate().back();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		osp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickMyOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		osp.clickUnderground();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("ContactUsPopUpTxt_XPATH"), "The information for this service is not currently available in Osmose 360. Complete this form to request more details about getting this set up. Someone will be in touch with you as quickly as possible.");
		Assert.assertTrue(Page.isVisible("MOSContactUsPopUpSubmitBtn_XPATH"));
		Assert.assertTrue(Page.isVisible("ContactUsPopUpHeaderTxt_XPATH"));
		Assert.assertEquals(Page.getText("ContactUsPopUpHeaderTxt_XPATH"), "Contact Us");
		String defaultValue = Page.getdefaultValuefromdropdown("ContactUsFormSubjectdd_XPATH");
		Assert.assertEquals(defaultValue, "Project Support");
		Page.click("ContactUsPopUpCloseBtn_XPATH");
	}

	// Keep this always false
	@Test(priority = 26, enabled = false, description = "Verify the click on Cancel button on the pop-up after click on Underground card")
	public void verifyCancelClickOnPopUpUnderground() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		WebElement cancelBtn = Page.driver.findElement(By.xpath("//button[contains(text(),'CANCEL')]"));
		Assert.assertTrue(cancelBtn.isDisplayed());
		Page.click("UndergroundPopUpCancelBtn_XPATH");
		WebElement UndergroundCard = Page.driver.findElement(By.xpath("//*[contains(text(),'Underground')]"));
		// Verifying the presence of Underground card
		Assert.assertTrue(UndergroundCard.isDisplayed());
	}
	
	// Keep this always false
	@Test(priority = 27, enabled = false, description = "Verify the click on ok button on the pop-up after click on Underground card")
	public void verifyOkClickOnPopUpUnderground() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		osp.clickUnderground();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		WebElement okBtn = Page.driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
		Assert.assertTrue(okBtn.isDisplayed());
		Page.click("UndergroundPopUpOkBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		WebElement ContactUsPopupHeaderTxt= Page.driver.findElement(By.xpath("//h5[@class='modal-title' and text()='Contact Us']"));
		Assert.assertTrue(ContactUsPopupHeaderTxt.isDisplayed());
		Assert.assertEquals(Page.getText("ContactUsPopUpHeaderTxt_XPATH"), "Contact Us");
		String defaultValue = Page.getdefaultValuefromdropdown("ContactUsFormSubjectdd_XPATH");
		Assert.assertEquals(defaultValue, "Project Support");
		Assert.assertEquals(Page.getText("ContactUsPopUpTxt_XPATH"), " The information for this service is not currently available in Osmose 360. Complete this form to request more details about getting this setup. Someone will be in touch with you as quickly as possible. ");
		Page.click("ContactUsPopUpCloseBtn_XPATH");
	}
	
	@Test(priority = 28, enabled = true, description = "Verify the presence and click on Take me to Osmose.com link")
	public void verifyTakeMeToOsmoseClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		// Verifying the presence of Wood Restoration card
		Assert.assertTrue(Page.isVisible("OcalcProCard_XPATH"));
		osp.clickOcalProLearnMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verifying the Header text of OcalPro
		Assert.assertEquals(Page.getText("OcalcProPopupHeaderTxt_XPATH"), "O-Calc Pro");
		Assert.assertTrue(Page.isVisible("TakeMeToOsmoseLnk_XPATH"));
		Page.click("TakeMeToOsmoseLnk_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		osp.closeTab(1);
		osp.switchToparentWindow();
		osp.clickLearnMorePopupCloseButton();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("MOSOsmoseLogo_XPATH");
	}

}
