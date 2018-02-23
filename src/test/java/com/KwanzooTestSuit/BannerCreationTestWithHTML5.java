package com.KwanzooTestSuit;

import org.openqa.selenium.WebDriver;

import com.KwanzooPages.BannerCreation;
import com.KwanzooPages.BannerCreationWithHTML5;
import com.KwanzooPages.CampaignFunctions;
import com.KwanzooPages.LoginPage;
import com.KwanzooPages.ProgramPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BannerCreationTestWithHTML5 {
	public WebDriver driver;
	public BannerCreation bannerinstance;
	public LoginPage login;
	public ProgramPage programpage;
	CampaignFunctions campaignFunctions;
	BannerCreationWithHTML5 bannerhtml5instance;
	public BannerCreationTestWithHTML5(WebDriver driver) {
		this.driver = driver;
	}
	@Before
	public void setUp(){
		login = new LoginPage(driver);
		bannerinstance = new BannerCreation(driver);
		programpage = new ProgramPage(driver);
		campaignFunctions = new CampaignFunctions(driver);
		bannerhtml5instance = new BannerCreationWithHTML5(driver);
	}
	
	
	@Given("^I have to login to Kwanzoo site for HTML banner$")
	public void i_have_to_login_to_Kwanzoo_site_for_HTML_banner() throws Throwable {
		/*login.maximizeWindow();
		login.onKwanzooSite();
		login.loginToKwanzoo();*/
	}

	@When("^I go to My campaign page for Smart banner selection$")
	public void i_go_to_My_campaign_page_for_Smart_banner_selection() throws Throwable {
		programpage.createNewTemplate();
	}

	@When("^Select Smart banner option and customize campaign$")
	public void select_Smart_banner_option_and_customize_campaign() throws Throwable {
		programpage.selectTemplate("template_opt5");
		programpage.customizeCampaignClick();
	}

	@Then("^I create new HTML banner$")
	public void i_create_new_HTML_banner() throws Throwable {
		bannerinstance.campaignDetails();
		bannerhtml5instance.enableHTML5();
		bannerhtml5instance.uploadZipFileFor300_250();
	}

	@Then("^I save HTML Banner Widget$")
	public void i_save_HTML_Banner_Widget() throws Throwable {
		campaignFunctions.saveSettings();
	}

	@Then("^I go to Run Campaign Page and Activate the HTML Banner$")
	public void i_go_to_Run_Campaign_Page_and_Activate_the_HTML_Banner() throws Throwable {
		bannerinstance.runcampaign();
		bannerinstance.activateCamp();
		bannerinstance.executeCamp();
		//bannerhtml5instance.loadBanner();
		
	}


}
