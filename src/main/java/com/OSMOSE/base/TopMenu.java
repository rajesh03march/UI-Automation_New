package com.OSMOSE.base;

import com.OSMOSE.pages.OU.HomeOU;
import org.openqa.selenium.WebDriver;



public class TopMenu{

	/*
	 * 
	 * TopMenu ISA Page ???
	 * 
	 * HomePage HASA TopMenu
	 * AccountsPAge HASA TopMenu
	 * 
	 * Page HASA TopMenu
	 * 
	 * 
	 */
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void gotoHome() {

	}

	public void gotoFeeds() {

	}

	public void gotoLeads() {

	}


	public HomeOU page(){
		return new HomeOU();
	}

	public void gotoContacts() {

	}
	
	
	public void signOut(){
		
		
	}

}
