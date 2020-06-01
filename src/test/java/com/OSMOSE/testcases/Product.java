package com.OSMOSE.testcases;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.HomeOU;
import com.OSMOSE.pages.OU.ProductPage;
import com.OSMOSE.utilities.Utilities;
import org.openqa.selenium.By;
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
    @Test(description = "Verify that User clicks on the Product Cart", priority = 1, enabled = false)
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
        pp.clickOnViewDetails();
        Assert.assertEquals(Page.getText("ProductDetail_XPATH"),"Product Details:");
        Page.click("CloseButton_CSS");
    }





    @Test(dataProviderClass = Utilities.class,dataProvider ="dp",description = "Verify that User clicks on the Slider icon")
    public void verifyTheSearchWithCategoryName(Hashtable<String,String> data) throws InterruptedException {
        HomeOU ou= new HomeOU();
        ProductPage pp = ou.goProduct();
        pp.clickSearch();
        Page.driver.findElement(By.xpath("")).clear();
        Page.type("Barrier Protection",data.get("SearchItem"));
        Page.clickEnter("Barrier Protection");
        Assert.assertEquals(Page.getText("//*[@id=\"productSlider\"]/div[1]/div[1]/div/h3"),"Fire Protection");
        Assert.assertEquals(Page.getText("//*[@id=\"productSlider\"]/div[2]/div[1]/div/h3"),"Pole Top Protection");
    }




}
