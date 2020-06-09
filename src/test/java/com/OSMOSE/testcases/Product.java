package com.OSMOSE.testcases;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.HomeOU;
import com.OSMOSE.pages.OU.ProductPage;
import com.OSMOSE.utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DriverCommand;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class Product extends BaseTest{

    @Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 0)
    public void verifyTheProductLink(Hashtable<String,String> data) throws InterruptedException {
        HomeOU ou = new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickOnOU360();
        Thread.sleep(12000);
        pp.clickProductLink();
        Thread.sleep(12000);
        Assert.assertEquals(Page.getText("POrdering_XPATH"),"Pole and Line Products");
    }
    @Test(description = "Verify that User clicks on the Product Cart", priority = 1)
    public void verifyTheProductCart() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickProductCartLink();
        Thread.sleep(12000);
        Assert.assertEquals(Page.getText("POrdering_XPATH"),"Pole and Line Products");
    }
    @Test(priority = 2,dependsOnMethods = "verifyTheProductLink")
    public void searchElementPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Assert.assertFalse(Page.isElementPresent(By.id("PSearch_ID")));
    }
    @Test(priority = 3,dependsOnMethods = "verifyTheProductLink")
    public void catalogElementPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Assert.assertEquals(Page.getText("CatalogItem_XPATH"),"Fire Protection");
    }
    @Test(priority = 4,dependsOnMethods = "verifyTheProductLink")
    public void openMyQuotesElementPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Assert.assertEquals(Page.getText("OpenMyQuotes_XPATH"),"MY QUOTES");
    }
    @Test(priority = 5,dependsOnMethods = "verifyTheProductLink")
    public void shoppingCartElementPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Assert.assertEquals(Page.getText("ShoppingCart_XPATH"),"");

    }
    @Test(priority = 6,dependsOnMethods = "verifyTheProductLink")
    public void adminElementPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Assert.assertEquals(Page.getText("Admin_XPATH"),"ADMIN");
    }
    @Test(priority = 7,dependsOnMethods = "verifyTheProductLink")
    public void viewDetailsElementPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Assert.assertEquals(Page.getText("ViewDetail_XPATH"),"VIEW DETAILS");
    }
    @Test(priority = 8,dependsOnMethods = "verifyTheProductLink")
    public void allSixProductPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Assert.assertEquals(Page.getText("MITCFUME_XPATH"),"MITC-FUME®");
    }
    @Test(priority = 9,dependsOnMethods = "verifyTheProductLink")
    public void sliderItemPresent() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp= ou.goProduct();
        Page.click("ProductSlider_XPATH");
        Assert.assertEquals(Page.getText("PoleTopper®_XPATH"),"MITC-FUME®");
    }
    @Test(priority = 10,dependsOnMethods = "verifyTheProductLink")
    public void verifyCategoryFilter(){
        HomeOU ou = new HomeOU();
        ProductPage pp = ou.goProduct();
        Assert.assertTrue(Page.isElementPresent(By.id("CategoryFilter_ID")));
    }
    @Test(priority = 11,dependsOnMethods = "verifyTheProductLink")
    public void VerifyFPImageClick() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickOnProductImage();
        Assert.assertEquals(Page.getText("FeaturedProductImage_CSS"),"Product Details:");
        Page.click("CloseButton_CSS");
    }
    @Test(priority = 12,dependsOnMethods = "verifyTheProductLink")
    public void verifyViewDetail() throws InterruptedException {
        HomeOU ou = new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickOnViewDetails("Productsimageclick_XPATH");
        Assert.assertEquals(Page.getText("ProductDetail_XPATH"),"Product Details:");
        Page.click("CloseButton_CSS");
    }

    @Test(dataProviderClass = Utilities.class,dataProvider ="dp",description = "Verify that User clicks on the Slider icon")
    public void verifyTheSearch(Hashtable<String,String> data) throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickSearch();
        Page.type("PSearch_ID",data.get("SearchItem"));
        Page.click("PSearchIcon_ID");
        Assert.assertEquals("","");
    }
    
    @Test(dataProviderClass = Utilities.class,dataProvider ="dp",description = "Verify that User clicks on the Slider icon and search for firstname Pole")
    public void verifyTheSearchFirstName(Hashtable<String,String> data) throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickSearch();
        Page.driver.findElement(By.id("searchInput")).clear();
        Page.type("PSearch_ID",data.get("SearchItem"));
        Page.driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
        Assert.assertEquals(Page.getText("PoleTopperProductSearch_LINKTEXT"),"Pole Topper®");
        Assert.assertEquals(Page.getText("SearcchResultPoleproductone_LINKTEXT"),"C-Truss");
        Assert.assertEquals(Page.getText("SearcchResultPoleproductTwo_LINKTEXT"),"Osmo-C2-Truss®");
        Assert.assertEquals(Page.getText("SearcchResultPoleproductThree_LINKTEXT"),"Dummy3 - C-Truss");
        Assert.assertEquals(Page.getText("SearcchResultPoleproductFour_LINKTEXT"),"Dummy4 - Osmo-C2-Truss®");       
        pp.ProductSearchFirstname();
    }
    
    @Test(dataProviderClass = Utilities.class,dataProvider ="dp",description = "Verify that User clicks on the Slider icon and search for full name Pole Restoration")
    public void verifyTheSearchFullName(Hashtable<String,String> data) throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickSearch();
        Page.driver.findElement(By.id("searchInput")).clear();
        Page.type("PSearch_ID",data.get("SearchItem"));
        Page.driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
        Assert.assertEquals(Page.getText("PoleTopperProductSearch_LINKTEXT"),"Pole Topper®");
        Assert.assertEquals(Page.getText("SearcchResultPoleproductone_LINKTEXT"),"C-Truss");
        Assert.assertEquals(Page.getText("SearcchResultPoleproductTwo_LINKTEXT"),"Osmo-C2-Truss®");
        Assert.assertEquals(Page.getText("SearcchResultPoleproductThree_LINKTEXT"),"Dummy3 - C-Truss");
        Assert.assertEquals(Page.getText("SearcchResultPoleproductFour_LINKTEXT"),"Dummy4 - Osmo-C2-Truss®");
        }
    
    @Test(dataProviderClass = Utilities.class,dataProvider ="dp",description = "Verify that User clicks on the Slider icon and search for One Alphabeted like H")
    public void verifyTheSearchOneAlphabet(Hashtable<String,String> data) throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickSearch();
        Page.driver.findElement(By.id("searchInput")).clear();
        Page.type("PSearch_ID",data.get("SearchItem"));
        Page.driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
        Assert.assertEquals(Page.getText("SearcchResultSingleAlphabet_LINKTEXT"),"MITC-FUME®");
        Assert.assertEquals(Page.getText("SearcchResultSingleAlphabet_LINKTEXT1"),"Dummy2 - MITC-FUME®");
        }
    
	/*
	 * @Test(dataProviderClass = Utilities.class,dataProvider ="dp",description =
	 * "Verify that User clicks on the Slider icon and Click on Crosss icon") public
	 * void verifyTheSearchCrossButton(Hashtable<String,String> data) throws
	 * InterruptedException { HomeOU ou= new HomeOU(); ProductPage pp =
	 * ou.goProduct(); pp.clickSearch();
	 * Page.driver.findElement(By.id("searchInput")).clear();
	 * Page.type("PSearch_ID",data.get("SearchItem")); Page.click(""); }
	 */
     
    @Test(priority = 13)
    public void VerifyProductClick() throws InterruptedException {
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
    
    @Test(priority = 14,enabled=false)
    public void AddQuantityAndVerifyCellNumber() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickOnProductImage();
        pp.AddQuantityInCart_AssertCellNumber();
        Assert.assertEquals(Page.getAttributeValue("SelectDropDownToolTip_XPATH","title"),"72-020-009-100 PR - C2-3611");
        Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"),"(770) 632-6700 Option 3");
        pp.switchToNewWindow(0);
        
    }
    
    
    
    @Test(priority = 16)
    public void FeaturedProductPoleRestoration() throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.ProductPoleRestoration();
        Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"),"(770) 632-6700 Option 3");
        Thread.sleep(100);
        pp.switchToparentWindow();
        Page.driver.navigate().back();
        pp.clickOnProductImage();
        System.out.println("second is clicked");
        pp.ProductPoleRestoration_1();
        Assert.assertEquals(Page.getText("FeaturedProductsCellNumber_XPATH"),"(770) 632-6700 Option 3");
        Thread.sleep(10);
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
    
}
