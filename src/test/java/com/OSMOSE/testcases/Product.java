package com.OSMOSE.testcases;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.HomeOU;
import com.OSMOSE.pages.OU.ProductPage;
import com.OSMOSE.utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DriverCommand;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class Product extends BaseTest{

    @Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 0)
    public void verifyTheProductLink(Hashtable<String,String> data) throws InterruptedException {
        HomeOU ou = new HomeOU();
        ProductPage pp = ou.goProduct();
        //pp.clickOnOU360();
        Thread.sleep(1200);
        pp.clickProductLink();
        Thread.sleep(1000);
        Assert.assertEquals(Page.getText("POrdering_XPATH"),"Pole and Line Products");
    }
    @Test(description = "Verify that User clicks on the Product Cart", priority = 1,enabled = false)
    public void verifyTheProductCart() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickProductCartLink();
        Thread.sleep(12000);
        Assert.assertEquals(Page.getText("POrdering_XPATH"),"Pole and Line Products");
    }
    @Test(priority = 2,dependsOnMethods = "verifyTheProductLink",enabled = false)
    public void searchElementPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Assert.assertFalse(Page.isElementPresent(By.id("PSearch_ID")));
    }
    @Test(priority = 3,dependsOnMethods = "verifyTheProductLink",enabled = false)
    public void catalogElementPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Assert.assertEquals(Page.getText("CatalogItem_XPATH"),"Category Filter");
    }
    @Test(priority = 4,dependsOnMethods = "verifyTheProductLink",enabled = false)
    public void openMyQuotesElementPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Assert.assertEquals(Page.getText("OpenMyQuotes_XPATH"),"MY QUOTES");
    }
    @Test(priority = 5,dependsOnMethods = "verifyTheProductLink",enabled = false)
    public void shoppingCartElementPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Assert.assertEquals(Page.getText("ShoppingCart_XPATH"),"");

    }
    @Test(priority = 6,dependsOnMethods = "verifyTheProductLink",enabled = false)
    public void adminElementPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Assert.assertEquals(Page.getText("Admin_XPATH"),"MYQUOTES0");
    }
    @Test(priority = 7,dependsOnMethods = "verifyTheProductLink",enabled = false)
    public void viewDetailsElementPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Assert.assertEquals(Page.getText("ViewDetail_XPATH"),"VIEW DETAILS");
    }
    @Test(priority = 8,dependsOnMethods = "verifyTheProductLink",enabled = false)
    public void allSixProductPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Assert.assertEquals(Page.getText("MITCFUME_XPATH"),"C-Truss");
    }
    @Test(priority = 9,dependsOnMethods = "verifyTheProductLink",enabled = false)
    public void sliderItemPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Page.click("ProductSlider_XPATH");
        Assert.assertEquals(Page.getText("PoleTopper®_XPATH"),"MITC-FUME®");
    }
    @Test(priority = 10,dependsOnMethods = "verifyTheProductLink",enabled = false)
    public void verifyCategoryFilter(){
        HomeOU ou = new HomeOU();
        ProductPage pp = ou.goProduct();
        Assert.assertFalse(Page.isElementPresent(By.id("CategoryFilter_ID")));
    }
    @Test(priority = 11,dependsOnMethods = "verifyTheProductLink",enabled = false)
    public void VerifyFPImageClick() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
       pp.clickOnProductImage();
       Thread.sleep(1200);
       Assert.assertEquals(Page.getText("ProductAddButton_XPATH"),"ADD");
        Page.click("CloseButton_CSS");
    }
    @Test(priority = 12,dependsOnMethods = "verifyTheProductLink",enabled = false)
    public void verifyViewDetail() throws InterruptedException {
        HomeOU ou = new HomeOU();
        ProductPage pp = ou.goProduct();
        Thread.sleep(1200);
        pp.clickOnViewDetails("Productsimageclick2_XPATH");
        Thread.sleep(1200);
        Assert.assertTrue((Page.isElementPresent(By.xpath("//*[@id=\"selectSize\"]"))));
        Page.click("CloseButton_CSS");
    }

    @Test(priority = 13,enabled = false)
    public void VerifyProductclick() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickProductLink();
        pp.clickOnProductFeatureImage();
        Assert.assertEquals(Page.getText("FeaturedProducts_XPATH"),"Featured Products");
        Page.driver.navigate().back();
        Page.click("Productsimageclick2_XPATH");
        Assert.assertEquals(Page.getText("FeaturedProducts_XPATH"),"Featured Products");
        Page.driver.navigate().back();
        Page.click("Productsimageclick3_XPATH");
        Assert.assertEquals(Page.getText("FeaturedProducts_XPATH"),"Featured Products");
        Page.driver.navigate().back();
        Page.click("Productsimageclick4_XPATH");
        Assert.assertEquals(Page.getText("FeaturedProducts_XPATH"),"Featured Products");
        Page.driver.navigate().back();
}
    
    @Test(priority = 14,enabled = false)
    public void AddQuantityandverifyCellNumber() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickOnProductImage();
        pp.AddQuantityInCart_AssertCellNumber();
       //Assert.assertEquals(Page.getAttributeValue("SelectDropDownToolTip_XPATH","title"),"72-020-009-100 PR - C2-3611");
       Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"),"(770) 632-6700 Option 3");
        pp.switchToNewWindow(0);
        
    }
    
    
    
    @Test(priority = 15,enabled = false)
    public void FeaturedProductPoleRestoration() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickProductCartLink();
        pp.ProductPoleRestoration();
        Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"),"(770) 632-6700 Option 3");
        Thread.sleep(1000);
        pp.switchToparentWindow();
        Page.driver.navigate().back();
  
        pp.clickProductCartLink();
        System.out.println("second is clicked");
        Thread.sleep(1000);
        pp.ProductPoleRestoration_1();
        Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"),"(770) 632-6700 Option 3");
        Thread.sleep(1000);
       pp.switchToparentWindow();
        Page.driver.navigate().back();
        pp.clickProductCartLink();
        Thread.sleep(1000);
        System.out.println("third is clicked");
        pp.ProductPoleRestoration_2();
        Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"),"(770) 632-6700 Option 3");
        Page.driver.navigate().back();
        Thread.sleep(1000);
        pp.clickProductCartLink();
        Thread.sleep(1000);
        System.out.println("fourth is clicked");
        Thread.sleep(1000);
        pp.ProductPoleRestoration_3();
         Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"),"(770) 632-6700 Option 3");
         Page.driver.navigate().back();
         Thread.sleep(1000);
         pp.clickProductCartLink();
    }
    @Test(dataProviderClass = Utilities.class,priority = 16, dataProvider ="dp",description = "Verify that User clicks on the Slider icon",enabled = false)
    public void verifyTheSearch(Hashtable<String,String> data) throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickSearch();
        Page.type("PSearch_ID",data.get("SearchItem"));
        Page.click("PSearchIcon_ID");
        Assert.assertEquals("","");
    }
    
    @Test(dataProviderClass = Utilities.class,priority = 17,dataProvider ="dp",description = "Verify that User clicks on the Slider icon and search for firstname Pole",enabled = false)
    public void verifyTheSearchfirstname(Hashtable<String,String> data) throws InterruptedException {
    	 HomeOU ou= new HomeOU();
         ProductPage pp = ou.goProduct();
         pp.clickSearch();
         Page.type("PSearch_XPATH",data.get("SearchItem"));
         Page.driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);  
       Assert.assertEquals(Page.getText("PoleTopperProductSearch_XPATH"),"Pole Topper®");
      // Assert.assertEquals(Page.getText("SearcchResultPoleproductone_XPATH"),"C-Truss");
      Assert.assertEquals(Page.getText("SearcchResultPoleproductTwo_XPATH"),"Osmo-C2-Truss®");
      Assert.assertEquals(Page.getText("SearcchResultPoleproductThree_XPATH"),"Dummy3 - C-Truss");
      Assert.assertEquals(Page.getText("SearcchResultPoleproductFour_XPATH"),"Dummy4 - Osmo-C2-Truss®");

        pp.ProductSearchFirstname();
    }
    
    @Test(dataProviderClass = Utilities.class,priority = 18,enabled = false,dataProvider ="dp",description = "Verify that User clicks on the Slider icon and search for full name Pole Restoration")
    public void verifyTheSearchFullname(Hashtable<String,String> data) throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickSearch();
		Page.driver.findElement(By.id("searchInput")).clear();
		Page.type("PSearch_XPATH",data.get("SearchItem"));
        Page.driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
        //Assert.assertEquals(Page.getText("SearcchResultPoleproductone_XPATH"),"C-Truss");
       Assert.assertEquals(Page.getText("SearcchResultPoleproductTwo_XPATH"),"Osmo-C2-Truss®");
       Assert.assertEquals(Page.getText("SearcchResultPoleproductThree_XPATH"),"Dummy3 - C-Truss");
       Assert.assertEquals(Page.getText("SearcchResultPoleproductFour_XPATH"),"Dummy4 - Osmo-C2-Truss®");

        
    
    }
    
    @Test(dataProviderClass = Utilities.class,priority = 19,dataProvider ="dp",enabled = false,description = "Verify that User clicks on the Slider icon and search for One Alphabeted like H")
    public void verifyTheSearchOneAlphabet(Hashtable<String,String> data) throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickSearch();
        Page.driver.findElement(By.id("searchInput")).clear();
        Page.type("PSearch_XPATH",data.get("SearchItem"));
        Page.driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
       //Assert.assertEquals(Page.getText("SearcchResultSingleMITCAlphabet_XPATH"),"MITC-FUME®");
       Assert.assertEquals(Page.getText("SearcchResultSingleAlphabet_XPATH"),"Dummy2 - MITC-FUME®");
        
    }
    
	
	 @Test(dataProviderClass = Utilities.class,priority = 20,enabled = false,dataProvider ="dp",description ="Verify that User clicks on the Slider icon and Click on Crosss icon")
	 public void verifyTheSearchCrossButton(Hashtable<String,String> data) throws InterruptedException { 
		 HomeOU ou= new HomeOU();
	        ProductPage pp = ou.goProduct();
	        Thread.sleep(2000);
	        pp.clickSearch();
	        Page.driver.findElement(By.id("searchInput")).clear();
	        Page.type("PSearch_XPATH",data.get("SearchItem"));
	        Page.driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER); 
	        Page.click("SearchCrossIcon_XPATH"); 
	     }
	 
	 @Test(dataProviderClass = Utilities.class,priority = 21,dataProvider ="dp",enabled = false,description = "Verify that User clicks on the Slider icon and validate the validation message is shown wrong input")
	 public void verifyTheValidationmessage(Hashtable<String,String> data) throws InterruptedException { 
		 HomeOU ou= new HomeOU();
	        ProductPage pp = ou.goProduct();
	        pp.clickSearch();
	        Page.driver.findElement(By.id("searchInput")).clear();
	        Page.type("PSearch_XPATH",data.get("SearchItem"));
	        Page.driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER); 
	        Page.driver.findElement(By.id("searchInput")).clear();
	        Thread.sleep(1000);
	        //WebElement element = Page.driver.findElement(By.xpath("//*[text()='No products match your search.']"));
	        	//	System.out.println(element.getText());
	  //Assert.assertEquals(,"No products match your search.");
	  }
     
	 
	 @Test(priority = 22,enabled =false)
	    public void ReturnPolicy() throws InterruptedException {
	        HomeOU ou= new HomeOU();
	        ProductPage pp = ou.goProduct();
	        pp.ProductReturnPolicy();
	        Assert.assertEquals(Page.getText("ReturnProceduretext_XPATH"), "Return Procedure");
	        pp.clickRequestCrossicon();
	    }
	 
	 
	 @Test(priority = 23,enabled = false)
	    public void verifyAddShoppingCarttext() throws InterruptedException {
	        HomeOU ou= new HomeOU();
	        ProductPage pp = ou.goProduct();
	       pp.AddToCartShoppingCart();
	       Assert.assertEquals(Page.driver.findElement(By.xpath("//div[@class='addCartStepOne']/div/div[2]/div[2]")).getText(), "For information or to place an order");
	        Assert.assertEquals(Page.driver.findElement(By.xpath("//div[@class='addCartStepOne']/div/div[2]/div[3]/strong")).getText(), "(770) 632-6700 Option 3");
	        Assert.assertEquals(Page.driver.findElement(By.xpath("//div[@class='addCartStepOne']/div/div[2]/div[4]/strong/a")).getText(),  "products@osmose.com");
	    }
	 @Test(priority = 24,enabled =false)
	    public void AddShoppingCart() throws InterruptedException {
	        HomeOU ou= new HomeOU();
	        ProductPage pp = ou.goProduct();
	        pp.AddToShoppingCart();
	        Thread.sleep(2000);
           Assert.assertEquals(Page.getText("ProductsQuoterequest_XPATH"), "Quote Request");
	    }
	 
	 
    
	 //Shopping Cart
	 @Test(priority = 25,enabled =false)
	    public void VerifyCrossicononhoppingCart() throws InterruptedException {
	        HomeOU ou= new HomeOU();
	        ProductPage pp = ou.goProduct();
	        Thread.sleep(1000);
	        Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@id='openMyCart___BV_modal_body_']/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[3]/a/span/img")).isDisplayed());
	    }
	 
	//Shopping Cart
		 @Test(priority = 26,enabled = false)
		    public void VerifyCrossicononhoppingCart_Sameitem_multipletime() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        pp.AddToCartProductPoleRestoration();
		        Thread.sleep(1000);
		        Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@id='openMyCart___BV_modal_body_']/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[3]/a/span/img")).isDisplayed());
		    }
		 
		 @Test(priority = 27,enabled = false)
		    public void DeleteQuanityinShoppingCart() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        Thread.sleep(1000);
                pp.DeleteQuanityinShoppingCart();
		    } 
		 
		 @Test(priority = 28,enabled = false)
		    public void UpdateIncreaseQuanityinShoppingCart() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        Thread.sleep(1000);
             pp.UpdateIncreaseQuanityinShoppingCart();
             Assert.assertEquals(Page.driver.findElement(By.xpath("//input[@name='quantities']")).getAttribute("value"), "9");
		    } 
		 
		 @Test(priority = 29,enabled = false)
		    public void UpdateDecreaseQuanityinShoppingCart() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        Thread.sleep(1000);
          pp.UpdateDecreaseQuanityinShoppingCart();
          Assert.assertEquals(Page.driver.findElement(By.xpath("//input[@name='quantities']")).getAttribute("value"), "7");
		    } 
		 
		 @Test(priority = 30,enabled = false)
		 public void CreateQuote() throws InterruptedException {
			 HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        pp.CreateQuoteByAddToShoppingCart();
		        Thread.sleep(1000); 
		 }
		 
		 @Test(priority = 31,enabled=false)
		 public void CreateQuote_Comments() throws InterruptedException {
			 HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        pp.CreateQuoteByCommentsAddToShoppingCart();
		        Thread.sleep(1000); 
		 }
		 @Test(priority = 32,enabled=false)
		 public void CreateQuote_ZipCode() throws InterruptedException {
			 HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        pp.CreateQuoteByZipCodeAddToShoppingCart();
		        Thread.sleep(1000); 
		 }
		 
		 @Test(priority = 33,enabled=false)
		 public void CreateQuote_Attachment() throws InterruptedException {
			 HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        pp.CreateQuoteByFileAddToShoppingCart();
		        Thread.sleep(1000); 
		 }
		 
		 @Test(priority = 34,enabled=false)
		 public void MyQuotes_96421() throws InterruptedException {
			 HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        pp.MyQuotes();
		        Thread.sleep(1000); 
		        Assert.assertEquals(Page.getText("MyQuotesheadertxt_XPATH"),"My Quotes");
		        Assert.assertEquals(Page.getText("Statustxt_XPATH"),"Status:");
		        Assert.assertTrue(Page.driver.findElement(By.xpath("//div[@class='popupQuotes']/div[1]/div[1]/div[1]/div/div[1]")).isDisplayed());
		        Assert.assertTrue(Page.driver.findElement(By.xpath("//header[@id=\"openMyquotes___BV_modal_header_\"]/button")).isDisplayed());
		        Assert.assertTrue(Page.driver.findElement(By.xpath("//header[@id=\"openMyquotes___BV_modal_header_\"]/h5/select")).isDisplayed());
		        Assert.assertTrue(Page.driver.findElement(By.xpath("//div[@class='popupQuotes']/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")).isDisplayed());
		        Assert.assertTrue(Page.driver.findElement(By.xpath("//div[@class='popupQuotes']/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/a")).isDisplayed());
		 }
		 
		 @Test(priority = 35,enabled=false)
		 public void HomepageCarticon() throws InterruptedException {
			 HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        pp.VerifyHomepageCartIcon();
		        Thread.sleep(6000);
		        
		        Assert.assertTrue(Page.driver.findElement(By.xpath("//nav[@id='topHeader']/div/ul/li[4]/a/div/div[1]/span/span")).isDisplayed());
		 }
		 
		 @Test(priority = 36,enabled=false)
		 public void ClickManageQuotesLink() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        //pp.clickProductLink();
		        pp.clickAdmin_ManageQuotes();
		        Assert.assertEquals(Page.getText("QuotesPagetitle_XPATH"),"Sort & Filter Customer Product Quotes");
		        Assert.assertEquals(Page.getText("QuoteIDHeader_XPATH"),"Quote ID");
		        Assert.assertEquals(Page.getText("CompanyHeader_XPATH"),"Company");
			        
		    }
		 
		 @Test(priority = 37,enabled =false)
		 public void VerifyUIonClickQuoteID() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        //pp.clickProductLink();
		        pp.clickAdmin_ManageQuotes();
		        Thread.sleep(2000);
		        Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@class =\"btnsAdminHeader\"]/a[2]")).isDisplayed());
		        Assert.assertEquals(Page.getText("HeadingQuoteIDSubmitQuotePopup_XPATH"),"Q000001");
		        Assert.assertTrue(Page.driver.findElement(By.xpath("//div[@class=\"col-12 text-center\"]/button")).isDisplayed());
		        Assert.assertTrue(Page.driver.findElement(By.xpath("//textarea[@class=\"form-control mt-2 mb-2\"]")).isDisplayed());
		        
		        
		    }
		
		 
		 @Test(priority = 38,enabled = false)
		 public void SubmitQuotewithOrderedstatus() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        Thread.sleep(2000);
		        pp.ClickSubmitQuotewithOrderedstatus();
		        

		    }
		 
		 @Test(priority = 39,enabled = false)
		 public void SubmitQuotewithQuotePendingstatus() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        Thread.sleep(2000);
		        pp.ClickSubmitQuotewithQuotedPendingstatus();
		       
		    }
		 
		 @Test(priority = 40,enabled = false)
		 public void SubmitQuotewithQuoteCancelledstatus() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        Thread.sleep(2000);
		        pp.ClickSubmitQuotewithCancelledstatus();
		        Thread.sleep(3000);

		    }
		 
		 @Test(priority = 41,enabled = true)
		 public void SubmitQuotewithQuotedstatus() throws Exception {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        Thread.sleep(2000);
		        pp.ClickSubmitQuotewithQUOTEDstatus();
		       
		    }
		 
		 @Test(priority = 42,enabled = false)
		 public void SubmitQuotewithOrderRequestedstatus() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        Thread.sleep(2000);
		        pp.ClickSubmitQuotewithOrderRequestedstatus();
		        

		    }
		 
		 @Test(priority = 43,enabled =false)
		 public void ClickManageProducts() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        //pp.clickProductLink();
		        pp.clickAdmin_ManageProducts();
		        Thread.sleep(2000);
		        Assert.assertEquals(Page.getText("ManageProductsheading_XPATH"),"Manage Products");
		   }
		
		 @Test(priority = 44,enabled =false,description = "Clicking Download Spreadsheet drop down and download")
		 public void ClickDownloadProducts() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        //pp.clickProductLink();
		        Thread.sleep(2000);
		        pp.ClickDownloadProducts();
		   }
		 @Test(priority = 45,enabled =false,description = "Clicking ProductsInreview button and going back to Manage Products pop up")
		 public void ClickProductsinReview() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        //pp.clickProductLink();
		        Thread.sleep(2000);
		        pp.ClickProductsInReview();
		        Assert.assertEquals(Page.getText("ProductReviewHeading_XPATH"),"Product Review");
		        pp.ClickProductsInReviewbackLink();
		   }
		 
		 @Test(priority = 46,enabled =false,description = "upload Spreadsheet")
		 public void ClickUploadProducts() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        //pp.clickProductLink();
		        Thread.sleep(2000);
		        pp.ClickUploadProducts();
		   }
}
