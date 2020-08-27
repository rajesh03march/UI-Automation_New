package com.OSMOSE.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.KnowledgeBasePage;
import com.OSMOSE.pages.OU.OsmoseServicesPage;

public class OsmoseServices extends BaseTest {

	//
	@Test(priority = 0, enabled = true, description = "Verify the presence of My Osmose Services Card on Home Page")
	public void verifyMyOsmoseServicesCardClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		osp.clickOnOU360();
		Thread.sleep(3000);
		WebElement MyOsmoseServicesCard = Page.driver.findElement(By.xpath("//div[@id='card-knowBase']/div[1]/a/p"));
		// Verifying the presence of My Osmose Services card on Home Page
		Assert.assertTrue(MyOsmoseServicesCard.isDisplayed());
		osp.clickMyOsmoseServices();
		// Verifying the Header Text displayed on My Osmose Services Page
		Assert.assertEquals(Page.getText("MyOsmoseServicesFirstHeader_XPATH"), "My Osmose Services");
		Assert.assertEquals(Page.getText("MyOsmoseServicesSecondHeader_XPATH"), "View & Manage");
	}

	//US-97721-98088-Verify Content displayed on the My Osmose Services page
	//US-99512-99702-Verify Learn More link functionality, when "Wood | Inspection & Treatment " tile is inactive for logged in user
	@Test(priority = 1, enabled = true, description = "Verify the presence of Wood Inspection and Treatment and click on Learn More button")
	public void verifyWoodInspectionandTreatmentLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		WebElement WoodInspectionandTreatmentCard = Page.driver
				.findElement(By.xpath("//*[@id='contentPart']/div/div/div/div/div[1]/div"));
		// Verifying the presence of Wood Inspection and Treatment card
		Assert.assertTrue(WoodInspectionandTreatmentCard.isDisplayed());
		osp.clickWoodInspectionandTreatmentLearnMore();
		Thread.sleep(5000);
		// Verifying the Header text of Wood Inspection and treatment
		Assert.assertEquals(Page.getText("WoodInspectionAndTreatmentPopupHeaderTxt_XPATH"),
				"Wood | Inspection & Treatment");
		osp.clickLearnMorePopupCloseButton();
	}

	//US-97721-98088-Verify Content displayed on the My Osmose Services page
	//US-99512-99700-Verify Learn More link functionality,when "Wood | Restoration" tile is inactive for logged in user
	@Test(priority = 2, enabled = true, description = "Verify the presence of Wood Restoration and click on Learn More button")
	public void verifyWoodRestorationLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		WebElement WoodRestorationCard = Page.driver
				.findElement(By.xpath("//*[@id='contentPart']/div/div/div/div/div[2]/div"));
		// Verifying the presence of Wood Restoration card
		Assert.assertTrue(WoodRestorationCard.isDisplayed());
		osp.clickWoodRestorationLearnMore();
		Thread.sleep(5000);
		// Verifying the Header text of Wood Rstoration
		Assert.assertEquals(Page.getText("WoodRestorationPopupHeaderTxt_XPATH"), "Wood | Restoration");
		osp.clickLearnMorePopupCloseButton();
	}

	//US-97721-98088-Verify Content displayed on the My Osmose Services page
	//US-99512-99701-Verify Learn More link functionality, when "O-Calc" tile is inactive for logged in user
	@Test(priority = 3, enabled = true, description = "Verify the presence of OCalc Pro and click on Learn More button")
	public void verifyOcalcProLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		WebElement OClacProCard = Page.driver
				.findElement(By.xpath("//*[@id='contentPart']/div/div/div/div/div[3]/div"));
		// Verifying the presence of Wood Restoration card
		Assert.assertTrue(OClacProCard.isDisplayed());
		osp.clickOcalProLearnMore();
		Thread.sleep(5000);
		// Verifying the Header text of OcalPro
		Assert.assertEquals(Page.getText("OcalcProPopupHeaderTxt_XPATH"), "O-Calc Pro");
		osp.clickLearnMorePopupCloseButton();
	}

	//US-97721-98088-Verify Content displayed on the My Osmose Services page
	//US-99512-99703-Verify Learn More link functionality, when "Steel & Concrete | Assessment " tile is inactive for logged in user
	@Test(priority = 4, enabled = true, description = "Verify the presence of Steel & Concrete | Assessment and click on Learn More button")
	public void verifySteelandConcreteAssessmentLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		WebElement SteelandConcreteAssessmentCard = Page.driver
				.findElement(By.xpath("//*[@id='contentPart']/div/div/div/div/div[4]/div"));
		// Verifying the presence of Steel & Concrete | Assessment card
		Assert.assertTrue(SteelandConcreteAssessmentCard.isDisplayed());
		osp.clickSteelandConcreteAssessmentLearnMore();
		Thread.sleep(5000);
		// Verifying the Header text of Steel & Concrete | Assessment
		Assert.assertEquals(Page.getText("SteelandConcreteAssessmentPopupHeaderTxt_XPATH"), "Steel & Concrete | Assessment");
		osp.clickLearnMorePopupCloseButton();
	}
	
	//US-97721-98088-Verify Content displayed on the My Osmose Services page
	//US-99512-99704-Verify Learn More link functionality, when "Steel & Concrete | Restoration" tile is inactive for logged in user
	@Test(priority = 5, enabled = true, description = "Verify the presence of Steel & Concrete | Restoration and click on Learn More button")
	public void verifySteelandConcreteRestorationLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		WebElement SteelandConcreteRestorationCard = Page.driver
				.findElement(By.xpath("//*[@id='contentPart']/div/div/div/div/div[5]/div"));
		// Verifying the presence of Steel & Concrete | Restoration card
		Assert.assertTrue(SteelandConcreteRestorationCard.isDisplayed());
		osp.clickSteelandConcreteRestorationLearnMore();
		Thread.sleep(5000);
		// Verifying the Header text of Steel & Concrete | Restoration
		Assert.assertEquals(Page.getText("SteelandConcreteRestorationPopupHeaderTxt_XPATH"), "Steel & Concrete | Restoration");
		osp.clickLearnMorePopupCloseButton();
	}
	
	//US-97721-98088-Verify Content displayed on the My Osmose Services page
	//US-99512-99705-Verify Learn More link functionality, when "Overhead" tile is inactive for logged in user
	@Test(priority = 6, enabled = true, description = "Verify the presence of Overhead and click on Learn More button")
	public void verifyOverheadLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		WebElement OverheadCard = Page.driver
				.findElement(By.xpath("//*[@id='contentPart']/div/div/div/div/div[6]/div"));
		// Verifying the presence of Overhead card
		Assert.assertTrue(OverheadCard.isDisplayed());
		osp.clickOverheadLearnMore();
		Thread.sleep(5000);
		// Verifying the Header text of Overhead
		Assert.assertEquals(Page.getText("OverheadPopupHeaderTxt_XPATH"), "Overhead");
		osp.clickLearnMorePopupCloseButton();
	}
	
	//US-97721-98088-Verify Content displayed on the My Osmose Services page
	//US-99512-99706-Verify Learn More link functionality,when "Underground" tile is inactive for logged in user
	@Test(priority = 7, enabled = true, description = "Verify the presence of Underground and click on Learn More button")
	public void verifyUndergroundLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		WebElement UndergroundCard = Page.driver
				.findElement(By.xpath("//*[@id='contentPart']/div/div/div/div/div[7]/div"));
		// Verifying the presence of Underground card
		Assert.assertTrue(UndergroundCard.isDisplayed());
		osp.clickUndergroundLearnMore();
		Thread.sleep(5000);
		// Verifying the Header text of Underground
		Assert.assertEquals(Page.getText("UndergroundPopupHeaderTxt_XPATH"), "Underground");
		osp.clickLearnMorePopupCloseButton();
	}
	
	//US-97721-98088-Verify Content displayed on the My Osmose Services page
	//US-99512-99707-Verify  Learn More link functionality, when "Joint Use" tile is inactive for logged in user
	@Test(priority = 8, enabled = true, description = "Verify the presence of JointUse and click on Learn More button")
	public void verifyJointUseLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		WebElement JointUseCard = Page.driver
				.findElement(By.xpath("//*[@id='contentPart']/div/div/div/div/div[8]/div"));
		// Verifying the presence of JointUse card
		Assert.assertTrue(JointUseCard.isDisplayed());
		osp.clickJointUseLearnMore();
		Thread.sleep(5000);
		// Verifying the Header text of JointUse
		Assert.assertEquals(Page.getText("JointUsePopupHeaderTxt_XPATH"), "Joint Use");
		osp.clickLearnMorePopupCloseButton();
	}
	
	//US-97721-98088-Verify Content displayed on the My Osmose Services page
	//US-99512-99709-Verify Learn More link functionality, when "Stray Voltage" tile is inactive for logged in user
	@Test(priority = 9, enabled = true, description = "Verify the presence of StrayVoltage and click on Learn More button")
	public void verifyStrayVoltageLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		WebElement StrayVoltageCard = Page.driver
				.findElement(By.xpath("//*[@id='contentPart']/div/div/div/div/div[9]/div"));
		// Verifying the presence of Stray Voltage card
		Assert.assertTrue(StrayVoltageCard.isDisplayed());
		osp.clickStrayVoltageLearnMore();
		Thread.sleep(5000);
		// Verifying the Header text of Stray Voltage
		Assert.assertEquals(Page.getText("StrayVoltagePopupHeaderTxt_XPATH"), "Stray Voltage");
		osp.clickLearnMorePopupCloseButton();
	}
	
	//US-97721-98088-Verify Content displayed on the My Osmose Services page
	//US-99512-99708-Verify Learn More link functionality, when "Technical Services" tile is inactive for logged in user
	@Test(priority = 10, enabled = true, description = "Verify the presence of Technical Services and click on Learn More button")
	public void verifyTechnicalServicesLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		WebElement TechnicalServicesCard = Page.driver
				.findElement(By.xpath("//*[@id='contentPart']/div/div/div/div/div[10]/div"));
		// Verifying the presence of Technical Services card
		Assert.assertTrue(TechnicalServicesCard.isDisplayed());
		osp.clickTechnicalServicesLearnMore();
		Thread.sleep(5000);
		// Verifying the Header text of Technical Services
		Assert.assertEquals(Page.getText("TechnicalServicesPopupHeaderTxt_XPATH"), "Technical Services");
		osp.clickLearnMorePopupCloseButton();
	}
	
	//US-97721-98088-Verify Content displayed on the My Osmose Services page
	//US-99512-99710-Verify Learn More link functionality,when "Products" tile is inactive for logged in user
	@Test(priority = 11, enabled = true, description = "Verify the presence of Products and click on Learn More button")
	public void verifyProductsLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		WebElement ProductsCard = Page.driver
				.findElement(By.xpath("//*[@id='contentPart']/div/div/div/div/div[11]/div"));
		// Verifying the presence of Products card
		Assert.assertTrue(ProductsCard.isDisplayed());
		osp.clickProductsLearnMore();
		Thread.sleep(5000);
		// Verifying the Header text of Products
		Assert.assertEquals(Page.getText("ProductsPopupHeaderTxt_XPATH"), "Products");
		osp.clickLearnMorePopupCloseButton();
	}
	
	//US-97721-98088-Verify Content displayed on the My Osmose Services page
	//US-99512-99711-Verify Learn More link functionality,when "Map View" tile is inactive for logged in user
	@Test(priority = 12, enabled = true, description = "Verify the presence of Map View and click on Learn More button")
	public void verifyMapViewLearnMoreClick() throws InterruptedException {
		KnowledgeBasePage kb = new KnowledgeBasePage();
		OsmoseServicesPage osp = kb.goOsmoseServices();
		WebElement MapViewCard = Page.driver
				.findElement(By.xpath("//*[@id='contentPart']/div/div/div/div/div[12]/div"));
		// Verifying the presence of Map View card
		Assert.assertTrue(MapViewCard.isDisplayed());
		osp.clickMapViewLearnMore();
		Thread.sleep(5000);
		// Verifying the Header text of Map View
		Assert.assertEquals(Page.getText("MapViewPopupHeaderTxt_XPATH"), "Map View");
		osp.clickLearnMorePopupCloseButton();
	}

}
