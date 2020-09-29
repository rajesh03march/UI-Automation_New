package com.OSMOSE.pages.OU;

import com.OSMOSE.base.Page;


public class Login extends Page {


	public void doLogin(String username, String password) throws InterruptedException {
		Thread.sleep((Long.parseLong(config.getProperty("Thread12000"))));
		type("email_XPATH", username);
		type("password_XPATH", password);
		click("submit_XPATH");
	}
	
	public HomeOU goHomeOU() {
		return new HomeOU();
	}


}
