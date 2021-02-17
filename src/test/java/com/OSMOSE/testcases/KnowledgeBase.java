package com.OSMOSE.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.ContactPage;
import com.OSMOSE.pages.OU.KnowledgeBasePage;
import com.OSMOSE.utilities.Utilities;

public class KnowledgeBase extends BaseTest {

	Page p = new Page();

	// US-98498-98570-Verify that Users will be able to access to KB Landing Page on
	// clicking the top tier menu item 'Knowledge Base'.
	@Test(priority = 1, enabled = true, description = "Verify the click on Knowledge Base menu and card Navigation")
	public void verifyKnowledgeBaseNavigationClick() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		kb.clickKBNavigation();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(Page.getText("KnowledgeBaseFirstHeaderTxt_XPATH"), "Knowledge Base");
		Assert.assertEquals(Page.getText("KnowledgeBaseSecondHeaderTxt_XPATH"), "How can we help?");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Page.click("KBHomePage_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		kb.clickKBCard();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		Assert.assertEquals(Page.getText("KnowledgeBaseFirstHeaderTxt_XPATH"), "Knowledge Base");
		Assert.assertEquals(Page.getText("KnowledgeBaseSecondHeaderTxt_XPATH"), "How can we help?");
	}

	// US-98498-98572-Verify that KB Landing page have a Search Bar with the option
	// to choose between 'All', 'Videos','Images, and 'Documents" as search category
	// filter.
	@Test(priority = 2, enabled = false, description = "Verify the links present on Home Page")
	public void verifyLinksPresentOnKb() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Verification of the links displayed on top of the Search Box
		Assert.assertEquals(Page.getText("AllLink_XPATH"), "All");
		Assert.assertEquals(Page.getText("ImagesLink_XPATH"), "Images");
		Assert.assertEquals(Page.getText("VideosLink_XPATH"), "Videos");
		Assert.assertEquals(Page.getText("DocumentsLink_XPATH"), "Documents");
	}

	// US-98498-98572-Verify that KB Landing page have a Search Bar with the option
	// to choose between 'All', 'Videos','Images, and 'Documents" as search category
	// filter.
	// US-98498-98573-Verify that the Search bar display verbiage "Ask Osmose" When
	// the Ask Osmose Search Bar is loaded onto the screen.
	// US-98498-98574-Verify that bar display verbiage "Ask Osmose" when the Ask
	// Osmose Search Bar is loaded onto the screen
	@Test(priority = 3, enabled = false, description = "Verify the presence of Search Box")
	public void verifyPresenceOfSearchBox() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Search box presence verification
		Assert.assertTrue(Page.isVisible("SearchBox_XPATH"));
		String Placeholder = Page.getAttributeValue("SearchBox_XPATH", "placeholder");
		Assert.assertEquals(Placeholder, "Ask Osmose");
	}

	// US-98498-98572-Verify that KB Landing page have a Search Bar with the option
	// to choose between 'All', 'Videos','Images, and 'Documents" as search category
	// filter.
	@Test(priority = 4, enabled = false, description = "Verify the presence of Popular Queries Filter")
	public void verifyPresenceOfPopularQueriesFilter() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Popular Queries Filter presence verification
		Assert.assertTrue(Page.isVisible("PopularQueriesFilter_XPATH"));
	}

	// US-98498-98572-Verify that KB Landing page have a Search Bar with the option
	// to choose between 'All', 'Videos','Images, and 'Documents" as search category
	// filter.
	// US-98503-98671-Verify layout and font of Popular queries section under search
	// bar in KB Landing page
	@Test(priority = 5, enabled = false, description = "Verify the presence of Filter items")
	public void verifyPresenceOfFilterItems() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Filter items presence verification
		Assert.assertTrue(Page.isVisible("PopularfilterCard_XPATH"));
		Assert.assertTrue(Page.isVisible("JointUseFilter_XPATH"));
		Assert.assertEquals(Page.getText("JointUseFilter_XPATH"), "Joint Use");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		kb.ClickPopularQueriesFilter();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertFalse(Page.findelement("PopularfilterCard_XPATH").isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 6, enabled = false, description = "Verify the presence of Steel And Concrete Assessment")
	public void verifyPresenceSteelAndConcreteAssessmentCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Steel and Concrete Assessment card presence verification
		Assert.assertTrue(Page.isVisible("SteelAndConcreteAssessmentCardKb_XPATH"));
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 7, enabled = false, description = "Verify the presence of Steel And Concrete Restoration")
	public void verifyPresenceSteelAndConcreteRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Steel and Concrete Restoration card presence verification
		Assert.assertTrue(Page.isVisible("SteelAndConcreteRestortationCard_XPATH"));
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 8, enabled = false, description = "Verify the presence of Wood Inspection And Treatment Card")
	public void verifyPresenceWoodInspectionAndTreatmentCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Wood Inspection And Treatment card presence verification
		Assert.assertTrue(Page.isVisible("WoodInspectionCard_XPATH"));
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 9, enabled = false, description = "Verify the presence of Wood Restoration Card")
	public void verifyPresenceWoodRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Wood Restoration Card presence verification
		Assert.assertTrue(Page.isVisible("WoodRestorationCardKb_XPATH"));
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 10, enabled = false, description = "Verify the presence of  Underground")
	public void verifyPresenceUndergroundCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Underground card presence verification
		Assert.assertTrue(Page.isVisible("UndergroundCardKb_XPATH"));
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 11, enabled = false, description = "Verify the presence of Overhead")
	public void verifyPresenceOverheadCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Overhead card presence verification
		Assert.assertTrue(Page.isVisible("OverheadCardKB_XPATH"));
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 12, enabled = false, description = "Verify the presence of Joint Use")
	public void verifyPresenceJointUseCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Joint Use card presence verification
		Assert.assertTrue(Page.isVisible("JointUseCardKb_XPATH"));
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 13, enabled = false, description = "Verify the presence of Pole Replacement")
	public void verifyPresencePoleReplacementCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Pole Replacement card presence verification
		Assert.assertTrue(Page.isVisible("PoleReplacementCard_XPATH"));
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 14, enabled = false, description = "Verify the presence of Storm Support")
	public void verifyPresenceStormSupportCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Storm Support card presence verification
		Assert.assertTrue(Page.isVisible("StormSupportCard_XPATH"));
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 15, enabled = false, description = "Verify the presence of Products")
	public void verifyPresenceProductsCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Products card presence verification
		Assert.assertTrue(Page.isVisible("ProductsCardKb_XPATH"));
	}

	// Keep this false always
	// US-98498-98739-Verify tiles related to News Feed section
	// US-98508-98701-Verify Industry News layout and UI in KB landing
	// US-98508-98702-Verify the number of items displayed in the Industry News tile
	@Test(priority = 16, enabled = false, description = "Verify the presence of Industry News Card")
	public void verifyPresenceIndustryNewsCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Industry Card presence verification
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//*[@id='contentPart0']/div/div/div/div/div[2]/div[1]/div[1]/div/h5"))
						.isDisplayed());
		// Verification of See more link
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[@id='contentPart0']/div/div/div/div/div[2]/div[1]/div[2]/div[4]/a"))
				.isDisplayed());
		// Verification of First section of the news
		Assert.assertTrue(Page.driver.findElement(By.xpath("//div[@class='cardMain']/div[1]/div[1]")).isDisplayed());
		// Verification of Second section of the news
		Assert.assertTrue(Page.driver.findElement(By.xpath("//div[@class='cardMain']/div[2]/div[1]")).isDisplayed());
		// Verification of Third section of the news
		Assert.assertTrue(Page.driver.findElement(By.xpath("//div[@class='cardMain']/div[3]/div[1]")).isDisplayed());
	}

	// US-98498-98740-Verify tiles related to O-Calc Pro
	// US-98500-99009-Verify  O-Calc Pro section in the KB landing page
	@Test(priority = 17, enabled = false, description = "Verify the presence of O-Calc Pro Card")
	public void verifyPresenceOCalcProCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// O-Calc Pro Card presence verification
		Assert.assertTrue(Page.isVisible("OcalProCard_XPATH"));
	}

	// US-98498-98738-Verify tiles related to Project of the Week
	// US-98500-98668-Verify KB Landing page will have a tile titled "Featured
	// Project"(Project of the Week)
	@Test(priority = 18, enabled = false, description = "Verify the presence of Project of the week Card")
	public void verifyPresenceProjectOfTheWeekCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Project of the week Card presence verification
		Assert.assertTrue(Page.isVisible("ProjectOfTheWeekCard_XPATH"));
		Assert.assertTrue(Page.isVisible("ProjectOfTheWeekViewProjectLnk_XPATH"));
	}

	// US-98500-98610-Verify that KB Landing page will have a "Gaff Gallery"
	// section which links to a dedicated Gallery Page.
	@Test(priority = 19, enabled = false, description = "Verify the presence of What's wrong with this Picture? Card")
	public void verifyPresenceWhatswrongwiththisPictureCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// What's wrong with this Picture? Card presence verification
		Assert.assertTrue(Page.isVisible("DailyGaffGalleryTxt_XPATH"));
	}

	// US-98500-99007-Verify KB Landing page is displaying carousel Video section
	@Test(priority = 20, enabled = false, description = "Verify the presence of Featured Videos Card")
	public void verifyPresenceFeaturedVideosCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Featured Videos Card presence verification
		Assert.assertTrue(Page.isVisible("FeaturedVideosCard_XPATH"));
	}

	// US 98500-98612-Verify that KB landing page will also display a section for
	// Suggested Content, which will contain links to assets that should be
	// suggested on the landing page.
	// US-98500-99005-Verify KB Landing page is displaying suggested content section
	@Test(priority = 21, enabled = false, description = "Verify the presence of Suggested Contents Card")
	public void verifyPresenceSuggestedContentsCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Suggested Contents Card presence verification
		Assert.assertTrue(Page.isVisible("SuggestedContentCard_XPATH"));
	}

	// US-98500-99009-Verify  O-Calc Pro section in the KB landing page
	@Test(priority = 22, enabled = true, description = "Verify the presence of Buttons on Oclac Pro Card")
	public void verifyPresenceOfOcalCproButtons() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// verification of the presence of buttons and text
		Assert.assertTrue(Page.isVisible("KB_RequestLiveDemo_XPATH"));
		Assert.assertEquals(Page.getText("KB_RequestLiveDemo_XPATH"), "REQUEST A LIVE DEMO");
		Assert.assertTrue(Page.isVisible("TrainingScheduleBtn_XPATH"));
		Assert.assertEquals(Page.getText("TrainingScheduleBtn_XPATH"), "TRAINING SCHEDULE");
		Assert.assertTrue(Page.isVisible("BrochureBtn_XPATH"));
		Assert.assertEquals(Page.getText("BrochureBtn_XPATH"), "BROCHURE");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		String OcalProCard_Txt = Page.getText("OcalProCardTxt_XPATH");
		Assert.assertEquals(OcalProCard_Txt, "Structural Analysis Software for Utility Poles");

	}

	// US 98500-98612-Verify that KB landing page will also display a section for
	// Suggested Content, which will contain links to assets that should be
	// suggested on the landing page.
	// US-98500-99005-Verify KB Landing page is displaying suggested content section
	@Test(priority = 23, enabled = false, description = "Verify the presence of slider on Suggested Contents")
	public void verifyPresenceOfSliderOnSuggestedContents() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// verification of the presence of Items
		Assert.assertTrue(Page.isVisible("SuggestedContentsSlider_XPATH"));
		Page.click("SuggestedContentsSlider_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		String suggestedContentsToolTip = Page.getAttributeValue("SuggestedContentToolTip_XPATH", "title");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		Assert.assertEquals(suggestedContentsToolTip, "Osmose Bulletin");
	}

	// US 98500-98612-Verify that KB landing page will also display a section for
	// Suggested Content, which will contain links to assets that should be
	// suggested on the landing page.
	// US-98500-99005-Verify KB Landing page is displaying suggested content section
	// US-98500-99006-Verify System is opening the content in Box Content display
	// when user clicked on any item from suggested content
	@Test(priority = 24, enabled = false, description = "Verify the click on item in Suggested Contents")
	public void verifyClickOnItemSuggestedContents() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// verification of the presence of items
		// Assert.assertTrue(Page.driver.findElement(By.xpath("//button[@class='slick-next
		// slick-arrow']")).isDisplayed());
		// kb.clickSliderIcon();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		kb.clickItemSuggestedContents();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// verification of cross/close icon
		Assert.assertTrue(Page.isVisible("BoxCloseBtn_XPATH"));
		kb.clickBoxCloseBtn();
	}

	// US-98500-99008-Verify System is opening the Featured Video in Box content
	// when user clicks on video thumbnail
	@Test(priority = 25, enabled = false, description = "Verify the click on item in Featured Videos")
	public void verifyClickOnItemFeaturedVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		kb.clickVideoFeaturedVideo();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// verification of cross/close icon
		Assert.assertTrue(Page.isVisible("BoxCloseBtn_XPATH"));
		kb.clickBoxCloseBtn();
	}

	// US-98500-98668-Verify KB Landing page will have a tile titled "Featured
	// Project"(Project of the Week)
	@Test(priority = 26, enabled = false, description = "Verify the click on View Project on Project of the week")
	public void verifyClickOnViewProjectProjectOfTheWeek() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		kb.clickViewProject();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// verification of cross/close icon
		Assert.assertTrue(Page.isVisible("BoxCloseBtn_XPATH"));
		kb.clickBoxCloseBtn();
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 27, enabled = false, description = "Verify the Card Contents of Steel Concrete Assessment")
	public void verifyCardContentsSteelConcreteAssessment() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Steel Concrete Assessment
		Assert.assertTrue(Page.isVisible("SteelAndConcreteAssessmentCardimageslink_XPATH"));
		Assert.assertEquals(Page.getText("SteelAndConcreteAssessmentCardimageslink_XPATH"), "IMAGES");
		Assert.assertTrue(Page.isVisible("SteelAndConcreteAssessmentCardBrochureslink_XPATH"));
		Assert.assertEquals(Page.getText("SteelAndConcreteAssessmentCardBrochureslink_XPATH"), "BROCHURES");
		Assert.assertTrue(Page.isVisible("SteelAndConcreteAssessmentCardStandardsCodeslink_XPATH"));
		Assert.assertEquals(Page.getText("SteelAndConcreteAssessmentCardStandardsCodeslink_XPATH"), "STANDARDS/CODES");
		Assert.assertTrue(Page.isVisible("SteelAndConcreteAssessmentCardImage_XPATH"));
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 28, enabled = false, description = "Verify the Card Contents of Steel Concrete Restoration")
	public void verifyCardContentsSteelConcreteRestoration() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Steel Concrete Restoration
		Assert.assertTrue(Page.isVisible("SteelAndConcreteRestortationtArticleslink_XPATH"));
		Assert.assertEquals(Page.getText("SteelAndConcreteRestortationtArticleslink_XPATH"), "ARTICLES");
		Assert.assertTrue(Page.isVisible("SteelAndConcreteRestortationBrochureslink_XPATH"));
		Assert.assertEquals(Page.getText("SteelAndConcreteRestortationBrochureslink_XPATH"), "BROCHURES");
		Assert.assertTrue(Page.isVisible("SteelAndConcreteRestortationImageslink_XPATH"));
		Assert.assertEquals(Page.getText("SteelAndConcreteRestortationImageslink_XPATH"), "IMAGES");
		Assert.assertTrue(Page.isVisible("SteelAndConcreteRestorationCardImage_XPATH"));
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 29, enabled = false, description = "Verify the Card Contents of Wood | Inspection & Treatment")
	public void verifyCardContentsWoodInspectionTreatment() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Wood | Inspection & Treatment
		Assert.assertTrue(Page.isVisible("WoodInspectionVideos_XPATH"));
		Assert.assertEquals(Page.getText("WoodInspectionVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.isVisible("WoodInspectionImages_XPATH"));
		Assert.assertEquals(Page.getText("WoodInspectionImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.isVisible("WoodInspectionResearch_XPATH"));
		Assert.assertEquals(Page.getText("WoodInspectionResearch_XPATH"), "RESEARCH");
		Assert.assertTrue(Page.isVisible("WoodInspectionCardImage_XPATH"));
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 30, enabled = false, description = "Verify the Card Contents of Steel Concrete Assessment")
	public void verifyCardContentsWoodRestoration() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Steel Concrete Assessment
		Assert.assertTrue(Page.isVisible("WoodRestorationVideos_XPATH"));
		Assert.assertEquals(Page.getText("WoodRestorationVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.isVisible("WoodRestorationBrochuers_XPATH"));
		Assert.assertEquals(Page.getText("WoodRestorationBrochuers_XPATH"), "BROCHURES");
		Assert.assertTrue(Page.isVisible("WoodRestorationArticles_XPATH"));
		Assert.assertEquals(Page.getText("WoodRestorationArticles_XPATH"), "ARTICLES");
		Assert.assertTrue(Page.isVisible("WoodRestorationCardImage_XPATH"));
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 31, enabled = false, description = "Verify the Card Contents of Joint Use")
	public void verifyCardContentsJointUse() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Joint Use
		Assert.assertTrue(Page.isVisible("JointUseImages_XPATH"));
		Assert.assertEquals(Page.getText("JointUseImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.isVisible("JointUseVideos_XPATH"));
		Assert.assertEquals(Page.getText("JointUseVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.isVisible("JointUseArticles_XPATH"));
		Assert.assertEquals(Page.getText("JointUseArticles_XPATH"), "ARTICLES");
		Assert.assertTrue(Page.isVisible("JointUseCardImage_XPATH"));
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 32, enabled = false, description = "Verify the Card Contents of Overhead")
	public void verifyCardContentsOverhead() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Overhead
		Assert.assertTrue(Page.isVisible("OverheadVideos_XPATH"));
		Assert.assertEquals(Page.getText("OverheadVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.isVisible("OverheadImages_XPATH"));
		Assert.assertEquals(Page.getText("OverheadImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.isVisible("OverheadProjectProfiles_XPATH"));
		Assert.assertEquals(Page.getText("OverheadProjectProfiles_XPATH"), "PROJECT PROFILES");
		Assert.assertTrue(Page.isVisible("OverheadCardImage_XPATH"));
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 33, enabled = false, description = "Verify the Card Contents of Pole Replacement")
	public void verifyCardContentsPoleReplacement() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Pole Replacement
		Assert.assertTrue(Page.isVisible("PoleReplacementImages_XPATH"));
		Assert.assertEquals(Page.getText("PoleReplacementImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.isVisible("PoleReplacementVideos_XPATH"));
		Assert.assertEquals(Page.getText("PoleReplacementVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.isVisible("PoleReplacementBrochure_XPATH"));
		Assert.assertEquals(Page.getText("PoleReplacementBrochure_XPATH"), "BROCHURE");
		Assert.assertTrue(Page.isVisible("PoleReplacementCardImage_XPATH"));
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 34, enabled = false, description = "Verify the Card Contents of Products")
	public void verifyCardContentsProducts() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Products
		Assert.assertTrue(Page.isVisible("ProductsImages_XPATH"));
		Assert.assertEquals(Page.getText("ProductsImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.isVisible("ProductsVideos_XPATH"));
		Assert.assertEquals(Page.getText("ProductsVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.isVisible("ProductsProductCatalog_XPATH"));
		Assert.assertEquals(Page.getText("ProductsProductCatalog_XPATH"), "PRODUCT CATALOG");
		Assert.assertTrue(Page.isVisible("ProductsCardImage_XPATH"));
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 35, enabled = false, description = "Verify the Card Contents of Storm Support")
	public void verifyCardContentsStormSupport() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Storm Support
		Assert.assertTrue(Page.isVisible("StormSupportImages_XPATH"));
		Assert.assertEquals(Page.getText("StormSupportImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.isVisible("StormSupportVideos_XPATH"));
		Assert.assertEquals(Page.getText("StormSupportVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.isVisible("StormSupportProjectProfiles_XPATH"));
		Assert.assertEquals(Page.getText("StormSupportProjectProfiles_XPATH"), "PROJECT PROFILES");
		Assert.assertTrue(Page.isVisible("StormSupportCardImage_XPATH"));
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 36, enabled = false, description = "Verify the Card Contents of Underground")
	public void verifyCardContentsUnderground() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Underground
		Assert.assertTrue(Page.isVisible("UndergroundImages_XPATH"));
		Assert.assertEquals(Page.getText("UndergroundImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.isVisible("UndergroundBrochure_XPATH"));
		Assert.assertEquals(Page.getText("UndergroundBrochure_XPATH"), "BROCHURE");
		Assert.assertTrue(Page.isVisible("UndergroundDiagram_XPATH"));
		Assert.assertEquals(Page.getText("UndergroundDiagram_XPATH"), "DIAGRAM");
		Assert.assertTrue(Page.isVisible("UndergroundCardImage_XPATH"));
	}

	// Keep this false always
	// US-98508-98703-Verify See More option functionality in Industry News section
	// in KB landing page
	@Test(priority = 37, enabled = false, description = "Verify the Industry News")
	public void verifyIndustrySeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Industry News
		kb.clickIndustrySeeMore();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		Assert.assertEquals(Page.getText("IndustryNewsText_XPATH"), "Industry News");
		kb.clickIndustryBackbtn();
	}

	// US-98500-98610-Verify that KB Landing page will have a "Gaff Gallery" section
	// which links to a dedicated Gallery Page.
	@Test(priority = 38, enabled = false, description = "Verify the click on Daliy Gaff Gallery on What's wrong with this picture")
	public void verifyClickOnDailyGaffGallery() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickDailyGaffGallery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		// Verification of Back button and Images text
		Assert.assertTrue(Page.isVisible("DailyGaffGalleryImagesBackBtn_XPATH"));
		Assert.assertEquals(Page.getText("DailyGaffGalleryImagesTxt_XPATH"), "Images");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		kb.clickDailyGaffGalleryBackbtn();
	}

	// US-98500-98610-Verify that KB Landing page will have a "Gaff Gallery" section
	// which links to a dedicated Gallery Page.
	// US-98500-98611-Verify that the Gallery Page will display a gallery of images.
	// When selected, the image will display a caption.
	@Test(priority = 39, enabled = false, description = "Verify the click on an Image on Daliy Gaff Gallery")
	public void verifyClickOnDailyGaffGalleryImage() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickDailyGaffGallery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		// Verification of the presence of image
		Assert.assertTrue(Page.isVisible("DailyGaffGalleryImage_XPATH"));
		kb.clickDailyGaffGalleryImage();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		kb.clickBoxCloseBtn();
		kb.clickDailyGaffGalleryBackbtn();
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 40, enabled = false, description = "Verify the click on Joint Use Card")
	public void verifyClickOnJointUseCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickJointUs();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			Assert.assertTrue(Page.isVisible("JointUseHeaderTxt_XPATH"));
			Assert.assertEquals(Page.getText("JointUseHeaderTxt_XPATH"), "Joint Use");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
			Page.click("PopularQueriesFilter_XPATH");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
			Assert.assertTrue(Page.isVisible("JointUsePopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("JointUsePopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("JointUsePopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 41, enabled = false, description = "Verify the click on Overhead Card")
	public void verifyClickOnOverheadCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickOverhead();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			Assert.assertTrue(Page.isVisible("OverheadHeaderTxt_XPATH"));
			Assert.assertEquals(Page.getText("OverheadHeaderTxt_XPATH"), "Overhead");
			Assert.assertTrue(Page.isVisible("OverheadPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("OverheadPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("OverheadPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}

	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 42, enabled = false, description = "Verify the click on Pole Replacement Card")
	public void verifyClickOnPoleReplacementCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickPoleReplacement();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			Assert.assertTrue(Page.isVisible("PoleReplacementHeaderTxt_XPATH"));
			Assert.assertEquals(Page.getText("PoleReplacementHeaderTxt_XPATH"), "Pole Replacement");
			// Page.click("PopularQueriesFilter_XPATH");
			Assert.assertTrue(Page.isVisible("PoleReplacementPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("PoleReplacementPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("PoleReplacementPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}

	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 43, enabled = false, description = "Verify the click on Products Card")
	public void verifyClickOnProductsCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickProducts();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			Assert.assertTrue(Page.isVisible("ProductHeaderTxt_XPATH"));
			Assert.assertEquals(Page.getText("ProductHeaderTxt_XPATH"), "Products");
			Assert.assertTrue(Page.isVisible("ProductsPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("ProductsPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("ProductsPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}

	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 44, enabled = false, description = "Verify the click on Steel and Concrete Assessment Card")
	public void verifyClickOnSteelandConcreteAssessmentCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickSteelAndConcreteAssessment();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			Assert.assertTrue(Page.isVisible("SteelAndConcreteAssessmentHeaderTxt_XPATH"));
			Assert.assertEquals(Page.getText("SteelAndConcreteAssessmentHeaderTxt_XPATH"),
					"Steel & Concrete | Assessment");
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 45, enabled = false, description = "Verify the click on Steel and Concrete Restoration Card")
	public void verifyClickOnSteelandConcreteRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickSteelAndConcreteRestortation();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			Assert.assertTrue(Page.isVisible("SteelAndConcreteRestorationHeaderTxt_XPATH"));
			Assert.assertEquals(Page.getText("SteelAndConcreteRestorationHeaderTxt_XPATH"),
					"Steel & Concrete | Restoration");
			Assert.assertTrue(Page.isVisible("SteelandConcreteRestorationPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteRestorationPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteRestorationPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}

	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 46, enabled = false, description = "Verify the click on Storm Support Card")
	public void verifyClickOnStormSupportCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickStormSupport();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			Assert.assertTrue(Page.isVisible("StormSupportHeaderTxt_XPATH"));
			Assert.assertEquals(Page.getText("StormSupportHeaderTxt_XPATH"), "Storm Support");
			Assert.assertTrue(Page.isVisible("StormSupportPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("StormSupportPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("StormSupportPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 47, enabled = false, description = "Verify the click on Underground Card")
	public void verifyClickOnUndergroundCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickUnderground();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			Assert.assertTrue(Page.isVisible("UndergroundHeaderTxt_XPATH"));
			Assert.assertEquals(Page.getText("UndergroundHeaderTxt_XPATH"), "Underground");
			Assert.assertTrue(Page.isVisible("UndergroundPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("UndergroundPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("UndergroundPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 48, enabled = false, description = "Verify the click on Wood Restoration Card")
	public void verifyClickOnWoodRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickWoodRestoration();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			Assert.assertTrue(Page.isVisible("WoodRestorationHeaderTxt_XPATH"));
			Assert.assertEquals(Page.getText("WoodRestorationHeaderTxt_XPATH"), "Wood | Restoration");
			Assert.assertTrue(Page.isVisible("WoodRestorationPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodRestorationPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodRestorationPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}

	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 49, enabled = false, description = "Verify the click on Wood Inspection Card")
	public void verifyClickOnWoodInspectionCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickWoodInspection();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			Assert.assertTrue(Page.isVisible("WoodInspectionHeaderTxt_XPATH"));
			Assert.assertEquals(Page.getText("WoodInspectionHeaderTxt_XPATH"), "Wood | Treatments");
			Assert.assertTrue(Page.isVisible("WoodInspectionPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodInspectionPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodInspectionPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	// US-98506-98724-Verify when user clicks on image from gallery system will open
	// the image content display page (Box)
	@Test(priority = 50, enabled = false, description = "Verify the click on Images under Joint Use")
	public void verifyClickonJointUsImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickJointUseImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Images header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("JointUsImagesImagesHeaderTxt_XPATH"), "Images");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of image
			// Assert.assertTrue(Page.isVisible("JointUsImagesImageClick_XPATH"));
			Assert.assertTrue(Page.isVisible("JointUsePopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("JointUsePopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("JointUsePopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-98506-98723-Verify video content display page will display the asset title
	// and description in addition to the embedded preview window.
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 51, enabled = false, description = "Verify the click on Videos under Joint Use")
	public void verifyClickonJointUsVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickJointUseVideos();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Videos header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("VideosHeaderTxt_XPATH"), "Videos");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of video
			// Assert.assertTrue(Page.isVisible("JointUsVideosVideoClick_XPATH"));
			Assert.assertTrue(Page.isVisible("JointUsePopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("JointUsePopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("JointUsePopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 52, enabled = false, description = "Verify the click on Articles under Joint Use")
	public void verifyClickonJointUsArticles() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickJointUseArticles();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence documents header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("DocumentsHeaderTxt_XPATH"), "Documents");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("JointUseDocumentsDocument_XPATH"));
			Assert.assertTrue(Page.isVisible("JointUsePopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("JointUsePopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("JointUsePopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-98506-98734-Verify When a user selects an asset(Video) for viewing, the
	// video should be opened in content display
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 53, enabled = false, description = "Verify the click on Videos under Overhead")
	public void verifyClickonOverheadVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickOverheadVideos();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Videos header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("VideosHeaderTxt_XPATH"), "Videos");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of video
			// Assert.assertTrue(Page.isVisible("OverheadVideosVideoClick_XPATH"));
			Assert.assertTrue(Page.isVisible("OverheadPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("OverheadPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("OverheadPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 54, enabled = false, description = "Verify the click on Images under Overhead")
	public void verifyClickonOverheadImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickOverheadImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Images header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("ImagesHeaderTxt_XPATH"), "Images");
			// Verification of the presence of image
			// Assert.assertTrue(Page.isVisible("OverheadImagesImage_XPATH"));
			Assert.assertTrue(Page.isVisible("OverheadPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("OverheadPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("OverheadPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	// US-98506-98737-Verify when user clicks on document from document list system
	// will open the document content display
	@Test(priority = 55, enabled = false, description = "Verify the click on Project profiles under Overhead")
	public void verifyClickonOverheadProjectProfiles() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickOverheadProjectProfiles();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Document header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("DocumentsHeaderTxt_XPATH"), "Documents");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("OverheadDocumentsDocument_XPATH"));
			Assert.assertTrue(Page.isVisible("OverheadPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("OverheadPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("OverheadPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 56, enabled = false, description = "Verify the click on Images under Pole Replacement")
	public void verifyClickonPoleReplacementImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickPoleReplacementImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Images header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("ImagesHeaderTxt_XPATH"), "Images");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of image
			// Assert.assertTrue(Page.isVisible("PoleReplacementImagesImage_XPATH"));
			Assert.assertTrue(Page.isVisible("PoleReplacementPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("PoleReplacementPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("PoleReplacementPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 57, enabled = false, description = "Verify the click on Videos under Pole Replacement")
	public void verifyClickonPoleReplacementVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickPoleReplacementVideos();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Videos header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("VideosHeaderTxt_XPATH"), "Videos");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of video
			// Assert.assertTrue(Page.isVisible("PoleReplacementVideosVideoClick_XPATH"));
			Assert.assertTrue(Page.isVisible("PoleReplacementPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("PoleReplacementPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("PoleReplacementPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 58, enabled = false, description = "Verify the click on Brochure under Pole Replacement")
	public void verifyClickonPoleReplacementBrochure() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickPoleReplacementBrochure();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Document header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("DocumentsHeaderTxt_XPATH"), "Documents");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("PoleReplacementBrochureclick_XPATH"));
			Assert.assertTrue(Page.isVisible("PoleReplacementPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("PoleReplacementPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("PoleReplacementPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 59, enabled = false, description = "Verify the click on Images under Products")
	public void verifyClickonProductsImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickProductsImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Images header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("ImagesHeaderTxt_XPATH"), "Images");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of image
			// Assert.assertTrue(Page.isVisible("ProductsImagesImage_XPATH"));
			// Assert.assertTrue(Page.isVisible("ProductsPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("ProductsPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("ProductsPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}

	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 60, enabled = false, description = "Verify the click on Videos under Products")
	public void verifyClickonProductsVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickProductsVideos();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Videos header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("VideosHeaderTxt_XPATH"), "Videos");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of video
			// Assert.assertTrue(Page.isVisible("ProductsVideosVideoClick_XPATH"));
			Assert.assertTrue(Page.isVisible("ProductsPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("ProductsPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("ProductsPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 61, enabled = false, description = "Verify the click on Product Catalog under Products")
	public void verifyClickonProductsProductCatalog() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickProductsProductCatalog();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Document header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("DocumentsHeaderTxt_XPATH"), "Documents");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("ProductsProductCatalogclick_XPATH"));
			Assert.assertTrue(Page.isVisible("ProductsPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("ProductsPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("ProductsPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 62, enabled = false, description = "Verify the click on Images under Steel And Concrete Assessment")
	public void verifyClickonSteelAndConcreteAssessmentImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickSteelandConcreteAssessmentImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Images header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("ImagesHeaderTxt_XPATH"), "Images");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of documents
			// Assert.assertTrue(Page.isVisible("SteelAndConcreteAssessmentImagesImage_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 63, enabled = false, description = "Verify the click on Brochures under Steel And Concrete Assessment")
	public void verifyClickonSteelAndConcreteAssessmentBrochures() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickSteelandConcreteAssessmentBrochures();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Documents header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("DocumentsHeaderTxt_XPATH"), "Documents");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("SteelAndConcreteAssessmentDocumentsDocument_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 64, enabled = false, description = "Verify the click on Standards/codes under Steel And Concrete Assessment")
	public void verifyClickonSteelAndConcreteAssessmentStandardsCodes() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickSteelandConcreteAssessmentStandards_Codes();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Documents header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("DocumentsHeaderTxt_XPATH"), "Documents");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("SteelAndConcreteAssessmentDocumentsDocument_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 65, enabled = false, description = "Verify the click on Articles under Steel And Concrete Restoration")
	public void verifyClickonSteelAndConcreteRestorationArticles() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickSteelandConcreteRestorationArticles();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Documents header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("DocumentsHeaderTxt_XPATH"), "Documents");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("SteelAndConcreteRestorationDocumentsDocument_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteRestorationPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteRestorationPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteRestorationPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 66, enabled = false, description = "Verify the click on Brochures under Steel And Concrete Restoration")
	public void verifyClickonSteelAndConcreteRestorationBrochures() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickSteelandConcreteRestorationBrochures();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Documents header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("DocumentsHeaderTxt_XPATH"), "Documents");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("SteelAndConcreteRestorationDocumentsDocument_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteRestorationPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteRestorationPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteRestorationPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 67, enabled = false, description = "Verify the click on Images under Steel And Concrete Restoration")
	public void verifyClickonSteelAndConcreteRestorationImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickSteelandConcreteRestorationImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Images header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("ImagesHeaderTxt_XPATH"), "Images");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of image
			// Assert.assertTrue(Page.isVisible("SteelAndConcreteRestorationImagesImage_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteRestorationPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteRestorationPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteRestorationPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 68, enabled = false, description = "Verify the click on Images under Storm Support")
	public void verifyClickonStormSupportImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickStormSupportImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Images header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("ImagesHeaderTxt_XPATH"), "Images");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of image
			// Assert.assertTrue(Page.isVisible("StormSupportImagesImage_XPATH"));
			Assert.assertTrue(Page.isVisible("StormSupportPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("StormSupportPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("StormSupportPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 69, enabled = false, description = "Verify the click on Videos under Storm Support")
	public void verifyClickonStormSupportVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickStormSupportVideos();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Videos header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("VideosHeaderTxt_XPATH"), "Videos");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of video
			// Assert.assertTrue(Page.isVisible("StormSupportVideosVideoClick_XPATH"));
			Assert.assertTrue(Page.isVisible("StormSupportPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("StormSupportPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("StormSupportPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 70, enabled = false, description = "Verify the click on Project profiles under Storm Support")
	public void verifyClickonStormSupportProjectProfiles() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickStormSupportProjectProfiles();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Document header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("DocumentsHeaderTxt_XPATH"), "Documents");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("StormSupportProjectProfilesDocument_XPATH"));
			Assert.assertTrue(Page.isVisible("StormSupportPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("StormSupportPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("StormSupportPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 71, enabled = false, description = "Verify the click on Images under Underground")
	public void verifyClickonUndergroundImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickUndergroundImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Images header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("ImagesHeaderTxt_XPATH"), "Images");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of image
			// Assert.assertTrue(Page.isVisible("UndergroundImagesImage_XPATH"));
			Assert.assertTrue(Page.isVisible("UndergroundPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("UndergroundPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("UndergroundPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 72, enabled = false, description = "Verify the click on Brochure under Underground")
	public void verifyClickonUndergroundBrochure() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickUndergroundBrochure();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Document header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("DocumentsHeaderTxt_XPATH"), "Documents");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("UndergroundBrochureDocument_XPATH"));
			Assert.assertTrue(Page.isVisible("UndergroundPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("UndergroundPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("UndergroundPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 73, enabled = false, description = "Verify the click on Diagram under Underground")
	public void verifyClickonUndergroundDiagram() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickUndergroundDiagram();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Document header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("DocumentsHeaderTxt_XPATH"), "Documents");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("UndergroundDiagramDocument_XPATH"));
			Assert.assertTrue(Page.isVisible("UndergroundPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("UndergroundPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("UndergroundPopularFilter3_XPATH"));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 74, enabled = false, description = "Verify the click on Videos under Wood Restoration")
	public void verifyClickonWoodRestorationVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickWoodRestorationVideos();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Videos header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("VideosHeaderTxt_XPATH"), "Videos");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of video
			// Assert.assertTrue(Page.isVisible("WoodRestorationVideosVideoClick_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodRestorationPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodRestorationPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodRestorationPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 75, enabled = false, description = "Verify the click on Brochures under Wood Restoration")
	public void verifyClickonWoodRestorationBrochures() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickWoodRestorationBrochures();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence documents header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("VideosHeaderTxt_XPATH"), "Videos");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("WoodRestorationDocumentsDocument_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodRestorationPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodRestorationPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodRestorationPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 76, enabled = false, description = "Verify the click on Articles under Wood Restoration")
	public void verifyClickonWoodRestorationArticles() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickWoodRestorationArticles();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence documents header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("VideosHeaderTxt_XPATH"), "Videos");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("WoodRestorationDocumentsDocument_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodRestorationPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodRestorationPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodRestorationPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 77, enabled = false, description = "Verify the click on Videos under Wood Treatment")
	public void verifyClickonWoodTreatmentVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickWoodTreatmentVideos();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Videos header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("VideosHeaderTxt_XPATH"), "Videos");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of video
			// Assert.assertTrue(Page.isVisible("WoodTreatmentVideosVideoClick_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodInspectionPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodInspectionPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodInspectionPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 78, enabled = false, description = "Verify the click on Images under Wood Treatment")
	public void verifyClickonWoodTreatmentImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickWoodTreatmentImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Images header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("ImagesHeaderTxt_XPATH"), "Images");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of image
			// Assert.assertTrue(Page.isVisible("WoodTreatmentImagesImage_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodInspectionPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodInspectionPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodInspectionPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 79, enabled = false, description = "Verify the click on Research under Wood Treatment")
	public void verifyClickonWoodTreatmentResearch() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickWoodTreatmentResearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Verify the presence Document header text
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("DocumentsHeaderTxt_XPATH"), "Documents");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("WoodTreatmentResearchDocument_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodInspectionPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodInspectionPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("WoodInspectionPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
		}
	}

	// US-98504-98685-Verify see more option functionality in "Videos" section in KB
	// landing page
	@Test(priority = 80, enabled = false, description = "Verify the click on See more link on Videos under Joint use PopularQuery")
	public void verifyClickonVideosSeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickJointUsePopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.click("SearchBoxClear_XPATH");
			// Page.driver.navigate().back();
		} else if (Page.isVisible("VideosHeaderTxt_XPATH")) {
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Page.click("JointUseVideosSeeMoreLink_XPATH");
			// Verify the presence of Back Button
			Assert.assertTrue(Page.isVisible("BackButtonVideos_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verify the presence Videos header text
			Assert.assertEquals(Page.getText("KBVideosResultsSection_XPATH"), "Videos");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of video
			// Assert.assertTrue(Page.isVisible("JointUsVideosVideoClick_XPATH"));
			kb.clickClearSearch();
		} else {
			System.out.println("verifyClickonVideosSeeMore: Videos section is not displayed");
			kb.clickClearSearch();
		}
	}

	// US-98504-98686-Verify See More option functionality in Images section in KB
	// landing page
	@Test(priority = 81, enabled = false, description = "Verify the click on See more link on Images under Pole Replacement Popular Query")
	public void verifyClickonImagesSeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickPoleReplacementPopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.click("SearchBoxClear_XPATH");
			// Page.driver.navigate().back();
		} else if (Page.isVisible("ImagesHeaderTxt_XPATH")) {
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Page.click("PoleReplacementImagesSeeMoreLink_XPATH");
			// Verify the presence of Back Button
			Assert.assertTrue(Page.isVisible("BackBtnImages_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verify the presence Images header text
			Assert.assertEquals(Page.getText("KBImagesResultsSection_XPATH"), "Images");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of image
			// Assert.assertTrue(Page.isVisible("PoleReplacementImagesImage_XPATH"));
			kb.clickClearSearch();
		} else {
			System.out.println("verifyClickonImagesSeeMore: Images section is not displayed");
			kb.clickClearSearch();
		}
	}

	// US-98504-98687-Verify See More option functionality in Documents section in
	// KB landing page
	@Test(priority = 82, enabled = false, description = "Verify the click on See more link on Documents under Joint use PopularQuery")
	public void verifyClickonDocumentsSeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickJointUsePopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.click("SearchBoxClear_XPATH");
			// Page.driver.navigate().back();
		} else if (Page.isVisible("DocumentsHeaderTxt_XPATH")) {
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Page.click("JointUseDocumentsSeeMoreLink_XPATH");
			// Verify the presence of Back Button
			Assert.assertTrue(Page.isVisible("BackButtonDocuments_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verify the presence Document header text
			Assert.assertEquals(Page.getText("KBDocumentsResultsSection_XPATH"), "Documents");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			// Assert.assertTrue(Page.isVisible("JointUseDocumentsDocument_XPATH"));
			kb.clickClearSearch();
		}

		else {
			System.out.println("verifyClickonDocumentsSeeMore: Documents section is not Present");
			kb.clickClearSearch();
		}
	}

	// US-98504-98688-Verify See More option functionality in News section in KB
	// landing page
	@Test(priority = 83, enabled = false, description = "Verify the click on See more link on a Document under Joint use PopularQuery")
	public void verifyClickonJointUseManagementServicesSeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickJointUsePopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.click("SearchBoxClear_XPATH");
			// Page.driver.navigate().back();
		} else if (Page.isVisible("DocumentsHeaderTxt_XPATH")) {
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Page.click("JointUseDocumentsSeeMoreLink_XPATH");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verify the presence of Back Button
			Assert.assertTrue(Page.isVisible("BackButtonDocuments_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verify the presence Document header text
			Assert.assertEquals(Page.getText("DocumentsHeaderTxt_XPATH"), "Documents");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			// Verification of the presence of document
			Assert.assertTrue(Page.isVisible("JointUseDocumentsDocument_XPATH"));
			Page.click("JointUseJointUseManagementServicesMoreLink_XPATH");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertEquals(Page.getText("JointUseJointUseManagemenrServicesHeaderTxt_XPATH"),
					"Joint Use Management Services");
			// Verification of the presence of link
			Assert.assertTrue(Page.isVisible("BoxCloseBtn_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
			Page.click("BoxCloseBtn_XPATH");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
			kb.clickClearSearch();
		}

		else {
			System.out.println("verifyClickonJointUseManagementServicesSeeMore: Documents section is not Present");
			kb.clickClearSearch();
		}
	}

	// US-98501-98614-Verify that The Search Bar will provide the user with a
	// drop-down when they start entering the searchQuery.
	// US-98502-98623-Verify that system shall allow users to perform keyword
	// searches which return results based on document content and metadata
	// fields(title, description, keyword)
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 84, enabled = false, description = "Verification of dynamic dropdown on search field")
	public void verifyDynamicDropdown(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.type("SearchBox_XPATH", data.get("AskOsmoseSearch"));
		// Verification of the presence of dynamic dd
		Assert.assertTrue(Page.isVisible("Dynamicdd_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		// Clicking on Industry option
		Page.click("IndustryOptionDD_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.click("SearchBoxClear_XPATH");
			// Page.driver.navigate().back();
		} else {
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
			System.out.println("verifyDynamicDropdown: Videos section is displayed?: "
					+ Page.isVisible("VideosHeaderTxt_XPATH"));
			System.out.println("verifyDynamicDropdown: Images section is displayed?: "
					+ Page.isVisible("ImagesHeaderTxt_XPATH"));
			System.out.println("verifyDynamicDropdown: Documents section is displayed?: "
					+ Page.isVisible("DocumentsHeaderTxt_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

		}
	}

	// US-98503-98669-Verify Search results section will be organized into separate
	// "grouped" areas based on the asset category and type.
	// US-98502-98616-Verify that the search bar will provide options for searching
	// only for specific media types
	// US-98502-98622-Verify that Default "All" option is selected for searching.
	@Test(priority = 85, enabled = false, description = "Verify that Search results section will be organized into separate grouped")
	public void verifySearchResultsAreGrouped() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickPoleReplacementPopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.click("SearchBoxClear_XPATH");
			// Page.driver.navigate().back();
		} else {
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
			System.out.println("verifySearchResultsAreGrouped: Videos section is displayed?: "
					+ Page.isVisible("VideosHeaderTxt_XPATH"));
			System.out.println("verifySearchResultsAreGrouped: Images section is displayed?: "
					+ Page.isVisible("ImagesHeaderTxt_XPATH"));
			System.out.println("verifySearchResultsAreGrouped: Documents section is displayed?: "
					+ Page.isVisible("DocumentsHeaderTxt_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}
	}

	// US-98503-98669-Verify Search results section will be organized into separate
	// "grouped" areas based on the asset category and type.
	// US-98503-98670-Verify Search results section will be updated and organized
	// into separate "grouped" areas based on the asset category and type when user
	// switches the selection of Popular queries
	// US-98505-98691-Verify Search results section will be updated and organized
	// into separate "grouped" areas based on the asset category and type when user
	// switches the selection of Popular queries
	@Test(priority = 86, enabled = false, description = "Verify that Search results section will be organized into separate grouped after updation of Popular filter")
	public void verifySearchResultsAreGroupedAfterfilterUpdation() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickPoleReplacementPopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.ClickPopularQueriesFilter();

		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.click("SearchBoxClear_XPATH");
			// Page.driver.navigate().back();
		} else {
			Page.click("PoleReplacement2Filter_XPATH");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
			System.out.println("verifySearchResultsAreGroupedAfterfilterUpdation: Videos section is displayed?: "
					+ Page.isVisible("VideosHeaderTxt_XPATH"));
			System.out.println("verifySearchResultsAreGroupedAfterfilterUpdation: Images section is displayed?: "
					+ Page.isVisible("ImagesHeaderTxt_XPATH"));
			System.out.println("verifySearchResultsAreGroupedAfterfilterUpdation: Documents section is displayed?: "
					+ Page.isVisible("DocumentsHeaderTxt_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}
	}

	// US-98503-98672-Verify System displaying search results based on the entered
	// search criteria
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 87, enabled = false, description = "Verify that Search results section will be organized into separate grouped after typing value in Search field")
	public void verifySearchResultsOnTyping(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.type("SearchBox_XPATH", data.get("TypePoleReplacement"));
		Page.driver.findElement(By.xpath("//input[@id='SearchFieldKB']")).sendKeys(Keys.ENTER);
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.click("SearchBoxClear_XPATH");
			// Page.driver.navigate().back();
		} else {
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
			System.out.println("verifySearchResultsAreGroupedAfterfilterUpdation: Videos section is displayed?: "
					+ Page.isVisible("VideosHeaderTxt_XPATH"));
			System.out.println("verifySearchResultsAreGroupedAfterfilterUpdation: Images section is displayed?: "
					+ Page.isVisible("ImagesHeaderTxt_XPATH"));
			System.out.println("verifySearchResultsAreGroupedAfterfilterUpdation: Documents section is displayed?: "
					+ Page.isVisible("DocumentsHeaderTxt_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}
	}

	// US-98503-98673-Verify Clear Search results
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 88, enabled = false, description = "Verify that clicking on clear button will clear the field")
	public void verifyClearButtonOnTyping(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.type("SearchBox_XPATH", data.get("TypeJointUseInSearchbox"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("SearchBoxClear_XPATH");
	}

	// US-98503-98674-Verify System will filter the search results when user selects
	// the 'Videos' Category filer
	// US-98502-98617-Verify that search bar will provide options for searching
	// videos.
	@Test(priority = 89, enabled = false, description = "Verify that Search results section will display only videos section")
	public void verifySearchResultsAreVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickJointUsePopularQuery();
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.click("SearchBoxClear_XPATH");
			// Page.driver.navigate().back();
		} else if (Page.isVisible("VideosHeaderTxt_XPATH")) {
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
			Page.click("VideosLink_XPATH");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		} else {
			System.out.println("verifySearchResultsAreVideos: Videos section is not Present");
			kb.clickClearSearch();
		}
	}

	// US-98503-98675-Verify System will filter the search results when user selects
	// the 'Images' Category filer
	// US-98502-98618-Verify that search bar will provide options for searching
	// images.
	@Test(priority = 90, enabled = false, description = "Verify that Search results section will display only images section")
	public void verifySearchResultsAreImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickPoleReplacementPopularQuery();
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.click("SearchBoxClear_XPATH");
			// Page.driver.navigate().back();
		} else if (Page.isVisible("ImagesHeaderTxt_XPATH")) {
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
			Page.click("ImagesLink_XPATH");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		} else {
			System.out.println("verifySearchResultsAreImages: Images section is not Present");
			kb.clickClearSearch();
		}

	}

	// US-98503-98677-Verify System will filter the search results when user selects
	// the 'Documents' Category filer
	// US-98502-98620-Verify that search bar will provide options for searching
	// documents.
	@Test(priority = 91, enabled = false, description = "Verify that Search results section will display only documents section")
	public void verifySearchResultsAreDocuments() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickJointUsePopularQuery();
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.click("SearchBoxClear_XPATH");
			// Page.driver.navigate().back();
		} else if (Page.isVisible("DocumentsHeaderTxt_XPATH")) {
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
			Page.click("DocumentsLink_XPATH");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		} else {
			System.out.println("verifySearchResultsAreDocuments: Documents section is not Present");
			kb.clickClearSearch();
		}
	}

	// US-98503-98680-Verify If a "grouped" area has no assets to display, then the
	// area will be hidden.<Grouped areas: Video, Images, Documents, and News>
	// US-98502-98733-Verify message displayed by system when there are no records
	// or search results for entered search criteria
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 92, enabled = false, description = "Verify no results found message on Search Box")
	public void verifyNoResultsFoundMessage(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.type("SearchBox_XPATH", data.get("NoResults"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.findelement("SearchBox_XPATH").sendKeys(Keys.ENTER);
		String text = Page.getText("NoResults_XPATH");
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98503-98681-Verify Document result set section will allow users to sort
	// the result set by 'Relevance' and 'Most Recent'
	@Test(priority = 93, enabled = false, description = "Verify the presence of Sort by dropdown and its values")
	public void verifyPresenceOfSortBy() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.ClickPopularQueriesFilter();
		kb.clickJointUsePopularQuery();
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.click("SearchBoxClear_XPATH");
			// Page.driver.navigate().back();
		} else if (Page.isVisible("DocumentsHeaderTxt_XPATH")) {
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
			Page.click("DocumentsLink_XPATH");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
			Assert.assertTrue(Page.isVisible("KBDocumentsResultsSection_XPATH"));
			// Verification of the presence of Sort By Dropdown
			Assert.assertTrue(Page.isVisible("DocumentsSortByDD_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
			Page.click("DocumentsSortByDD_XPATH");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
			// Verification of the options present in Sort By Dropdown
			Assert.assertEquals(Page.getText("SortByOptionDD_XPATH"), "SORT BY");
			Assert.assertEquals(Page.getText("RelevanceOptionDD_XPATH"), "Relevance");
			Assert.assertEquals(Page.getText("MostRecentOptionDD_XPATH"), "Most Recent");
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		} else {
			System.out.println("verifyPresenceOfSortBy: Documents section is not Present");
			kb.clickClearSearch();
		}

	}

	// US-98503-98672-Verify System displaying search results based on the entered
	// search criteria
	// US-98502-98624-Verify that The system shall allow users to modify searches
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 94, enabled = false, description = "Verify that the text entered in search field can be modified")
	public void verifySearchTextUpdation(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.type("SearchBox_XPATH", data.get("TypeJointUseTextUpdation"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.clear("SearchBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.type("SearchBox_XPATH", data.get("TypePoleReplacementTextUpdation"));
		Page.findelement("SearchBox_XPATH").sendKeys(Keys.ENTER);
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			Page.click("SearchBoxClear_XPATH");
			// Page.driver.navigate().back();
		} else {
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
			System.out.println("verifySearchTextUpdation: Videos section is displayed?: "
					+ Page.isVisible("VideosHeaderTxt_XPATH"));
			System.out.println("verifySearchTextUpdation: Images section is displayed?: "
					+ Page.isVisible("ImagesHeaderTxt_XPATH"));
			System.out.println("verifySearchTextUpdation: Documents section is displayed?: "
					+ Page.isVisible("DocumentsHeaderTxt_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			kb.clickClearSearch();
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		}
	}

	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 95, enabled = false, description = "Verify the Popular filters on Images under Steel & Concrete Assessment")
	public void verifyPopularFiltersSteelAndConcreteAssessmentImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread10000"))));
		kb.clickSteelandConcreteAssessmentImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			// Page.click("PopularQueriesFilter_XPATH");
			Page.click("SteelandConcreteAssessmentPopularFilter1_XPATH");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			System.out.println("verifyPopularFiltersSteelAndConcreteAssessmentImages: Videos section is displayed?: "
					+ Page.isVisible("VideosHeaderTxt_XPATH"));
			System.out.println("verifyPopularFiltersSteelAndConcreteAssessmentImages: Images section is displayed?: "
					+ Page.isVisible("ImagesHeaderTxt_XPATH"));
			System.out.println("verifyPopularFiltersSteelAndConcreteAssessmentImages: Documents section is displayed?: "
					+ Page.isVisible("DocumentsHeaderTxt_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Page.click("ClearSearchBtn_XPATH");
		}
	}

	// US-100681-100878-Verify Popular Queries on the result page will revert to the
	// default set when user performs free form search in the "Ask Osmose" box after
	// sub-category filter search is performed
	@Test(priority = 96, enabled = false, description = "Verify that popular queries are reset to default")
	public void verifyPopularQueriesReset() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickSteelandConcreteAssessmentImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		if (Page.isVisible("NoResults_XPATH")) {
			String text = Page.getText("NoResults_XPATH");
			String newtext = text.substring(text.indexOf('\n') + 1);
			Assert.assertEquals(newtext, "No results match your search criteria.");
			// Page.driver.navigate().back();
		} else {
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter1_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter2_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelandConcreteAssessmentPopularFilter3_XPATH"));
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Page.click("ClearSearchBtn_XPATH");
			Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
			Assert.assertTrue(Page.isVisible("JointUseFilter_XPATH"));
			Assert.assertTrue(Page.isVisible("SteelAssessmentFilter_XPATH"));
			Assert.assertTrue(Page.isVisible("PoleReplacementFilter_XPATH"));
		}
	}

	// Keep this false always
	// US-98506-100683-Verify External video from YouTube and Vimeo should open in
	// there respective video player
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 97, enabled = false, description = "Verify presence of External video from YouTube and Vimeo")
	public void verifyExternalVideo(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.type("SearchBox_XPATH", data.get("TypeExternal"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.findelement("SearchBox_XPATH").sendKeys(Keys.ENTER);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.click("SeeMoreVideos_ID");
		Assert.assertTrue(Page.isVisible("youtubeVideo_XPATH"));
		Assert.assertTrue(Page.isVisible("vimeoVideo_XPATH"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		Page.click("KBHomePage_XPATH");
	}
	@Test(priority = 98, enabled = true, description = "Verify the functionality of Buttons on Oclac Pro Card")
	public void verifyfunctionalityOfOcalCproButtons() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// verification of the presence of buttons and text
		Page.click("KB_RequestLiveDemo_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		Assert.assertEquals(Page.getText("KB_RequestLiveDemoHeader_XPATH"), "Request A Live Demo");
		Page.iFrames(0);
		// Verification of Header text
		/*Assert.assertEquals(Page.getText("DemoHeaderTxt_XPATH"), "O-Calc® Pro Live Demo")*/;
		// Verification of FirstName field
		Assert.assertTrue(Page.isVisible("DemoFirstName_XPATH"));
		// Verification of LastName field
		Assert.assertTrue(Page.isVisible("DemoLastName_XPATH"));
		// Verification of Company field
		Assert.assertTrue(Page.isVisible("DemoCompany_XPATH"));
		// Verification of Title field
		Assert.assertTrue(Page.isVisible("DemoTitle_XPATH"));
		// Verification of BusinessEmail field
		Assert.assertTrue(Page.isVisible("DemoBusinessEmail_XPATH"));
		// Verification of Phone field
		Assert.assertTrue(Page.isVisible("DemoPhone_XPATH"));
		// Verification of Country field
		Assert.assertTrue(Page.isVisible("DemoCountry_XPATH"));
		// Verification of State field
		Assert.assertTrue(Page.isVisible("DemoState_XPATH"));
		// Verification of RequestTrialBtn button
		Assert.assertTrue(Page.isVisible("DemoRequestTrialBtn_XPATH"));
		Page.driver.switchTo().defaultContent();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		// Page.click("DemoBackBtn_XPATH");
		// Verification of close button
		Assert.assertTrue(Page.isVisible("DemoCloseBtn_XPATH"));
		Page.click("DemoCloseBtn_XPATH");
		Page.click("TrainingScheduleBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the Back button
		Assert.assertTrue(Page.isVisible("oCalCurrentPublicClassBackBtn_XPATH"));
		// Verification of Back btn text
		Assert.assertEquals(Page.getText("oCalCurrentPublicClassBackBtn_XPATH"), "Back");
		// Verification of the Header text
		Assert.assertEquals(Page.getText("KB_OCalcProHeader_XPATH"), "O-Calc Pro Classes");
		// Verification of close button
		Assert.assertTrue(Page.isVisible("oCalCurrentPublicClassesCloseBtn_XPATH"));
		Page.iFrames(0);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		// Verification of O-Calc® Pro Training text
		Assert.assertEquals(Page.getText("oCalCurrentPublicClassesHeading_XPATH"), "O-Calc® Pro Training");
		/*Page.click("oCalCurrentPublicClassesFlyerBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.closeTab(1);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		ocal.switchToparentWindow();*/
		Page.driver.switchTo().defaultContent();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("oCalCurrentPublicClassesCloseBtn_XPATH");
		Page.click("BrochureBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		kb.closeTab(1);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		kb.switchToparentWindow();
	
	}

}