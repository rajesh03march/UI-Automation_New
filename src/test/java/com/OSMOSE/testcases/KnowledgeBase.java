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
	@Test(priority = 2, enabled = true, description = "Verify the links present on Home Page")
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
	@Test(priority = 3, enabled = true, description = "Verify the presence of Search Box")
	public void verifyPresenceOfSearchBox() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Search box presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//input[@id='SearchFieldKB' and @placeholder='Ask Osmose']")).isDisplayed());
		String Placeholder = Page.driver
				.findElement(By.xpath("//input[@id='SearchFieldKB' and @placeholder='Ask Osmose']"))
				.getAttribute("placeholder");
		Assert.assertEquals(Placeholder, "Ask Osmose");
	}

	// US-98498-98572-Verify that KB Landing page have a Search Bar with the option
	// to choose between 'All', 'Videos','Images, and 'Documents" as search category
	// filter.
	@Test(priority = 4, enabled = true, description = "Verify the presence of Popular Queries Filter")
	public void verifyPresenceOfPopularQueriesFilter() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Popular Queries Filter presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//a[@id='Filter']")).isDisplayed());
	}

	// US-98498-98572-Verify that KB Landing page have a Search Bar with the option
	// to choose between 'All', 'Videos','Images, and 'Documents" as search category
	// filter.
	// US-98503-98671-Verify layout and font of Popular queries section under search
	// bar in KB Landing page
	@Test(priority = 5, enabled = true, description = "Verify the presence of Filter items")
	public void verifyPresenceOfFilterItems() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Filter items presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//div[@class='card']")).isDisplayed());
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//label[@class='custom-control-label' and text()='Joint Use']")).isDisplayed());
		Assert.assertEquals(Page.getText("JointUseFilter_XPATH"), "Joint Use");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		kb.ClickPopularQueriesFilter();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Assert.assertFalse(Page.driver.findElement(By.xpath("//div[@class='card']")).isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 6, enabled = true, description = "Verify the presence of Steel And Concrete Assessment")
	public void verifyPresenceSteelAndConcreteAssessmentCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Steel and Concrete Assessment card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Assessment')]"))
				.isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 7, enabled = true, description = "Verify the presence of Steel And Concrete Restoration")
	public void verifyPresenceSteelAndConcreteRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Steel and Concrete Restoration card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Restoration')]"))
				.isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 8, enabled = true, description = "Verify the presence of Wood Inspection And Treatment Card")
	public void verifyPresenceWoodInspectionAndTreatmentCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Wood Inspection And Treatment card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[contains(text(),'Wood | Treatments')]")).isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 9, enabled = true, description = "Verify the presence of Wood Restoration Card")
	public void verifyPresenceWoodRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Wood Restoration Card presence verification
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//*[contains(text(),'Wood | Restoration')]")).isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 10, enabled = true, description = "Verify the presence of  Underground")
	public void verifyPresenceUndergroundCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Underground card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[contains(text(),'Underground')]")).isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 11, enabled = true, description = "Verify the presence of Overhead")
	public void verifyPresenceOverheadCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Overhead card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[contains(text(),'Overhead')]")).isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 12, enabled = true, description = "Verify the presence of Joint Use")
	public void verifyPresenceJointUseCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Joint Use card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//h5[contains(text(),'Joint Use')]")).isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 13, enabled = true, description = "Verify the presence of Pole Replacement")
	public void verifyPresencePoleReplacementCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Pole Replacement card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//h5[contains(text(),'Pole Replacement')]")).isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 14, enabled = true, description = "Verify the presence of Storm Support")
	public void verifyPresenceStormSupportCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Storm Support card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[contains(text(),'Storm Support')]")).isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 15, enabled = true, description = "Verify the presence of Products")
	public void verifyPresenceProductsCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Products card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[contains(text(),'Products')]")).isDisplayed());
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
	@Test(priority = 17, enabled = true, description = "Verify the presence of O-Calc Pro Card")
	public void verifyPresenceOCalcProCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// O-Calc Pro Card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//img[@id='oCalLogo']")).isDisplayed());
	}

	// US-98498-98738-Verify tiles related to Project of the Week
	// US-98500-98668-Verify KB Landing page will have a tile titled "Featured
	// Project"(Project of the Week)
	@Test(priority = 18, enabled = true, description = "Verify the presence of Project of the week Card")
	public void verifyPresenceProjectOfTheWeekCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Project of the week Card presence verification
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//*[contains(text(),'Project of the Week')]")).isDisplayed());
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[contains(text(),'View Project')]")).isDisplayed());
	}

	// US-98500-98610-Verify that KB Landing page will have a "Gaff Gallery"
	// section which links to a dedicated Gallery Page.
	@Test(priority = 19, enabled = true, description = "Verify the presence of What's wrong with this Picture? Card")
	public void verifyPresenceWhatswrongwiththisPictureCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// What's wrong with this Picture? Card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath(
						"//h5[contains(text(),'This is a caption to be displayed as part of the Gaff Gallery.')]"))
				.isDisplayed());
	}

	// US-98500-99007-Verify KB Landing page is displaying carousel Video section
	@Test(priority = 20, enabled = true, description = "Verify the presence of Featured Videos Card")
	public void verifyPresenceFeaturedVideosCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Featured Videos Card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//h5[contains(text(),'Featured Videos')]")).isDisplayed());
	}

	// US 98500-98612-Verify that KB landing page will also display a section for
	// Suggested Content, which will contain links to assets that should be
	// suggested on the landing page.
	// US-98500-99005-Verify KB Landing page is displaying suggested content section
	@Test(priority = 21, enabled = true, description = "Verify the presence of Suggested Contents Card")
	public void verifyPresenceSuggestedContentsCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Suggested Contents Card presence verification
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//h5[contains(text(),'Suggested Content')]")).isDisplayed());
	}

	// US-98500-99009-Verify  O-Calc Pro section in the KB landing page
	@Test(priority = 22, enabled = true, description = "Verify the presence of Buttons on Oclac Pro Card")
	public void verifyPresenceOfOcalCproButtons() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// verification of the presence of buttons and text
		Assert.assertTrue(Page.driver.findElement(By.xpath("//button[contains(text(),'TRY IT NOW')]")).isDisplayed());
		Assert.assertEquals(Page.getText("TryItNowBtn_XPATH"), "TRY IT NOW");
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//button[contains(text(),'TRAINING SCHEDULE')]")).isDisplayed());
		Assert.assertEquals(Page.getText("TrainingScheduleBtn_XPATH"), "TRAINING SCHEDULE");
		Assert.assertTrue(Page.driver.findElement(By.xpath("//button[contains(text(),'BROCHURE')]")).isDisplayed());
		Assert.assertEquals(Page.getText("BrochureBtn_XPATH"), "BROCHURE");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		String OcalProCard_Txt = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Structural Analysis Software for Utility Poles')]"))
				.getText();
		Assert.assertEquals(OcalProCard_Txt, "Structural Analysis Software for Utility Poles");

	}

	// US 98500-98612-Verify that KB landing page will also display a section for
	// Suggested Content, which will contain links to assets that should be
	// suggested on the landing page.
	// US-98500-99005-Verify KB Landing page is displaying suggested content section
	@Test(priority = 23, enabled = true, description = "Verify the presence of slider on Suggested Contents")
	public void verifyPresenceOfSliderOnSuggestedContents() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// verification of the presence of Items
		Assert.assertTrue(Page.driver.findElement(By.xpath("//button[@class='slick-next slick-arrow']")).isDisplayed());
		Page.click("SuggestedContentsSlider_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		String suggestedContentsToolTip = Page.driver.findElement(By.xpath("//*[@title='Osmose Bulletin']"))
				.getAttribute("title");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		Assert.assertEquals(suggestedContentsToolTip, "Osmose Bulletin");
	}

	// US 98500-98612-Verify that KB landing page will also display a section for
	// Suggested Content, which will contain links to assets that should be
	// suggested on the landing page.
	// US-98500-99005-Verify KB Landing page is displaying suggested content section
	// US-98500-99006-Verify System is opening the content in Box Content display
	// when user clicked on any item from suggested content
	@Test(priority = 24, enabled = true, description = "Verify the click on item in Suggested Contents")
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
		Assert.assertTrue(Page.driver.findElement(By.xpath("//button[@class='close closeCST' and @type='button']"))
				.isDisplayed());
		kb.clickBoxCloseBtn();
	}

	// US-98500-99008-Verify System is opening the Featured Video in Box content
	// when user clicks on video thumbnail
	@Test(priority = 25, enabled = true, description = "Verify the click on item in Featured Videos")
	public void verifyClickOnItemFeaturedVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		kb.clickVideoFeaturedVideo();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// verification of cross/close icon
		Assert.assertTrue(Page.driver.findElement(By.xpath("//button[@class='close closeCST' and @type='button']"))
				.isDisplayed());
		kb.clickBoxCloseBtn();
	}

	// US-98500-98668-Verify KB Landing page will have a tile titled "Featured
	// Project"(Project of the Week)
	@Test(priority = 26, enabled = true, description = "Verify the click on View Project on Project of the week")
	public void verifyClickOnViewProjectProjectOfTheWeek() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		kb.clickViewProject();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// verification of cross/close icon
		Assert.assertTrue(Page.driver.findElement(By.xpath("//button[@class='close closeCST' and @type='button']"))
				.isDisplayed());
		kb.clickBoxCloseBtn();
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 27, enabled = true, description = "Verify the Card Contents of Steel Concrete Assessment")
	public void verifyCardContentsSteelConcreteAssessment() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Steel Concrete Assessment
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Images']/a/span)[2]")).isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteAssessmentCardimageslink_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Brochures']/a/span)[2]")).isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteAssessmentCardBrochureslink_XPATH"), "BROCHURES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Standards/Codes']/a/span)[1]")).isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteAssessmentCardStandardsCodeslink_XPATH"), "STANDARDS/CODES");
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("(//img[@alt='Thumbnail - Steel Tile.jpg'])[1]")).isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 28, enabled = true, description = "Verify the Card Contents of Steel Concrete Restoration")
	public void verifyCardContentsSteelConcreteRestoration() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Steel Concrete Restoration
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Articles']/a/span)[2]")).isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteRestortationtArticleslink_XPATH"), "ARTICLES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Brochures']/a/span)[3]")).isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteRestortationBrochureslink_XPATH"), "BROCHURES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Images']/a/span)[3]")).isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteRestortationImageslink_XPATH"), "IMAGES");
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("(//img[@alt='Thumbnail - Steel Tile.jpg'])[2]")).isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 29, enabled = true, description = "Verify the Card Contents of Wood | Inspection & Treatment")
	public void verifyCardContentsWoodInspectionTreatment() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Wood | Inspection & Treatment
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Videos']/a/span)[1]")).isDisplayed());
		Assert.assertEquals(Page.getText("WoodInspectionVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Images']/a/span)[1]")).isDisplayed());
		Assert.assertEquals(Page.getText("WoodInspectionImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Research']/a/span)[1]")).isDisplayed());
		Assert.assertEquals(Page.getText("WoodInspectionResearch_XPATH"), "RESEARCH");
		Assert.assertTrue(Page.driver.findElement(By.xpath("//img[@alt='Thumbnail - wood.jpg']")).isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 30, enabled = true, description = "Verify the Card Contents of Steel Concrete Assessment")
	public void verifyCardContentsWoodRestoration() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Steel Concrete Assessment
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Videos']/a/span)[2]")).isDisplayed());
		Assert.assertEquals(Page.getText("WoodRestorationVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Brochures']/a/span)[1]")).isDisplayed());
		Assert.assertEquals(Page.getText("WoodRestorationBrochuers_XPATH"), "BROCHURES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Articles']/a/span)[1]")).isDisplayed());
		Assert.assertEquals(Page.getText("WoodRestorationArticles_XPATH"), "ARTICLES");
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//img[@alt='Thumbnail - wood restoration.jpg']")).isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 31, enabled = true, description = "Verify the Card Contents of Joint Use")
	public void verifyCardContentsJointUse() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Joint Use
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Images']/a/span)[6]")).isDisplayed());
		Assert.assertEquals(Page.getText("JointUseImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Videos']/a/span)[4]")).isDisplayed());
		Assert.assertEquals(Page.getText("JointUseVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Articles']/a/span)[3]")).isDisplayed());
		Assert.assertEquals(Page.getText("JointUseArticles_XPATH"), "ARTICLES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//img[@alt='Thumbnail.jpg'])[3]")).isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 32, enabled = true, description = "Verify the Card Contents of Overhead")
	public void verifyCardContentsOverhead() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Overhead
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Videos']/a/span)[3]")).isDisplayed());
		Assert.assertEquals(Page.getText("OverheadVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Images']/a/span)[5]")).isDisplayed());
		Assert.assertEquals(Page.getText("OverheadImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Project Profiles']/a/span)[1]")).isDisplayed());
		Assert.assertEquals(Page.getText("OverheadProjectProfiles_XPATH"), "PROJECT PROFILES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//img[@alt='Thumbnail.jpg'])[2]")).isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 33, enabled = true, description = "Verify the Card Contents of Pole Replacement")
	public void verifyCardContentsPoleReplacement() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Pole Replacement
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Images']/a/span)[7]")).isDisplayed());
		Assert.assertEquals(Page.getText("PoleReplacementImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Videos']/a/span)[5]")).isDisplayed());
		Assert.assertEquals(Page.getText("PoleReplacementVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Brochure']/a/span)[2]")).isDisplayed());
		Assert.assertEquals(Page.getText("PoleReplacementBrochure_XPATH"), "BROCHURE");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//img[@alt='Thumbnail.jpg'])[4]")).isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 34, enabled = true, description = "Verify the Card Contents of Products")
	public void verifyCardContentsProducts() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Products
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Images']/a/span)[9]")).isDisplayed());
		Assert.assertEquals(Page.getText("ProductsImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Videos']/a/span)[7]")).isDisplayed());
		Assert.assertEquals(Page.getText("ProductsVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Product Catalog']/a/span)[1]")).isDisplayed());
		Assert.assertEquals(Page.getText("ProductsProductCatalog_XPATH"), "PRODUCT CATALOG");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//img[@alt='Thumbnail.jpg'])[5]")).isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 35, enabled = true, description = "Verify the Card Contents of Storm Support")
	public void verifyCardContentsStormSupport() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Storm Support
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Images']/a/span)[8]")).isDisplayed());
		Assert.assertEquals(Page.getText("StormSupportImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Videos']/a/span)[6]")).isDisplayed());
		Assert.assertEquals(Page.getText("StormSupportVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Project Profiles']/a/span)[2]")).isDisplayed());
		Assert.assertEquals(Page.getText("StormSupportProjectProfiles_XPATH"), "PROJECT PROFILES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//img[@alt='Thumbnail.jpg'])[5]")).isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 36, enabled = true, description = "Verify the Card Contents of Underground")
	public void verifyCardContentsUnderground() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Underground
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Images']/a/span)[4]")).isDisplayed());
		Assert.assertEquals(Page.getText("UndergroundImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Brochure']/a/span)[1]")).isDisplayed());
		Assert.assertEquals(Page.getText("UndergroundBrochure_XPATH"), "BROCHURE");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//li[@id='Diagram']/a/span)[1]")).isDisplayed());
		Assert.assertEquals(Page.getText("UndergroundDiagram_XPATH"), "DIAGRAM");
		Assert.assertTrue(Page.driver.findElement(By.xpath("(//img[@alt='Thumbnail.jpg'])[1]")).isDisplayed());
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
	@Test(priority = 38, enabled = true, description = "Verify the click on Daliy Gaff Gallery on What's wrong with this picture")
	public void verifyClickOnDailyGaffGallery() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickDailyGaffGallery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		// Verification of Back button and Images text
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("DailyGaffGalleryImagesTxt_XPATH"), "Images");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		kb.clickDailyGaffGalleryBackbtn();
	}

	// US-98500-98610-Verify that KB Landing page will have a "Gaff Gallery" section
	// which links to a dedicated Gallery Page.
	// US-98500-98611-Verify that the Gallery Page will display a gallery of images.
	// When selected, the image will display a caption.
	@Test(priority = 39, enabled = true, description = "Verify the click on an Image on Daliy Gaff Gallery")
	public void verifyClickOnDailyGaffGalleryImage() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		kb.clickDailyGaffGallery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		// Verification of the presence of image
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//img[@class='w-100' and @alt='Gaff Gallery Image']")).isDisplayed());
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
	@Test(priority = 40, enabled = true, description = "Verify the click on Joint Use Card")
	public void verifyClickOnJointUseCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickJointUs();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		WebElement VideoResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		/*
		 * WebElement ImageResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		 * Assert.assertTrue(ImageResultsSection.isDisplayed());
		 */
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("PopularQueriesFilter_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		WebElement JointUsePopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Joint Use Vanity Query 1')]"));
		Assert.assertTrue(JointUsePopularFilter1.isDisplayed());
		WebElement JointUsePopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Joint Use Vanity Query 2')]"));
		Assert.assertTrue(JointUsePopularFilter2.isDisplayed());
		WebElement JointUsePopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Joint Use Vanity Query 3')]"));
		Assert.assertTrue(JointUsePopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 41, enabled = true, description = "Verify the click on Overhead Card")
	public void verifyClickOnOverheadCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickOverhead();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));

		/*
		 * WebElement VideoResultsSection = Page.driver
		 * .findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		 * Assert.assertTrue(VideoResultsSection.isDisplayed()); WebElement
		 * ImageResultsSection = Page.driver
		 * .findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		 * Assert.assertTrue(ImageResultsSection.isDisplayed());
		 */
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		WebElement OverheadPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Overhead Vanity Query 1')]"));
		Assert.assertTrue(OverheadPopularFilter1.isDisplayed());
		WebElement OverheadPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Overhead Vanity Query 2')]"));
		Assert.assertTrue(OverheadPopularFilter2.isDisplayed());
		WebElement OverheadPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Overhead Vanity Query 3')]"));
		Assert.assertTrue(OverheadPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 42, enabled = true, description = "Verify the click on Pole Replacement Card")
	public void verifyClickOnPoleReplacementCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickPoleReplacement();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		/*
		 * WebElement VideoResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		 * Assert.assertTrue(VideoResultsSection.isDisplayed()); WebElement
		 * ImageResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		 * Assert.assertTrue(ImageResultsSection.isDisplayed());
		 */
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement PoleReplacementPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Pole Replacement Vanity Query 1')]"));
		Assert.assertTrue(PoleReplacementPopularFilter1.isDisplayed());
		WebElement PoleReplacementPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Pole Replacement Vanity Query 2')]"));
		Assert.assertTrue(PoleReplacementPopularFilter2.isDisplayed());
		WebElement PoleReplacementPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Pole Replacement Vanity Query 3')]"));
		Assert.assertTrue(PoleReplacementPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 43, enabled = true, description = "Verify the click on Products Card")
	public void verifyClickOnProductsCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickProducts();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		/*
		 * WebElement VideoResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		 * Assert.assertTrue(VideoResultsSection.isDisplayed()); WebElement
		 * ImageResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		 * Assert.assertTrue(ImageResultsSection.isDisplayed()); WebElement
		 * DocumentResultsSection = Page.driver
		 * .findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		 * Assert.assertTrue(DocumentResultsSection.isDisplayed()); //
		 * Page.click("PopularQueriesFilter_XPATH"); WebElement ProductsPopularFilter1 =
		 * Page.driver
		 * .findElement(By.xpath("//*[contains(text(),'Products Vanity Query 1')]"));
		 * Assert.assertTrue(ProductsPopularFilter1.isDisplayed()); WebElement
		 * ProductsPopularFilter2 = Page.driver
		 * .findElement(By.xpath("//*[contains(text(),'Products Vanity Query 2')]"));
		 * Assert.assertTrue(ProductsPopularFilter2.isDisplayed()); WebElement
		 * ProductsPopularFilter3 = Page.driver
		 * .findElement(By.xpath("//*[contains(text(),'Products Vanity Query 3')]"));
		 * Assert.assertTrue(ProductsPopularFilter3.isDisplayed());
		 * Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		 * kb.clickClearSearch();
		 * Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		 */

		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");

	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 44, enabled = true, description = "Verify the click on Steel and Concrete Assessment Card")
	public void verifyClickOnSteelandConcreteAssessmentCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickSteelAndConcreteAssessment();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		/*
		 * WebElement VideoResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		 * Assert.assertTrue(VideoResultsSection.isDisplayed());
		 */
		WebElement ImageResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		WebElement SteelandConcreteAssessmentPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Assessment Vanity Query 1')]"));
		Assert.assertTrue(SteelandConcreteAssessmentPopularFilter1.isDisplayed());
		WebElement SteelandConcreteAssessmentPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Assessment Vanity Query 2')]"));
		Assert.assertTrue(SteelandConcreteAssessmentPopularFilter2.isDisplayed());
		WebElement SteelandConcreteAssessmentPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Assessment Vanity Query 3')]"));
		Assert.assertTrue(SteelandConcreteAssessmentPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 45, enabled = true, description = "Verify the click on Steel and Concrete Restoration Card")
	public void verifyClickOnSteelandConcreteRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickSteelAndConcreteRestortation();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		/*
		 * WebElement VideoResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		 * Assert.assertTrue(VideoResultsSection.isDisplayed());
		 */
		WebElement ImageResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		WebElement SteelandConcreteRestorationPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Restoration Vanity Query 1')]"));
		Assert.assertTrue(SteelandConcreteRestorationPopularFilter1.isDisplayed());
		WebElement SteelandConcreteRestorationPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Restoration Vanity Query 2')]"));
		Assert.assertTrue(SteelandConcreteRestorationPopularFilter2.isDisplayed());
		WebElement SteelandConcreteRestorationPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Restoration Vanity Query 3')]"));
		Assert.assertTrue(SteelandConcreteRestorationPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

		/*
		 * WebElement noresults = Page.driver .findElement(By.
		 * xpath("//div[contains(text(),'No results match your search criteria')]"));
		 * String text = noresults.getText(); String newtext =
		 * text.substring(text.indexOf('\n') + 1); Assert.assertEquals(newtext,
		 * "No results match your search criteria.");
		 */
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 46, enabled = true, description = "Verify the click on Storm Support Card")
	public void verifyClickOnStormSupportCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickStormSupport();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		WebElement VideoResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement StormSupportPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Storm Support Vanity Query 1')]"));
		Assert.assertTrue(StormSupportPopularFilter1.isDisplayed());
		WebElement StormSupportPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Storm Support Vanity Query 2')]"));
		Assert.assertTrue(StormSupportPopularFilter2.isDisplayed());
		WebElement StormSupportPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Storm Support Vanity Query 3')]"));
		Assert.assertTrue(StormSupportPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 47, enabled = true, description = "Verify the click on Underground Card")
	public void verifyClickOnUndergroundCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickUnderground();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		/*
		 * WebElement VideoResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		 * Assert.assertTrue(VideoResultsSection.isDisplayed()); WebElement
		 * ImageResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		 * Assert.assertTrue(ImageResultsSection.isDisplayed());
		 */
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement UndergroundPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Underground Vanity Query 1')]"));
		Assert.assertTrue(UndergroundPopularFilter1.isDisplayed());
		WebElement UndergroundPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Underground Vanity Query 2')]"));
		Assert.assertTrue(UndergroundPopularFilter2.isDisplayed());
		WebElement UndergroundPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Underground Vanity Query 3')]"));
		Assert.assertTrue(UndergroundPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 48, enabled = true, description = "Verify the click on Wood Restoration Card")
	public void verifyClickOnWoodRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickWoodRestoration();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));

		WebElement VideoResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		/*
		 * WebElement ImageResultsSection =
		 * Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		 * Assert.assertTrue(ImageResultsSection.isDisplayed());
		 */
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		WebElement WoodRestorationPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood | Restoration Vanity Query 1')]"));
		Assert.assertTrue(WoodRestorationPopularFilter1.isDisplayed());
		WebElement WoodRestorationPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood | Restoration Vanity Query 2')]"));
		Assert.assertTrue(WoodRestorationPopularFilter2.isDisplayed());
		WebElement WoodRestorationPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood | Restoration Vanity Query 3')]"));
		Assert.assertTrue(WoodRestorationPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

		/*
		 * WebElement noresults = Page.driver .findElement(By.
		 * xpath("//div[contains(text(),'No results match your search criteria')]"));
		 * String text = noresults.getText(); String newtext =
		 * text.substring(text.indexOf('\n') + 1); Assert.assertEquals(newtext,
		 * "No results match your search criteria.");
		 */
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 49, enabled = true, description = "Verify the click on Wood Inspection Card")
	public void verifyClickOnWoodInspectionCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickWoodInspection();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));

		/*WebElement VideoResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());*/
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		WebElement WoodInspectionPopularFilter1 = Page.driver.findElement(By.xpath("//*[contains(text(),'Wood | Treatments Vanity Query 1')]"));
		Assert.assertTrue(WoodInspectionPopularFilter1.isDisplayed());
		WebElement WoodInspectionPopularFilter2 = Page.driver.findElement(By.xpath("//*[contains(text(),'Wood | Treatments Vanity Query 2')]"));
		Assert.assertTrue(WoodInspectionPopularFilter2.isDisplayed());
		WebElement WoodInspectionPopularFilter3 = Page.driver.findElement(By.xpath("//*[contains(text(),'Wood | Treatments Vanity Query 3')]"));
		Assert.assertTrue(WoodInspectionPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

		/*
		 * WebElement noresults = Page.driver .findElement(By.
		 * xpath("//div[contains(text(),'No results match your search criteria')]"));
		 * String text = noresults.getText(); String newtext =
		 * text.substring(text.indexOf('\n') + 1); Assert.assertEquals(newtext,
		 * "No results match your search criteria.");
		 */
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	// US-98506-98724-Verify when user clicks on image from gallery system will open
	// the image content display page (Box)
	@Test(priority = 50, enabled = true, description = "Verify the click on Images under Joint Use")
	public void verifyClickonJointUsImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickJointUseImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackBtnImages = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Images ']"))
				.getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of image
		WebElement ImageContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(ImageContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement JointUseImagesPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Joint Use Vanity Query 1')]"));
		Assert.assertTrue(JointUseImagesPopularFilter1.isDisplayed());
		WebElement JointUseImagesPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Joint Use Vanity Query 2')]"));
		Assert.assertTrue(JointUseImagesPopularFilter2.isDisplayed());
		WebElement JointUseImagesPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Joint Use Vanity Query 3')]"));
		Assert.assertTrue(JointUseImagesPopularFilter3.isDisplayed());
		// WebElement imageTitle =
		// Page.driver.findElement(By.xpath("//*[contains(text(),'Test Image (Joint Use
		// 2)')]"));
		// Assert.assertEquals(imageTitle.getText(), "Test Image (Joint Use 2)");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickJointUseOnAnImage();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickJointUseImagesBackbtn();*/
		
		WebElement noresults = Page.driver .findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText(); 
		String newtext = text.substring(text.indexOf('\n') + 1); 
		Assert.assertEquals(newtext,"No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-98506-98723-Verify video content display page will display the asset title
	// and description in addition to the embedded preview window.
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 51, enabled = true, description = "Verify the click on Videos under Joint Use")
	public void verifyClickonJointUsVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickJointUseVideos();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		// Verify the presence of Back Button
		WebElement BackButtonVideos = Page.driver.findElement(By.xpath("//a[@class='btnLink m-0']"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Videos ' ]"))
				.getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of video
		WebElement VideoContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(VideoContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement JointUseVideosPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Joint Use Vanity Query 1')]"));
		Assert.assertTrue(JointUseVideosPopularFilter1.isDisplayed());
		WebElement JointUseVideosPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Joint Use Vanity Query 2')]"));
		Assert.assertTrue(JointUseVideosPopularFilter2.isDisplayed());
		WebElement JointUseVideosPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Joint Use Vanity Query 3')]"));
		Assert.assertTrue(JointUseVideosPopularFilter3.isDisplayed());
		WebElement videoTitle = Page.driver.findElement(By.xpath("//*[contains(text(),' Day in the Life Video ')]"));
		Assert.assertEquals(videoTitle.getText(), "Day in the Life Video");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickJointUseOnAVideo();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		// kb.clickJointUseVideosBackbtn();
		// Page.click("JointUsVideosBackBtn_XPATH");
		kb.clickClearSearch();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 52, enabled = true, description = "Verify the click on Articles under Joint Use")
	public void verifyClickonJointUsArticles() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickJointUseArticles();
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-98506-98734-Verify When a user selects an asset(Video) for viewing, the
	// video should be opened in content display
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 53, enabled = true, description = "Verify the click on Videos under Overhead")
	public void verifyClickonOverheadVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickOverheadVideos();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackButtonVideos = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Videos ' ]"))
				.getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of video
		WebElement VideoContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(VideoContent.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickOverheadOnAVideo();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		WebElement VideoHeader = Page.driver
				.findElement(By.xpath("//div[contains(text(),'Test Video (Overhead 1)') and @class='KBmtpx']"));
		Assert.assertEquals(VideoHeader.getText(), "Test Video (Overhead 1)");
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement OverheadVideosPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Overhead Vanity Query 1')]"));
		Assert.assertTrue(OverheadVideosPopularFilter1.isDisplayed());
		WebElement OverheadVideosPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Overhead Vanity Query 2')]"));
		Assert.assertTrue(OverheadVideosPopularFilter2.isDisplayed());
		WebElement OverheadVideosPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Overhead Vanity Query 3')]"));
		Assert.assertTrue(OverheadVideosPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		// kb.clickOverheadVideosBackbtn();
		// Page.click("OverheadVideosBackBtn_XPATH");
		kb.clickClearSearch();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 54, enabled = true, description = "Verify the click on Images under Overhead")
	public void verifyClickonOverheadImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickOverheadImages();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackBtnImages = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Images ']"))
				.getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of image
		WebElement ImageContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(ImageContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement OverheadImagesPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Overhead Vanity Query 1')]"));
		Assert.assertTrue(OverheadImagesPopularFilter1.isDisplayed());
		WebElement OverheadImagesPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Overhead Vanity Query 2')]"));
		Assert.assertTrue(OverheadImagesPopularFilter2.isDisplayed());
		WebElement OverheadImagesPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Overhead Vanity Query 3')]"));
		Assert.assertTrue(OverheadImagesPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickOverheadOnAnImage();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickOverheadImagesBackbtn();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	// US-98506-98737-Verify when user clicks on document from document list system
	// will open the document content display
	@Test(priority = 55, enabled = true, description = "Verify the click on Project profiles under Overhead")
	public void verifyClickonOverheadProjectProfiles() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickOverheadProjectProfiles();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackBtnProjectProfiles = Page.driver
				.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnProjectProfiles.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Documents ']"))
				.getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver.findElement(
				By.xpath("//div[@class='docBox m-0 mb-2']//a[text()='Test Project Profiles (Overhead 2)']"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement OverheadProjectProfilesPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Overhead Vanity Query 1')]"));
		Assert.assertTrue(OverheadProjectProfilesPopularFilter1.isDisplayed());
		WebElement OverheadProjectProfilesPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Overhead Vanity Query 2')]"));
		Assert.assertTrue(OverheadProjectProfilesPopularFilter2.isDisplayed());
		WebElement OverheadProjectProfilesPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Overhead Vanity Query 3')]"));
		Assert.assertTrue(OverheadProjectProfilesPopularFilter3.isDisplayed());
		WebElement documentTitle = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Test Project Profiles (Overhead 2)')]"));
		Assert.assertEquals(documentTitle.getText(), "Test Project Profiles (Overhead 2)");
		WebElement docDescription = Page.driver.findElement(By.xpath("(//div[@class='docBox m-0 mb-2']//span)[1]"));
		Assert.assertEquals(docDescription.getText(), "Test brochure ...");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickOverheadOnADocument();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickOverheadProjectProfilesBackbtn();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 56, enabled = true, description = "Verify the click on Images under Pole Replacement")
	public void verifyClickonPoleReplacementImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickPoleReplacementImages();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackBtnImages = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Images ']"))
				.getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of image
		WebElement ImageContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(ImageContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement PoleReplacementImagesPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Pole Replacement Vanity Query 1')]"));
		Assert.assertTrue(PoleReplacementImagesPopularFilter1.isDisplayed());
		WebElement PoleReplacementImagesPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Pole Replacement Vanity Query 2')]"));
		Assert.assertTrue(PoleReplacementImagesPopularFilter2.isDisplayed());
		WebElement PoleReplacementImagesPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Pole Replacement Vanity Query 3')]"));
		Assert.assertTrue(PoleReplacementImagesPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickPoleReplacementOnAnImage();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickPoleReplacementImagesBackbtn();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 57, enabled = true, description = "Verify the click on Videos under Pole Replacement")
	public void verifyClickonPoleReplacementVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickPoleReplacementVideos();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackButtonVideos = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Videos ']"))
				.getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of video
		WebElement VideoContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(VideoContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement PoleReplacementVideosPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Pole Replacement Vanity Query 1')]"));
		Assert.assertTrue(PoleReplacementVideosPopularFilter1.isDisplayed());
		WebElement PoleReplacementVideosPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Pole Replacement Vanity Query 2')]"));
		Assert.assertTrue(PoleReplacementVideosPopularFilter2.isDisplayed());
		WebElement PoleReplacementVideosPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Pole Replacement Vanity Query 3')]"));
		Assert.assertTrue(PoleReplacementVideosPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickPoleReplacementOnAVideo();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		// kb.clickPoleReplacementVideosBackbtn();
		// Page.click("PoleReplacementVideosBackBtn_XPATH");
		kb.clickClearSearch();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 58, enabled = true, description = "Verify the click on Brochure under Pole Replacement")
	public void verifyClickonPoleReplacementBrochure() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickPoleReplacementBrochure();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		// Verify the presence of Back Button
		WebElement BackBtnBrochure = Page.driver.findElement(By.xpath("//a[@id='navigateBackFromDocAll' and @class='btnLink m-0']"));
		Assert.assertTrue(BackBtnBrochure.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Documents ']"))
				.getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver.findElement(
				By.xpath("//div[@class='docBox m-0 mb-2']//a[text()='Osmo-ET-Truss']"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement PoleReplacementBrochurePopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Pole Replacement Vanity Query 1')]"));
		Assert.assertTrue(PoleReplacementBrochurePopularFilter1.isDisplayed());
		WebElement PoleReplacementBrochurePopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Pole Replacement Vanity Query 2')]"));
		Assert.assertTrue(PoleReplacementBrochurePopularFilter2.isDisplayed());
		WebElement PoleReplacementBrochurePopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Pole Replacement Vanity Query 3')]"));
		Assert.assertTrue(PoleReplacementBrochurePopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickPoleReplacementOnADocument();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickPoleReplacementBrochureBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 59, enabled = true, description = "Verify the click on Images under Products")
	public void verifyClickonProductsImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickProductsImages();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackBtnImages = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Images ']"))
				.getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of image
		WebElement ImageContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(ImageContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement ProductsImagesPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Products Vanity Query 1')]"));
		Assert.assertTrue(ProductsImagesPopularFilter1.isDisplayed());
		WebElement ProductsImagesPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Products Vanity Query 2')]"));
		Assert.assertTrue(ProductsImagesPopularFilter2.isDisplayed());
		WebElement ProductsImagesPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Products Vanity Query 3')]"));
		Assert.assertTrue(ProductsImagesPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickProductsOnAnImage();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickProductsImagesBackbtn();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 60, enabled = true, description = "Verify the click on Videos under Products")
	public void verifyClickonProductsVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickProductsVideos();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackButtonVideos = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Videos ']"))
				.getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of video
		WebElement VideoContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(VideoContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement ProductsVideosPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Products Vanity Query 1')]"));
		Assert.assertTrue(ProductsVideosPopularFilter1.isDisplayed());
		WebElement ProductsVideosPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Products Vanity Query 2')]"));
		Assert.assertTrue(ProductsVideosPopularFilter2.isDisplayed());
		WebElement ProductsVideosPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Products Vanity Query 3')]"));
		Assert.assertTrue(ProductsVideosPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickProductsOnAVideo();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		// kb.clickProductsVideosBackbtn();
		// Page.click("ProductsVideosBackBtn_XPATH");
		kb.clickClearSearch();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 61, enabled = true, description = "Verify the click on Product Catalog under Products")
	public void verifyClickonProductsProductCatalog() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickProductsProductCatalog();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackBtnBrochure = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnBrochure.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Documents ']"))
				.getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver.findElement(
				By.xpath("//div[@class='docBox m-0 mb-2']//a[text()='Test Product Catalog (Products 2)']"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement ProductsProductCatalogPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Products Vanity Query 1')]"));
		Assert.assertTrue(ProductsProductCatalogPopularFilter1.isDisplayed());
		WebElement ProductsProductCatalogPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Products Vanity Query 2')]"));
		Assert.assertTrue(ProductsProductCatalogPopularFilter2.isDisplayed());
		WebElement ProductsProductCatalogPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Products Vanity Query 3')]"));
		Assert.assertTrue(ProductsProductCatalogPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickProductsOnADocument();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickProductsProductCatalogBackbtn();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 62, enabled = true, description = "Verify the click on Images under Steel And Concrete Assessment")
	public void verifyClickonSteelAndConcreteAssessmentImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread8000"))));
		kb.clickSteelandConcreteAssessmentImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		WebElement BackBtnImages = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Images ']"))
				.getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of image
		WebElement ImageContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(ImageContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement SteelandConcreteAssessmentImagesPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Assessment Vanity Query 1')]"));
		Assert.assertTrue(SteelandConcreteAssessmentImagesPopularFilter1.isDisplayed());
		WebElement SteelandConcreteAssessmentImagesPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Assessment Vanity Query 2')]"));
		Assert.assertTrue(SteelandConcreteAssessmentImagesPopularFilter2.isDisplayed());
		WebElement SteelandConcreteAssessmentImagesPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Assessment Vanity Query 3')]"));
		Assert.assertTrue(SteelandConcreteAssessmentImagesPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickSteelAndConcreteAssessmentOnAnImage();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickSteelAndConcreteAssessmentImagesBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 63, enabled = true, description = "Verify the click on Brochures under Steel And Concrete Assessment")
	public void verifyClickonSteelAndConcreteAssessmentBrochures() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickSteelandConcreteAssessmentBrochures();
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 64, enabled = true, description = "Verify the click on Standards/codes under Steel And Concrete Assessment")
	public void verifyClickonSteelAndConcreteAssessmentStandardsCodes() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickSteelandConcreteAssessmentStandards_Codes();
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 65, enabled = true, description = "Verify the click on Articles under Steel And Concrete Restoration")
	public void verifyClickonSteelAndConcreteRestorationArticles() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickSteelandConcreteRestorationArticles();
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 66, enabled = true, description = "Verify the click on Brochures under Steel And Concrete Restoration")
	public void verifyClickonSteelAndConcreteRestorationBrochures() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickSteelandConcreteRestorationBrochures();
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 67, enabled = true, description = "Verify the click on Images under Steel And Concrete Restoration")
	public void verifyClickonSteelAndConcreteRestorationImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickSteelandConcreteRestorationImages();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackBtnImages = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Images ']"))
				.getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of image
		WebElement ImageContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(ImageContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement SteelandConcreteRestorationImagesPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete Restoration Vanity Query 1')]"));
		Assert.assertTrue(SteelandConcreteRestorationImagesPopularFilter1.isDisplayed());
		WebElement SteelandConcreteRestorationImagesPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete Restoration Vanity Query 2')]"));
		Assert.assertTrue(SteelandConcreteRestorationImagesPopularFilter2.isDisplayed());
		WebElement SteelandConcreteRestorationImagesPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete Restoration Vanity Query 3')]"));
		Assert.assertTrue(SteelandConcreteRestorationImagesPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickSteelAndConcreteRestorationOnAnImage();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickSteelAndConcreteRestorationImagesBackbtn();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 68, enabled = true, description = "Verify the click on Images under Storm Support")
	public void verifyClickonStormSupportImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickStormSupportImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		WebElement BackBtnImages = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Images ']"))
				.getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of image
		WebElement ImageContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(ImageContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement StormSupportImagesPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Storm Support Vanity Query 1')]"));
		Assert.assertTrue(StormSupportImagesPopularFilter1.isDisplayed());
		WebElement StormSupportImagesPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Storm Support Vanity Query 2')]"));
		Assert.assertTrue(StormSupportImagesPopularFilter2.isDisplayed());
		WebElement StormSupportImagesPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Storm Support Vanity Query 3')]"));
		Assert.assertTrue(StormSupportImagesPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickStormSupportOnAnImage();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickStormSupportImagesBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 69, enabled = true, description = "Verify the click on Videos under Storm Support")
	public void verifyClickonStormSupportVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickStormSupportVideos();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		WebElement BackButtonVideos = Page.driver.findElement(By.xpath("//a[@class='btnLink m-0']"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Videos ']"))
				.getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of video
		WebElement VideoContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(VideoContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement StormSupportVideosPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Storm Support Vanity Query 1')]"));
		Assert.assertTrue(StormSupportVideosPopularFilter1.isDisplayed());
		WebElement StormSupportVideosPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Storm Support Vanity Query 2')]"));
		Assert.assertTrue(StormSupportVideosPopularFilter2.isDisplayed());
		WebElement StormSupportVideosPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Storm Support Vanity Query 3')]"));
		Assert.assertTrue(StormSupportVideosPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickStormSupportOnAVideo();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		// kb.clickStormSupportVideosBackbtn();
		// Page.click("StormSupportVideosBackBtn_XPATH");
		kb.clickClearSearch();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 70, enabled = true, description = "Verify the click on Project profiles under Storm Support")
	public void verifyClickonStormSupportProjectProfiles() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickStormSupportProjectProfiles();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		WebElement BackBtnProjectProfiles = Page.driver
				.findElement(By.xpath("//a[@id='navigateBackFromDocAll' and @class='btnLink m-0']"));
		Assert.assertTrue(BackBtnProjectProfiles.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Documents ']"))
				.getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver.findElement(
				By.xpath("//div[@class='docBox m-0 mb-2']//a[text()='Project Profile Rural Fiber Build Out and Make-Ready at Cumberland EMC']"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement StormSupportProjectProfilesPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Storm Support Vanity Query 1')]"));
		Assert.assertTrue(StormSupportProjectProfilesPopularFilter1.isDisplayed());
		WebElement StormSupportProjectProfilesPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Storm Support Vanity Query 2')]"));
		Assert.assertTrue(StormSupportProjectProfilesPopularFilter2.isDisplayed());
		WebElement StormSupportProjectProfilesPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Storm Support Vanity Query 3')]"));
		Assert.assertTrue(StormSupportProjectProfilesPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickStormSupportonADocument();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickStormSupportProjectProfilesBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 71, enabled = true, description = "Verify the click on Images under Underground")
	public void verifyClickonUndergroundImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickUndergroundImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackBtnImages = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Images ']"))
				.getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of image
		WebElement ImageContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(ImageContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement UndergroundImagesPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Underground Vanity Query 1')]"));
		Assert.assertTrue(UndergroundImagesPopularFilter1.isDisplayed());
		WebElement UndergroundImagesPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Underground Vanity Query 2')]"));
		Assert.assertTrue(UndergroundImagesPopularFilter2.isDisplayed());
		WebElement UndergroundImagesPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Underground Vanity Query 3')]"));
		Assert.assertTrue(UndergroundImagesPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickUndergroundOnAnImage();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickUndergroundImagesBackbtn();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 72, enabled = true, description = "Verify the click on Brochure under Underground")
	public void verifyClickonUndergroundBrochure() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickUndergroundBrochure();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackBtnProjectProfiles = Page.driver
				.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnProjectProfiles.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Documents ']"))
				.getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver
				.findElement(By.xpath("//div[@class='docBox m-0 mb-2']//a[text()='Test brochure (Underground 1)']"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement UndergroundProjectProfilesPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Underground Vanity Query 1')]"));
		Assert.assertTrue(UndergroundProjectProfilesPopularFilter1.isDisplayed());
		WebElement UndergroundProjectProfilesPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Underground Vanity Query 2')]"));
		Assert.assertTrue(UndergroundProjectProfilesPopularFilter2.isDisplayed());
		WebElement UndergroundProjectProfilesPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Underground Vanity Query 3')]"));
		Assert.assertTrue(UndergroundProjectProfilesPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickUndergroundADocument();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickUndergroundBrochureBackbtn();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 73, enabled = true, description = "Verify the click on Diagram under Underground")
	public void verifyClickonUndergroundDiagram() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickUndergroundDiagram();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackBtnDiagram = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnDiagram.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Documents ']"))
				.getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver
				.findElement(By.xpath("//div[@class='docBox m-0 mb-2']//a[text()='Test Diagram (Underground 1)']"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement UndergroundDiagramPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Underground Vanity Query 1')]"));
		Assert.assertTrue(UndergroundDiagramPopularFilter1.isDisplayed());
		WebElement UndergroundDiagramPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Underground Vanity Query 2')]"));
		Assert.assertTrue(UndergroundDiagramPopularFilter2.isDisplayed());
		WebElement UndergroundDiagramPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Underground Vanity Query 3')]"));
		Assert.assertTrue(UndergroundDiagramPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickUndergroundADiagramDocument();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickUndergroundDiagramBackbtn();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 74, enabled = true, description = "Verify the click on Videos under Wood Restoration")
	public void verifyClickonWoodRestorationVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickWoodRestorationVideos();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackButtonVideos = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Videos ']"))
				.getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of video
		WebElement VideoContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(VideoContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement WoodRestorationVideosPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood Restoration Vanity Query 1')]"));
		Assert.assertTrue(WoodRestorationVideosPopularFilter1.isDisplayed());
		WebElement WoodRestorationVideosPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood Restoration Vanity Query 2')]"));
		Assert.assertTrue(WoodRestorationVideosPopularFilter2.isDisplayed());
		WebElement WoodRestorationVideosPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood Restoration Vanity Query 3')]"));
		Assert.assertTrue(WoodRestorationVideosPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickWoodRestorationOnAVideo();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		// kb.clickWoodRestorationVideosBackbtn();
		// Page.click("WoodRestorationVideosBackBtn_XPATH");
		kb.clickClearSearch();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 75, enabled = true, description = "Verify the click on Brochures under Wood Restoration")
	public void verifyClickonWoodRestorationBrochures() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickWoodRestorationBrochures();
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 76, enabled = true, description = "Verify the click on Articles under Wood Restoration")
	public void verifyClickonWoodRestorationArticles() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickWoodRestorationArticles();
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 77, enabled = true, description = "Verify the click on Videos under Wood Treatment")
	public void verifyClickonWoodTreatmentVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickWoodTreatmentVideos();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackButtonVideos = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Videos ']"))
				.getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of video
		WebElement VideoContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(VideoContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement WoodInspectionVideosPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood Treatments Vanity Query 1')]"));
		Assert.assertTrue(WoodInspectionVideosPopularFilter1.isDisplayed());
		WebElement WoodInspectionVideosPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood Treatments Vanity Query 2')]"));
		Assert.assertTrue(WoodInspectionVideosPopularFilter2.isDisplayed());
		WebElement WoodInspectionVideosPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood Treatments Vanity Query 3')]"));
		Assert.assertTrue(WoodInspectionVideosPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickWoodTreatmentOnAVideo();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		// kb.clickWoodTreatmentVideosBackbtn();
		// Page.click("WoodTreatmentVideosBackBtn_XPATH");
		kb.clickClearSearch();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 78, enabled = true, description = "Verify the click on Images under Wood Treatment")
	public void verifyClickonWoodTreatmentImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickWoodTreatmentImages();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackBtnImages = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Images ']"))
				.getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of image
		WebElement ImageContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(ImageContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement WoodInspectionImagesPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood Treatments Vanity Query 1')]"));
		Assert.assertTrue(WoodInspectionImagesPopularFilter1.isDisplayed());
		WebElement WoodInspectionImagesPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood Treatments Vanity Query 2')]"));
		Assert.assertTrue(WoodInspectionImagesPopularFilter2.isDisplayed());
		WebElement WoodInspectionImagesPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood Treatments Vanity Query 3')]"));
		Assert.assertTrue(WoodInspectionImagesPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickWoodTreatmentOnAnImage();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickWoodTreatmentImagesBackbtn();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	// US-100681-100871-Verify Popular Queries" will be populated with a set of
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 79, enabled = true, description = "Verify the click on Research under Wood Treatment")
	public void verifyClickonWoodTreatmentResearch() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickWoodTreatmentResearch();
		//Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		/*WebElement BackBtnProjectProfiles = Page.driver
				.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnProjectProfiles.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Documents ']"))
				.getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver.findElement(
				By.xpath("//div[@class='docBox m-0 mb-2']//a[text()='Test Research (Wood Treatments 1)']"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		// Page.click("PopularQueriesFilter_XPATH");
		WebElement WoodInspectionResearchPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood Treatments Vanity Query 1')]"));
		Assert.assertTrue(WoodInspectionResearchPopularFilter1.isDisplayed());
		WebElement WoodInspectionResearchPopularFilter2 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood Treatments Vanity Query 2')]"));
		Assert.assertTrue(WoodInspectionResearchPopularFilter2.isDisplayed());
		WebElement WoodInspectionResearchPopularFilter3 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood Treatments Vanity Query 3')]"));
		Assert.assertTrue(WoodInspectionResearchPopularFilter3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickWoodTreatmentOnADocument();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickWoodTreatmentResearchBackbtn();*/
		
		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98504-98685-Verify see more option functionality in "Videos" section in KB
	// landing page
	@Test(priority = 80, enabled = true, description = "Verify the click on See more link on Videos under Joint use PopularQuery")
	public void verifyClickonVideosSeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickJointUsePopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.click("JointUseVideosSeeMoreLink_XPATH");
		// Verify the presence of Back Button
		WebElement BackButtonVideos = Page.driver.findElement(By.xpath("//a[@class='btnLink m-0']"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Videos ']"))
				.getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of video
		WebElement VideoContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(VideoContent.isDisplayed());
		kb.clickClearSearch();
	}

	// US-98504-98686-Verify See More option functionality in Images section in KB
	// landing page
	@Test(priority = 81, enabled = true, description = "Verify the click on See more link on Images under Joint use PopularQuery")
	public void verifyClickonImagesSeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickPoleReplacementPopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.click("PoleReplacementImagesSeeMoreLink_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		WebElement BackBtnImages = Page.driver.findElement(By.xpath("//a[@id='navFromImageResultsAll' and @class='showPointer btnLink m-0']"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Images ']"))
				.getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of image
		WebElement ImageContent = Page.driver.findElement(By.xpath("(//div[@class='imgBox']//img[@class='w-100'])[1]"));
		Assert.assertTrue(ImageContent.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
	}

	// US-98504-98687-Verify See More option functionality in Documents section in
	// KB landing page
	@Test(priority = 82, enabled = true, description = "Verify the click on See more link on Documents under Joint use PopularQuery")
	public void verifyClickonDocumentsSeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickJointUsePopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.click("JointUseDocumentsSeeMoreLink_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		WebElement BackBtnProjectProfiles = Page.driver
				.findElement(By.xpath("//a[@id='navigateBackFromDocAll' and @class='btnLink m-0']"));
		Assert.assertTrue(BackBtnProjectProfiles.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Documents ']"))
				.getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver
				.findElement(By.xpath("//div[@class='docBox m-0 mb-2']//a[text()='Joint Use Management Services']"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
	}

	// US-98504-98688-Verify See More option functionality in News section in KB
	// landing page
	@Test(priority = 83, enabled = true, description = "Verify the click on See more link on a Document under Joint use PopularQuery")
	public void verifyClickonJointUseManagementServicesSeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickJointUsePopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.click("JointUseDocumentsSeeMoreLink_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence of Back Button
		WebElement BackBtnProjectProfiles = Page.driver
				.findElement(By.xpath("//a[@id='navigateBackFromDocAll' and @class='btnLink m-0']"));
		Assert.assertTrue(BackBtnProjectProfiles.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Documents ']"))
				.getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver
				.findElement(By.xpath("//div[@class='docBox m-0 mb-2']//a[text()='Joint Use Management Services']"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		Page.click("JointUseJointUseManagementServicesMoreLink_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Assert.assertEquals(Page.getText("JointUseJointUseManagemenrServicesHeaderTxt_XPATH"),
				"Joint Use Management Services");
		// Verification of the presence of link
		WebElement BoxCloseBtn = Page.driver
				.findElement(By.xpath("//button[@type='button' and @class='close closeCST']"));
		Assert.assertTrue(BoxCloseBtn.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		Page.click("BoxCloseBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		kb.clickClearSearch();
	}

	// US-98501-98614-Verify that The Search Bar will provide the user with a
	// drop-down when they start entering the searchQuery.
	// US-98502-98623-Verify that system shall allow users to perform keyword
	// searches which return results based on document content and metadata
	// fields(title, description, keyword)
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 84, enabled = true, description = "Verification of dynamic dropdown on search field")
	public void verifyDynamicDropdown(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.type("SearchBox_XPATH", data.get("AskOsmoseSearch"));
		// Verification of the presence of dynamic dd
		WebElement Dynamicdd = Page.driver.findElement(By.xpath("//ul[@class='list-unstyled searchList']"));
		Assert.assertTrue(Dynamicdd.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		// Clicking on Industry option
		Page.click("IndustryOptionDD_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		// Verification of the Search Results
		Assert.assertEquals(Page.getText("IndustryText_XPATH"), "Repellent Products for the Utility Industry");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread2000"))));
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	// US-98503-98669-Verify Search results section will be organized into separate
	// "grouped" areas based on the asset category and type.
	// US-98502-98616-Verify that the search bar will provide options for searching
	// only for specific media types
	// US-98502-98622-Verify that Default "All" option is selected for searching.
	@Test(priority = 85, enabled = true, description = "Verify that Search results section will be organized into separate grouped")
	public void verifySearchResultsAreGrouped() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickPoleReplacementPopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		WebElement VideoResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	// US-98503-98669-Verify Search results section will be organized into separate
	// "grouped" areas based on the asset category and type.
	// US-98503-98670-Verify Search results section will be updated and organized
	// into separate "grouped" areas based on the asset category and type when user
	// switches the selection of Popular queries
	// US-98505-98691-Verify Search results section will be updated and organized
	// into separate "grouped" areas based on the asset category and type when user
	// switches the selection of Popular queries
	@Test(priority = 86, enabled = true, description = "Verify that Search results section will be organized into separate grouped after updation of Popular filter")
	public void verifySearchResultsAreGroupedAfterfilterUpdation() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickPoleReplacementPopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.ClickPopularQueriesFilter();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("PoleReplacement2Filter_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		WebElement VideoResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	// US-98503-98672-Verify System displaying search results based on the entered
	// search criteria
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 87, enabled = true, description = "Verify that Search results section will be organized into separate grouped after typing value in Search field")
	public void verifySearchResultsOnTyping(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.type("SearchBox_XPATH", data.get("TypePoleReplacement"));
		Page.driver.findElement(By.xpath("//input[@id='SearchFieldKB']")).sendKeys(Keys.ENTER);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		WebElement VideoResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	// US-98503-98673-Verify Clear Search results
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 88, enabled = true, description = "Verify that clicking on clear button will clear the field")
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
	@Test(priority = 89, enabled = true, description = "Verify that Search results section will display only videos section")
	public void verifySearchResultsAreVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickJointUsePopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.click("VideosLink_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		WebElement VideoResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Videos ']"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	// US-98503-98675-Verify System will filter the search results when user selects
	// the 'Images' Category filer
	// US-98502-98618-Verify that search bar will provide options for searching
	// images.
	@Test(priority = 90, enabled = true, description = "Verify that Search results section will display only images section")
	public void verifySearchResultsAreImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickPoleReplacementPopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.click("ImagesLink_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		WebElement ImageResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()=' Images ']"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

	}

	// US-98503-98677-Verify System will filter the search results when user selects
	// the 'Documents' Category filer
	// US-98502-98620-Verify that search bar will provide options for searching
	// documents.
	@Test(priority = 91, enabled = true, description = "Verify that Search results section will display only documents section")
	public void verifySearchResultsAreDocuments() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickJointUsePopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.click("DocumentsLink_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()=' Documents ']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

	}

	// US-98503-98680-Verify If a "grouped" area has no assets to display, then the
	// area will be hidden.<Grouped areas: Video, Images, Documents, and News>
	// US-98502-98733-Verify message displayed by system when there are no records
	// or search results for entered search criteria
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 92, enabled = true, description = "Verify no results found message on Search Box")
	public void verifyNoResultsFoundMessage(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.type("SearchBox_XPATH", data.get("NoResults"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.findElement(By.xpath("//input[@id='SearchFieldKB']")).sendKeys(Keys.ENTER);

		WebElement noresults = Page.driver
				.findElement(By.xpath("//div[contains(text(),'No results match your search criteria')]"));
		String text = noresults.getText();
		String newtext = text.substring(text.indexOf('\n') + 1);
		Assert.assertEquals(newtext, "No results match your search criteria.");
	}

	// US-98503-98681-Verify Document result set section will allow users to sort
	// the result set by 'Relevance' and 'Most Recent'
	@Test(priority = 93, enabled = true, description = "Verify the presence of Sort by dropdown and its values")
	public void verifyPresenceOfSortBy() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.ClickPopularQueriesFilter();
		kb.clickJointUsePopularQuery();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.click("DocumentsLink_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()=' Documents ']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		// Verification of the presence of Sort By Dropdown
		WebElement DocumentSortBy = Page.driver.findElement(By.xpath("//select[@class='sbox']"));
		Assert.assertTrue(DocumentSortBy.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread1000"))));
		Page.click("DocumentsSortByDD_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread5000"))));
		// Verification of the options present in Sort By Dropdown
		Assert.assertEquals(Page.getText("SortByOptionDD_XPATH"), "SORT BY");
		Assert.assertEquals(Page.getText("RelevanceOptionDD_XPATH"), "Relevance");
		Assert.assertEquals(Page.getText("MostRecentOptionDD_XPATH"), "Most Recent");
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));

	}

	// US-98503-98672-Verify System displaying search results based on the entered
	// search criteria
	// US-98502-98624-Verify that The system shall allow users to modify searches
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 94, enabled = true, description = "Verify that the text entered in search field can be modified")
	public void verifySearchTextUpdation(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.type("SearchBox_XPATH", data.get("TypeJointUseTextUpdation"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.clear("SearchBox_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.type("SearchBox_XPATH", data.get("TypePoleReplacementTextUpdation"));
		Page.driver.findElement(By.xpath("//input[@id='SearchFieldKB']")).sendKeys(Keys.ENTER);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		WebElement VideoResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Videos']"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver.findElement(By.xpath("//h5[@class='m-0' and text()='Images']"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//h5[@class='m-0' and text()='Documents']"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickClearSearch();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
	}

	// US-100681-100877-Verify system is displaying results based on selection in
	// sub-category "Filters" specific to the tile category selected.
	@Test(priority = 95, enabled = true, description = "Verify the Popular filters on Images under Steel & Concrete Assessment")
	public void verifyPopularFiltersSteelAndConcreteAssessmentImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickSteelandConcreteAssessmentImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		//Page.click("PopularQueriesFilter_XPATH");
		WebElement PoleReplacementImagesPopularFilter1 = Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Assessment Vanity Query 1')]"));
		PoleReplacementImagesPopularFilter1.click();
		Page.click("PopularFilterSteelConcreteAssessmentVideo_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		kb.clickBoxCloseBtn();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("ClearSearchBtn_XPATH");
	}

	// US-100681-100878-Verify Popular Queries on the result page will revert to the
	// default set when user performs free form search in the "Ask Osmose" box after
	// sub-category filter search is performed
	@Test(priority = 96, enabled = true, description = "Verify that popular queries are reset to default")
	public void verifyPopularQueriesReset() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		kb.clickSteelandConcreteAssessmentImages();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		WebElement PopFil1 = Page.driver.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Assessment Vanity Query 1')]"));
		Assert.assertTrue(PopFil1.isDisplayed());
		WebElement PopFil2 = Page.driver.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Assessment Vanity Query 2')]"));
		Assert.assertTrue(PopFil2.isDisplayed());
		WebElement PopFil3 = Page.driver.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Assessment Vanity Query 3')]"));
		Assert.assertTrue(PopFil3.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.click("ClearSearchBtn_XPATH");
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		WebElement PopFilDef1 = Page.driver.findElement(By.xpath("//*[contains(text(),'Joint Use')]"));
		Assert.assertTrue(PopFilDef1.isDisplayed());
		WebElement PopFilDef2 = Page.driver.findElement(By.xpath("//*[contains(text(),'Steel Assessment')]"));
		Assert.assertTrue(PopFilDef2.isDisplayed());
		WebElement PopFilDef3 = Page.driver.findElement(By.xpath("//*[contains(text(),'Pole Replacement')]"));
		Assert.assertTrue(PopFilDef3.isDisplayed());
	}

	// US-98506-100683-Verify External video from YouTube and Vimeo should open in
	// there respective video player
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 97, enabled = true, description = "Verify presence of External video from YouTube and Vimeo")
	public void verifyExternalVideo(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.type("SearchBox_XPATH", data.get("TypeExternal"));
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread3000"))));
		Page.driver.findElement(By.xpath("//input[@id='SearchFieldKB']")).sendKeys(Keys.ENTER);
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread6000"))));
		Page.click("SeeMoreVideos_ID");
		WebElement youtubeVideo = Page.driver
				.findElement(By.xpath("//div[@class='vTitle' and contains(text(),'National Wood Pole Standa ...')]"));
		Assert.assertTrue(youtubeVideo.isDisplayed());
		WebElement vimeoVideo = Page.driver
				.findElement(By.xpath("//div[@class='vTitle' and contains(text(),'OsmoWeld MPF Pole Repair')]"));
		Assert.assertTrue(vimeoVideo.isDisplayed());
		Thread.sleep((Long.parseLong(p.config.getProperty("Thread4000"))));
		Page.click("KBHomePage_XPATH");
	}

}
