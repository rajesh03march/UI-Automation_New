package com.OSMOSE.pages.OU;

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
        click("FeaturedProductImage_CSS");
    }
    public void clickOnViewDetails() throws InterruptedException {
        Thread.sleep(12000);
        click("ViewDetail_LINKTEXT");
    }




}
