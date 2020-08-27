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
	
	public void clickJointUs() throws InterruptedException {
		click("JointUseCardKb_XPATH");
	}
	
	public void clickOverhead() throws InterruptedException {
		click("OverheadCard_XPATH");
	}
	
	public void clickPoleReplacement() throws InterruptedException {
		click("PoleReplacementCard_XPATH");
	}
	
	public void clickProducts() throws InterruptedException {
		click("ProductsCardKb_XPATH");
	}
	
	public void clickStormSupport() throws InterruptedException {
		click("StormSupportCard_XPATH");
	}
	
	public void clickUnderground() throws InterruptedException {
		click("UndergroundCardKb_XPATH");
	}
	
	public void clickSteelAndConcreteAssessment() throws InterruptedException {
		click("SteelAndConcreteAssessmentCardKb_XPATH");
	}
	
	public void clickSteelAndConcreteRestortation() throws InterruptedException {
		click("SteelAndConcreteRestortationCard_XPATH");
	}
	
	public void clickWoodInspection() throws InterruptedException {
		click("WoodInspectionCard_XPATH");
	}
	
	public void clickWoodRestoration() throws InterruptedException {
		click("WoodRestorationCardKb_XPATH");
	}
	
	public void clickClearSearch() throws InterruptedException {
		click("ClearSearchBtn_XPATH");
	}
	
	public void clickJointUseImages() {
		click("JointUseImages_XPATH");
	}
	
	public void clickJointUseVideos() {
		click("JointUseVideos_XPATH");
	}
	
	public void clickJointUseArticles() {
		click("JointUseArticles_XPATH");
	}
	
	public void clickOverheadVideos() {
		click("OverheadVideos_XPATH");
	}
	
	public void clickOverheadImages() {
		click("OverheadImages_XPATH");
	}
	
	public void clickOverheadProjectProfiles() {
		click("OverheadProjectProfiles_XPATH");
	}
	
	public void clickPoleReplacementImages() {
		click("PoleReplacementImages_XPATH");
	}
	
	public void clickPoleReplacementVideos() {
		click("PoleReplacementVideos_XPATH");
	}
	
	public void clickPoleReplacementBrochure() {
		click("PoleReplacementBrochure_XPATH");
	}
	
	public void clickProductsImages() {
		click("ProductsImages_XPATH");
	}
	
	public void clickProductsVideos() {
		click("ProductsVideos_XPATH");
	}
	
	public void clickProductsProductCatalog() {
		click("ProductsProductCatalog_XPATH");
	}
	
	public void clickSteelandConcreteAssessmentImages() {
		click("SteelAndConcreteAssessmentCardimageslink_XPATH");
	}
	
	public void clickSteelandConcreteAssessmentBrochures() {
		click("SteelAndConcreteAssessmentCardBrochureslink_XPATH");
	}
	
	public void clickSteelandConcreteAssessmentStandards_Codes() {
		click("SteelAndConcreteAssessmentCardStandardsCodeslink_XPATH");
	}
	
	public void clickSteelandConcreteRestorationArticles() {
		click("SteelAndConcreteRestortationtArticleslink_XPATH");
	}
	
	public void clickSteelandConcreteRestorationBrochures() {
		click("SteelAndConcreteRestortationBrochureslink_XPATH");
	}
	
	public void clickSteelandConcreteRestorationImages() {
		click("SteelAndConcreteRestortationImageslink_XPATH");
	}
	
	public void clickStormSupportImages() {
		click("StormSupportImages_XPATH");
	}
	
	public void clickStormSupportVideos() {
		click("StormSupportVideos_XPATH");
	}
	
	public void clickStormSupportProjectProfiles() {
		click("StormSupportProjectProfiles_XPATH");
	}
	
	public void clickUndergroundImages() {
		click("UndergroundImages_XPATH");
	}
	
	public void clickUndergroundBrochure() {
		click("UndergroundBrochure_XPATH");
	}
	
	public void clickUndergroundDiagram() {
		click("UndergroundDiagram_XPATH");
	}
	
	public void clickWoodRestorationVideos() {
		click("WoodRestorationVideos_XPATH");
	}
	
	public void clickWoodRestorationBrochures() {
		click("WoodRestorationBrochuers_XPATH");
	}
	
	public void clickWoodRestorationArticles() {
		click("WoodRestorationArticles_XPATH");
	}
	
	public void clickWoodTreatmentVideos() {
		click("WoodInspectionVideos_XPATH");
	}
	
	public void clickWoodTreatmentImages() {
		click("WoodInspectionImages_XPATH");
	}
	
	public void clickWoodTreatmentResearch() {
		click("WoodInspectionResearch_XPATH");
	}
	
	public void clickJointUseOnAnImage() {
		click("DailyGaffGalleryImage_XPATH");
	}
	
	public void clickJointUseImagesBackbtn() throws InterruptedException {
		ClickActions("DailyGaffGalleryImagesBackBtn_XPATH");
	}
	
	
    public OsmoseServicesPage goOsmoseServices(){
        return new OsmoseServicesPage();
    }

}
