package com.OSMOSE.pages.OU;

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

	public void clickSliderIcon() {
		click("SuggestedContentsSlider_XPATH");
	}

	public void clickItemSuggestedContents() {
		click("SliderItem_XPATH");
	}

	public void clickBoxCloseBtn() {
		click("SliderItemCloseBtn_XPATH");
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

}
