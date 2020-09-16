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

	// US-98498-98570-Verify that Users will be able to access to KB Landing Page on
	// clicking the top tier menu item 'Knowledge Base'.
	@Test(priority = 1, enabled = true, description = "Verify the click on Knowledge Base menu and card Navigation")
	public void verifyKnowledgeBaseNavigationClick() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(5000);
		kb.clickKBNavigation();
		Thread.sleep(5000);
		Assert.assertEquals(Page.getText("KnowledgeBaseFirstHeaderTxt_XPATH"), "Knowledge Base");
		Assert.assertEquals(Page.getText("KnowledgeBaseSecondHeaderTxt_XPATH"), "How can we help?");
		Thread.sleep(5000);
		Page.click("KBHomePage_XPATH");
		Thread.sleep(5000);
		kb.clickKBCard();
		Thread.sleep(5000);
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
				.findElement(By.xpath("//div[@id='knowledgeBaseSearchBox']/div[1]/div[1]/div[1]/div[1]/input"))
				.isDisplayed());
		String Placeholder = Page.driver
				.findElement(By.xpath("//div[@id='knowledgeBaseSearchBox']/div[1]/div[1]/div[1]/div[1]/input"))
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
		Assert.assertTrue(Page.driver.findElement(By.xpath("//div[@id='collapseFilter']/div")).isDisplayed());
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[@id='collapseFilter']/div/div/div/div/div/div[1]/label")).isDisplayed());
		Assert.assertEquals(Page.getText("JointUseFilter_XPATH"), "Joint Use");
		kb.ClickPopularQueriesFilter();
		Thread.sleep(2000);
		Assert.assertFalse(Page.driver.findElement(By.xpath("//div[@id='collapseFilter']/div")).isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 6, enabled = true, description = "Verify the presence of Steel And Concrete Assessment")
	public void verifyPresenceSteelAndConcreteAssessmentCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Steel and Concrete Assessment card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Assessment')]"))
				.isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 7, enabled = true, description = "Verify the presence of Steel And Concrete Restoration")
	public void verifyPresenceSteelAndConcreteRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Steel and Concrete Restoration card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[contains(text(),'Steel & Concrete | Restoration')]"))
				.isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 8, enabled = true, description = "Verify the presence of Wood Inspection And Treatment Card")
	public void verifyPresenceWoodInspectionAndTreatmentCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Wood Inspection And Treatment card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood | Treatments')]"))
				.isDisplayed());
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 9, enabled = true, description = "Verify the presence of Wood Restoration Card")
	public void verifyPresenceWoodRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Wood Restoration Card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[contains(text(),'Wood | Restoration')]"))
				.isDisplayed());
	}
	
	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 10, enabled = true, description = "Verify the presence of  Underground")
	public void verifyPresenceUndergroundCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		//  Underground card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[contains(text(),'Underground')]"))
				.isDisplayed());
	}
	
	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 11, enabled = true, description = "Verify the presence of Overhead")
	public void verifyPresenceOverheadCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		//  Overhead card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[contains(text(),'Overhead')]"))
				.isDisplayed());
	}
	
	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 12, enabled = true, description = "Verify the presence of Joint Use")
	public void verifyPresenceJointUseCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		//  Joint Use card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[contains(text(),'Joint Use')]"))
				.isDisplayed());
	}
	
	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 13, enabled = true, description = "Verify the presence of Pole Replacement")
	public void verifyPresencePoleReplacementCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		//  Pole Replacement card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//h5[contains(text(),'Pole Replacement')]"))
				.isDisplayed());
	}
	
	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 14, enabled = true, description = "Verify the presence of Storm Support")
	public void verifyPresenceStormSupportCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		//  Storm Support card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[contains(text(),'Storm Support')]"))
				.isDisplayed());
	}
	
	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	@Test(priority = 15, enabled = true, description = "Verify the presence of Products")
	public void verifyPresenceProductsCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		//  Products card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[contains(text(),'Products')]"))
				.isDisplayed());
	}

	// US-98498-98739-Verify tiles related to News Feed section
	@Test(priority = 16, enabled = true, description = "Verify the presence of Industry News Card")
	public void verifyPresenceIndustryNewsCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Industry Card presence verification
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//*[@id='contentPart0']/div/div/div/div/div[2]/div[1]/div[1]/div/h5"))
						.isDisplayed());
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[@id='contentPart0']/div/div/div/div/div[2]/div[1]/div[2]/div[4]/a"))
				.isDisplayed());
	}

	// US-98498-98740-Verify tiles related to O-Calc Pro
	// US-98500-99009-Verify  O-Calc Pro section in the KB landing page
	@Test(priority = 17, enabled = true, description = "Verify the presence of O-Calc Pro Card")
	public void verifyPresenceOCalcProCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// O-Calc Pro Card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@id='contentPart0']/div/div/div/div/div[2]/div[2]/div"))
				.isDisplayed());
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
				Page.driver.findElement(By.xpath("//*[@id='contentPart0']/div/div/div/div/div[2]/div[3]/div[1]/div/h5"))
						.isDisplayed());
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[@id='contentPart0']/div/div/div/div/div[2]/div[3]/div[2]/div[2]/a"))
				.isDisplayed());
	}

	//// US-98500-98610-Verify that KB Landing page will have a "Gaff Gallery"
	//// section which links to a dedicated Gallery Page.
	@Test(priority = 19, enabled = true, description = "Verify the presence of What's wrong with this Picture? Card")
	public void verifyPresenceWhatswrongwiththisPictureCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// What's wrong with this Picture? Card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div/div/div[1]")).isDisplayed());
	}

	// US-98500-99007-Verify KB Landing page is displaying carousel Video section
	@Test(priority = 20, enabled = true, description = "Verify the presence of Featured Videos Card")
	public void verifyPresenceFeaturedVideosCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Featured Videos Card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div/div/div[2]")).isDisplayed());
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
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div/div/div[3]")).isDisplayed());
	}

	// US-98500-99009-Verify  O-Calc Pro section in the KB landing page
	@Test(priority = 22, enabled = true, description = "Verify the presence of Buttons on Oclac Pro Card")
	public void verifyPresenceOfOcalCproButtons() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// verification of the presence of buttons and text
		Assert.assertTrue(Page.driver
				.findElement(By
						.xpath("//*[@id=\"contentPart0\"]/div/div/div/div/div[2]/div[2]/div/div[2]/p/ul/li[1]/button"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("TryItNowBtn_XPATH"), "TRY IT NOW");
		Assert.assertTrue(Page.driver
				.findElement(By
						.xpath("//*[@id=\"contentPart0\"]/div/div/div/div/div[2]/div[2]/div/div[2]/p/ul/li[2]/button"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("TrainingScheduleBtn_XPATH"), "TRAINING SCHEDULE");
		Assert.assertTrue(Page.driver
				.findElement(By
						.xpath("//*[@id=\"contentPart0\"]/div/div/div/div/div[2]/div[2]/div/div[2]/p/ul/li[3]/button"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("BrochureBtn_XPATH"), "BROCHURE");
		Thread.sleep(3000);
		String OcalProCard_Txt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart0']/div/div/div/div/div[2]/div[2]/div/div[1]/p")).getText();
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
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[5]/div/div/div[3]/div/div/div/button[2]"))
						.isDisplayed());
		Page.click("SuggestedContentsSlider_XPATH");
		Thread.sleep(4000);
		String suggestedContentsToolTip = Page.driver
				.findElement(By.xpath("//*[@id=\"app\"]/div/div[5]/div/div/div[3]/div/div/div/div/div/div[3]/div/div"))
				.getAttribute("title");
		Thread.sleep(4000);
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
		Assert.assertTrue(
				Page.driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[5]/div/div/div[3]/div/div/div/button[2]"))
						.isDisplayed());
		kb.clickSliderIcon();
		Thread.sleep(4000);
		kb.clickItemSuggestedContents();
		Thread.sleep(5000);
		// verification of cross icon
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@id=\"openAdminMyquotes___BV_modal_body_\"]/button"))
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
		Thread.sleep(5000);
		// verification of cross icon
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@id=\"openAdminMyquotes___BV_modal_body_\"]/button"))
				.isDisplayed());
		kb.clickBoxCloseBtn();
	}

	// US-98500-98668-Verify KB Landing page will have a tile titled "Featured
	// Project"(Project of the Week)
	@Test(priority = 26, enabled = true, description = "Verify the click on View Project on Project of the week")
	public void verifyClickOnViewProjectProjectOfTheWeek() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		kb.clickViewProject();
		Thread.sleep(5000);
		// verification of cross icon
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@id=\"openAdminMyquotes___BV_modal_body_\"]/button"))
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
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='115291495643']/div[1]/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteAssessmentCardimageslink_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//div[@id='115291495643']/div[1]/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteAssessmentCardBrochureslink_XPATH"), "BROCHURES");
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//div[@id='115291495643']/div[1]/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteAssessmentCardStandardsCodeslink_XPATH"), "STANDARDS/CODES");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id='115291495643']/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 28, enabled = true, description = "Verify the Card Contents of Steel Concrete Restoration")
	public void verifyCardContentsSteelConcreteRestoration() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Steel Concrete Restoration
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//div[@id='115291494443']/div[1]/div[2]/div[1]/p[1]/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteRestortationtArticleslink_XPATH"), "ARTICLES");
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//div[@id='115291494443']/div[1]/div[2]/div[1]/p[1]/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteRestortationBrochureslink_XPATH"), "BROCHURES");
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//div[@id='115291494443']/div[1]/div[2]/div[1]/p[1]/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteRestortationImageslink_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id='115291494443']/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 29, enabled = true, description = "Verify the Card Contents of Wood | Inspection & Treatment")
	public void verifyCardContentsWoodInspectionTreatment() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Wood | Inspection & Treatment
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='115291493243']/div[1]/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("WoodInspectionVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='115291493243']/div[1]/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("WoodInspectionImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='115291493243']/div[1]/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("WoodInspectionResearch_XPATH"), "RESEARCH");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id='115291493243']/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 30, enabled = true, description = "Verify the Card Contents of Steel Concrete Assessment")
	public void verifyCardContentsWoodRestoration() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Steel Concrete Assessment
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//div[@id='115291496843']/div[1]/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("WoodRestorationVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//div[@id='115291496843']/div[1]/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("WoodRestorationBrochuers_XPATH"), "BROCHURES");
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//div[@id='115291496843']/div[1]/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("WoodRestorationArticles_XPATH"), "ARTICLES");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id='115291496843']/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 31, enabled = true, description = "Verify the Card Contents of Joint Use")
	public void verifyCardContentsJointUse() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Joint Use
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177689493']/div[1]/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("JointUseImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177689493']/div[1]/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("JointUseVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177689493']/div[1]/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("JointUseArticles_XPATH"), "ARTICLES");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id='121177689493']/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 32, enabled = true, description = "Verify the Card Contents of Overhead")
	public void verifyCardContentsOverhead() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Overhead
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121176940132']/div[1]/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("OverheadVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121176940132']/div[1]/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("OverheadImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121176940132']/div[1]/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("OverheadProjectProfiles_XPATH"), "PROJECT PROFILES");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id='121176940132']/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 33, enabled = true, description = "Verify the Card Contents of Pole Replacement")
	public void verifyCardContentsPoleReplacement() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Pole Replacement
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177263710']/div[1]/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("PoleReplacementImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177263710']/div[1]/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("PoleReplacementVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177263710']/div[1]/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("PoleReplacementBrochure_XPATH"), "BROCHURE");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id='121177263710']/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 34, enabled = true, description = "Verify the Card Contents of Products")
	public void verifyCardContentsProducts() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Products
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177344116']/div[1]/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("ProductsImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177344116']/div[1]/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("ProductsVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177344116']/div[1]/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("ProductsProductCatalog_XPATH"), "PRODUCT CATALOG");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id='121177344116']/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 35, enabled = true, description = "Verify the Card Contents of Storm Support")
	public void verifyCardContentsStormSupport() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Storm Support
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177381598']/div[1]/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("StormSupportImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177381598']/div[1]/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("StormSupportVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177381598']/div[1]/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("StormSupportProjectProfiles_XPATH"), "PROJECT PROFILES");
		//Assert.assertTrue(Page.driver.findElement(By.xpath("")).isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 36, enabled = false, description = "Verify the Card Contents of Underground")
	public void verifyCardContentsUnderground() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Underground
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177343612']/div[1]/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("UndergroundImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177343612']/div[1]/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("UndergroundBrochure_XPATH"), "BROCHURE");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//div[@id='121177343612']/div[1]/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("UndergroundDiagram_XPATH"), "DIAGRAM");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id='121177343612']/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	//
	@Test(priority = 37, enabled = true, description = "Verify the Industry News")
	public void verifyIndustrySeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Industry News
		kb.clickIndustrySeeMore();
		Thread.sleep(4000);
		Assert.assertEquals(Page.getText("InustryText_XPATH"), "Industry News");
		kb.clickIndustryBackbtn();
	}

	// US-98500-98610-Verify that KB Landing page will have a "Gaff Gallery" section
	// which links to a dedicated Gallery Page.
	@Test(priority = 38, enabled = true, description = "Verify the click on Daliy Gaff Gallery on What's wrong with this picture")
	public void verifyClickOnDailyGaffGallery() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(6000);
		kb.clickDailyGaffGallery();
		Thread.sleep(6000);
		// Verification of Back button and Images text
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5/a/i"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("DailyGaffGalleryImagesTxt_XPATH"), "Images");
		Thread.sleep(6000);
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
		Thread.sleep(4000);
		kb.clickDailyGaffGallery();
		Thread.sleep(4000);
		// Verification of the presence of image
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id=\"contentPart2\"]/div/div/div/div/div/div/div/div[2]/div/div[1]/div/img"))
				.isDisplayed());
		kb.clickDailyGaffGalleryImage();
		Thread.sleep(4000);
		kb.clickBoxCloseBtn();
		kb.clickDailyGaffGalleryBackbtn();
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	@Test(priority = 40, enabled = true, description = "Verify the click on Joint Use Card")
	public void verifyClickOnJointUseCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickJointUs();
		Thread.sleep(50000);
		WebElement VideoResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[1]/div/div[1]/div/h5"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[2]/div/div[1]/div/h5"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[3]/div/div[1]/div[1]/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
		Thread.sleep(3000);
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	@Test(priority = 41, enabled = true, description = "Verify the click on Overhead Card")
	public void verifyClickOnOverheadCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(15000);
		kb.clickOverhead();
		Thread.sleep(50000);
		WebElement VideoResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[1]/div/div[1]/div/h5"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[2]/div/div[1]/div/h5"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[3]/div/div[1]/div[1]/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
		Thread.sleep(3000);
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	@Test(priority = 42, enabled = true, description = "Verify the click on Pole Replacement Card")
	public void verifyClickOnPoleReplacementCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(15000);
		kb.clickPoleReplacement();
		Thread.sleep(50000);
		WebElement VideoResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[1]/div/div[1]/div/h5"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[2]/div/div[1]/div/h5"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[3]/div/div[1]/div[1]/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
		Thread.sleep(3000);
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	@Test(priority = 43, enabled = true, description = "Verify the click on Products Card")
	public void verifyClickOnProductsCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(15000);
		kb.clickProducts();
		Thread.sleep(50000);
		WebElement VideoResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[1]/div/div[1]/div/h5"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[2]/div/div[1]/div/h5"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[3]/div/div[1]/div[1]/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
		Thread.sleep(3000);
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	@Test(priority = 44, enabled = true, description = "Verify the click on Steel and Concrete Assessment Card")
	public void verifyClickOnSteelandConcreteAssessmentCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(15000);
		kb.clickSteelAndConcreteAssessment();
		Thread.sleep(50000);
		// WebElement VideoResultsSection =
		// Page.driver.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[1]/div/div[1]/div/h5"));
		// Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver
				.findElement(By.xpath("//*[@id=\"contentPart1\"]/div/div/div/div/div[1]/div/div[1]/div/h5"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[2]/div/div[1]/div/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
		Thread.sleep(3000);
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	@Test(priority = 45, enabled = true, description = "Verify the click on Steel and Concrete Restoration Card")
	public void verifyClickOnSteelandConcreteRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(15000);
		kb.clickSteelAndConcreteAssessment();
		Thread.sleep(50000);
		// WebElement VideoResultsSection =
		// Page.driver.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[1]/div/div[1]/div/h5"));
		// Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver
				.findElement(By.xpath("//*[@id=\"contentPart1\"]/div/div/div/div/div[1]/div/div[1]/div/h5"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id=\"contentPart1\"]/div/div/div/div/div[2]/div/div[1]/div[1]/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
		Thread.sleep(3000);
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	@Test(priority = 46, enabled = true, description = "Verify the click on Storm Support Card")
	public void verifyClickOnStormSupportCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(15000);
		kb.clickStormSupport();
		Thread.sleep(50000);
		WebElement VideoResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[1]/div/div[1]/div/h5"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[2]/div/div[1]/div/h5"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[3]/div/div[1]/div[1]/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
		Thread.sleep(3000);
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	@Test(priority = 47, enabled = true, description = "Verify the click on Underground Card")
	public void verifyClickOnUndergroundCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(15000);
		kb.clickUnderground();
		Thread.sleep(50000);
		// WebElement VideoResultsSection =
		// Page.driver.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[1]/div/div[1]/div/h5"));
		// Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver
				.findElement(By.xpath("//*[@id=\"contentPart1\"]/div/div/div/div/div[1]/div/div[1]/div/h5"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[2]/div/div[1]/div/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
		Thread.sleep(3000);
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	@Test(priority = 48, enabled = true, description = "Verify the click on Wood Restoration Card")
	public void verifyClickOnWoodRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(15000);
		kb.clickWoodRestoration();
		Thread.sleep(50000);
		WebElement VideoResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[1]/div/div[1]/div/h5"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		// WebElement ImageResultsSection =
		// Page.driver.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[2]/div/div[1]/div/h5"));
		// Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id=\"contentPart1\"]/div/div/div/div/div[2]/div/div[1]/div[1]/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
		Thread.sleep(3000);
	}

	// US-98499-98607-Verify that clicking on the header on the tiles in KB landing
	// page will take the user to refined search result page
	// US-98499-98742-verify the user is redirected to correct URLs on clicking the
	// assets listed to intended category
	@Test(priority = 49, enabled = true, description = "Verify the click on Wood Inspection Card")
	public void verifyClickOnWoodInspectionCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(15000);
		kb.clickWoodInspection();
		Thread.sleep(50000);
		WebElement VideoResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[1]/div/div[1]/div/h5"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[2]/div/div[1]/div/h5"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[3]/div/div[1]/div[1]/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
		Thread.sleep(3000);
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 50, enabled = true, description = "Verify the click on Images under Joint Use")
	public void verifyClickonJointUsImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickJointUseImages();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnImages = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep(3000);
		// Verification of the presence of image
		WebElement ImageContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(ImageContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickJointUseOnAnImage();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickJointUseImagesBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 51, enabled = true, description = "Verify the click on Videos under Joint Use")
	public void verifyClickonJointUsVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickJointUseVideos();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackButtonVideos = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep(3000);
		// Verification of the presence of video
		WebElement VideoContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(VideoContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickJointUseOnAVideo();
		Thread.sleep(10000);
		kb.clickBoxCloseBtn();
		Thread.sleep(6000);
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
		Thread.sleep(3000);
		kb.clickJointUseArticles();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 53, enabled = true, description = "Verify the click on Videos under Overhead")
	public void verifyClickonOverheadVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickOverheadVideos();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackButtonVideos = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep(3000);
		// Verification of the presence of video
		WebElement VideoContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(VideoContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickOverheadOnAVideo();
		Thread.sleep(10000);
		kb.clickBoxCloseBtn();
		Thread.sleep(6000);
		// kb.clickOverheadVideosBackbtn();
		// Page.click("OverheadVideosBackBtn_XPATH");
		kb.clickClearSearch();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 54, enabled = true, description = "Verify the click on Images under Overhead")
	public void verifyClickonOverheadImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickOverheadImages();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnImages = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep(3000);
		// Verification of the presence of image
		WebElement ImageContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(ImageContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickOverheadOnAnImage();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickOverheadImagesBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 55, enabled = true, description = "Verify the click on Project profiles under Overhead")
	public void verifyClickonOverheadProjectProfiles() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickOverheadProjectProfiles();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnProjectProfiles = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5/a"));
		Assert.assertTrue(BackBtnProjectProfiles.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5")).getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep(3000);
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver
				.findElement(By.xpath("//div[@class='pagiNation p-0']/div[1]/div[1]/a"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickOverheadOnADocument();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickOverheadProjectProfilesBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 56, enabled = true, description = "Verify the click on Images under Pole Replacement")
	public void verifyClickonPoleReplacementImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickPoleReplacementImages();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnImages = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep(3000);
		// Verification of the presence of image
		WebElement ImageContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(ImageContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickPoleReplacementOnAnImage();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickPoleReplacementImagesBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 57, enabled = true, description = "Verify the click on Videos under Pole Replacement")
	public void verifyClickonPoleReplacementVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickPoleReplacementVideos();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackButtonVideos = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep(3000);
		// Verification of the presence of video
		WebElement VideoContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(VideoContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickPoleReplacementOnAVideo();
		Thread.sleep(10000);
		kb.clickBoxCloseBtn();
		Thread.sleep(6000);
		// kb.clickPoleReplacementVideosBackbtn();
		// Page.click("PoleReplacementVideosBackBtn_XPATH");
		kb.clickClearSearch();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 58, enabled = true, description = "Verify the click on Brochure under Pole Replacement")
	public void verifyClickonPoleReplacementBrochure() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickPoleReplacementBrochure();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnBrochure = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5/a"));
		Assert.assertTrue(BackBtnBrochure.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5")).getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep(3000);
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver
				.findElement(By.xpath("//div[@class='pagiNation p-0']/div[1]/div[1]/a"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickPoleReplacementOnADocument();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickPoleReplacementBrochureBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 59, enabled = true, description = "Verify the click on Images under Products")
	public void verifyClickonProductsImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickProductsImages();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnImages = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep(3000);
		// Verification of the presence of image
		WebElement ImageContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(ImageContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickProductsOnAnImage();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickProductsImagesBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 60, enabled = true, description = "Verify the click on Videos under Products")
	public void verifyClickonProductsVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickProductsVideos();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackButtonVideos = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep(3000);
		// Verification of the presence of video
		WebElement VideoContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(VideoContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickProductsOnAVideo();
		Thread.sleep(10000);
		kb.clickBoxCloseBtn();
		Thread.sleep(6000);
		// kb.clickProductsVideosBackbtn();
		// Page.click("ProductsVideosBackBtn_XPATH");
		kb.clickClearSearch();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 61, enabled = true, description = "Verify the click on Product Catalog under Products")
	public void verifyClickonProductsProductCatalog() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickProductsProductCatalog();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnBrochure = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5/a"));
		Assert.assertTrue(BackBtnBrochure.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5")).getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep(3000);
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver
				.findElement(By.xpath("//div[@class='pagiNation p-0']/div[1]/div[1]/a"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickProductsOnADocument();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickProductsProductCatalogBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 62, enabled = true, description = "Verify the click on Images under Steel And Concrete Assessment")
	public void verifyClickonSteelAndConcreteAssessmentImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickSteelandConcreteAssessmentImages();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnImages = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep(3000);
		// Verification of the presence of image
		WebElement ImageContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(ImageContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickSteelAndConcreteAssessmentOnAnImage();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickSteelAndConcreteAssessmentImagesBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 63, enabled = true, description = "Verify the click on Brochures under Steel And Concrete Assessment")
	public void verifyClickonSteelAndConcreteAssessmentBrochures() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickSteelandConcreteAssessmentBrochures();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 64, enabled = true, description = "Verify the click on Standards/codes under Steel And Concrete Assessment")
	public void verifyClickonSteelAndConcreteAssessmentStandardsCodes() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickSteelandConcreteAssessmentStandards_Codes();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 65, enabled = true, description = "Verify the click on Articles under Steel And Concrete Restoration")
	public void verifyClickonSteelAndConcreteRestorationArticles() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickSteelandConcreteRestorationArticles();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 66, enabled = true, description = "Verify the click on Brochures under Steel And Concrete Restoration")
	public void verifyClickonSteelAndConcreteRestorationBrochures() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickSteelandConcreteRestorationBrochures();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 67, enabled = true, description = "Verify the click on Images under Steel And Concrete Restoration")
	public void verifyClickonSteelAndConcreteRestorationImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickSteelandConcreteRestorationImages();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnImages = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep(3000);
		// Verification of the presence of image
		WebElement ImageContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(ImageContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickSteelAndConcreteRestorationOnAnImage();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickSteelAndConcreteRestorationImagesBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 68, enabled = true, description = "Verify the click on Images under Storm Support")
	public void verifyClickonStormSupportImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickStormSupportImages();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnImages = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep(3000);
		// Verification of the presence of image
		WebElement ImageContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(ImageContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickStormSupportOnAnImage();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickStormSupportImagesBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 69, enabled = true, description = "Verify the click on Videos under Storm Support")
	public void verifyClickonStormSupportVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickStormSupportVideos();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackButtonVideos = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep(3000);
		// Verification of the presence of video
		WebElement VideoContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(VideoContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickStormSupportOnAVideo();
		Thread.sleep(10000);
		kb.clickBoxCloseBtn();
		Thread.sleep(6000);
		// kb.clickStormSupportVideosBackbtn();
		// Page.click("StormSupportVideosBackBtn_XPATH");
		kb.clickClearSearch();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 70, enabled = true, description = "Verify the click on Project profiles under Storm Support")
	public void verifyClickonStormSupportProjectProfiles() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickStormSupportProjectProfiles();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnProjectProfiles = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5/a"));
		Assert.assertTrue(BackBtnProjectProfiles.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5")).getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep(3000);
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver
				.findElement(By.xpath("//div[@class='pagiNation p-0']/div[1]/div[1]/a"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickStormSupportonADocument();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickStormSupportProjectProfilesBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 71, enabled = true, description = "Verify the click on Images under Underground")
	public void verifyClickonUndergroundImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickUndergroundImages();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnImages = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep(3000);
		// Verification of the presence of image
		WebElement ImageContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(ImageContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickUndergroundOnAnImage();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickUndergroundImagesBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 72, enabled = true, description = "Verify the click on Brochure under Underground")
	public void verifyClickonUndergroundBrochure() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickUndergroundBrochure();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnProjectProfiles = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5/a"));
		Assert.assertTrue(BackBtnProjectProfiles.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5")).getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep(3000);
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver
				.findElement(By.xpath("//div[@class='pagiNation p-0']/div[1]/div[1]/a"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickUndergroundADocument();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickUndergroundBrochureBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 73, enabled = true, description = "Verify the click on Diagram under Underground")
	public void verifyClickonUndergroundDiagram() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickUndergroundDiagram();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnProjectProfiles = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5/a"));
		Assert.assertTrue(BackBtnProjectProfiles.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5")).getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep(3000);
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver
				.findElement(By.xpath("//div[@class='pagiNation p-0']/div[1]/div[1]/a"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickUndergroundADiagramDocument();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickUndergroundDiagramBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 74, enabled = true, description = "Verify the click on Videos under Wood Restoration")
	public void verifyClickonWoodRestorationVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickWoodRestorationVideos();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackButtonVideos = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep(3000);
		// Verification of the presence of video
		WebElement VideoContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(VideoContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickWoodRestorationOnAVideo();
		Thread.sleep(10000);
		kb.clickBoxCloseBtn();
		Thread.sleep(6000);
		// kb.clickWoodRestorationVideosBackbtn();
		// Page.click("WoodRestorationVideosBackBtn_XPATH");
		kb.clickClearSearch();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 75, enabled = true, description = "Verify the click on Brochures under Wood Restoration")
	public void verifyClickonWoodRestorationBrochures() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickWoodRestorationBrochures();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 76, enabled = true, description = "Verify the click on Articles under Wood Restoration")
	public void verifyClickonWoodRestorationArticles() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickWoodRestorationArticles();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 77, enabled = true, description = "Verify the click on Videos under Wood Treatment")
	public void verifyClickonWoodTreatmentVideos() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickWoodTreatmentVideos();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackButtonVideos = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep(3000);
		// Verification of the presence of video
		WebElement VideoContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(VideoContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickWoodTreatmentOnAVideo();
		Thread.sleep(10000);
		kb.clickBoxCloseBtn();
		Thread.sleep(6000);
		// kb.clickWoodTreatmentVideosBackbtn();
		// Page.click("WoodTreatmentVideosBackBtn_XPATH");
		kb.clickClearSearch();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 78, enabled = true, description = "Verify the click on Images under Wood Treatment")
	public void verifyClickonWoodTreatmentImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickWoodTreatmentImages();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnImages = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep(3000);
		// Verification of the presence of image
		WebElement ImageContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(ImageContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickWoodTreatmentOnAnImage();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickWoodTreatmentImagesBackbtn();
	}

	// US-98499-98609: Verify that clicking on the assets for the tiles in KB
	// landing page will take the user to refined search result page for the same
	@Test(priority = 79, enabled = true, description = "Verify the click on Research under Wood Treatment")
	public void verifyClickonWoodTreatmentResearch() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickWoodTreatmentResearch();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnProjectProfiles = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5/a"));
		Assert.assertTrue(BackBtnProjectProfiles.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5")).getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep(3000);
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver
				.findElement(By.xpath("//div[@class='pagiNation p-0']/div[1]/div[1]/a"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickWoodTreatmentOnADocument();
		Thread.sleep(3000);
		kb.clickBoxCloseBtn();
		Thread.sleep(3000);
		kb.clickWoodTreatmentResearchBackbtn();
	}

	// US-98504-98685-Verify see more option functionality in "Videos" section in KB
	// landing page
	@Test(priority = 80, enabled = true, description = "Verify the click on See more link on Videos under Joint use Popular query")
	public void verifyClickonVideosSeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickJointUsePopularQuery();
		Thread.sleep(50000);
		Page.click("JointUseVideosSeeMoreLink_XPATH");
		// Verify the presence of Back Button
		WebElement BackButtonVideos = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackButtonVideos.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Videos header text
		String VideosHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(VideosHeaderTxt, "Videos");
		Thread.sleep(3000);
		// Verification of the presence of video
		WebElement VideoContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(VideoContent.isDisplayed());
		kb.clickClearSearch();
	}

	// US-98504-98686-Verify See More option functionality in Images section in KB
	// landing page
	@Test(priority = 81, enabled = true, description = "Verify the click on See more link on Images under Joint use Popular query")
	public void verifyClickonImagesSeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickJointUsePopularQuery();
		Thread.sleep(50000);
		Page.click("JointUseImagesSeeMoreLink_XPATH");
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnImages = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(BackBtnImages.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Images header text
		String ImagesHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5")).getText();
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		Thread.sleep(3000);
		// Verification of the presence of image
		WebElement ImageContent = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(ImageContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
	}

	// US-98504-98687-Verify See More option functionality in Documents section in
	// KB landing page
	@Test(priority = 82, enabled = true, description = "Verify the click on See more link on Documents under Joint use Popular query")
	public void verifyClickonDocumentsSeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickJointUsePopularQuery();
		Thread.sleep(50000);
		Page.click("JointUseDocumentsSeeMoreLink_XPATH");
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnProjectProfiles = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5/a"));
		Assert.assertTrue(BackBtnProjectProfiles.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5")).getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep(3000);
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver
				.findElement(By.xpath("//div[@class='pagiNation p-0']/div[1]/div[1]/a"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
	}

	// US-98504-98688-Verify See More option functionality in News section in KB
	// landing page
	@Test(priority = 83, enabled = true, description = "Verify the click on See more link on a Document under Joint use Popular query")
	public void verifyClickonJointUseManagementServicesSeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickJointUsePopularQuery();
		Thread.sleep(50000);
		Page.click("JointUseDocumentsSeeMoreLink_XPATH");
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement BackBtnProjectProfiles = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5/a"));
		Assert.assertTrue(BackBtnProjectProfiles.isDisplayed());
		Thread.sleep(3000);
		// Verify the presence Document header text
		String DocumentHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5")).getText();
		Assert.assertEquals(DocumentHeaderTxt, "Documents");
		Thread.sleep(3000);
		// Verification of the presence of document
		WebElement DocumentContent = Page.driver
				.findElement(By.xpath("//div[@class='pagiNation p-0']/div[1]/div[1]/a"));
		Assert.assertTrue(DocumentContent.isDisplayed());
		Page.click("JointUseJointUseManagementServicesMoreLink_XPATH");
		Thread.sleep(3000);
		Assert.assertEquals(Page.getText("JointUseJointUseManagemenrServicesHeaderTxt_XPATH"), "Joint Use Management Services");
		// Verification of the presence of link
		WebElement BoxCloseBtn= Page.driver.findElement(By.xpath("//*[@id='openAdminMyquotes___BV_modal_body_']/button"));
		Assert.assertTrue(BoxCloseBtn.isDisplayed());
		Thread.sleep(2000);
		Page.click("BoxCloseBtn_XPATH");
		Thread.sleep(1000);
		kb.clickClearSearch();
	}

	// US-98501-98614-Verify that The Search Bar will provide the user with a
	// drop-down when they start entering the search query.
	// US-98502-98623-Verify that system shall allow users to perform keyword
	// searches which return results based on document content and metadata
	// fields(title, description, keyword)
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 84, enabled = true, description = "Verification of dynamic dropdown on search field")
	public void verifyDynamicDropdown(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		Page.type("SearchBox_XPATH", data.get("AskOsmoseSearch"));
		// Verification of the presence of dynamic dd
		WebElement Dynamicdd = Page.driver
				.findElement(By.xpath("//div[@id='knowledgeBaseSearchBox']/div[1]/div[1]/div[1]/div[1]/ul"));
		Thread.sleep(3000);
		Assert.assertTrue(Dynamicdd.isDisplayed());
		// Clicking on Industry option
		Page.click("IndustryOptionDD_XPATH");
		Thread.sleep(30000);
		// Verification of the Search Results
		Assert.assertEquals(Page.getText("IndustryText_XPATH"), "Repellent Products for the Utility Industry");
		kb.clickClearSearch();
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		kb.clickJointUsePopularQuery();
		Thread.sleep(50000);
		WebElement VideoResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[1]/div/div[1]/div/h5"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[2]/div/div[1]/div/h5"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[3]/div/div[1]/div[1]/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		kb.clickJointUsePopularQuery();
		Thread.sleep(80000);
		kb.ClickPopularQueriesFilter();
		Page.click("PoleReplacementFilter_XPATH");
		Thread.sleep(80000);
		WebElement VideoResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[1]/div/div[1]/div/h5"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[2]/div/div[1]/div/h5"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[3]/div/div[1]/div[1]/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
		Thread.sleep(3000);
	}

	// US-98503-98672-Verify System displaying search results based on the entered
	// search criteria
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 87, enabled = true, description = "Verify that Search results section will be organized into separate grouped after typing value in Search field")
	public void verifySearchResultsOnTyping(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		Page.type("SearchBox_XPATH", data.get("TypeJointUse"));
		Page.driver.findElement(By.xpath("//input[@id='SearchFieldKB']"))
				.sendKeys(Keys.ENTER);
		// Page.click("JointUseOptionDD_XPATH");
		Thread.sleep(50000);
		WebElement VideoResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[1]/div/div[1]/div/h5"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[2]/div/div[1]/div/h5"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[3]/div/div[1]/div[1]/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
		Thread.sleep(3000);
	}

	// US-98503-98673-Verify Clear Search results
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 88, enabled = true, description = "Verify that clicking on clear button will clear the field")
	public void verifyClearButtonOnTyping(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		Page.type("SearchBox_XPATH", data.get("TypeJointUseInSearchbox"));
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		kb.clickJointUsePopularQuery();
		Thread.sleep(80000);
		Page.click("VideosLink_XPATH");
		Thread.sleep(5000);
		WebElement VideoResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart3']/div/div/div/div/div/div/div[1]/div/h5"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		kb.clickClearSearch();
		Thread.sleep(3000);
	}

	// US-98503-98675-Verify System will filter the search results when user selects
	// the 'Images' Category filer
	// US-98502-98618-Verify that search bar will provide options for searching
	// images.
	@Test(priority = 90, enabled = true, description = "Verify that Search results section will display only images section")
	public void verifySearchResultsAreImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickJointUsePopularQuery();
		Thread.sleep(80000);
		Page.click("ImagesLink_XPATH");
		Thread.sleep(5000);
		WebElement ImageResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		kb.clickClearSearch();
		Thread.sleep(3000);

	}

	// US-98503-98677-Verify System will filter the search results when user selects
	// the 'Documents' Category filer
	// US-98502-98620-Verify that search bar will provide options for searching
	// documents.
	@Test(priority = 91, enabled = true, description = "Verify that Search results section will display only documents section")
	public void verifySearchResultsAreDocuments() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		kb.clickJointUsePopularQuery();
		Thread.sleep(80000);
		Page.click("DocumentsLink_XPATH");
		Thread.sleep(5000);
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		kb.clickClearSearch();
		Thread.sleep(3000);

	}

	// US-98503-98680-Verify If a "grouped" area has no assets to display, then the
	// area will be hidden.<Grouped areas: Video, Images, Documents, and News>
	// US-98502-98733-Verify message displayed by system when there are no records
	// or search results for entered search criteria
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 92, enabled = true, description = "Verify no results found message on Search Box")
	public void verifyNoResultsFoundMessage(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		Page.type("SearchBox_XPATH", data.get("NoResults"));
		Thread.sleep(3000);
		Page.driver.findElement(By.xpath("//input[@id='SearchFieldKB']"))
				.sendKeys(Keys.ENTER);

		WebElement noresults = Page.driver.findElement(By.xpath("//div[@class='text-center dismissCountDown']/div[1]"));

		System.out.println(noresults.getText());
	}

	// US-98503-98681-Verify Document result set section will allow users to sort
	// the result set by 'Relevance' and 'Most Recent'
	@Test(priority = 93, enabled = true, description = "Verify the presence of Sort by dropdown and its values")
	public void verifyPresenceOfSortBy() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(6000);
		kb.ClickPopularQueriesFilter();
		kb.clickJointUsePopularQuery();
		Thread.sleep(80000);
		Page.click("DocumentsLink_XPATH");
		Thread.sleep(5000);
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart5']/div/div/div/div/div/div/div[1]/div[1]/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		// Verification of the presence of Sort By Dropdown
		WebElement DocumentSortBy = Page.driver.findElement(By.xpath("//select[@class='sbox']"));
		Assert.assertTrue(DocumentSortBy.isDisplayed());
		Thread.sleep(1000);
		Page.click("DocumentsSortByDD_XPATH");
		Thread.sleep(5000);
		// Verification of the options present in Sort By Dropdown
		Assert.assertEquals(Page.getText("SortByOptionDD_XPATH"), "SORT BY");
		Assert.assertEquals(Page.getText("RelevanceOptionDD_XPATH"), "Relevance");
		Assert.assertEquals(Page.getText("MostRecentOptionDD_XPATH"), "Most Recent");
		kb.clickClearSearch();
		Thread.sleep(3000);

	}

	// US-98503-98672-Verify System displaying search results based on the entered
	// search criteria
	// US-98502-98624-Verify that The system shall allow users to modify searches
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp", priority = 94, enabled = true, description = "Verify that the text entered in search field can be modified")
	public void verifySearchTextUpdation(Hashtable<String, String> data) throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		Thread.sleep(3000);
		Page.type("SearchBox_XPATH", data.get("TypeJointUseTextUpdation"));
		Thread.sleep(3000);
		Page.clear("SearchBox_XPATH");
		Thread.sleep(3000);
		Page.type("SearchBox_XPATH", data.get("TypePoleReplacementTextUpdation"));
		Page.driver.findElement(By.xpath("//input[@id='SearchFieldKB']"))
				.sendKeys(Keys.ENTER);
		// Page.click("JointUseOptionDD_XPATH");
		Thread.sleep(80000);
		WebElement VideoResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[1]/div/div[1]/div/h5"));
		Assert.assertTrue(VideoResultsSection.isDisplayed());
		WebElement ImageResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[2]/div/div[1]/div/h5"));
		Assert.assertTrue(ImageResultsSection.isDisplayed());
		WebElement DocumentResultsSection = Page.driver
				.findElement(By.xpath("//*[@id='contentPart1']/div/div/div/div/div[3]/div/div[1]/div[1]/h5"));
		Assert.assertTrue(DocumentResultsSection.isDisplayed());
		Thread.sleep(3000);
		kb.clickClearSearch();
		Thread.sleep(3000);
	}

}
