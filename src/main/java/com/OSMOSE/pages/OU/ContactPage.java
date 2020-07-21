package com.OSMOSE.pages.OU;

import com.OSMOSE.base.Page;

public class ContactPage extends Page {
	public void clickOnOU360() {
		click("HomePage_XPATH");
	}

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
	
	public void clickCloseOnThankYouFormSubmission( ) {
		click("FormSubmissionThankYouPopUpCloseBtn_XPATH");
	}

}
