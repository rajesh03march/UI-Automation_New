package com.OSMOSE.testcases;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.HomeOU;
import com.OSMOSE.pages.OU.ProductPage;
import com.OSMOSE.utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class Product extends BaseTest {
	
	Page p = new Page();

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 0, description = "Verification of the Products Link on the Home Page")
	public void verifyTheProductLink(Hashtable<String, String> data) throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		//pp.clickOnOU360();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1200"))));
		pp.clickProductLink();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertEquals(Page.getText("POrdering_XPATH"), "Pole and Line Products");
	}

	// Keep this false always
	@Test(priority = 1, enabled = false, description = "Verify that User clicks on the Product Cart")
	public void verifyTheProductCart() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.clickProductCartLink();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread12000"))));
		Assert.assertEquals(Page.getText("POrdering_XPATH"), "Pole and Line Products");
	}

	@Test(priority = 2, dependsOnMethods = "verifyTheProductLink", enabled = true, description = "Verification of the presence of Search field")
	public void searchElementPresent() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Assert.assertFalse(Page.isElementPresent(By.id("PSearch_ID")));
	}

	@Test(priority = 3, dependsOnMethods = "verifyTheProductLink", enabled = true, description = "Verification of the presence of Catalog Element")
	public void catalogElementPresent() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Assert.assertEquals(Page.getText("CatalogItem_XPATH"), "Category Filter");
	}

	@Test(priority = 4, dependsOnMethods = "verifyTheProductLink", enabled = true, description = "Verification of the presence of My Quotes button")
	public void openMyQuotesElementPresent() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Assert.assertEquals(Page.getText("OpenMyQuotes_XPATH"), "MY QUOTES");
	}

	@Test(priority = 5, dependsOnMethods = "verifyTheProductLink", enabled = true, description = "Verification of the presence of Shopping Cart Icon")
	public void shoppingCartElementPresent() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Assert.assertTrue(Page.driver.findElement(By.xpath("//a[@id='openMyCart']//img[@alt='shopping cart']")).isDisplayed());
	}

	@Test(priority = 6, dependsOnMethods = "verifyTheProductLink", enabled = true, description = "Verification of the presence of Admin button")
	public void adminElementPresent() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		//Verifying the presence of MyQuotes button
		WebElement Admin = Page.driver.findElement(By.xpath("//div[@id='AdminDropdown']"));
		Assert.assertTrue(Admin.isDisplayed());
	}

	@Test(priority = 7, dependsOnMethods = "verifyTheProductLink", enabled = true, description = "Verification of the presence of View Details button")
	public void viewDetailsElementPresent() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Assert.assertEquals(Page.getText("ViewDetail_XPATH"), "VIEW DETAILS");
	}

	@Test(priority = 8, dependsOnMethods = "verifyTheProductLink", enabled = true, description = "Verification of the presence of all six products")
	public void allSixProductPresent() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Assert.assertEquals(Page.getText("MITCFUME_XPATH"), "MP500-EXT® Preservative Paste");
	}

	@Test(priority = 9, dependsOnMethods = "verifyTheProductLink", enabled = true, description = "Verification of the presence of Slider items")
	public void sliderItemPresent() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Page.click("ProductSlider_XPATH");
		Assert.assertEquals(Page.getText("PoleTopper®_XPATH"), "MP500-EXT® Preservative Paste");
	}

	@Test(priority = 10, dependsOnMethods = "verifyTheProductLink", enabled = true, description = "Verification of the presence of Category Filter button")
	public void verifyCategoryFilter() {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Assert.assertFalse(Page.isElementPresent(By.xpath("CatalogItem_XPATH")));
	}

	@Test(priority = 11, dependsOnMethods = "verifyTheProductLink", enabled = true, description = "Verify that a Featured product can be clicked")
	public void VerifyFPImageClick() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.clickOnProductImage();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread100"))));
		Assert.assertFalse(Page.isElementPresent(By.xpath("ProductSizeDropdown_XPATH")));
		Page.click("CloseButton_XPATH");
	}

	@Test(priority = 12, dependsOnMethods = "verifyTheProductLink", enabled = true, description = "Verification of the presence of View Details button")
	public void verifyViewDetail() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1200"))));
		pp.clickOnViewDetails("Productsimageclick2_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		//WebElement SizeDD = Page.driver.findElement(By.xpath("(//select[@id='selectSize' and @title='Select Size'])[1]"));
		Assert.assertTrue(Page.isElementPresent(By.xpath("ProductSizeDropdown_XPATH")));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("CloseButton_XPATH");
	}

	@Test(priority = 13, enabled = true, description = "Verification of the contents on Products Page")
	public void VerifyProductclick() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Page.driver.navigate().back();
		pp.clickOnProductFeatureImage();
		Assert.assertEquals(Page.getText("FeaturedProducts_XPATH"), "Featured Products");
		Page.driver.navigate().back();
		Page.click("Productsimageclick2_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("CloseButton_XPATH");
		Assert.assertEquals(Page.getText("FeaturedProducts_XPATH"), "Featured Products");
		Page.driver.navigate().back();
		Page.click("Productsimageclick3_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("CloseButton_XPATH");
		Assert.assertEquals(Page.getText("FeaturedProducts_XPATH"), "Featured Products");
		Page.driver.navigate().back();
		Page.click("Productsimageclick4_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("CloseButton_XPATH");
		Assert.assertEquals(Page.getText("FeaturedProducts_XPATH"), "Featured Products");
		Page.driver.navigate().back();
	}

	@Test(priority = 14, enabled = true, description = "Verifying the quantity entered in the Quantity field")
	public void AddQuantityandverifyCellNumber() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.clickProductCartLink();
		pp.AddQuantityInCart_AssertCellNumber();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"), "(770) 632-6700 Option 3");
		Page.click("CloseButton_XPATH");
		Page.driver.navigate().back();

	}

	@Test(priority = 15, enabled = true, description = "Verify the tel number text on Add to Shopping cart pop-up")
	public void FeaturedProductPoleRestoration() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.clickProductLinktonavigateback();
		pp.ProductPoleRestoration();
		Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"), "(770) 632-6700 Option 3");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		pp.switchToparentWindow();
		Page.click("CloseButton_XPATH");
		Page.driver.navigate().back();

		pp.clickProductCartLink();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		pp.ProductPoleRestoration_1();
		pp.switchToparentWindow();
		Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"), "(770) 632-6700 Option 3");
		Page.click("CloseButton_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));

		/*
		 * Page.driver.navigate().back(); pp.clickProductCartLink(); Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		 * pp.ProductPoleRestoration_2(); pp.switchToparentWindow();
		 * Assert.assertEquals(Page.getText("FeaturedProductsCellNumber1_XPATH"),
		 * "(770) 632-6700 Option 3"); Page.click("CloseButton_XPATH");
		 * Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000")))); Page.driver.navigate().back();
		 * 
		 * pp.clickProductCartLink(); Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000")))); pp.ProductPoleRestoration_3();
		 * pp.switchToparentWindow();
		 * Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"),
		 * "(770) 632-6700 Option 3"); Page.click("CloseButton_XPATH");
		 * Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000")))); Page.driver.navigate().back(); pp.clickProductCartLink();
		 */

	}

	// Keep this false always
	@Test(dataProviderClass = Utilities.class, priority = 16, enabled = false, dataProvider = "dp", description = "Verify the presence of Search Box")
	public void verifyTheSearch(Hashtable<String, String> data) throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.clickSearch();
		Page.type("PSearch_ID", data.get("SearchItem"));
		Page.click("PSearchIcon_ID");
		Assert.assertEquals("", "");
	}

	@Test(dataProviderClass = Utilities.class, priority = 17, enabled = false, dataProvider = "dp", description = "Verify that User clicks on the Slider icon and search for firstname Pole")
	public void verifyTheSearchfirstname(Hashtable<String, String> data) throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.clickSearch();
		Page.type("PSearch_XPATH", data.get("SearchItem"));
		Page.driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//*[@id='productSlider']/div[1]/div[2]/img")).isDisplayed());
		pp.ProductSearchFirstname();
	}

	@Test(dataProviderClass = Utilities.class, priority = 18, enabled = false, dataProvider = "dp", description = "Verify that User clicks on the Slider icon and search for full name Pole Restoration")
	public void verifyTheSearchFullname(Hashtable<String, String> data) throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.clickSearch();
		Page.driver.findElement(By.id("searchInput")).clear();
		Page.type("PSearch_XPATH", data.get("SearchItem"));
		Page.driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//*[@id='productSlider']/div[1]/div[2]/img")).isDisplayed());
	}

	@Test(dataProviderClass = Utilities.class, priority = 19, enabled = false, dataProvider = "dp", description = "Verify that User clicks on the Slider icon and search for One Alphabeted like H")
	public void verifyTheSearchOneAlphabet(Hashtable<String, String> data) throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.clickSearch();
		Page.driver.findElement(By.id("searchInput")).clear();
		Page.type("PSearch_XPATH", data.get("SearchItem"));
		Page.driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//div[@id='productSlider']/div[1]/div[2]/a")).isDisplayed());

	}

	@Test(dataProviderClass = Utilities.class, priority = 20, enabled = false, dataProvider = "dp", description = "Verify that User clicks on the Slider icon and Click on Crosss icon")
	public void verifyTheSearchCrossButton(Hashtable<String, String> data) throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.clickSearch();
		Page.driver.findElement(By.id("searchInput")).clear();
		Page.type("PSearch_XPATH", data.get("SearchItem"));
		Page.driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		Page.click("SearchCrossIcon_XPATH");
	}

	@Test(dataProviderClass = Utilities.class, priority = 21, enabled = false, dataProvider = "dp", description = "Verify that User clicks on the Slider icon and validate the validation message is shown wrong input")
	public void verifyTheValidationmessage(Hashtable<String, String> data) throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.clickSearch();
		Page.driver.findElement(By.id("searchInput")).clear();
		Page.type("PSearch_XPATH", data.get("SearchItem"));
		Page.driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
		// Page.driver.findElement(By.id("searchInput")).clear();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));

		WebElement element = Page.driver.findElement(By.xpath("//div[@class='alert alert-dismissible alert-danger']"));
		String text = element.getText();
		String newtext = text.substring(text.indexOf('\n')+1);
		Assert.assertEquals(newtext,"No products match your search.");

	}

	@Test(priority = 22, enabled = false, description = "Product Return Policies will be provided on the 'Quote Request Approval' page and will be presented to the customer as a pop-up for reading.")
	public void ReturnPolicy() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.ProductReturnPolicy();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("ReturnProceduretext_XPATH"), "Return Procedure");
		Page.click("CrossiconReturnPilicy_XPATH");
		pp.clickRequestCrossicon();
	}

	@Test(priority = 23, enabled = false, description = "On the Product Group Details Page, verify the text present")
	public void verifyAddShoppingCarttext() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.AddToCartShoppingCart();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(
				Page.driver.findElement(By.xpath("//div[@class='addCartStepOne']/div/div[2]/div[2]")).getText(),
				"For information or to place an order");
		Assert.assertEquals(
				Page.driver.findElement(By.xpath("//div[@class='addCartStepOne']/div/div[2]/div[3]/strong")).getText(),
				"(770) 632-6700 Option 3");
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@class='addCartStepOne']/div/div[2]/div[4]/strong/a")).getText(),
				"products@osmose.com");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		Page.click("QuoteRequestCrossicon_XPATH");
	}

	@Test(priority = 24, enabled = false, description = "On the Product Group Details Page, the user will be provided with the “ADD”  button  with a quantity selector.")
	public void AddShoppingCart() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.AddToShoppingCart();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertEquals(Page.getText("ProductsQuoterequest_XPATH"), "Quote Request");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id='openMyCart___BV_modal_body_']/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[3]/a/span/img"))
				.isDisplayed());
	}

	// Shopping Cart
	@Test(priority = 25, enabled = false, description = "On the Product Group Details Page, the user will be provided with the “ADD”  button  with a quantity selector.")
	public void VerifyCrossicononhoppingCart() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id='openMyCart___BV_modal_body_']/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[3]/a/span/img"))
				.isDisplayed());
	}

	// Shopping Cart
	@Test(priority = 26, enabled = false, description = "User is able to add different product multiple times in cart by clicking on contiune button")
	public void VerifyCrossicononhoppingCart_Differentitem() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.AddToCartProductPoleRestoration();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id='openMyCart___BV_modal_body_']/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[3]/a/span/img"))
				.isDisplayed());
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id='openMyCart___BV_modal_body_']/div/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div/div[3]/a/span/img"))
				.isDisplayed());
	}

	// Shopping Cart
	@Test(priority = 27, enabled = false, description = "User is able to add same product multiple times in cart by clicking on contiune button")
	public void VerifyAddShopping_Sameitem() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.AddToCart_singleproductmultipletimes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id='openMyCart___BV_modal_body_']/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[3]/a/span/img"))
				.isDisplayed());
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id='openMyCart___BV_modal_body_']/div/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div/div[3]/a/span/img"))
				.isDisplayed());
	}

	@Test(priority = 28, enabled = false, description = "Delete product from the cart")
	public void DeleteQuanityinShoppingCart() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		pp.DeleteQuanityinShoppingCart();
	}

	@Test(priority = 29, enabled = false, description = "Increase product quantity from the cart")
	public void UpdateIncreaseQuanityinShoppingCart() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		pp.UpdateIncreaseQuanityinShoppingCart();
	}

	@Test(priority = 30, enabled = false, description = "Decrease product quantity from the cart")
	public void UpdateDecreaseQuanityinShoppingCart() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		pp.UpdateDecreaseQuanityinShoppingCart();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread15000"))));
	}

	@Test(priority = 31, enabled = false, description = "Create Quote by adding product in the cart")
	public void CreateQuote() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.CreateQuoteByAddToShoppingCart();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
	}

	@Test(priority = 32, enabled = false, description = "Create Quote by adding product in the cart by adding comments")
	public void CreateQuote_Comments() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.CreateQuoteByCommentsAddToShoppingCart();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
	}

	@Test(priority = 33, enabled = false, description = "Create Quote by adding product in the cart by adding zip code")
	public void CreateQuote_ZipCode() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.CreateQuoteByZipCodeAddToShoppingCart();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
	}

	@Test(priority = 34, enabled = false, description = "Create Quote by adding product in the cart by adding attachment")
	public void CreateQuote_Attachment() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.CreateQuoteByFileAddToShoppingCart();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
	}

	@Test(priority = 35, enabled = false, description = "ShoppingCartOverlaycarticonverification")
	public void ClickShoppingCartIcon() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.ClickShoppingCartIcon();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[@id='topHeader-nav-collapse']/ul/li[4]/a/div/div[2]/li[1]/button"))
				.isDisplayed());
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[@id='topHeader-nav-collapse']/ul/li[4]/a/div/div[2]/li[1]/button"))
				.isDisplayed());
		Assert.assertTrue(Page.driver
				.findElement(By.xpath(
						"//*[@id='topHeader-nav-collapse']/ul/li[4]/a/div/div[2]/div/div/div[2]/div[2]/div[2]/i"))
				.isDisplayed());
	}

	@Test(priority = 36, enabled = false, description = "ShoppingCart Overlay cart ViewCart Button")
	public void ClickShoppingViewCartbutton() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Page.click("ProductPageCartIcon_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.ClickShoppingViewCartbutton();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertEquals(Page.getText("ProductsQuoterequest_XPATH"), "Quote Request");
	}

	@Test(priority = 37, enabled = false, description = "ShoppingCart Overlay cart ViewCart Button")
	public void ClickShoppingSubmitCartbutton() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.ClickShoppingSubmitCartbutton();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertEquals(Page.getText("ProductsQuoterequest_XPATH"), "Quote Request");
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[@id='openMyCart___BV_modal_body_']/div/div[2]/div/div[3]/div/a[2]"))
				.isDisplayed());
	}

	@Test(priority = 38, enabled = false, description = "Verification of Quantity on ShoppingCart Overlay")
	public void verifyUpdatedQuantityOnOverlay() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.UpdateQuantityOnShoppingCart();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertEquals(Page.driver.findElement(By.xpath("//div[@class='cQuantity']/span")).getText(), "33");
	}

	@Test(priority = 39, enabled = false, description = "Verification of contents on MyQuotes popup")
	public void MyQuotes_96421() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Page.click("ProductPageCartIcon_XPATH");
		pp.MyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertEquals(Page.getText("MyQuotesheadertxt_XPATH"), "My Quotes");
		Assert.assertEquals(Page.getText("Statustxt_XPATH"), "Status:");
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//div[@class='popupQuotes']/div[1]/div[1]/div[1]/div/div[1]")).isDisplayed());
		Assert.assertTrue(Page.driver.findElement(By.xpath("//header[@id='openMyquotes___BV_modal_header_']/button"))
				.isDisplayed());
		Assert.assertTrue(Page.driver.findElement(By.xpath("//header[@id='openMyquotes___BV_modal_header_']/h5/select"))
				.isDisplayed());
		// Verifying comment section: It should be visible to user without user clicking
		// on it
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//div[@id='openMyquotes___BV_modal_body_']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/textarea"))
				.isDisplayed());
		// Verifying the presence of Status Filter
		Assert.assertTrue(Page.isElementPresent(By.xpath("//button[@id='dropdown-form__BV_toggle_']")));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		pp.clickMyQuotesCrossicon();
	}

	// Below method added by Varun 22july2020
	@Test(priority = 40, enabled = false, description = "Verification of Status filter 'All'")
	public void verifyStatusFilterAll() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotesStatusFilterAll();
		// verifying the first record
		String First_All = Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[1]/div/div[1]/ul[1]/li[3]/span[2]")).getText();
		System.out.println(First_All);
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[1]/div/div[1]/ul[1]/li[3]/span[2]")).getText(),
				First_All);
		// verifying the second record
		String Second_All = Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[2]/div/div[1]/ul[1]/li[3]/span[2]")).getText();
		System.out.println(Second_All);
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[2]/div/div[1]/ul[1]/li[3]/span[2]")).getText(),
				Second_All);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.clickMyQuotesCrossicon();
	}

	// Below method added by Varun 22july2020
	@Test(priority = 41, enabled = false, description = "Verification of Status filter 'Expired'")
	public void verifyStatusFilterExpired() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotesStatusFilterExpired();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// verifying the first record
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[1]/div/div[1]/ul[1]/li[3]/span[2]")).getText(),
				"Expired");
		// verifying the second record
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[2]/div/div[1]/ul[1]/li[3]/span[2]")).getText(),
				"Expired");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.clickMyQuotesCrossicon();
	}

	// Below method added by Varun 22july2020
	@Test(priority = 42, enabled = false, description = "Verification of Status filter 'Ordered'")
	public void verifyStatusFilterOrdered() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotesStatusFilterOrdered();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// verifying the first record
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[1]/div/div[1]/ul[1]/li[3]/span[2]")).getText(),
				"Ordered");
		// verifying the second record
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[2]/div/div[1]/ul[1]/li[3]/span[2]")).getText(),
				"Ordered");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.clickMyQuotesCrossicon();
	}

	// Below method added by Varun 22july2020
	@Test(priority = 43, enabled = false, description = "Verification of Status filter 'Quoted'")
	public void verifyStatusFilterQuoted() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotesStatusFilterQuoted();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// verifying the first record
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[1]/div/div[1]/ul[1]/li[3]/span[2]")).getText(),
				"Quoted");
		// verifying the second record
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[2]/div/div[1]/ul[1]/li[3]/span[2]")).getText(),
				"Quoted");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.clickMyQuotesCrossicon();
	}

	// Below method added by Varun 22july2020
	@Test(priority = 44, enabled = false, description = "Verification of Status filter 'Quote Pending'")
	public void verifyStatusFilterQuotePending() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotesStatusFilterQuotePending();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// verifying the first record
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[1]/div/div[1]/ul[1]/li[3]/span[2]")).getText(),
				"Quote Pending");
		// verifying the second record
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[2]/div/div[1]/ul[1]/li[3]/span[2]")).getText(),
				"Quote Pending");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.clickMyQuotesCrossicon();
	}

	// Below method added by Varun 22july2020
	@Test(priority = 45, enabled = false, description = "Verification of Status filter 'Cancelled'")
	public void verifyStatusFilterCancelled() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotesStatusFilterCancelled();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// verifying the first record
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[1]/div/div[1]/ul[1]/li[3]/span[2]")).getText(),
				"Cancelled");
		// verifying the second record
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[2]/div/div[1]/ul[1]/li[3]/span[2]")).getText(),
				"Cancelled");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.clickMyQuotesCrossicon();
	}

	// Below method added by Varun 22july2020
	@Test(priority = 46, enabled = false, description = "Verification of Status filter 'Order Requested'")
	public void verifyStatusFilterOrderRequested() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotesStatusFilterOrderRequested();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// verifying the first record
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[1]/div/div[1]/ul[1]/li[3]/span[2]")).getText(),
				"Order Requested");
		// verifying the second record
		Assert.assertEquals(Page.driver
				.findElement(By.xpath("//div[@id='popupQuotes']/div[2]/div/div[1]/ul[1]/li[3]/span[2]")).getText(),
				"Order Requested");
		pp.clickMyQuotesCrossicon();
	}

	@Test(priority = 47, enabled = false, description = "Verification of values present in Sort dropdown")
	public void SortBydd() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.MyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("Sortdd_Xpath");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Assert.assertEquals(Page.getText("SortddFirstOption_XPATH"), "Quote Id");
		Assert.assertEquals(Page.getText("SortddSecondOption_XPATH"), "Status");
		Assert.assertEquals(Page.getText("SortddThirdOption_XPATH"), "Date");
	}

	@Test(priority = 48, enabled = false, description = "Verification of the presence of cart icon on Home page")
	public void HomepageCarticon() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.VerifyHomepageCartIcon();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));

		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//nav[@id='topHeader']/div/ul/li[4]/a/div/div[1]/span/span")).isDisplayed());
	}

	@Test(priority = 49, enabled = false, description = "Verification of contents on Manage Quotes page")
	public void ClickManageQuotesLink() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.clickProductLink();
		pp.clickAdmin_ManageQuotes();
		// Assert.assertEquals(Page.getText("QuotesPagetitle_XPATH"), "Sort & Filter
		// Customer Product Quotes");
		Assert.assertEquals(Page.getText("QuoteIDHeader_XPATH"), "Quote ID");
		Assert.assertEquals(Page.getText("CompanyHeader_XPATH"), "Status");

	}

	@Test(priority = 50, enabled = false, description = "Verification of contents on a particular Quote")
	public void VerifyUIonClickQuoteID() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		// pp.clickProductLink();
		Page.driver.navigate().back();
		pp.clickAdmin_ManageQuotesQuoteID();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@class ='btnsAdminHeader']/a[2]")).isDisplayed());
		Assert.assertTrue(Page.driver.findElement(By.xpath("//div[@class='col-12 text-center']/button")).isDisplayed());
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//textarea[@class='form-control mt-2 mb-2']")).isDisplayed());

	}

	@Test(priority = 51, enabled = false, description = "Submitting a Quote with Ordered Status")
	public void SubmitQuotewithOrderedstatus() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("CloseBtnOnQuote_XPATH");
		Page.driver.navigate().back();
		pp.ClickSubmitQuotewithOrderedstatus();

	}

	@Test(priority = 52, enabled = false, description = "Submitting a Quote with Quote Pending Status")
	public void SubmitQuotewithQuotePendingstatus() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.driver.navigate().back();
		pp.ClickSubmitQuotewithQuotedPendingstatus();

	}

	@Test(priority = 53, enabled = false, description = "Submitting a Quote with a file more than 20mb")
	public void SubmitQuotewithMoreThan20mbFile() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.driver.navigate().back();
		pp.ClickSubmitQuotewithQuotedPendingstatusmorethan20mb();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		String tooltip = Page.driver
				.findElement(
						By.xpath("//*[@id='openAdminMyquotes___BV_modal_body_']/div/div/div/div[2]/div[2]/div[1]/div"))
				.getAttribute("title");
		System.out.println("The tooltip error message is: " + tooltip);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(tooltip, "File size should not exceed 20 mb");
		Page.click("ManageQuotesQuoteIDCloseBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	// Keep this false always
	@Test(priority = 54, enabled = false, description = "Submitting a Quote with a file more than 20mb")
	public void SubmitQuotewithNegativeExpireDays() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.driver.navigate().back();
		pp.ClickSubmitQuotewithNegativeExpireDays();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		String ExpireDaysTooltip = Page.driver.findElement(By.xpath("//input[@id='quoteExpire']"))
				.getAttribute("title");
		System.out.println("The tooltip error message is: " + ExpireDaysTooltip);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(ExpireDaysTooltip, "Value must be greater than or equal to 1.");
		Page.click("ManageQuotesQuoteIDCloseBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	@Test(priority = 55, enabled = false, description = "Submitting a Quote with a file with not supported format")
	public void SubmitQuotewithInvalidFileType() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.driver.navigate().back();
		pp.ClickSubmitQuotewithInvalidFileFormat();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		String InvalidFileTooltip = Page.driver
				.findElement(By
						.xpath("//*[@id='openAdminMyquotes___BV_modal_body_']/div/div/div/div[2]/div[2]/div[1]/div[1]"))
				.getAttribute("title");
		System.out.println("The tooltip error message is: " + InvalidFileTooltip);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(InvalidFileTooltip,
				"Please select a valid supported file format (supported : .jpg, .jpeg, .png, .gif, .csv, .xls, .xlsx, .pdf, .doc, .docx, .ppt, .pptx, .txt)");
		Page.click("ManageQuotesQuoteIDCloseBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	@Test(priority = 56, enabled = false, description = "Submitting a Quote with Quote Canceled Status")
	public void SubmitQuotewithQuoteCancelledstatus() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.driver.navigate().back();
		pp.ClickSubmitQuotewithCancelledstatus();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

	}

	@Test(priority = 57, enabled = false, description = "Submitting a Quote with Quoted Status")
	public void SubmitQuotewithQuotedstatus() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.driver.navigate().back();
		pp.ClickSubmitQuotewithQUOTEDstatus();

	}

	@Test(priority = 58, enabled = false, description = "Submitting a Quote with Order Requested Status")
	public void SubmitQuotewithOrderRequestedstatus() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.driver.navigate().back();
		pp.ClickSubmitQuotewithOrderRequestedstatus();

	}

	@Test(priority = 59, enabled = false, description = "Submitting a Quote with Expired Status")
	public void SubmitQuotewithExpiredstatus() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.driver.navigate().back();
		pp.ClickSubmitExpiredstatus();

	}

	@Test(priority = 60, enabled = false, description = "Verification of Manage Products dropdown menu")
	public void ClickManageProducts() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		// pp.clickProductLink();
		Page.driver.navigate().back();
		pp.clickAdmin_ManageProducts();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertEquals(Page.getText("ManageProductsheading_XPATH"), "Manage Products");
	}

	@Test(priority = 61, enabled = false, description = "Clicking Download Spreadsheet drop down and download")
	public void ClickDownloadProducts() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		// pp.clickProductLink();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickDownloadProducts();
	}

	@Test(priority = 62, enabled = false, description = "Clicking ProductsInreview button and going back to Manage Products pop up")
	public void ClickProductsinReview() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		// pp.clickProductLink();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickProductsInReview();
		Assert.assertEquals(Page.getText("ProductReviewHeading_XPATH"), "Product Review");
		pp.ClickProductsInReviewbackLink();
	}

	@Test(priority = 63, enabled = false, description = "Verification of click on Review button on Manage Products")
	public void ClickReview() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		// pp.clickProductLink();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickProductsInReview();
		pp.ClickReview();
		Assert.assertTrue(Page.isElementPresent(By.xpath("//*[@id='selectSize']")));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.ClickActions("CloseButton_XPATH");
	}

	@Test(priority = 64, enabled = false, description = "Verification of click on Approve button on Manage Products")
	public void ClickApprove() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		// pp.clickProductLink();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickApprove();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("ManageProductsApprovePopUpTxt_XPATH"), "Are you sure you want to do this?");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("ManageProductsApprovePopUpYesBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("ManageProductApproveSuccessPopupOkbtn_XPATH");

	}

	@Test(priority = 65, enabled = false, description = "Verification of click on Reject button on Manage Products")
	public void ClickReject() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		// pp.clickProductLink();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickReject();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("ManageProductsRejectPopUpTxt_XPATH"), "Are you sure you want to do this?");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("ManageProductsRejectPopUpYesBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("ManageProductRejectSuccessPopupOkbtn_XPATH");
		pp.ClickProductsInReviewbackLink();
	}

	@Test(priority = 66, enabled = false, description = "Verification of upload Spreadsheet on Manage Products")
	public void ClickUploadProducts() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		// pp.clickProductLink();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickUploadProducts();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("ManageProductUploadSuccessPopup_XPATH"), "Success!");
		Assert.assertEquals(Page.getText("ManageProductUploadSuccessPopuptxt_XPATH"), "Product Spreadsheet Uploaded");
		Page.ClickActions("ManageProductUploadSuccessPopupOkbtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("ManageProductCrossbutn_XPATH");
		Page.driver.navigate().back();
	}

	// Below method added by Varun 4August2020
	@Test(priority = 67, enabled = false, description = "Verification of upload Spreadsheet on Manage Products")
	public void ClickDictionaryLink() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.clickProductLink();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.clickAdmin_ManageProducts();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		pp.ClickDictionary();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("DictionaryHeaderTxt_XPATH"), "Dictionary");
		Assert.assertEquals(Page.getText("LevelTxt_XPATH"), "Level");
		Assert.assertEquals(Page.getText("ProductGroupTxt_XPATH"), "Product Group");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("DictionaryCloseBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.ClickProductsInReview();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.ClickDictionary();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("DictionaryHeaderTxt_XPATH"), "Dictionary");
		Assert.assertEquals(Page.getText("LevelTxt_XPATH"), "Level");
		Assert.assertEquals(Page.getText("ProductGroupTxt_XPATH"), "Product Group");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("DictionaryCloseBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.ClickProductsInReviewbackLink();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("ManageProductCrossbutn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.navigate().back();
	}

	// Below method added by Varun 6july2020
	@Test(priority = 68, enabled = false, description = "Verification of contents on Approve<<QuoteId>> screen")
	public void VerifyUIonApprove() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.clickProductLink();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.AddToShoppingCartApprove();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.CreateQuoteAllFields();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.ClickSubmitQuotewithQUOTEDstatus();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickApprovebtnManageQuote();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(Page.driver.findElement(By.xpath("//div[@id='popupApprove']/h6")).getText(),
				"Thank you! To approve your quote you will need to:");
		Assert.assertTrue(Page.driver.findElement(By.xpath("//input[@id = 'purchaseOrder']")).isDisplayed());
		Assert.assertTrue(Page.driver.findElement(By.xpath("//input[@id = 'buyerName']")).isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("ApproveClosebtn_XPATH");
	}

	// Added new test case on 7july,2020
	@Test(priority = 69, enabled = false, description = "Verification of disabled Approve button")
	public void VerifyApprovebtndisabled() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.AddToShoppingCartApprove();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.CreateQuoteAllFields();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.ClickSubmitQuotewithQUOTEDstatus();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickApprovebtnManageQuote();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.VerifyApprovebtndisabled();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Assert.assertFalse(Page.driver.findElement(By.xpath("//div[@id =
		// 'popupApprove']/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")).isDisplayed());
		Assert.assertFalse(Page.driver
				.findElement(By.xpath("//div[@id = 'popupApprove']/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]"))
				.isEnabled());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("ApproveClosebtn_XPATH");
	}

	// Below method added by Varun 6july2020
	@Test(priority = 70, enabled = false, description = "Verification of Thank you pop after approving the Quoted Request")
	public void verifyThankyouPopup() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.AddToShoppingCartApprove();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.CreateQuoteAllFields();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		pp.ClickSubmitQuotewithQUOTEDstatus();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickApprovebtnManageQuote();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickApprovebtnApprove();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(Page.driver.findElement(By.xpath("//div[@class='popupApproved text-center']/h6")).getText(),
				"Thank you for submitting your request. We will contact you with an order confirmation shortly.");
		Assert.assertEquals(
				Page.driver.findElement(By.xpath("//h5[@id='openMyquotes___BV_modal_title_']/span[3]")).getText(),
				"Approved!");
		Assert.assertTrue(Page.driver.findElement(By.xpath("//button[@id='closeQuoteDetails']")).isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("ApprovedClosebtn_XPATH");
	}

	@Test(priority = 71, enabled = false, description = "Verification of Cancel action on the quote screen")
	public void verifyCancelwhileREQuoting() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickSubmitQuotewithQuotedPendingstatus();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.driver.navigate().back();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickCancelREQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertTrue(Page.driver.findElement(By.xpath("//header[@id='openMyquotes___BV_modal_header_']/h5/select"))
				.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("Closebtn_XPATH");
	}

	@Test(priority = 72, enabled = false, description = "Verification of submission action on the quote screen")
	public void verifySubmitwhileREQuoting() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickSubmitQuotewithQuotedPendingstatus();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.driver.navigate().back();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickSubmitREQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[@id='openMyCart___BV_modal_body_']/div/div[2]/div/div[3]/div/a[2]"))
				.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		pp.CreateREQuoteAllFields();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(Page.driver.findElement(By.xpath("//h5[@id='quoteSubmitted___BV_modal_title_']")).getText(),
				"Quote Request Submitted");
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//*[@id='quoteSubmitted___BV_modal_body_']/div/div/div[2]/button"))
						.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	@Test(priority = 73, enabled = false, description = "Verification of Add to Cart on the quote screen")
	public void verifyAddToCartWhileReQuoting() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickSubmitQuotewithQuotedPendingstatus();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.driver.navigate().back();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.MyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.ClickAddToCartReQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.AddtoShoppingCartRequote();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		//Page.click("SubmitQuoteRequestbtn_XPATH");
		pp.CreateREQuoteAllFields();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(Page.driver.findElement(By.xpath("//h5[@id='quoteSubmitted___BV_modal_title_']")).getText(),
				"Quote Request Submitted");
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//*[@id='quoteSubmitted___BV_modal_body_']/div/div/div[2]/button"))
						.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("QuoteRequestsubmittedpopupClosebtn_XPATH");
	}

	// Added on 23rd July 20
	@Test(priority = 74, enabled = false, description = "Verification of Exclamation Mark on My Quotes for Quote Request")
	public void verifyExclamationOnMyQuotes() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.CreateQuoteExclamation();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		Assert.assertTrue(Page.driver.findElement(By.xpath("//a[@id='openMyquotes']/span")).isDisplayed());
	}

	@Test(priority = 75, enabled = false, description = "ShoppingCart Add button verification")
	public void VerifyShoppingAddbtndisabled() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.ShoppingCarrtAddbtnDisabled();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertFalse(Page.driver.findElement(By.xpath("//*[@id='MypopupScroll']/div/div/div[2]/form/button[1]"))
				.isEnabled());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("CloseButton_XPATH");
	}

	@Test(priority = 76, enabled = false, description = "ShoppingCart Add button disabled even if the qty is clear")
	public void VerifyShoppingCarrtAddbtnDisabledclearqty() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.ShoppingCarrtAddbtnDisabledclearqty();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertFalse(Page.driver.findElement(By.xpath("//*[@id='MypopupScroll']/div/div/div[2]/form/button[1]"))
				.isEnabled());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("CloseButton_XPATH");
	}

	@Test(priority = 77, enabled = false, description = "Verify that shopping cart icon will be displayed with a number indicating the quantity of items in the cart ")
	public void verifyCartIconCount() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.AddToCartShoppingCart();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("QuoteRequestCrossicon_XPATH");
		String CartIconNumber = Page.driver.findElement(By.xpath("//*[@id='openMyCart']/span")).getText();
		System.out.println("The number of products in the cart: " + CartIconNumber);
		pp.AddToCartShoppingCart();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("QuoteRequestCrossicon_XPATH");
		String CartIconNumberUpdated = Page.driver.findElement(By.xpath("//*[@id='openMyCart']/span")).getText();
		System.out.println("The number of products in the cart after Updation: " + CartIconNumberUpdated);
	}

	@Test(priority = 78, enabled = false, description = "ShoppingCart Add button disabled even if the qty is out of the fiels limits")
	public void VerifyShoppingCarrtMinMaxqty() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.ShoppingCarrtAddbtnDisabledclearqty();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		String validationtooltip = Page.driver.findElement(By.xpath("//*[@id='selectQuantity']")).getAttribute("title");
		Assert.assertEquals(validationtooltip, "Please enter quantity between 1 and 999");
		Page.click("CloseButton_XPATH");
		pp.ShoppingCarrtAddbtnMaxqty();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertEquals(validationtooltip, "Please enter quantity between 1 and 999");
		Page.click("CloseButton_XPATH");
		pp.ShoppingCarrtAddbtnZeroqty();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Assert.assertEquals(validationtooltip, "Please enter quantity between 1 and 999");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("CloseButton_XPATH");
	}

	@Test(priority = 79, enabled = false, description = "Verify Go Back button funactionality on Quote Request screen")
	public void GoBack() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.ProductGoBack();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//*[@id='openMyCart___BV_modal_header_']/button")).isDisplayed());
		Page.click("QuoteRequestCrossicon_XPATH");
	}

	@Test(priority = 80, enabled = false, description = "Create Quote by adding product in the cart by Multiple attachment")
	public void CreateQuote_MultipleAttachment() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.CreateQuoteByMultipleFileAddToShoppingCart();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
	}

	@Test(priority = 81, enabled = false, description = "Create Quote by adding product in the cart by updating attachment")
	public void CreateQuote_UpdateeAttachment() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.CreateQuoteByUpdateFileAddToShoppingCart();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
	}

	@Test(priority = 82, enabled = false, description = "Submitting a Quote without attachment")
	public void SubmitQuotewithoutFile() throws Exception {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.driver.navigate().back();
		pp.clickProductCartLink();
		pp.ClickSubmitQuotewithoutFile();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		String FileError = Page.driver
				.findElement(
						By.xpath("//*[@id='openAdminMyquotes___BV_modal_body_']/div/div/div/div[2]/div/div/div/div[3]"))
				.getText();
		Assert.assertEquals(FileError, "Quote attachment is required for Quoted status.");
		Page.click("ManageQuotesQuoteIDCloseBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.navigate().back();
	}

	@Test(priority = 83, enabled = false, description = "Add Related products to shopping Cart")
	public void VerifyAddingRelatedProductsToShoppingCart() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.AddingRelatedProducts();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id='openMyCart___BV_modal_body_']/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[3]/a/span/img"))
				.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("QuoteRequestCrossicon_XPATH");
	}

	@Test(priority = 84, enabled = false, description = "Verify the tooltip displayed for Size dropdown")
	public void VerifyTooltipForSizeDropDown() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.ToolTipForSize();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		String Sizetooltip = Page.driver.findElement(By.xpath("//*[@id='selectSize']/option[2]")).getAttribute("title");
		Assert.assertEquals(Sizetooltip, "767-020-001-4007 230 x 13' - 191,800 ft/lbs");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("CloseButton_XPATH");
	}

	@Test(priority = 85, enabled = false, description = "Create Quote by adding product in the cart by updating attachment and filling all the details")
	public void UpdateChangeProductAddToShoppingCart() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		pp.CreateQuoteByUpdateFileAddToShoppingCart();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
	}

	@Test(priority = 86, enabled = false, description = "Verification of deleting the Quantity on ShoppingCart Overlay")
	public void verifyDeleteProductOnOverlay() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.DeleteQuantityOnShoppingCart();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
	}

	@Test(priority = 87, enabled = false, description = "Verification of Comments textarea when comments section is Expanded and collapsed")
	public void MyQuotesComments_Collapse() throws InterruptedException {
		HomeOU ou = new HomeOU();
		ProductPage pp = ou.goProduct();
		pp.MyQuotes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("CollapseExpandCOmmentbtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("CollapseExpandCOmmentbtn_XPATH");
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//div[@id='openMyquotes___BV_modal_body_']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/textarea"))
				.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("CollapseExpandCOmmentbtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertFalse(Page.driver.findElement(By
				.xpath("//div[@id='openMyquotes___BV_modal_body_']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/textarea"))
				.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		pp.clickMyQuotesCrossicon();
	}

}
