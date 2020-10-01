package com.OSMOSE.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.HomeOU;
import com.OSMOSE.pages.OU.Login;
import com.OSMOSE.utilities.Utilities;

public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 0, description = "Verify the login functionality")
	public void loginTest(Hashtable<String, String> data) throws InterruptedException {
		Login lo = new Login();
		lo.doLogin(data.get("username"), data.get("password"));
		String element = Page.getText("verify_ID");
		Assert.assertEquals(element, "Varun M R");
	}

}
