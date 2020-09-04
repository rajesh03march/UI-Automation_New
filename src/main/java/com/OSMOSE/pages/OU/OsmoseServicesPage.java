package com.OSMOSE.pages.OU;

import com.OSMOSE.base.Page;

public class OsmoseServicesPage extends Page {

	public void clickOnOU360() {
		ClickActions("HomePage_XPATH");
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

}
