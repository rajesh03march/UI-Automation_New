package com.OSMOSE.pages.OU;

import com.OSMOSE.base.Page;

public class ContactPage extends Page {
	public void clickContactUsMainMenudd() {
		click("ContactUsMainMenudd_XPATH");
	}

	public void ClickViewContactsMenu() {
		click("ViewContactsMenu_XPATH");
	}

	public void ClickContactUsMenu() {
		click("ContactUsMenu_XPATH");
	}

	public void ClickOnBackButton() {
		click("ContactUsBackBtn_XPATH");
	}

	public void clickOnAtlantaMap() {
		click("ContactUsOurLocationsAtlanta_XPATH");
	}

	public void clickOnBuffaloMap() {
		click("ContactUsOurLocationsBuffalo_XPATH");
	}

	public void clickOnSyracuseMap() {
		click("ContactUsOurLocationsSyracuse_XPATH");
	}

	public void submitWithRequestForInformation() {
		ClickActions("ContactUsFormEmailRadio_XPATH");
		selectbyindex("ContactUsFormSubjectdd_XPATH", 1);
		type("ContactUsFormMessageTxtarea_XPATH", "Submitting the form with Subject 'Request For Information'");
		click("ContactUsFormSubmitBtn_XPATH");
	}

	public void submitWithProjectSupport() {
		ClickActions("ContactUsFormEmailRadio_XPATH");
		selectbyindex("ContactUsFormSubjectdd_XPATH", 2);
		type("ContactUsFormMessageTxtarea_XPATH", "Submitting the form with Subject 'Project Support'");
		click("ContactUsFormSubmitBtn_XPATH");
	}

	public void submitWithTechnicalSupport() {
		ClickActions("ContactUsFormPhoneRadio_XPATH");
		selectbyindex("ContactUsFormSubjectdd_XPATH", 3);
		type("ContactUsFormMessageTxtarea_XPATH", "Submitting the form with Subject 'Technical Support'");
		click("ContactUsFormSubmitBtn_XPATH");
	}

	public void submitWithOther() {
		ClickActions("ContactUsFormPhoneRadio_XPATH");
		selectbyindex("ContactUsFormSubjectdd_XPATH", 4);
		type("ContactUsFormMessageTxtarea_XPATH", "Submitting the form with Subject 'Other'");
		click("ContactUsFormSubmitBtn_XPATH");
	}

	public void clickCloseOnThankYouFormSubmission() {
		click("FormSubmissionThankYouPopUpCloseBtn_XPATH");
	}

	public void navigateToColombiapit() throws InterruptedException {
		click("ProjectGroupMenu_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("CityOfColumbia_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("Colombiapit_XPATH");
	}
	
	public void navigateToGeorgiaPowerCompanyDistributionChange() throws InterruptedException {
		click("ProjectGroupMenu_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("GeorgiaPowerCompany_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("GeorgiaPowerCompanyDistributionChange_XPATH");
	}
	
	public void navigateToGrandElectric() throws InterruptedException {
		click("ProjectGroupMenu_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("GrandElectricMenu_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("GrandElectric_XPATH");
	}
	
	public void navigateToIdahoPowerCompanyInspection() throws InterruptedException {
		click("ProjectGroupMenu_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("IdahoPowerCompany_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("IdahoPowerInspection_XPATH");
	}
	
	public void navigateToIdahoPowerCompanyRestoration() throws InterruptedException {
		click("ProjectGroupMenu_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		/*click("IdahoPowerCompany_XPATH");
		Thread.sleep(1000);*/
		click("IdahoPowerRestoration_XPATH");
	}
	
	public void navigateToOncor() throws InterruptedException {
		click("ProjectGroupMenu_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("Oncor_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("OncorDistribution_XPATH");
	}
	
	public void navigateToPacificGasAndElectricCo() throws InterruptedException {
		click("ProjectGroupMenu_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("PacificGasAndElectricCo_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("PacificGasAndElectricTransmission_XPATH");
	}
	
	public void navigateToPedernalesElecCoop() throws InterruptedException {
		click("ProjectGroupMenu_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("PedernalesElecCoop_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("PedernalesECDev_XPATH");
	}
	
	public void navigateToPugetSoundEnergyInspection() throws InterruptedException {
		click("ProjectGroupMenu_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("PugetSoundEnergy_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		click("PugetSoundEnergyInspection_XPATH");
	}
	
	public void navigateToPugetSoundEnergyRestoration() throws InterruptedException {
		click("ProjectGroupMenu_XPATH");
		Thread.sleep((Long.parseLong(config.getProperty("Thread1000"))));
		/*click("PugetSoundEnergy_XPATH");
		Thread.sleep(1000);*/
		click("PugetSoundEnergyRestoration_XPATH");
	}

	public KnowledgeBasePage goKnowledgeBase() {
		return new KnowledgeBasePage();
	}

}
