package com.OSMOSE.pages.OU;

import com.OSMOSE.base.Page;
import org.openqa.selenium.By;


public class Login extends Page {


   public DoLogin doLogin(String Username, String Password){
       driver.findElement(By.id("logonIdentifier")).sendKeys(Username);
       driver.findElement(By.id("password")).sendKeys(Password);
       driver.findElement(By.id("next")).click();
       return new DoLogin();

   }


}
