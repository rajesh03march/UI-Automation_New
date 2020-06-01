package com.OSMOSE.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rough {
    public static void main(String[] arg) throws InterruptedException{


        WebDriver driver = null;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ac42939\\Desktop\\Mobil Automation\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://osmose360cl.azurewebsites.net/");
//        System.out.println("Current url : " + driver.getCurrentUrl());
//        System.out.println("Title : " + driver.getTitle());
        //WebDriverWait wait = new WebDriverWait(driver, 20);
        Thread.sleep(10000);
        System.out.println("Current url : " + driver.getCurrentUrl());
        System.out.println("Title : " + driver.getTitle());
        System.out.println("Thread awake");
//        Thread.sleep(120000);
//        System.out.println("Current url 2: " + driver.getCurrentUrl());
//        System.out.println("Title 2: " + driver.getTitle());
//        System.out.println("Thread awake 2");
        driver.findElement(By.xpath("//*[@id=\"logonIdentifier\"]")).sendKeys("rajesh.yadav@centurylink.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hyde@2317");
        driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"project-tabs\"]/div[1]/div/a/img")).click();
        //Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"btnLiveEvent\"]")).click();
        Thread.sleep(10000);
      driver.switchTo().frame(0);
      driver.findElement(By.xpath("/html/body/section/div/div/div/p[12]/a")).click();

        //WebElement Element = driver.findElement(By.xpath("//*[@id=\"a100005_l100003_e100031_first_name\"));
                //js.executeScript("arguments[0].scrollIntoView();",element);

      String s = driver.findElement(By.xpath("//*[@id=\"a100005_l100003_e100031_first_name\"]")).getText();
      System.out.println(s);
//        String value = webEle.getText();
//        System.out.println("Get Text : " + value + " \ntag name :" + webEle.getTagName());
//        driver.findElement(By.id("logonIdentifier")).sendKeys("rajesh.yadav@centurylink.com");
//        driver.findElement(By.id("password")).sendKeys("Hyde@2317");
//        driver.findElement(By.id("next")).click();
//        driver.quit();

    }
}
