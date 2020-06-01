package com.OSMOSE.pages.OU;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.OSMOSE.base.Page;



public class ProductPage extends Page {
    public void clickOnOU360(){
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
       click("PSearch_ID");
    }
    public void clickCatalogItem() throws InterruptedException {
        Thread.sleep(12000);
        click("CatalogItem_XPATH");
    }
    public void clickOnProductImage() throws InterruptedException {
        Thread.sleep(12000);
        click("HeadingProducts_LINKTEXT");
    }
    public void clickOnViewDetails(String locator) throws InterruptedException {
        Thread.sleep(12000);
        if(locator.equals("Productsimageclick_XPATH")) {
        click("ViewDetail_LINKTEXT");
        }else if(locator.equals("Productsimageclick2_XPATH"))
        {
        	click("ViewDetail_LINKTEXT");	
        }
    }

    public void clickOnProductFeatureImage() throws InterruptedException {
        Thread.sleep(12000);
        driver.navigate().back();
        click("Productsimageclick_XPATH");
           
    }
    
    public void AddQuantityInCart_AssertCellNumber() throws InterruptedException {
        Thread.sleep(12000);
        select("ProductSizeDropdown_XPATH","72-020-009-100 PR - C2-3611");
        type("ProductSizeEnterQuantity_XPATH", "8");
        click("ProductAddButton_XPATH");
        click("LinkProductDetail_LINKTEXT");
    }
    
   public void ProductPoleRestoration() throws InterruptedException {
	   click("ProductPoleRestoration_XPATH");
	   click("ProductPoleRestorationCTruss_XPATH");
	   selectbyindex("ProductSizeDropdown_XPATH",1);
       type("ProductSizeEnterQuantity_XPATH", "8");
       click("ProductAddButton_XPATH");
       click("LinkProductDetail_LINKTEXT");
   }
   public void ProductPoleRestoration_1() throws InterruptedException {
       click("ProductPoleRestoration_XPATH");
	   click("Productsimageclick3_XPATH");
	   Thread.sleep(30);
	   selectbyindex("ProductSizeDropdown_XPATH",1);
       type("ProductSizeEnterQuantity_XPATH", "8");
       click("ProductAddButton_XPATH");
       //click("LinkOsmoProductDetail_LINKTEXT");
   }
   
   public void ProductPoleRestoration_2() throws InterruptedException {
       click("ProductPoleRestoration_XPATH");
	   click("ProductPoleRestorationDummy3_XPATH");
	   Thread.sleep(30);
	   selectbyindex("ProductSizeDropdown_XPATH",1);
       type("ProductSizeEnterQuantity_XPATH", "8");
       click("ProductAddButton_XPATH");
       click("ProductPoleRestorationDummy3Link_XPATH");
   }
   
   public void ProductPoleRestoration_3() throws InterruptedException {
       click("ProductPoleRestoration_XPATH");
	   click("ProductPoleRestorationDummy4_XPATH");
	   Thread.sleep(50);
	   selectbyindex("ProductSizeDropdown_XPATH",1);
       type("ProductSizeEnterQuantity_XPATH", "8");
       click("ProductAddButton_XPATH");
       click("ProductPoleRestorationDummy4Link_XPATH");
   }
   }
   
   


