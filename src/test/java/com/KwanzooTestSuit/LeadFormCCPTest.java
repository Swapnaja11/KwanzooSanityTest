package com.KwanzooTestSuit;

import org.openqa.selenium.WebDriver;

import com.CommonFunctions.SharedDriver;
import com.KwanzooPages.CampaignFunctions;
import com.KwanzooPages.LeadFormCCP;
import com.KwanzooPages.LoginPage;
import com.KwanzooPages.ProgramPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class LeadFormCCPTest {
	
	public WebDriver driver;
	public LeadFormCCP leadformccpinstance;
	public LoginPage login;
	public ProgramPage programpage;
	CampaignFunctions campaignFunctions;
	
	public LeadFormCCPTest(SharedDriver driver) {
		this.driver = driver;
	}
	@Before
	public void setUp(){
		login = new LoginPage(driver);
		leadformccpinstance = new LeadFormCCP(driver);
		programpage = new ProgramPage(driver);
		campaignFunctions = new CampaignFunctions(driver);
	}
	
	@Given("^I have to login to Kwanzoo$")
	public void i_have_to_login_to_Kwanzoo() throws Throwable {
	//  login.onKwanzooSite();
	 // login.loginToKwanzoo();
	}

	@When("^I create new campaign$")
	public void i_create_new_campaign() throws Throwable {
		programpage.createNewTemplate();
	}
	
	@When("^Select smart lead form option and Click on customize campaign$")
	public void select_smart_lead_form_option_and_Click_on_customize_campaign() throws Throwable {
		programpage.selectTemplate("template_opt4");
		programpage.customizeCampaignClick();
	}

	@Then("^I create new lead form$")
	public void i_create_new_lead_form() throws Throwable {
		leadformccpinstance.createLeadfomCCP();
	}

	@Then("^I save lead form settings$")
	public void i_save_lead_form_settings() throws Throwable {
		campaignFunctions.saveSettings();
	}

	@Then("^I go to Run Campaign Page and Activate the Campaign$")
	public void i_go_to_Run_Campaign_Page_and_Activate_the_Campaign() throws Throwable {
		campaignFunctions.runcampaign();
		campaignFunctions.activateCampaign();
	}

	@Then("^I load campaign\\.$")
	public void i_load_campaign() throws Throwable {
		campaignFunctions.executeCampaign();
		leadformccpinstance.signUp();
	}
}
