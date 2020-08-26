package com.OSMOSE.pages.OU;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.OSMOSE.base.Page;

public class KnowledgeBasePage extends Page {

	public void clickKBNavigation() throws InterruptedException {
		Thread.sleep(12000);
		click("KnowledgeBaseMenu_XPATH");
	}

	public void clickKBCard() throws InterruptedException {
		Thread.sleep(12000);
		click("KBCard_XPATH");
	}
	
	public void ClickPopularQueriesFilter() {
		click("PopularQueriesFilter_XPATH");
	}

	public void clickSliderIcon() {
		click("SuggestedContentsSlider_XPATH");
	}

	public void clickItemSuggestedContents() {
		click("SliderItem_XPATH");
	}

	public void clickBoxCloseBtn() {
		click("BoxCloseBtn_XPATH");
	}

	public void clickVideoFeaturedVideo() {
		click("FeaturedVideoMovie_XPATH");
	}

	public void clickViewProject() {
		click("ViewProjectLink_XPATH");
	}

	public void clickIndustrySeeMore() throws InterruptedException {
		Thread.sleep(12000);
		ClickActions("IndustrySeeMoreLink_XPATH");
	}

	public void clickIndustryBackbtn() throws InterruptedException {
		Thread.sleep(12000);
		click("IndustryBACKbtn_XPATH");
	}
	
	public void clickDailyGaffGallery() {
		click("DailyGaffGallery_XPATH");
	}
	
	public void clickDailyGaffGalleryImage() {
		click("DailyGaffGalleryImage_XPATH");
	}
	
	public void clickDailyGaffGalleryBackbtn() throws InterruptedException {
		ClickActions("DailyGaffGalleryImagesBackBtn_XPATH");
	}

}
