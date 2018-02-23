package com.KwanzooTestSuit;

import org.openqa.selenium.WebDriver;

import com.CommonFunctions.SharedDriver;
import com.KwanzooPages.BannerCreation;
import com.KwanzooPages.CampaignFunctions;
import com.KwanzooPages.LoginPage;
import com.KwanzooPages.ProgramPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BannerCreationTest {
	
	public WebDriver driver;
	public BannerCreation bannerinstance;
	public LoginPage login;
	public ProgramPage programpage;
	CampaignFunctions campaignFunctions;
	
	public BannerCreationTest(SharedDriver driver) {
		this.driver = driver;
	}
	@Before
	public void setUp(){
		login = new LoginPage(driver);
		bannerinstance = new BannerCreation(driver);
		programpage = new ProgramPage(driver);
		campaignFunctions = new CampaignFunctions(driver);
	}
	
	
	@Given("^I have to login to Kwanzoo site$")
	public void i_have_to_login_to_Kwanzoo_site() throws Throwable {
		login.maximizeWindow();
		login.onKwanzooSite();
		login.loginToKwanzoo();
	}

	@When("^I go to My campaign page$")
	public void i_go_to_My_campaign_page() throws Throwable {
		//Thread.sleep(70000);
		programpage.createNewTemplate();
		
	}

	@When("^Select Smart banner option and Click on customize campaign$")
	public void select_Smart_banner_option_and_Click_on_customize_campaign() throws Throwable {
		programpage.selectTemplate("template_opt5");
		programpage.customizeCampaignClick();
	}

	@Then("^I create new banner$")
	public void i_create_new_banner() throws Throwable {
		bannerinstance.details();
	}

	@Then("^I save Banner Widget$")
	public void i_save_Banner_Widget() throws Throwable {
		//campaignFunctions.saveSettings();
		bannerinstance.runcampaign();
		
	}

	@Then("^I go to Run Campaign Page and Activate the Banner$")
	public void i_go_to_Run_Campaign_Page_and_Activate_the_Banner() throws Throwable {
		bannerinstance.activateCamp();
		bannerinstance.executeCamp();
		bannerinstance.loadBanner();
		
	
	}

}
