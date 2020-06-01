package com.OSMOSE.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

import com.OSMOSE.base.Page;

public class BaseTest {
	
	
	@AfterSuite
	public void tearDown(){
		
		Page.quit();
		
	}

}
