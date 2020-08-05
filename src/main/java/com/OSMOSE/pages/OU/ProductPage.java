package com.OSMOSE.pages.OU;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.OSMOSE.base.Page;

public class ProductPage extends Page {
	public void clickOnOU360() {
		ClickActions("HomePage_XPATH");
	}

	public void clickProductLink() throws InterruptedException {
		Thread.sleep(1000);
		click("ProCard_XPATH");

	}

	public void clickProductCartLink() throws InterruptedException {
		Thread.sleep(1000);
		click("ProCard_XPATH");
	}

	public void clickOnSlider() throws InterruptedException {
		Thread.sleep(12000);
		click("");
	}

	public void clickSearch() throws InterruptedException {
		Thread.sleep(12000);
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(683,0)");
		 */
		// click("PSearch_XPATH");
		ClickActions("PSearch_XPATH");
	}

	public void clickCatalogItem() throws InterruptedException {
		Thread.sleep(12000);
		click("CatalogItem_XPATH");
	}

	public void clickOnProductImage() throws InterruptedException {
		Thread.sleep(1000);
		click("HomePage_XPATH");
		click("HeadingProducts_XPATH");
	}

	public void clickProductLinktonavigateback() throws InterruptedException {
		Thread.sleep(1000);
		// click("Osmoselogo_XPATH");
		click("ProCard_XPATH");

	}

	public void clickLogo() throws InterruptedException {
		Thread.sleep(1000);
		click("Osmoselogo_XPATH");
	}

	public void AddtoCartclickProductLink() throws InterruptedException {
		Thread.sleep(1000);

		click("ProCard_XPATH");

	}

	public void clickOnViewDetails(String locator) throws InterruptedException {
		Thread.sleep(1000);
		if (locator.equals("Productsimageclick_XPATH")) {
			click("ViewDetail_LINKTEXT");
		} else if (locator.equals("Productsimageclick2_XPATH")) {
			click("ViewDetail_LINKTEXT");
		}
	}

	public void clickOnProductFeatureImage() throws InterruptedException {
		Thread.sleep(1000);
		// driver.navigate().back();
		click("Productsimageclick_XPATH");
		Thread.sleep(3000);
		Page.click("CloseButton_XPATH");

	}

	public void AddQuantityInCart_AssertCellNumber() throws InterruptedException {
		Thread.sleep(4000);
		ClickActions("ProductPoleRestoration_XPATH");
		Thread.sleep(4000);
		click("1stViewDetails_XPATH");
		Thread.sleep(4000);
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");

	}

	public void ProductPoleRestoration() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		Thread.sleep(500);
		click("LinkProductDetail_XPATH");
	}

	public void ProductReturnPolicy() throws InterruptedException {
		Thread.sleep(1000);
		ClickActions("CategoryFilter_ID");
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("SubmitQuoteRequest_XPATH");
		click("ReturnPolicy_XPATH");
		Thread.sleep(1000);
		click("CloseicononReturnPolicy_XPATH");
		Thread.sleep(1000);
		click("ReturnPolicy_XPATH");
		Thread.sleep(1000);

	}

	public void clickRequestCrossicon() {
		click("QuoteRequestCrossicon_XPATH");
	}

	public void AddToCartProductPoleRestoration() throws InterruptedException {
		clickRequestCrossicon();
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");

		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("ContiuneSHoppingButton_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration1Dummy3_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");

		Thread.sleep(2000);

	}

	public void AddToCart_singleproductmultipletimes() throws InterruptedException {
		clickRequestCrossicon();
		Thread.sleep(1000);
		// click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		// click("ProductPoleRestoration_XPATH");

		click("ProductPoleRestorationDummy3_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("ContiuneSHoppingButton_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestorationDummy3_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep(2000);

	}

	public void AddToCartShoppingCart() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 2);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
	}

	public void ProductSearchFirstname() throws InterruptedException {
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("CloseButton_XPATH");
	}

	public void ProductPoleRestoration_1() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationDummy3_XPATH");
		Thread.sleep(3000);
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("LinkProductDetail_XPATH");
	}

	public void ProductPoleRestoration_2() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationDummy3_XPATH");
		Thread.sleep(30);
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		Page.click("CloseButton_XPATH");
		click("LinkProductDetail_XPATH");
	}

	public void ProductPoleRestoration_3() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationDummy4_XPATH");
		Thread.sleep(50);
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		Page.click("CloseButton_XPATH");
		// click("ProductPoleRestorationDummy4Link_XPATH");
	}

	public void AddToShoppingCart() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 2);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");

	}

	public void AddToShoppingCartApprove() throws InterruptedException {
		// click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 2);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");

	}

	public void DeleteQuanityinShoppingCart() throws InterruptedException {
		clickRequestCrossicon();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep(1000);
		click("DeleteShoppingCart_XPATH");
	}

	public void UpdateIncreaseQuanityinShoppingCart() throws InterruptedException {
		click("ContiuneSHoppingButton_XPATH");
		// click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep(1000);
		System.out.println("-------UpdateIncreaseQuanityinShoppingCart-------");
		String a = Page.driver.findElement(By.xpath("//input[@name='quantities']")).getAttribute("value");
		System.out.println("Quantity before Increasing: " + a);
		Thread.sleep(4000);
		click("PlusicononShoppingCart_XPATH");
		Thread.sleep(4000);
		String b = Page.driver.findElement(By.xpath("//input[@name='quantities']")).getAttribute("value");
		System.out.println("Quantity after Increasing: " + b);
	}

	public void UpdateDecreaseQuanityinShoppingCart() throws InterruptedException {
		click("ContiuneSHoppingButton_XPATH");
		// click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep(2000);
		System.out.println("-------UpdateDecreaseQuanityinShoppingCart-------");
		String c = Page.driver.findElement(By.xpath("//input[@name='quantities']")).getAttribute("value");
		System.out.println("Quantity before decreasing: " + c);
		Thread.sleep(4000);
		click("MinusicononShoppingCart_XPATH");
		Thread.sleep(4000);
		String d = Page.driver.findElement(By.xpath("//input[@name='quantities']")).getAttribute("value");
		System.out.println("Quantity after decreasing: " + d);
	}

	public void clickAdmin_ManageQuotes() throws InterruptedException {
		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep(2000);
	}

	public void clickAdmin_ManageQuotesQuoteID() throws InterruptedException {
		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep(2000);
		click("Q00001QUOTEID_XPATH");
	}

	public void clickAdmin_ManageProducts() throws InterruptedException {
		click("ClickAdminDropDown_XPATH");
		click("ManageProductsdrp_XPATH");
		// click("ManageProductCrossbutn_XPATH");
	}

	public void ClickDownloadProducts() throws InterruptedException {

		// click("ClickAdminDropDown_XPATH");
		// click("ManageProductsdrp_XPATH");
		click("ManageProductDownloadspreadsheet_XPATH");
		Thread.sleep(2000);
		WebElement all = Page.driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/div[1]/div[1]/input"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", all);
		Thread.sleep(3000);
		click("ManageProductDownloadspreadsheetbtn_XPATH");

	}

	public void ClickUploadProducts() throws InterruptedException, Exception {

		// click("ClickAdminDropDown_XPATH");
		// click("ManageProductsdrp_XPATH");
		type("ManageProductUploadpreadsheet_XPATH", "C:\\Users\\AC38373\\Desktop\\File_123.xlsx");

	}

	public void ClickProductsInReview() throws InterruptedException {

		// click("ClickAdminDropDown_XPATH");
		// click("ManageProductsdrp_XPATH");
		click("ManageProductsinReviewbutton_XPATH");
		// click("ProductReviewBackLink_XPATH");
	}

	public void ClickProductsInReviewbackLink() throws InterruptedException {
		click("ProductReviewBackLink_XPATH");
	}
	
	public void ClickDictionary() throws InterruptedException {
		ClickActions("DictionaryLink_XPATH");
	}

	public void ClickSubmitQuotewithOrderedstatus() throws InterruptedException {

		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep(3000);
		click("Q00010QUOTEID_XPATH");
		click("StatusdropdownQuotesubmit_XPATH");
		ClickActions("StatusdropdownQuotesubmit_XPATH");
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 1);
		click("SubmitbtnQuotesubmission_XPATH");
		Thread.sleep(3000);

	}

	public void ClickSubmitQuotewithOrderRequestedstatus() throws InterruptedException {

		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep(3000);
		click("Q00010QUOTEID_XPATH");
		click("StatusdropdownQuotesubmit_XPATH");
		ClickActions("StatusdropdownQuotesubmit_XPATH");
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 5);
		click("SubmitbtnQuotesubmission_XPATH");
		Thread.sleep(3000);

	}

	public void ClickSubmitQuotewithQuotedPendingstatus() throws InterruptedException {
		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep(3000);
		click("Q00010QUOTEID_XPATH");
		click("StatusdropdownQuotesubmit_XPATH");
		ClickActions("StatusdropdownQuotesubmit_XPATH");
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 3);
		click("SubmitbtnQuotesubmission_XPATH");
		Thread.sleep(3000);

	}

	public void ClickSubmitQuotewithQUOTEDstatus() throws InterruptedException, Exception {
		// Below 2 lines are added by Varun 1july2020
		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep(3000);
		click("Q00010QUOTEID_XPATH");
		click("StatusdropdownQuotesubmit_XPATH");
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 2);
		click("BrowseFileSubmitQuote_XPATH");
		Thread.sleep(5000);
		// Below line is added by Varun 1july2020
		// AutoIT function to upload file
		Runtime.getRuntime().exec("C:\\Users\\AC38373\\Downloads\\AutoITScripts\\ManageQuoteUpload.exe");
		Thread.sleep(3000);
		click("UploadbtnSubmitQuote_XPATH");
		click("SubmitbtnQuotesubmission_XPATH");
		Thread.sleep(3000);

	}

	// Below method added by Varun 6july2020
	public void ClickApprovebtnManageQuote() throws InterruptedException, Exception {
		Page.driver.navigate().back();
		Thread.sleep(6000);
		click("MyQuotesMenu_XPATH");
		Thread.sleep(3000);
		click("MyQuotesApprovebtn_XPATH");
		Thread.sleep(3000);
	}

	// Below method added by Varun 6july2020
	public void ClickApprovebtnApprove() throws InterruptedException, Exception {
		type("ApproveAttachPurchaseOrder_XPATH", "C:\\Users\\AC38373\\Desktop\\File_123.pdf");
		type("ApproveOrtxtbox_XPATH", "123");
		type("ApproveAndtxtbox_XPATH", "123");
		type("ApproveCommentstxtarea_XPATH", "123");
		click("ApproveApproveBtn_XPATH");
		Thread.sleep(3000);

	}

	// Added new test case on 7july,2020
	public void VerifyApprovebtndisabled() throws InterruptedException, Exception {
		type("ApproveOrtxtbox_XPATH", "123");
		Thread.sleep(3000);

	}

	public void ClickSubmitQuotewithCancelledstatus() throws InterruptedException {
		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep(3000);
		click("Q00010QUOTEID_XPATH");
		click("StatusdropdownQuotesubmit_XPATH");
		ClickActions("StatusdropdownQuotesubmit_XPATH");
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 4);
		type("commentstextareaSubmitQuote_XPATH", "Automationtestingcancelling");
		click("SubmitbtnQuotesubmission_XPATH");
		Thread.sleep(3000);

	}

	public void CreateQuoteByAddToShoppingCart() throws InterruptedException {
//	   JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(-925,114)");
		// scrollbyjavaexecutor(-925,114);
		clickRequestCrossicon();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationDummy3_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("SubmitQuoteRequestbtn_XPATH");
		click("Submitbtn_XPATH");
		click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	public void CreateQuoteByZipCodeAddToShoppingCart() throws InterruptedException {
//	   JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(-925,114)");
		// scrollbyjavaexecutor(-925,114);
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationDummy3_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("SubmitQuoteRequestbtn_XPATH");
		type("ShippingZipCode_XPATH", "12345");
		click("Submitbtn_XPATH");
		click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	public void CreateQuoteByCommentsAddToShoppingCart() throws InterruptedException {
//	   JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(-925,114)");
		// scrollbyjavaexecutor(-925,114);
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationDummy3_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("SubmitQuoteRequestbtn_XPATH");
		type("ShippingComments_XPATH", "AutomationTesting");
		click("Submitbtn_XPATH");
		click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	public void CreateQuoteByFileAddToShoppingCart() throws InterruptedException {
//	   JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(-925,114)");
		// scrollbyjavaexecutor(-925,114);
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("SubmitQuoteRequestbtn_XPATH");
		type("ShippingAttachment_XPATH", "C:\\Users\\AC38373\\Desktop\\File_123.pdf");
		Thread.sleep(1000);
		click("FileAttachmentSubmitbtn_XPATH");
		click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	// Below method added by Varun 6july2020
	public void CreateQuoteAllFields() throws InterruptedException {
		click("SubmitQuoteRequestbtn_XPATH");
		type("ShippingZipCode_XPATH", "12345");
		type("ShippingAttachment_XPATH", "C:\\Users\\AC38373\\Desktop\\File_123.pdf");
		type("ShippingComments_XPATH", "AutomationTesting");
		click("Submitbtn_XPATH");
		Thread.sleep(3000);
		click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	// Created on 6july aman
	public void CreateREQuoteAllFields() throws InterruptedException {
		type("ShippingZipCode_XPATH", "12345");
		type("ShippingAttachment_XPATH", "C:\\Users\\AC38373\\Desktop\\File_123.pdf");
		type("ShippingComments_XPATH", "AutomationTesting");
		click("Submitbtn_XPATH");
		Thread.sleep(3000);
		// click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	public void ClickShoppingCartIcon() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep(1000);
		click("QuoteRequestCrossicon_XPATH");
		click("ProductPageCartIcon_XPATH");
	}

	public void ClickShoppingViewCartbutton() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep(1000);
		click("QuoteRequestCrossicon_XPATH");
		click("ProductPageCartIcon_XPATH");
		click("productPageCartViewCartbtn_XPATH");
	}

	public void ClickShoppingSubmitCartbutton() throws InterruptedException {
		click("QuoteRequestCrossicon_XPATH");
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep(1000);
		click("QuoteRequestCrossicon_XPATH");
		click("ProductPageCartIcon_XPATH");
		click("productPageCartSubmitCartbtn_XPATH");
	}

	public void UpdateQuantityOnShoppingCart() throws InterruptedException {
		click("QuoteRequestCrossicon_XPATH");
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep(1000);
		click("QuoteRequestCrossicon_XPATH");
		click("ProductPageCartIcon_XPATH");
		click("productPageCartViewCartbtn_XPATH");
		Thread.sleep(1000);
		click("PlusicononShoppingCart_XPATH");
		Thread.sleep(1000);
		click("QuoteRequestCrossicon_XPATH");
		click("ProductPageCartIcon_XPATH");
	}

	public void MyQuotes() throws InterruptedException {
		click("MyQuotesMenu_XPATH");
	}

	public void clickMyQuotesCrossicon() {
		click("Closebtn_XPATH");
	}

	// Created on 6july aman
	public void ClickCancelREQuotes() throws InterruptedException {
		click("Requotebutton_XPATH");
		Thread.sleep(4000);
		ClickActions("CancelbuttonRequote_XPATH");
	}

	// Created on 6july aman
	public void ClickSubmitREQuotes() throws InterruptedException {
		click("Requotebutton_XPATH");
		Thread.sleep(4000);
		ClickActions("SubmitbuttonRequote_XPATH");
	}

	public void ClickAddToCartReQuotes() throws InterruptedException {
		click("Requotebutton_XPATH");
		Thread.sleep(4000);
		ClickActions("AddToCartRequote_XPATH");
	}

	public void AddtoShoppingCartRequote() {
		click("ContiuneSHoppingButton_XPATH");
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 2);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		ClickActions("SubmitbuttonRequote_XPATH");
	}

	public void VerifyHomepageCartIcon() throws InterruptedException {
		clickMyQuotesCrossicon();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(3000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 2);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep(3000);
		click("QuoteRequestCrossicon_XPATH");
		Page.driver.navigate().back();
	}

	public void MyQuotesStatusFilterAll() throws InterruptedException {
		ClickActions("StatusFilterdd_XPATH");
		Thread.sleep(5000);
		ClickActions("StatusFilterddAll_XPATH");
		Thread.sleep(5000);
		ClickActions("StatusFilterdd_XPATH");
	}

	public void MyQuotesStatusFilterExpired() throws InterruptedException {
		ClickActions("StatusFilterdd_XPATH");
		Thread.sleep(5000);
		ClickActions("StatusFilterddExpired_XPATH");
		Thread.sleep(5000);
		ClickActions("StatusFilterdd_XPATH");
	}

	public void MyQuotesStatusFilterOrdered() throws InterruptedException {
		Thread.sleep(5000);
		ClickActions("StatusFilterdd_XPATH");
		Thread.sleep(5000);
		ClickActions("StatusFilterddOrdered_XPATH");
		Thread.sleep(5000);
		ClickActions("StatusFilterdd_XPATH");
	}

	public void MyQuotesStatusFilterQuoted() throws InterruptedException {
		Thread.sleep(5000);
		ClickActions("StatusFilterdd_XPATH");
		Thread.sleep(5000);
		ClickActions("StatusFilterddQuoted_XPATH");
		Thread.sleep(5000);
		ClickActions("StatusFilterdd_XPATH");
	}

	public void MyQuotesStatusFilterQuotePending() throws InterruptedException {
		Thread.sleep(5000);
		ClickActions("StatusFilterdd_XPATH");
		Thread.sleep(5000);
		ClickActions("StatusFilterddQuotePending_XPATH");
		Thread.sleep(5000);
		ClickActions("StatusFilterdd_XPATH");
	}

	public void MyQuotesStatusFilterCancelled() throws InterruptedException {
		Thread.sleep(5000);
		ClickActions("StatusFilterdd_XPATH");
		Thread.sleep(5000);
		ClickActions("StatusFilterddCancelled_XPATH");
		Thread.sleep(5000);
		ClickActions("StatusFilterdd_XPATH");
	}

	public void MyQuotesStatusFilterOrderRequested() throws InterruptedException {
		Thread.sleep(5000);
		ClickActions("StatusFilterdd_XPATH");
		Thread.sleep(5000);
		ClickActions("StatusFilterddOrderRequested_XPATH");
		Thread.sleep(5000);
		ClickActions("StatusFilterdd_XPATH");
	}

	public void CreateQuoteExclamation() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationDummy3_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("SubmitQuoteRequestbtn_XPATH");
		click("Submitbtn_XPATH");
		click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}
	
    public ContactPage goContact(){
        return new ContactPage();
    }
}
