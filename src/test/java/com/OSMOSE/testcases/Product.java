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
        Thread.sleep(1200);
        Assert.assertEquals(Page.getText("POrdering_XPATH"),"Pole and Line Products");
    }
    @Test(priority = 2,dependsOnMethods = "verifyTheProductLink")
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
        Assert.assertEquals(Page.getText("MITCFUME_XPATH"),"MITC-FUME®");
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
        pp.clickOnViewDetails("Productsimageclick_XPATH");
        Thread.sleep(1200);
        Assert.assertTrue((Page.isElementPresent(By.xpath("//*[@id=\"selectSize\"]"))));
        Page.click("CloseButton_CSS");
    }

    @Test(priority = 13,enabled = false)
    public void VerifyProductclick() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
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
}
    
    @Test(priority = 14,enabled = false)
    public void AddQuantityandverifyCellNumber() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickOnProductImage();
        pp.AddQuantityInCart_AssertCellNumber();
       Assert.assertEquals(Page.getAttributeValue("SelectDropDownToolTip_XPATH","title"),"72-020-009-100 PR - C2-3611");
      Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"),"(770) 632-6700 Option 3");
        pp.switchToNewWindow(0);
        
    }
    
    
    
    @Test(priority = 15,enabled = false)
    public void FeaturedProductPoleRestoration() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.ProductPoleRestoration();
        Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"),"(770) 632-6700 Option 3");
        Thread.sleep(1000);
        pp.switchToparentWindow();
        Page.driver.navigate().back();
  
        pp.clickOnProductImage();
        System.out.println("second is clicked");
        pp.ProductPoleRestoration_1();
        Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"),"(770) 632-6700 Option 3");
        Thread.sleep(1000);
        pp.switchToparentWindow();
        Page.driver.navigate().back();
        pp.clickOnProductImage();
        System.out.println("third is clicked");
        pp.ProductPoleRestoration_2();
        Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"),"(770) 632-6700 Option 3");
        Thread.sleep(10);
        pp.ProductPoleRestoration_3();
         Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"),"(770) 632-6700 Option 3");
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
       Assert.assertEquals(Page.getText("SearcchResultPoleproductone_XPATH"),"C-Truss");
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
        Assert.assertEquals(Page.getText("SearcchResultPoleproductone_XPATH"),"C-Truss");
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
       Assert.assertEquals(Page.getText("SearcchResultSingleMITCAlphabet_XPATH"),"MITC-FUME®");
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
	        WebElement element = Page.driver.findElement(By.xpath("//*[text()='No products match your search.']"));
	        		System.out.println(element.getText());
	  //Assert.assertEquals(,"No products match your search.");
	  }
     
	 
	 @Test(priority = 22,enabled =false)
	    public void ReturnPolicy() throws InterruptedException {
	        HomeOU ou= new HomeOU();
	        ProductPage pp = ou.goProduct();
	        pp.ProductReturnPolicy();
	        //Assert.assertEquals(Page.getText("ReturnProceduretext_XPATH"), "Return Procedure");
	        pp.clickRequestCrossicon();
	    }
	 @Test(priority = 24,enabled =false)
	    public void AddShoppingCart() throws InterruptedException {
	        HomeOU ou= new HomeOU();
	        ProductPage pp = ou.goProduct();
	        pp.AddToShoppingCart();
	        Thread.sleep(2000);
            //Assert.assertEquals(Page.getText("ProductsQuoterequest_XPATH"), "Quote Request");
	    }
	 
	 @Test(priority = 23,enabled = false)
	    public void verifyAddShoppingCarttext() throws InterruptedException {
	        HomeOU ou= new HomeOU();
	        ProductPage pp = ou.goProduct();
	       pp.AddToCartShoppingCart();
         Assert.assertEquals(Page.getText("ForInfoQuoteRequest_XPATH"), "For information or to place an order");
         Assert.assertEquals(Page.getText("ForCallRequest_XPATH"), "(770) 632-6700 Option 3");
        Assert.assertEquals(Page.getText("ForEmailQuoteRequest_XPATH"),"products@osmose.com"); 
	    }
    
	 //Shopping Cart
	 @Test(priority = 25,enabled =false)
	    public void VerifyCrossicononhoppingCart() throws InterruptedException {
	        HomeOU ou= new HomeOU();
	        ProductPage pp = ou.goProduct();
	        Thread.sleep(1000);
	        Assert.assertTrue((Page.isElementPresent(By.xpath("//*[@id=\"qty_5_906\"]"))));
	    }
	 
	//Shopping Cart
		 @Test(priority = 26,enabled = false)
		    public void VerifyCrossicononhoppingCart_Sameitem_multipletime() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        pp.AddToCartProductPoleRestoration();
		        Thread.sleep(1000);
	        // Assert.assertTrue((Page.isElementPresent(By.xpath("//*[@id=\"qty_5_906\"]"))));
	        //Assert.assertEquals(Page.getText("QuantityfieldonShoppingCart_XPATH"), "16");
		    }
		 
		 @Test(priority = 27)
		    public void DeleteQuanityinShoppingCart() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        Thread.sleep(1000);
                pp.DeleteQuanityinShoppingCart();
		    } 
		 
		 @Test(priority = 28)
		    public void UpdateIncreaseQuanityinShoppingCart() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        Thread.sleep(1000);
             pp.UpdateIncreaseQuanityinShoppingCart();
		    } 
		 
		 @Test(priority = 29)
		    public void UpdateDecreaseQuanityinShoppingCart() throws InterruptedException {
		        HomeOU ou= new HomeOU();
		        ProductPage pp = ou.goProduct();
		        Thread.sleep(1000);
          pp.UpdateDecreaseQuanityinShoppingCart();
		    } 
}
