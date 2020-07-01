package com.OSMOSE.pages.OU;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.OSMOSE.base.Page;

public class ProductPage extends Page {
	public void clickOnOU360() {
		click("HomePage_XPATH");
	}

	public void clickProductLink() throws InterruptedException {
		Thread.sleep(12000);
		click("ProCard_XPATH");
	}

	public void clickProductCartLink() throws InterruptedException {
		Thread.sleep(12000);
		click("ProCard_XPATH");
	}

	public void clickOnSlider() throws InterruptedException {
		Thread.sleep(12000);
		click("");
	}

	public void clickSearch() throws InterruptedException {
		Thread.sleep(12000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(683,0)");
		// click("PSearch_XPATH");
		ClickActions("PSearch_XPATH");
	}

	public void clickCatalogItem() throws InterruptedException {
		Thread.sleep(12000);
		click("CatalogItem_XPATH");
	}

	public void clickOnProductImage() throws InterruptedException {
		Thread.sleep(15000);
		click("HeadingProducts_LINKTEXT");
	}

	public void clickOnViewDetails(String locator) throws InterruptedException {
		Thread.sleep(12000);
		if (locator.equals("Productsimageclick_XPATH")) {
			click("ViewDetail_LINKTEXT");
		} else if (locator.equals("Productsimageclick2_XPATH")) {
			click("ViewDetail_LINKTEXT");
		}
	}

	public void clickOnProductFeatureImage() throws InterruptedException {
		Thread.sleep(1000);
		// driver.navigate().back();
		click("SearcchResultPoleproductone_XPATH");

	}

	public void AddQuantityInCart_AssertCellNumber() throws InterruptedException {
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
//        selectbyindex("ProductSizeDropdown_XPATH",1);
//        click("ProductSizeEnterQuantity_XPATH");
//        clear("ProductSizeEnterQuantity_XPATH");
//        type("ProductSizeEnterQuantity_XPATH", "8");
//        click("ProductAddButton_XPATH");
		Thread.sleep(500);
		// click("LinkProductDetail_LINKTEXT");
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
		click("LinkProductDetail_LINKTEXT");
	}

	public void ProductReturnPolicy() throws InterruptedException {
		Thread.sleep(1000);
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
		WebElement Returnpolicybtn = Page.driver
				.findElement(By.xpath("//*[@id=\"returnPolicy___BV_modal_body_\"]/div/div/button"));
		scrollDownBYWebelemnt(Returnpolicybtn);
		// Page.scrollbyjavaexecutor(-268, 487);
		Thread.sleep(1000);
		click("CloseicononReturnPolicy_XPATH");
		Thread.sleep(1000);
		click("ReturnPolicy_XPATH");
		Thread.sleep(1000);
		click("CrossiconReturnPilicy_XPATH");

	}

	public void clickRequestCrossicon() {
		click("QuoteRequestCrossicon_XPATH");
	}

	public void AddToCartProductPoleRestoration() throws InterruptedException {
		clickRequestCrossicon();
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
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
		click("ProductPoleRestoration1Dummy3_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("ContiuneSHoppingButton_XPATH");

	}

	public void AddToCartShoppingCart() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 2);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
	}

	public void ProductSearchFirstname() throws InterruptedException {
		click("PoleTopperProductSearch_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("PoleTopperCancelicon_XPATH");
	}

	public void ProductPoleRestoration_1() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		click("Productsimageclick3_XPATH");
		Thread.sleep(30);
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		// click("LinkOsmoProductDetail_LINKTEXT");
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
		// click("ProductPoleRestorationDummy3Link_XPATH");
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
		// click("ProductPoleRestorationDummy4Link_XPATH");
	}

	public void AddToShoppingCart() throws InterruptedException {
//	   JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(-925,114)");
		// scrollbyjavaexecutor(-925,114);
		Thread.sleep(1000);
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationOsmo_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 2);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");

	}

	public void DeleteQuanityinShoppingCart() throws InterruptedException {
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		// click("ProductPoleRestorationCTruss_XPATH");
		click("ProductPoleRestorationOsmo_XPATH");
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
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep(1000);
		click("PlusicononShoppingCart_XPATH");
	}

	public void UpdateDecreaseQuanityinShoppingCart() throws InterruptedException {
		click("ContiuneSHoppingButton_XPATH");
		click("ProductPoleRestoration_XPATH");
		Thread.sleep(1000);
		click("ProductPoleRestorationDummy3_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 1);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		Thread.sleep(2000);
		click("MinusicononShoppingCart_XPATH");
	}

	public void clickAdmin_ManageQuotes() throws InterruptedException {
		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep(2000);
		click("Q00001QUOTEID_XPATH");
	}

	public void clickAdmin_ManageProducts() throws InterruptedException {
		click("ClickAdminDropDown_XPATH");
		click("ManageProductsdrp_XPATH");
		click("ManageProductCrossbutn_XPATH");
	}

	public void ClickDownloadProducts() throws InterruptedException {

		click("ClickAdminDropDown_XPATH");
		click("ManageProductsdrp_XPATH");
		click("ManageProductDownloadspreadsheet_XPATH");
		ClickActions("ManageProductDownloadspreadsheetbtn_XPATH");
		Thread.sleep(2000);

		WebElement all = Page.driver.findElement(By.xpath("//input[@id='__BVID__120']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", all);
		Thread.sleep(3000);
		click("ManageProductDownloadspreadsheetbtn_XPATH");

	}

	public void ClickUploadProducts() throws InterruptedException {

		click("ClickAdminDropDown_XPATH");
		click("ManageProductsdrp_XPATH");
		type("ManageProductUploadpreadsheet_XPATH", "C:\\Users\\AB73631\\Desktop\\desktop\\Exported Data.xlsx");

	}

	public void ClickProductsInReview() throws InterruptedException {

		click("ClickAdminDropDown_XPATH");
		click("ManageProductsdrp_XPATH");
		click("ManageProductsinReviewbutton_XPATH");
		click("ProductReviewBackLink_XPATh");
	}

	public void ClickProductsInReviewbackLink() throws InterruptedException {
		click("ProductReviewBackLink_XPATh");
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
		click("Q00010OrderedQUOTEID_XPATH");
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
		click("Q00010OrderedQUOTEID_XPATH");
		click("StatusdropdownQuotesubmit_XPATH");
		// ClickActions("StatusdropdownQuotesubmit_XPATH");
		selectbyindex("StatusdropdownQuotesubmit_XPATH", 2);
		click("BrowseFileSubmitQuote_XPATH");
		Thread.sleep(5000);
		// Below line is added by Varun 1july2020
		// AutoIT function to upload file
		Runtime.getRuntime().exec("C:\\Users\\AC38373\\Downloads\\AutoITScripts\\ManageQuoteUpload.exe");
		Thread.sleep(3000);
		click("UploadbtnSubmitQuote_XPATH");
		// click("SubmitbtnQuotesubmission_XPATH");
		Thread.sleep(3000);

	}

	public void ClickSubmitQuotewithCancelledstatus() throws InterruptedException {
		click("ClickAdminDropDown_XPATH");
		click("ClickManageQuotes_XPATH");
		Thread.sleep(3000);
		click("Q00010OrderedQUOTEID_XPATH");
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
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 2);
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
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 2);
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
		selectbyindex("ProductSizeDropdown_XPATH", 2);
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

	public void MyQuotes() throws InterruptedException {
		click("MyQuotesMenu_XPATH");
	}

	public void VerifyHomepageCartIcon() {
		click("ProductPoleRestoration_XPATH");
		click("ProductPoleRestorationCTruss_XPATH");
		selectbyindex("ProductSizeDropdown_XPATH", 2);
		click("ProductSizeEnterQuantity_XPATH");
		clear("ProductSizeEnterQuantity_XPATH");
		type("ProductSizeEnterQuantity_XPATH", "8");
		click("ProductAddButton_XPATH");
		click("ProductViewCartButton_XPATH");
		click("QuoteRequestCrossicon_XPATH");
		Page.driver.navigate().back();
	}
}
