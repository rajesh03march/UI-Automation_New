package com.OSMOSE.pages.OU;

import com.OSMOSE.base.Page;
import org.openqa.selenium.By;


public class Login extends Page {


	public void doLogin(String username, String password) throws InterruptedException {
		Thread.sleep(12000);
		type("email_XPATH", username);
		type("password_XPATH", password);
		click("submit_XPATH");
	}
	
	public HomeOU goHomeOU() {
		return new HomeOU();
	}


}
