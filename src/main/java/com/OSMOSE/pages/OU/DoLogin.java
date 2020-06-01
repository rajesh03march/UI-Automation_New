package com.OSMOSE.pages.OU;

import com.OSMOSE.base.Page;

public class DoLogin extends Page {

    public OU clickOnTheOULink(){

        return new OU();
    }

    public void clickOULink(){
    click("OUlink_XPATH");
    }

}
