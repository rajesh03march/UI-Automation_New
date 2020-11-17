package com.OSMOSE.pages.OU;


import com.OSMOSE.base.Page;

public class KnowledgeBasePage extends Page {
	
	Page p = new Page();

	public void clickKBNavigation() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread12000"))));
		click("KnowledgeBaseMenu_XPATH");
	}

	public void clickKBCard() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread12000"))));
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
		ClickActions("FeaturedVideoMovie_XPATH");
	}

	public void clickViewProject() {
		ClickActions("ViewProjectLink_XPATH");
	}

	public void clickIndustrySeeMore() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread12000"))));
		ClickActions("IndustrySeeMoreLink_XPATH");
	}

	public void clickIndustryBackbtn() throws InterruptedException {
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread12000"))));
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
		ClickActions("JointUseCardKb_XPATH");
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
		ClickActions("JointUsImagesImageClick_XPATH");
	}
	
	public void clickJointUseOnAVideo() {
		ClickActions("JointUsVideosVideoClick_XPATH");
	}
	
	public void clickJointUseImagesBackbtn() throws InterruptedException {
		ClickActions("DailyGaffGalleryImagesBackBtn_XPATH");
	}
	
	public void clickJointUseVideosBackbtn() throws InterruptedException {
		ClickActions("JointUseVideosBackBtn_XPATH");
	}
	
	public void clickOverheadOnAVideo() {
		ClickActions("OverheadVideosVideoClick_XPATH");
	}
	
	public void clickOverheadVideosBackbtn() throws InterruptedException {
		ClickActions("OverheadVideosBackBtn_XPATH");
	}
	
	public void clickOverheadOnAnImage() {
		ClickActions("OverheadImagesImage_XPATH");
	}
	
	public void clickOverheadImagesBackbtn() throws InterruptedException {
		ClickActions("OverheadImagesBackBtn_XPATH");
	}
	
	public void clickOverheadOnADocument() {
		ClickActions("OverheadDocumentsDocument_XPATH");
	}
	
	public void clickOverheadProjectProfilesBackbtn() throws InterruptedException {
		ClickActions("OverheadDocumentBackBtn_XPATH");
	}
	
	public void clickPoleReplacementOnAnImage() {
		ClickActions("PoleReplacementImagesImage_XPATH");
	}
	
	public void clickPoleReplacementImagesBackbtn() throws InterruptedException {
		ClickActions("PoleReplacementImagesBackBtn_XPATH");
	}
	
	public void clickPoleReplacementOnAVideo() {
		ClickActions("PoleReplacementVideosVideoClick_XPATH");
	}
	
	public void clickPoleReplacementVideosBackbtn() throws InterruptedException {
		ClickActions("PoleReplacementVideosBackBtn_XPATH");
	}
	
	public void clickPoleReplacementOnADocument() {
		ClickActions("PoleReplacementBrochureclick_XPATH");
	}
	
	public void clickPoleReplacementBrochureBackbtn() throws InterruptedException {
		ClickActions("PoleReplacementBrochureBackBtn_XPATH");
	}
	
	public void clickProductsOnAnImage() {
		ClickActions("ProductsImagesImage_XPATH");
	}
	
	public void clickProductsImagesBackbtn() throws InterruptedException {
		ClickActions("ProductsImagesBackBtn_XPATH");
	}
	
	public void clickProductsOnAVideo() {
		ClickActions("ProductsVideosVideoClick_XPATH");
	}
	
	public void clickProductsVideosBackbtn() throws InterruptedException {
		ClickActions("ProductsVideosBackBtn_XPATH");
	}
	
	public void clickProductsOnADocument() {
		ClickActions("ProductsProductCatalogclick_XPATH");
	}
	
	public void clickProductsProductCatalogBackbtn() throws InterruptedException {
		ClickActions("ProductsProductCatalogBackBtn_XPATH");
	}
	
	public void clickSteelAndConcreteAssessmentOnAnImage() {
		ClickActions("SteelAndConcreteAssessmentImagesImage_XPATH");
	}
	
	public void clickSteelAndConcreteAssessmentImagesBackbtn() throws InterruptedException {
		ClickActions("SteelAndConcreteAssessmentImagesBackBtn_XPATH");
	}
	
	public void clickSteelAndConcreteRestorationOnAnImage() {
		ClickActions("SteelAndConcreteRestorationImagesImage_XPATH");
	}
	
	public void clickSteelAndConcreteRestorationImagesBackbtn() throws InterruptedException {
		ClickActions("SteelAndConcreteRestorationImagesBackBtn_XPATH");
	}
	
	public void clickStormSupportOnAnImage() {
		ClickActions("StormSupportImagesImage_XPATH");
	}
	
	public void clickStormSupportImagesBackbtn() throws InterruptedException {
		ClickActions("StormSupportImagesBackBtn_XPATH");
	}
	
	public void clickStormSupportOnAVideo() {
		ClickActions("StormSupportVideosVideoClick_XPATH");
	}
	
	public void clickStormSupportVideosBackbtn() throws InterruptedException {
		ClickActions("StormSupportVideosBackBtn_XPATH");
	}
	
	public void clickStormSupportonADocument() {
		ClickActions("StormSupportProjectProfilesDocument_XPATH");
	}
	
	public void clickStormSupportProjectProfilesBackbtn() throws InterruptedException {
		ClickActions("StormSupportProjectProfilesBackBtn_XPATH");
	}
	
	public void clickUndergroundOnAnImage() {
		ClickActions("UndergroundImagesImage_XPATH");
	}
	
	public void clickUndergroundImagesBackbtn() throws InterruptedException {
		ClickActions("UndergroundImagesBackBtn_XPATH");
	}
	
	public void clickUndergroundADocument() {
		ClickActions("UndergroundBrochureDocument_XPATH");
	}
	
	public void clickUndergroundBrochureBackbtn() throws InterruptedException {
		ClickActions("UndergroundBrochureBackBtn_XPATH");
	}
	
	public void clickUndergroundADiagramDocument() {
		ClickActions("UndergroundDiagramDocument_XPATH");
	}
	
	public void clickUndergroundDiagramBackbtn() throws InterruptedException {
		ClickActions("UndergroundDiagramBackBtn_XPATH");
	}
	
	public void clickWoodRestorationOnAVideo() {
		ClickActions("WoodRestorationVideosVideoClick_XPATH");
	}
	
	public void clickWoodRestorationVideosBackbtn() throws InterruptedException {
		ClickActions("WoodRestorationVideosBackBtn_XPATH");
	}
	
	public void clickWoodTreatmentOnAVideo() {
		ClickActions("WoodTreatmentVideosVideoClick_XPATH");
	}
	
	public void clickWoodTreatmentVideosBackbtn() throws InterruptedException {
		ClickActions("WoodTreatmentVideosBackBtn_XPATH");
	}
	
	public void clickWoodTreatmentOnAnImage() {
		ClickActions("WoodTreatmentImagesImage_XPATH");
	}
	
	public void clickWoodTreatmentImagesBackbtn() throws InterruptedException {
		ClickActions("WoodTreatmentImagesBackBtn_XPATH");
	}
	
	public void clickWoodTreatmentOnADocument() {
		ClickActions("WoodTreatmentResearchDocument_XPATH");
	}
	
	public void clickWoodTreatmentResearchBackbtn() throws InterruptedException {
		ClickActions("WoodTreatmentResearchBackBtn_XPATH");
	}
	
	public void clickJointUsePopularQuery() {
		click("JointUseFilter_XPATH");
	}
	
	public void clickPoleReplacementPopularQuery() {
		click("PoleReplacementFilter_XPATH");
	}

	
    public OsmoseServicesPage goOsmoseServices(){
        return new OsmoseServicesPage();
    }

}
