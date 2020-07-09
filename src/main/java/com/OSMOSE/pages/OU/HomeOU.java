package com.OSMOSE.pages.OU;

import com.OSMOSE.base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeOU extends Page {


    public DoLogin doLogin(String username, String password) throws InterruptedException {
        Thread.sleep(12000);
        type("email_XPATH",username);
        type("password_XPATH",password);
        click("submit_XPATH");
        return new DoLogin();
    }
    public void clickOULink() throws InterruptedException {
        Thread.sleep(12000);
        click("OUCard_XPATH");
    }
    public void clickOnLiveEventsSTS() throws InterruptedException {
        Thread.sleep(12000);
        click("LiveEvent_XPATH");
        iFrames(0);
    }

    public void clickOnLiveEventsJUS() throws InterruptedException {
        Thread.sleep(12000);
        Page.driver.switchTo().defaultContent();
        click("LiveEvent_XPATH");
        iFrames(0);
    }

    public void clickOnLiveEventsWPTS() throws InterruptedException {
        Thread.sleep(12000);
        Page.driver.switchTo().defaultContent();
        click("LiveEvent_XPATH");
        iFrames(0);
    }

    public void clickOnSTSDetailsAndRegistration() throws InterruptedException {
        Thread.sleep(12000);
        click("DETAILSANDREGISTRATION_XPATH");
    }

    public void clickWebinars() throws InterruptedException {
        Thread.sleep(12000);
        Page.driver.switchTo().defaultContent();
        ClickActions("WEBINAR_XPATH");
    }
    public void selectUpcoming() throws InterruptedException {
        Thread.sleep(12000);
        click("UPCOMING_XPATH");
        iFrames(1);
    }
    public void steelStructuresProtected() throws InterruptedException {
        Thread.sleep(12000);
//        Page.driver.switchTo().defaultContent();
//        click("WEBINAR_XPATH");
//        click("UPCOMING_XPATH");
        iFrames(1);
    }
    public void steelStructuresProtectedMOREINFOREGISTRATION() throws InterruptedException {
        Thread.sleep(12000);
        click("MOREINFO&REGISTRATION_LINKTEXT");
    }
    public void ContactAndStrayMOREINFOREGISTRATION() throws InterruptedException {
        Thread.sleep(12000);
        click("CSMOREINFO&REGISTRATION_LINKTEXT");
    }
    public void ContactAndStray()throws InterruptedException {
        Thread.sleep(12000);

    }
    public void OCALCTRAINING() throws InterruptedException {
        Thread.sleep(12000);
        Page.driver.switchTo().defaultContent();
        click("O-CALCTRAINING_XPATH");
        Page.iFrames(2);

    }
    public void clickLiveEventLink() throws InterruptedException {
        Thread.sleep(12000);
        click("OUCartliveeventlink_XPATH");
    }
    public void clickWebinarLink() throws InterruptedException {
        Thread.sleep(12000);
        click("OUCartWebinarLink_XPATH");
    }
    public void clickOCalcLInk() throws InterruptedException {
        Thread.sleep(12000);
        click("OUCartOcalcLink_XPATH");
    }



    public ProductPage goProduct(){
        return new ProductPage();
    }


}
