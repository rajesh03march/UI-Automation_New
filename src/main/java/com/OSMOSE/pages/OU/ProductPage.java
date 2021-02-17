package com.OSMOSE.pages.OU;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.OSMOSE.base.Page;

public class ProductPage extends Page {
	
	Page p = new Page();
	
	public void clickOnOU360() {
		ClickActions("OUHomePage_XPATH");
	}

	public void clickProductLink() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProCard_XPATH");

	}

	public void clickProductCartLink() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProCard_XPATH");
	}

	public void clickOnSlider() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread12000"))));
		click("");
	}

	public void clickSearch() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1200"))));
		ClickActions("PSearch_XPATH");
	}

	public void clickCatalogItem() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread12000"))));
		click("CatalogItem_XPATH");
	}

	public void clickOnProductImage() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProHomePage_XPATH");
		click("HeadingProducts_XPATH");
	}

	public void clickProductLinktonavigateback() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		// click("Osmoselogo_XPATH");
		click("ProCard_XPATH");

	}

	public void clickLogo() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("Osmoselogo_XPATH");
	}

	public void AddtoCartclickProductLink() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));

		click("ProCard_XPATH");

	}

	public void clickOnViewDetails(String locator) throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		if (locator.equals("Productsimageclick_XPATH")) {
			click("ViewDetail_LINKTEXT");
		} else if (locator.equals("Productsimageclick2_XPATH")) {
			click("ViewDetail_LINKTEXT");
		}
	}

	public void clickOnProductFeatureImage() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		// driver.navigate().back();
		click("Productsimageclick_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("CloseButton_XPATH");

	}

	public void AddQuantityInCart_AssertCellNumber() throws InterruptedException {
		scrollbyjavaexecutor();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		click("1stViewDetails_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");

	}

	public void ProductPoleRestoration() throws InterruptedException {
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread500"))));
		click("LinkProductDetail_XPATH");
	}

	public void ProductReturnPolicy() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		ClickActions("CategoryFilter_ID");
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("FirstProduct_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("SubmitQuoteRequest_XPATH");
		click("ReturnPolicy_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("CloseicononReturnPolicy_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ReturnPolicy_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));

	}

	public void clickRequestCrossicon() {
		click("QuoteRequestCrossicon_XPATH");
	}

	public void AddToCartProductPoleRestoration() throws InterruptedException {
		clickRequestCrossicon();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");

		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("ContiuneSHoppingButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration1Dummy3_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");

		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));

	}

	public void AddToCart_singleproductmultipletimes() throws InterruptedException {
		clickRequestCrossicon();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		// click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		// click("ProductPoleRestoration_XPATH");

		click("ProductPoleRestorationDummy3_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("ContiuneSHoppingButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestorationDummy3_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));

	}

	public void AddToCartShoppingCart() throws InterruptedException {
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
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
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationDummy3_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
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
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
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
		scrollbyjavaexecutor();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("ProductPoleRestorationCTruss_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		selectbyindex("ProductSizeDropdown_XPATH", 2);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("ProductSizeEnterQuantity_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		clear("ProductSizeEnterQuantity_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		type("ProductSizeEnterQuantity_XPATH", "8");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("ProductAddButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("ProductViewCartButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

	}

	public void DeleteQuanityinShoppingCart() throws InterruptedException {
		clickRequestCrossicon();
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("DeleteShoppingCart_XPATH");
	}

	public void UpdateIncreaseQuanityinShoppingCart() throws InterruptedException {
		click("ContiuneSHoppingButton_XPATH");
		// click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		scrollbyjavaexecutor();
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		System.out.println("-------UpdateIncreaseQuanityinShoppingCart-------");
		String a = Page.driver.findElement(By.xpath("//input[@name='quantities']")).getAttribute("value");
		System.out.println("Quantity before Increasing: " + a);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		click("PlusicononShoppingCart_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		String b = Page.driver.findElement(By.xpath("//input[@name='quantities']")).getAttribute("value");
		System.out.println("Quantity after Increasing: " + b);
	}

	public void UpdateDecreaseQuanityinShoppingCart() throws InterruptedException {
		click("ContiuneSHoppingButton_XPATH");
		// click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		System.out.println("-------UpdateDecreaseQuanityinShoppingCart-------");
		String c = Page.driver.findElement(By.xpath("//input[@name='quantities']")).getAttribute("value");
		System.out.println("Quantity before decreasing: " + c);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		click("MinusicononShoppingCart_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		String d = Page.driver.findElement(By.xpath("//input[@name='quantities']")).getAttribute("value");
		System.out.println("Quantity after decreasing: " + d);
	}

	public void clickAdmin_ManageQuotes() throws InterruptedException {
		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
	}

	public void clickAdmin_ManageQuotesQuoteID() throws InterruptedException {
		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
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
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		WebElement all = Page.driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/div[1]/div[1]/input"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", all);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("ManageProductDownloadspreadsheetbtn_XPATH");

	}

	public void ClickUploadProducts() throws InterruptedException, Exception {

		// click("ClickAdminDropDown_XPATH");
		// click("ManageProductsdrp_XPATH");
		type("ManageProductUploadpreadsheet_XPATH", "C:\\Users\\AB75139\\Desktop\\File_123.xlsx");

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

	public void ClickReview() throws InterruptedException {
		click("ManageProductsReviewBtn_XPATH");
	}

	public void ClickApprove() throws InterruptedException {
		click("ManageProductsApproveBtn_XPATH");
	}

	public void ClickReject() {
		click("ManageProductsRejectBtn_XPATH");
	}

	public void ClickSubmitQuotewithOrderedstatus() throws InterruptedException {

		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("Q00010QUOTEID_XPATH");
		click("StatusdropdownQuotesubmit_XPATH");
		ClickActions("StatusdropdownQuotesubmit_XPATH");
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 1);
		click("SubmitbtnQuotesubmission_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

	}

	public void ClickSubmitQuotewithOrderRequestedstatus() throws InterruptedException {

		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("Q00010QUOTEID_XPATH");
		click("StatusdropdownQuotesubmit_XPATH");
		ClickActions("StatusdropdownQuotesubmit_XPATH");
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 5);
		click("SubmitbtnQuotesubmission_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

	}

	public void ClickSubmitExpiredstatus() throws InterruptedException {

		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("Q00010QUOTEID_XPATH");
		click("StatusdropdownQuotesubmit_XPATH");
		ClickActions("StatusdropdownQuotesubmit_XPATH");
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 0);
		click("SubmitbtnQuotesubmission_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

	}

	public void ClickSubmitQuotewithQuotedPendingstatus() throws InterruptedException {
		click("ClickAdminDropDown_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		click("ClickManageQuotes_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("Q00010QUOTEID_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		click("StatusdropdownQuotesubmit_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusdropdownQuotesubmit_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 3);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		click("SubmitbtnQuotesubmission_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

	}

	public void ClickSubmitQuotewithQuotedPendingstatusmorethan20mb() throws InterruptedException, Exception {
		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("Q00010QUOTEID_XPATH");
		click("StatusdropdownQuotesubmit_XPATH");
		ClickActions("StatusdropdownQuotesubmit_XPATH");
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 3);
		click("BrowseFileSubmitQuote_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Runtime.getRuntime().exec("C:\\Users\\AB75139\\Downloads\\AutoITScripts\\ManageQuoteMoreThan20mb.exe");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		click("UploadbtnSubmitQuote_XPATH");
		/*
		 * click("SubmitbtnQuotesubmission_XPATH"); Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		 */

	}

	public void ClickSubmitQuotewithQUOTEDstatus() throws InterruptedException, Exception {
		// Below 2 lines are added by Varun 1july2020
		click("ClickAdminDropDown_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("ClickManageQuotes_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("Q00010OrderedQUOTEID_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("StatusdropdownQuotesubmit_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 2);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("BrowseFileSubmitQuote_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Below line is added by Varun 1july2020
		// AutoIT function to upload file
		Runtime.getRuntime().exec("C:\\Users\\AB75139\\Downloads\\AutoITScripts\\ManageQuoteUpload.exe");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("UploadbtnSubmitQuote_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("SubmitbtnQuotesubmission_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

	}

	public void ClickSubmitQuotewithNegativeExpireDays() throws InterruptedException, Exception {
		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("Q00010QUOTEID_XPATH");
		click("StatusdropdownQuotesubmit_XPATH");
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 2);
		click("BrowseFileSubmitQuote_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Runtime.getRuntime().exec("C:\\Users\\AB75139\\Downloads\\AutoITScripts\\ManageQuoteUpload.exe");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("UploadbtnSubmitQuote_XPATH");
		/*
		 * click("SubmitbtnQuotesubmission_XPATH"); Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		 */
		type("ExpireInTxtBox_XPATH", "-12");

	}

	public void ClickSubmitQuotewithInvalidFileFormat() throws InterruptedException, Exception {
		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("Q00010QUOTEID_XPATH");
		click("StatusdropdownQuotesubmit_XPATH");
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 2);
		click("BrowseFileSubmitQuote_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Runtime.getRuntime().exec("C:\\Users\\AB75139\\Downloads\\AutoITScripts\\ManageQuoteInvalidFileUpload.exe");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("UploadbtnSubmitQuote_XPATH");
		/*
		 * click("SubmitbtnQuotesubmission_XPATH"); Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		 */

	}

	// Below method added by Varun 6july2020
	public void ClickApprovebtnManageQuote() throws InterruptedException, Exception {
		Page.driver.navigate().back();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		click("MyQuotesMenu_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		click("MyQuotesApprovebtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
	}

	// Below method added by Varun 6july2020
	public void ClickApprovebtnApprove() throws InterruptedException, Exception {
		type("ApproveAttachPurchaseOrder_XPATH", "C:\\Users\\AB75139\\Desktop\\File_123.pdf");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		type("ApproveOrtxtbox_XPATH", "123");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		type("ApproveAndtxtbox_XPATH", "123");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		type("ApproveCommentstxtarea_XPATH", "123");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		click("ApproveApproveBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

	}

	// Added new test case on 7july,2020
	public void VerifyApprovebtndisabled() throws InterruptedException, Exception {
		type("ApproveOrtxtbox_XPATH", "123");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));

	}

	public void ClickSubmitQuotewithCancelledstatus() throws InterruptedException {
		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("Q00010QUOTEID_XPATH");
		click("StatusdropdownQuotesubmit_XPATH");
		ClickActions("StatusdropdownQuotesubmit_XPATH");
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 4);
		type("commentstextareaSubmitQuote_XPATH", "Automationtestingcancelling");
		click("SubmitbtnQuotesubmission_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	public void CreateQuoteByAddToShoppingCart() throws InterruptedException {
//	   JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(-925,114)");
		// scrollbyjavaexecutor(-925,114);
		clickRequestCrossicon();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
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
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
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
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	public void CreateQuoteByCommentsAddToShoppingCart() throws InterruptedException {
//	   JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(-925,114)");
		// scrollbyjavaexecutor(-925,114);
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
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
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	public void CreateQuoteByFileAddToShoppingCart() throws InterruptedException {
//	   JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(-925,114)");
		// scrollbyjavaexecutor(-925,114);
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("SubmitQuoteRequestbtn_XPATH");
		type("ShippingAttachment_XPATH", "C:\\Users\\AB75139\\Desktop\\File_123.pdf");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("FileAttachmentSubmitbtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	// Below method added by Varun 6july2020
	public void CreateQuoteAllFields() throws InterruptedException {
		click("SubmitQuoteRequestbtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		type("ShippingZipCode_XPATH", "12345");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		type("ShippingAttachment_XPATH", "C:\\Users\\AB75139\\Desktop\\File_123.pdf");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		type("ShippingComments_XPATH", "AutomationTesting");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("Submitbtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	// Created on 6july aman
	public void CreateREQuoteAllFields() throws InterruptedException {
		type("ShippingZipCode_XPATH", "12345");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		type("ShippingAttachment_XPATH", "C:\\Users\\AB75139\\Desktop\\File_123.pdf");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		type("ShippingComments_XPATH", "AutomationTesting");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		click("Submitbtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	public void ClickShoppingCartIcon() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("QuoteRequestCrossicon_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPageCartIcon_XPATH");
	}

	public void ClickShoppingViewCartbutton() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("QuoteRequestCrossicon_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPageCartIcon_XPATH");
		click("productPageCartViewCartbtn_XPATH");
	}

	public void ClickShoppingSubmitCartbutton() throws InterruptedException {
		click("QuoteRequestCrossicon_XPATH");
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("QuoteRequestCrossicon_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPageCartIcon_XPATH");
		click("productPageCartSubmitCartbtn_XPATH");
	}

	public void UpdateQuantityOnShoppingCart() throws InterruptedException {
		click("QuoteRequestCrossicon_XPATH");
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("QuoteRequestCrossicon_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPageCartIcon_XPATH");
		click("productPageCartViewCartbtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("PlusicononShoppingCart_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("QuoteRequestCrossicon_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
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
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		ClickActions("CancelbuttonRequote_XPATH");
	}

	// Created on 6july aman
	public void ClickSubmitREQuotes() throws InterruptedException {
		click("Requotebutton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		ClickActions("SubmitbuttonRequote_XPATH");
	}

	public void ClickAddToCartReQuotes() throws InterruptedException {
		click("Requotebutton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		ClickActions("AddToCartRequote_XPATH");
	}

	public void AddtoShoppingCartRequote() throws InterruptedException {
		click("ContiuneSHoppingButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		click("ProductPoleRestorationCTruss_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		selectbyindex("ProductSizeDropdown_XPATH", 2);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		click("ProductSizeEnterQuantity_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		clear("ProductSizeEnterQuantity_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		type("ProductSizeEnterQuantity_XPATH", "8");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		click("ProductAddButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		click("ProductViewCartButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("SubmitbuttonRequote_XPATH");
	}

	public void VerifyHomepageCartIcon() throws InterruptedException {
		clickMyQuotesCrossicon();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 2);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("QuoteRequestCrossicon_XPATH");
		Page.driver.navigate().back();
	}

	public void MyQuotesStatusFilterAll() throws InterruptedException {
		ClickActions("StatusFilterdd_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterddAll_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterdd_XPATH");
	}

	public void MyQuotesStatusFilterExpired() throws InterruptedException {
		ClickActions("StatusFilterdd_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterddExpired_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterdd_XPATH");
	}

	public void MyQuotesStatusFilterOrdered() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterdd_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterddOrdered_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterdd_XPATH");
	}

	public void MyQuotesStatusFilterQuoted() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterdd_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterddQuoted_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterdd_XPATH");
	}

	public void MyQuotesStatusFilterQuotePending() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterdd_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterddQuotePending_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterdd_XPATH");
	}

	public void MyQuotesStatusFilterCancelled() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterdd_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterddCancelled_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterdd_XPATH");
	}

	public void MyQuotesStatusFilterOrderRequested() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterdd_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterddOrderRequested_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ClickActions("StatusFilterdd_XPATH");
	}

	public void CreateQuoteExclamation() throws InterruptedException {
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationDummy3_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("SubmitQuoteRequestbtn_XPATH");
		click("Submitbtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	public void ProductGoBack() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "1");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("SubmitQuoteRequestbtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("GoBackLink_XPATH");

	}

	public void CreateQuoteByMultipleFileAddToShoppingCart() throws InterruptedException, Exception {
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("SubmitQuoteRequestbtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		ClickActions("ShippingAttachment_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Runtime.getRuntime().exec("C:\\Users\\AB75139\\Downloads\\AutoITScripts\\MultipleFileUploadPdf.exe");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ClickActions("ShippingAttachment_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Runtime.getRuntime().exec("C:\\Users\\AB75139\\Downloads\\AutoITScripts\\MultipleFileUploaddocx.exe");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		ClickActions("ShippingAttachment_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Runtime.getRuntime().exec("C:\\Users\\AB75139\\Downloads\\AutoITScripts\\MultipleFileUploadXlsx.exe");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("MultipleFileCreateQuoteSubmitBtn_XPATH");
		click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	public void CreateQuoteByUpdateFileAddToShoppingCart() throws InterruptedException {
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("SubmitQuoteRequestbtn_XPATH");
		type("ShippingAttachment_XPATH", "C:\\Users\\AB75139\\Desktop\\File_123.pdf");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("DeleteAttachmnetbtn_XPATH");
		type("ShippingAttachment_XPATH", "C:\\Users\\AB75139\\Desktop\\File_123.xlsx");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("FileAttachmentSubmitbtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	public void ShoppingCarrtAddbtnDisabled() throws InterruptedException {
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
	}

	public void ShoppingCarrtAddbtnDisabledclearqty() throws InterruptedException {
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
	}

	public void ShoppingCarrtAddbtnMaxqty() throws InterruptedException {
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "1000");
	}

	public void ShoppingCarrtAddbtnZeroqty() throws InterruptedException {
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "0");
	}

	public void ClickSubmitQuotewithoutFile() throws InterruptedException, Exception {
		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("Q00010QUOTEID_XPATH");
		click("StatusdropdownQuotesubmit_XPATH");
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 2);
		// click("BrowseFileSubmitQuote_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		click("SubmitbtnQuotesubmission_XPATH");
	}

	public void AddingRelatedProducts() throws InterruptedException {
		// click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestorationCTruss_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("RelatedProductsCart_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductSizeEnterQuantity_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		clear("ProductSizeEnterQuantity_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		type("ProductSizeEnterQuantity_XPATH", "2");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductAddButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductViewCartButton_XPATH");
	}

	public void ToolTipForSize() throws InterruptedException {
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
	}

	public void UpdateChangeProductAddToShoppingCart() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationDummy3_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		select("QuoteRequestSizeDrodwn_XPATH", "2");
	}

	public void DeleteQuantityOnShoppingCart() throws InterruptedException {
		scrollbyjavaexecutor();
		click("ProductPoleRestoration_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		click("QuoteRequestCrossicon_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("ProductPageCartIcon_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		click("DeleteiconShoppingOverlay_XPATH");

	}

	public ContactPage goContact() {
		return new ContactPage();
	}
}
