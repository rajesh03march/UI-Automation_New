package com.OSMOSE.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.ContactPage;
import com.OSMOSE.pages.OU.JointUsePage;
import com.OSMOSE.pages.OU.KnowledgeBasePage;
import com.OSMOSE.pages.OU.ProjectDashboardPage;

public class Projectdashboard extends BaseTest {
	Page p = new Page();

	@Test(priority = 1, enabled = true, description = "Verify the click on Project Dashboard menu and card Navigationl")
	public void verifyProjectDashboardeNavigationClick() throws InterruptedException {
		JointUsePage ju = new JointUsePage();
		ProjectDashboardPage pd = ju.goProjectDashboard();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		pd.clickPDNavigation();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertTrue(Page.isVisible("PDSummaryView_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("PDHomePage_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		pd.clickPDCard();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertTrue(Page.isVisible("PDSummaryView_XPATH"));

	}

	@Test(priority = 2, enabled = true, description = "Verify Project Deliverables Tab in Project Dashboard Page")
	public void verifyProjectDeliverablesTab() throws InterruptedException {
		JointUsePage ju = new JointUsePage();
		ProjectDashboardPage pd = ju.goProjectDashboard();
		pd.navigateToOncor();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertTrue(Page.isVisible("PDProjectDeliverables_XPATH"));

	}

	@Test(priority = 3, enabled = true, description = "Verify Project Deliverables(Box) Contents")
	public void verifyProjectDeliverablesContents() throws InterruptedException {
		JointUsePage ju = new JointUsePage();
		ProjectDashboardPage pd = ju.goProjectDashboard();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("PDProjectDeliverables_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertTrue(Page.isVisible("PDSearchbox_XPATH"));
		Assert.assertTrue(Page.isVisible("PDSwitchView_XPATH"));

	}

	@Test(priority = 4, enabled = true, description = "Verify Project Deliverables(Box) Search Funtionality")
	public void verifyPDSearchFuntionality() throws InterruptedException {
		JointUsePage ju = new JointUsePage();
		ProjectDashboardPage pd = ju.goProjectDashboard();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.type("PDSearchbox_XPATH", "PDF");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(Page.getText("PDSearchResultsText_XPATH"), "Search Results");

	}

	@Test(priority = 5, enabled = true, description = "Verify Project Deliverables(Box) Switch View Functionality")
	public void verifyPDSwitchViewFunctionality() throws InterruptedException {
		JointUsePage ju = new JointUsePage();
		ProjectDashboardPage pd = ju.goProjectDashboard();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("PDSwitchView_XPATH");
		Assert.assertTrue(Page.isVisible("PDGridViewSlider_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("PDSwitchView_XPATH");
		Assert.assertFalse(Page.isVisible("PDGridViewSlider_XPATH"));

	}
	@Test(priority = 6, enabled = true, description = "Verify Project Deliverables(Box) BreadCrumb Navigation Functionality")
	public void verifyPDBreadCrumbNavigationFunctionality() throws InterruptedException {
		JointUsePage ju = new JointUsePage();
		ProjectDashboardPage pd = ju.goProjectDashboard();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.clear("PDSearchbox_XPATH");
		Assert.assertTrue(Page.isVisible("PDHome_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("PDThirdFolder_XPATH");
		Assert.assertTrue(Page.isVisible("PDBreadCrumb1_XPATH"));
		Page.click("PDFirstSubFolder_XPATH");
		Assert.assertTrue(Page.isVisible("PDBreadCrumb2_XPATH"));
		Page.click("PDBreadCrumb1_XPATH");
		Assert.assertFalse(Page.isVisible("PDBreadCrumb2_XPATH"));
		Page.click("PDHome_XPATH");
		Assert.assertFalse(Page.isVisible("PDBreadCrumb1_XPATH"));
		
}}