package com.OSMOSE.pages.OU;

import com.OSMOSE.base.Page;

public class OsmoseServicesPage extends Page {

	public void clickOnOU360() throws InterruptedException {
		Thread.sleep(1000);
		ClickActions("MOSOsmoseLogo_XPATH");
	}

	public void clickMyOsmoseServices() throws InterruptedException {
		Thread.sleep(1000);
		click("MyOsmoseServicesCard_XPATH");
	}

	public void clickWoodInspectionandTreatmentLearnMore() {
		click("WoodInspectionAndTreatmentLearnMoreBtn_XPATH");
	}

	public void clickWoodRestorationLearnMore() {
		click("WoodRestorationLearnMoreBtn_XPATH");
	}

	public void clickOcalProLearnMore() {
		click("OcalcProLearnMoreBtn_XPATH");
	}

	public void clickSteelandConcreteAssessmentLearnMore() {
		click("SteelandConcreteAssessmentLearnMoreBtn_XPATH");
	}

	public void clickSteelandConcreteRestorationLearnMore() {
		click("SteelandConcreteRestorationLearnMoreBtn_XPATH");
	}

	public void clickOverheadLearnMore() {
		click("OverheadLearnMoreBtn_XPATH");
	}

	public void clickUndergroundLearnMore() {
		click("UndergroundLearnMoreBtn_XPATH");
	}

	public void clickJointUseLearnMore() {
		click("JointUseLearnMoreBtn_XPATH");
	}

	public void clickStrayVoltageLearnMore() {
		click("StrayVoltageLearnMore_XPATH");
	}

	public void clickTechnicalServicesLearnMore() {
		click("TechnicalServicesLearnMore_XPATH");
	}

	public void clickProductsLearnMore() {
		click("ProductsLearnMore_XPATH");
	}

	public void clickMapViewLearnMore() {
		click("MapViewLearnMore_XPATH");
	}

	public void clickLearnMorePopupCloseButton() {
		click("LearnMorePopupCloseBtn_XPATH");
	}
	
	public void navigateToPedernalesElecCoop() throws InterruptedException {
		click("MOSProjectGroupMenu_XPATH");
		Thread.sleep(1000);
		click("MOSPedernalesElecCoop_XPATH");
		Thread.sleep(1000);
		click("MOSPedernalesECDev_XPATH");
	}
	
	public void navigateToColombiapit() throws InterruptedException {
		click("ProjectGroupMenu_XPATH");
		Thread.sleep(1000);
		click("MOSCityOfColumbia_XPATH");
		Thread.sleep(1000);
		click("MOSColombiapit_XPATH");
	}
	
	public void clickWoodInspection() throws InterruptedException {
		click("MOSWoodInspectionAndTreatmentCard_XPATH");
	}
	
	public void clickWoodTreatmentVideos() {
		click("MOSWoodInspectionVideos_XPATH");
	}
	
	public void clickWoodTreatmentProjectProfiles() {
		click("MOSWoodInspectionProjectProfiles_XPATH");
	}
	
	public void clickWoodRestoration() throws InterruptedException {
		click("MOSWoodRestorationCard_XPATH");
	}
	
	public void clickWoodRestorationVideos() {
		click("MOSWoodRestorationVideos_XPATH");
	}
	
	public void clickWoodRestorationProjectProfiles() {
		click("MOSWoodRestorationProjectProfiles_XPATH");
	}
	
	public void clickUndergroundVideos() {
		click("MOSUndergroundVideos_XPATH");
	}
	
	public void clickUnderstandProjectProfiles() {
		click("MOSUndergroundProjectProfiles_XPATH");
	}
	
	public void clickUnderground() throws InterruptedException {
		click("UndergroundCard_XPATH");
	}
	
	
	public oCalcProPage gooCalcPro() {
		return new oCalcProPage();
	}

}
