package com.OSMOSE.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.JointUsePage;
import com.OSMOSE.pages.OU.Login;
import com.OSMOSE.pages.OU.oCalcProPage;
import com.OSMOSE.utilities.Utilities;

public class JointUse_ts_allroles5 extends BaseTest {

	Page p = new Page();

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 0, description = "Verify the login functionality")
	public void jointUseloginTestAllRoles(Hashtable<String, String> data) throws InterruptedException {
		Login lo = new Login();
		lo.doLogin(data.get("username"), data.get("password"));
		Page.click("submit_XPATH");
		String element = Page.getText("verify_ID");
		Assert.assertEquals(element, "All Roles");
	}

	@Test(priority = 1, enabled = true, description = "Verify the click on Joint Use menu and card Navigation")
	public void verifyJointUseNavigationClick() throws InterruptedException {
		oCalcProPage ocal = new oCalcProPage();
		JointUsePage jup = ocal.goJointUse();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		jup.clickJUNavigation();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		System.out.println("The current Url is: " + Page.driver.getCurrentUrl());
		Page.driver.navigate().back();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		jup.clickJUCard();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		System.out.println("The header text on JU page is: " + Page.getText("JUHeaderTxt_XPATH"));
	}

	@Test(priority = 2, enabled = true, description = "Verify the Presence of Horizontal collapse button functionality")
	public void verifyHorizontalCollapseFunctionality() throws InterruptedException {
		oCalcProPage ocal = new oCalcProPage();
		JointUsePage jup = ocal.goJointUse();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verify the presence of Collapse icon
		if (Page.findelement("HorizontalCollapse_XPATH").isDisplayed()) {
			Assert.assertTrue(Page.isVisible("HorizontalCollapse_XPATH"));
			Assert.assertTrue(Page.isVisible("HorizontalFirstGraph_XPATH"));
			Page.click("HorizontalCollapse_XPATH");
		}

		else {
			Assert.assertTrue(Page.isVisible("HorizontalExpand_XPATH"));
			Assert.assertFalse(Page.findelement("HorizontalFirstGraph_XPATH").isDisplayed());
			Page.click("HorizontalExpand_XPATH");
			Assert.assertTrue(Page.isVisible("HorizontalFirstGraph_XPATH"));
		}
	}

	@Test(priority = 3, enabled = true, description = "Verify the Presence of Vertical collapse button functionality")
	public void verifyVerticalCollapseFunctionality() throws InterruptedException {
		oCalcProPage ocal = new oCalcProPage();
		JointUsePage jup = ocal.goJointUse();
		// Verify the presence of Collapse icon
		if (Page.findelement("VerticalCollapse_XPATH").isDisplayed()) {
			Assert.assertTrue(Page.isVisible("VerticalFirstGraph_XPATH"));
			Page.click("VerticalCollapse_XPATH");
		} else {
			Assert.assertTrue(Page.isVisible("VerticalExpand_XPATH"));
			Assert.assertFalse(Page.findelement("VerticalFirstGraph_XPATH").isDisplayed());
			Page.click("VerticalExpand_XPATH");
			Assert.assertTrue(Page.isVisible("VerticalFirstGraph_XPATH"));
		}
	}

	@Test(priority = 4, enabled = true, description = "Verify the Presence of Add widgets button")
	public void verifyAddWidgets() throws InterruptedException {
		oCalcProPage ocal = new oCalcProPage();
		JointUsePage jup = ocal.goJointUse();
		// Verify the presence of Add Widget button
		Assert.assertTrue(Page.isVisible("AddWidgetBtn_XPATH"));
		// verify the presence of Add Widget title
		Assert.assertEquals(Page.getAttributeValue("AddWidgetBtn_XPATH", "title"), "Add Widgets");
	}

	@Test(priority = 5, enabled = true, description = "Verify the Presence of Edit Layout button")
	public void verifyEditLayout() throws InterruptedException {
		oCalcProPage ocal = new oCalcProPage();
		JointUsePage jup = ocal.goJointUse();
		// Verify the presence of Edit Layout button
		Assert.assertTrue(Page.isVisible("EditLayoutBtn_XPATH"));
		// verify the presence of Edit Layout title
		Assert.assertEquals(Page.getAttributeValue("EditLayoutBtn_XPATH", "title"), "Edit Layout");
	}

	@Test(priority = 6, enabled = true, description = "Verify the presence of New Application button and its options")
	public void verifyNewApplication() {
		oCalcProPage ocal = new oCalcProPage();
		JointUsePage jup = ocal.goJointUse();
		// Verify the presence of New Application button
		Assert.assertTrue(Page.isVisible("NewApplicationBtn_XPATH"));
		Page.click("NewApplicationBtn_XPATH");
		// Verify the options displayed under New Application
		Assert.assertEquals(Page.getText("NewApplicationFirstHeaderTxt_XPATH"), "Applications");

		Assert.assertTrue(Page.isVisible("NewApplicationFirstApp_XPATH"));
		Assert.assertEquals(Page.getText("NewApplicationFirstApp_XPATH"), "Wired - New Attachment");

		Assert.assertTrue(Page.isVisible("NewApplicationSecondApp_XPATH"));
		Assert.assertEquals(Page.getText("NewApplicationSecondApp_XPATH"), "Overlash Notification");

		Assert.assertTrue(Page.isVisible("NewApplicationThirdApp_XPATH"));
		Assert.assertEquals(Page.getText("NewApplicationThirdApp_XPATH"), "Wired - Overlash or New Attachment");

		Assert.assertTrue(Page.isVisible("NewApplicationFourthApp_XPATH"));
		Assert.assertEquals(Page.getText("NewApplicationFourthApp_XPATH"), "Equipment");

		Assert.assertTrue(Page.isVisible("NewApplicationFifthApp_XPATH"));
		Assert.assertEquals(Page.getText("NewApplicationFifthApp_XPATH"), "Other - Banner, Sign, Drop");

		Assert.assertTrue(Page.isVisible("NewApplicationSixthApp_XPATH"));
		Assert.assertEquals(Page.getText("NewApplicationSixthApp_XPATH"), "Wireless - Antenna");

		Page.click("NewApplicationBtn_XPATH");
	}

	@Test(priority = 7, enabled = true, description = "Verify the presence of export options")
	public void verifyExportOptions() {
		oCalcProPage ocal = new oCalcProPage();
		JointUsePage jup = ocal.goJointUse();
		// Verify the presence of Export text
		Assert.assertEquals(Page.getText("ExportTxt_XPATH"), "Export:");
		// Verify the presence of Excel export option
		Assert.assertTrue(Page.isVisible("ExcelExport_XPATH"));
		Assert.assertEquals(Page.getText("ExcelExport_XPATH"), "Excel");
		// Verify the presence of Pdf export option
		Assert.assertTrue(Page.isVisible("PdfExport_XPATH"));
		Assert.assertEquals(Page.getText("PdfExport_XPATH"), "Pdf");
	}

	@Test(priority = 8, enabled = true, description = "Verify the presence of Search box")
	public void verifySearchBox() {
		oCalcProPage ocal = new oCalcProPage();
		JointUsePage jup = ocal.goJointUse();
		// Verify the presence of Search Box
		Assert.assertTrue(Page.isVisible("JUSearchBox_XPATH"));
		Assert.assertEquals(Page.getAttributeValue("JUSearchBox_XPATH", "placeholder"), "Search");
	}

	@Test(priority = 9, enabled = true, description = "Verify the presence of Refresh button")
	public void verifyRefreshBtn() {
		oCalcProPage ocal = new oCalcProPage();
		JointUsePage jup = ocal.goJointUse();
		// Verify the presence of Refresh Button
		Assert.assertTrue(Page.isVisible("RefreshBtn_XPATH"));
	}

	@Test(priority = 10, enabled = true, description = "Verify the presence of Number of rows")
	public void verifyRowsCount() {
		oCalcProPage ocal = new oCalcProPage();
		JointUsePage jup = ocal.goJointUse();
		// Verify the presence of Rows text
		Assert.assertTrue(Page.isVisible("RowsTxt_XPATH"));
		Assert.assertEquals(Page.getText("RowsTxt_XPATH"), "Rows");
		System.out.println("The number of rows is: " + Page.getText("NoOfRows_XPATH"));
	}

	@Test(priority = 11, enabled = true, description = "Verify the presence of Columns button")
	public void verifyColumns() throws InterruptedException {
		oCalcProPage ocal = new oCalcProPage();
		JointUsePage jup = ocal.goJointUse();
		// Verify the presence of Columns button
		Assert.assertTrue(Page.isVisible("Columns_XPATH"));
		Page.click("Columns_XPATH");
		System.out.println("The First Check box is: " + Page.getText("ColumnsFirstChkBx_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("Columns_XPATH");
	}

	@Test(priority = 12, enabled = true, description = "Verify Select All functionality")
	public void verifySelectAllFunctionality() throws InterruptedException {
		oCalcProPage ocal = new oCalcProPage();
		JointUsePage jup = ocal.goJointUse();
		// Verify the presence of Columns button
		Assert.assertTrue(Page.isVisible("SelectAllChkBx_XPATH"));
		Page.click("SelectAllChkBx_XPATH");
		Assert.assertTrue(Page.findelement("SelectAllFirstChkBx_XPATH").isSelected());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("SelectAllChkBx_XPATH");
		Assert.assertFalse(Page.findelement("SelectAllFirstChkBx_XPATH").isSelected());
	}

	@Test(priority = 13, enabled = true, description = "Verify Add widget click")
	public void verifyAddWidgetClick() throws InterruptedException {
		oCalcProPage ocal = new oCalcProPage();
		JointUsePage jup = ocal.goJointUse();
		if (Page.findelement("VerticalCollapse_XPATH").isDisplayed()) {
			Assert.assertTrue(Page.isVisible("AddWidgetBtn_XPATH"));
			Page.click("AddWidgetBtn_XPATH");
			Assert.assertTrue(Page.isVisible("AddWidgetCloseBtn_XPATH"));
			Assert.assertEquals(Page.getText("AddWidgetTxt_XPATH"), "Drag and Drop a widget to add to the dashboard");
			Page.click("AddWidgetCloseBtn_XPATH");
		} else {
			Assert.assertTrue(Page.isVisible("VerticalExpand_XPATH"));
			Assert.assertFalse(Page.findelement("AddWidgetBtn_XPATH").isDisplayed());
			Page.click("VerticalExpand_XPATH");
			Assert.assertTrue(Page.isVisible("AddWidgetBtn_XPATH"));
			Page.click("AddWidgetBtn_XPATH");
			Assert.assertTrue(Page.isVisible("AddWidgetCloseBtn_XPATH"));
			Assert.assertEquals(Page.getText("AddWidgetTxt_XPATH"), "Drag and Drop a widget to add to the dashboard");
			Page.click("AddWidgetCloseBtn_XPATH");
		}
	}

	@Test(priority = 14, enabled = true, description = "Verify Edit widget click")
	public void verifyEditWidgetClick() throws InterruptedException {
		oCalcProPage ocal = new oCalcProPage();
		JointUsePage jup = ocal.goJointUse();
		if (Page.findelement("VerticalCollapse_XPATH").isDisplayed()) {
			Assert.assertTrue(Page.isVisible("EditLayoutBtn_XPATH"));
			Page.click("EditLayoutBtn_XPATH");
			Assert.assertTrue(Page.isVisible("DeleteIcon_XPATH"));
			Page.click("SaveLayoutBtn_XPATH");
			Assert.assertTrue(Page.isVisible("DeleteIcon_XPATH"));
		} else {
			Assert.assertTrue(Page.isVisible("VerticalExpand_XPATH"));
			Page.click("VerticalExpand_XPATH");
			Assert.assertTrue(Page.isVisible("EditLayoutBtn_XPATH"));
			Page.click("EditLayoutBtn_XPATH");
			Assert.assertTrue(Page.isVisible("DeleteIcon_XPATH"));
			Page.click("SaveLayoutBtn_XPATH");
			Assert.assertTrue(Page.isVisible("DeleteIcon_XPATH"));
		}
	}

}
