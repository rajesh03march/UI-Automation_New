package com.OSMOSE.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OSMOSE.base.Page;
import com.OSMOSE.pages.OU.ContactPage;
import com.OSMOSE.pages.OU.KnowledgeBasePage;

public class KnowledgeBase extends BaseTest {

	// US-98498-98570-Verify that Users will be able to access to KB Landing Page on
	// clicking the top tier menu item 'Knowledge Base'.
	@Test(priority = 1, enabled = true, description = "Verify the click on Knowledge Base menu and card Navigation")
	public void verifyKnowledgeBaseNavigationClick() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		kb.clickKBNavigation();
		Thread.sleep(3000);
		Assert.assertEquals(Page.getText("KnowledgeBaseFirstHeaderTxt_XPATH"), "Knowledge Base");
		Assert.assertEquals(Page.getText("KnowledgeBaseSecondHeaderTxt_XPATH"), "How can we help?");
		Thread.sleep(3000);
		Page.click("HomePage_XPATH");
		kb.clickKBCard();
		Thread.sleep(3000);
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
		Assert.assertTrue(Page.driver.findElement(By.xpath("//input[@id='searchInput']")).isDisplayed());
		String Placeholder = Page.driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).getAttribute("placeholder");
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

	//
	@Test(priority = 6, enabled = true, description = "Verify the presence of Steel And Concrete Assessment")
	public void verifyPresenceSteelAndConcreteAssessmentCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Steel and Concrete Assessment card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[1]/div/div[1]/div/h5"))
				.isDisplayed());
	}

	//
	@Test(priority = 7, enabled = true, description = "Verify the presence of Steel And Concrete Restoration")
	public void verifyPresenceSteelAndConcreteRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Steel and Concrete Restoration card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[2]/div/div[1]/div/h5"))
				.isDisplayed());
	}

	//
	@Test(priority = 8, enabled = true, description = "Verify the presence of Wood Inspection And Treatment Card")
	public void verifyPresenceWoodInspectionAndTreatmentCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Wood Inspection And Treatment card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[3]/div/div[1]/div/h5"))
				.isDisplayed());
	}

	//
	@Test(priority = 9, enabled = true, description = "Verify the presence of Wood Restoration Card")
	public void verifyPresenceWoodRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Wood Restoration Card presence verification
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[4]/div/div[1]/div/h5"))
				.isDisplayed());
	}

	// US-98498-98739-Verify tiles related to News Feed section
	@Test(priority = 10, enabled = true, description = "Verify the presence of Industry News Card")
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
	@Test(priority = 11, enabled = true, description = "Verify the presence of O-Calc Pro Card")
	public void verifyPresenceOCalcProCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// O-Calc Pro Card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@id='contentPart0']/div/div/div/div/div[2]/div[2]/div"))
				.isDisplayed());
	}

	// US-98498-98738-Verify tiles related to Project of the Week
	@Test(priority = 12, enabled = true, description = "Verify the presence of Project of the week Card")
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

	//
	@Test(priority = 13, enabled = true, description = "Verify the presence of What's wrong with this Picture? Card")
	public void verifyPresenceWhatswrongwiththisPictureCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// What's wrong with this Picture? Card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div/div/div[1]")).isDisplayed());
	}

	//
	@Test(priority = 13, enabled = true, description = "Verify the presence of Featured Videos Card")
	public void verifyPresenceFeaturedVideosCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Featured Videos Card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div/div/div[2]")).isDisplayed());
	}

	//
	@Test(priority = 14, enabled = true, description = "Verify the presence of Suggested Contents Card")
	public void verifyPresenceSuggestedContentsCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Suggested Contents Card presence verification
		Assert.assertTrue(Page.driver.findElement(By.xpath("//*[@id='app']/div/div[5]/div/div/div[3]")).isDisplayed());
	}

	//
	@Test(priority = 15, enabled = true, description = "Verify the presence of Buttons on Oclac Pro Card")
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

	//
	@Test(priority = 16, enabled = true, description = "Verify the presence of slider on Suggested Contents")
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

	//
	@Test(priority = 17, enabled = true, description = "Verify the click on item in Suggested Contents")
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

	//
	@Test(priority = 18, enabled = true, description = "Verify the click on item in Featured Videos")
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

	//
	@Test(priority = 19, enabled = true, description = "Verify the click on View Project on Project of the week")
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
	@Test(priority = 20, enabled = true, description = "Verify the Card Contents of Steel Concrete Assessment")
	public void verifyCardContentsSteelConcreteAssessment() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Steel Concrete Assessment
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[5]/div/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteAssessmentCardimageslink_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[5]/div/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteAssessmentCardBrochureslink_XPATH"), "BROCHURES");
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[5]/div/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteAssessmentCardStandardsCodeslink_XPATH"), "STANDARDS/CODES");
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[5]/div/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[5]/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 21, enabled = true, description = "Verify the Card Contents of Steel Concrete Restoration")
	public void verifyCardContentsSteelConcreteRestoration() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Steel Concrete Restoration
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[6]/div/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteRestortationtArticleslink_XPATH"), "ARTICLES");
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[6]/div/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteRestortationBrochureslink_XPATH"), "BROCHURES");
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[6]/div/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("SteelAndConcreteRestortationImageslink_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[6]/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 22, enabled = true, description = "Verify the Card Contents of Wood | Inspection & Treatment")
	public void verifyCardContentsWoodInspectionTreatment() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Wood | Inspection & Treatment
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[10]/div/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("WoodInspectionVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[10]/div/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("WoodInspectionImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[10]/div/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("WoodInspectionResearch_XPATH"), "RESEARCH");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[10]/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 23, enabled = true, description = "Verify the Card Contents of Steel Concrete Assessment")
	public void verifyCardContentsWoodRestoration() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Steel Concrete Assessment
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[9]/div/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("WoodRestorationVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[9]/div/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("WoodRestorationBrochuers_XPATH"), "BROCHURES");
		Assert.assertTrue(Page.driver.findElement(By
				.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[9]/div/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("WoodRestorationArticles_XPATH"), "ARTICLES");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id='contentPart0']/div/div/div/div/div[1]/div/div[9]/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 24, enabled = true, description = "Verify the Card Contents of Joint Use")
	public void verifyCardContentsJointUse() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Joint Use
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("JointUseImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("JointUseVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("JointUseArticles_XPATH"), "ARTICLES");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 25, enabled = true, description = "Verify the Card Contents of Overhead")
	public void verifyCardContentsOverhead() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Overhead
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("OverheadVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("OverheadImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("OverheadProjectProfiles_XPATH"), "PROJECT PROFILES");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 26, enabled = true, description = "Verify the Card Contents of Pole Replacement")
	public void verifyCardContentsPoleReplacement() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Pole Replacement
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[3]/div/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("PoleReplacementImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[3]/div/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("PoleReplacementVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[3]/div/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("PoleReplacementBrochure_XPATH"), "BROCHURE");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[3]/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 27, enabled = true, description = "Verify the Card Contents of Products")
	public void verifyCardContentsProducts() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Products
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[4]/div/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("ProductsImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[4]/div/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("ProductsVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[4]/div/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("ProductsProductCatalog_XPATH"), "PRODUCT CATALOG");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[4]/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 28, enabled = true, description = "Verify the Card Contents of Storm Support")
	public void verifyCardContentsStormSupport() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Storm Support
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[7]/div/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("StormSupportImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[7]/div/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("StormSupportVideos_XPATH"), "VIDEOS");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[7]/div/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("StormSupportProjectProfiles_XPATH"), "PROJECT PROFILES");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[7]/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	// US-98498-98571-Verify that each navigational tile will have only one link for
	// different asset types.
	@Test(priority = 29, enabled = true, description = "Verify the Card Contents of Underground")
	public void verifyCardContentsUnderground() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Card Contents of Underground
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[8]/div/div[2]/div[1]/p/ul/li[1]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("UndergroundImages_XPATH"), "IMAGES");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[8]/div/div[2]/div[1]/p/ul/li[2]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("UndergroundBrochure_XPATH"), "BROCHURE");
		Assert.assertTrue(Page.driver.findElement(By.xpath(
				"//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[8]/div/div[2]/div[1]/p/ul/li[3]/a/span"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("UndergroundDiagram_XPATH"), "DIAGRAM");
		Assert.assertTrue(Page.driver
				.findElement(
						By.xpath("//*[@id=\"contentPart0\"]/div/div/div/div/div[1]/div/div[8]/div/div[2]/div[2]/img"))
				.isDisplayed());
	}

	//
	@Test(priority = 30, enabled = true, description = "Verify the Industry News")
	public void verifyIndustrySeeMore() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		// Industry News
		kb.clickIndustrySeeMore();
		Thread.sleep(4000);
		Assert.assertEquals(Page.getText("InustryText_XPATH"), "Industry News");
		kb.clickIndustryBackbtn();
	}

	//
	@Test(priority = 31, enabled = true, description = "Verify the click on Daliy Gaff Gallery on What's wrong with this picture")
	public void verifyClickOnDailyGaffGallery() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		kb.clickDailyGaffGallery();
		Thread.sleep(4000);
		// Verification of Back button and Images text
		Assert.assertTrue(Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5/a/i"))
				.isDisplayed());
		Assert.assertEquals(Page.getText("DailyGaffGalleryImagesTxt_XPATH"), "Images");
		Thread.sleep(4000);
		kb.clickDailyGaffGalleryBackbtn();
	}

	//
	@Test(priority = 32, enabled = true, description = "Verify the click on an Image on Daliy Gaff Gallery")
	public void verifyClickOnDailyGaffGalleryImage() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
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
	@Test(priority = 33, enabled = true, description = "Verify the click on Joint Use Card")
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
	@Test(priority = 34, enabled = true, description = "Verify the click on Overhead Card")
	public void verifyClickOnOverheadCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
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
	@Test(priority = 35, enabled = true, description = "Verify the click on Pole Replacement Card")
	public void verifyClickOnPoleReplacementCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
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
	@Test(priority = 36, enabled = true, description = "Verify the click on Products Card")
	public void verifyClickOnProductsCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
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
	@Test(priority = 37, enabled = true, description = "Verify the click on Steel and Concrete Assessment Card")
	public void verifyClickOnSteelandConcreteAssessmentCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
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
	@Test(priority = 38, enabled = true, description = "Verify the click on Steel and Concrete Restoration Card")
	public void verifyClickOnSteelandConcreteRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
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
	@Test(priority = 39, enabled = true, description = "Verify the click on Storm Support Card")
	public void verifyClickOnStormSupportCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
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
	@Test(priority = 40, enabled = true, description = "Verify the click on Underground Card")
	public void verifyClickOnUndergroundCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
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
	@Test(priority = 41, enabled = true, description = "Verify the click on Wood Restoration Card")
	public void verifyClickOnWoodRestorationCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
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
	@Test(priority = 42, enabled = true, description = "Verify the click on Wood Inspection Card")
	public void verifyClickOnWoodInspectionCard() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
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

	//
	@Test(priority = 43, enabled = false, description = "Verify the click on Images under Joint Use")
	public void verifyClickonJointUsImages() throws InterruptedException {
		ContactPage cp = new ContactPage();
		KnowledgeBasePage kb = cp.goKnowledgeBase();
		kb.clickJointUseImages();
		Thread.sleep(3000);
		// Verify the presence of Back Button
		WebElement Images = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5/a"));
		Assert.assertTrue(Images.isDisplayed());
		// Verify the presence Images header text
		WebElement ImagesHeaderTxt = Page.driver
				.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[1]/div/h5"));
		Assert.assertEquals(ImagesHeaderTxt, "Images");
		// Verification of the presence of image
		WebElement ImageContent = Page.driver.findElement(By.xpath("//*[@id='contentPart2']/div/div/div/div/div/div/div/div[2]/div/div[1]/div/img"));
		Assert.assertTrue(ImageContent.isDisplayed());
		kb.clickJointUseOnAnImage();
		kb.clickBoxCloseBtn();
		kb.clickJointUseImagesBackbtn();
	}

}
