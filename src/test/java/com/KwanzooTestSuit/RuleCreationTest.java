package com.KwanzooTestSuit;

import org.openqa.selenium.WebDriver;

import com.CommonFunctions.SharedDriver;
import com.KwanzooPages.CampaignFunctions;
import com.KwanzooPages.LeadFormCCP;
import com.KwanzooPages.LoginPage;
import com.KwanzooPages.ProgramPage;
import com.KwanzooPages.RuleCreationPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RuleCreationTest {
	public WebDriver driver;
	public LeadFormCCP leadformccpinstance;
	public LoginPage login;
	public ProgramPage programpage;
	CampaignFunctions campaignFunctions;
	RuleCreationPage rulecreationinstance;
	
	public RuleCreationTest(SharedDriver driver) {
		this.driver = driver;
	}
	@Before
	public void setUp(){
		login = new LoginPage(driver);
		leadformccpinstance = new LeadFormCCP(driver);
		programpage = new ProgramPage(driver);
		campaignFunctions = new CampaignFunctions(driver);
		rulecreationinstance = new RuleCreationPage(driver);
	}
	
	@Given("^Login to Kwanzoo$")
	public void login_to_Kwanzoo() throws Throwable {
	        login.onKwanzooSite();
		    login.loginToKwanzoo();
	}

	@When("^I create a campaign$")
	public void i_create_a_campaign() throws Throwable {
			programpage.viewAllCampaigns();
			programpage.createNewTemplate();
	}

	@When("^Apply test rule$")
	public void apply_test_rule() throws Throwable {
		programpage.selectTemplate("template_opt4");
		programpage.customizeCampaignClick();
		leadformccpinstance.createLeadfomCCP();
		leadformccpinstance.Eloqua();
		campaignFunctions.saveSettings();
		leadformccpinstance.createAnotherLeadForm();
		leadformccpinstance.Eloqua();
		campaignFunctions.saveSettings();
		//campaignFunctions.saveSettings();
		campaignFunctions.runcampaign();
		campaignFunctions.activateCampaign();
		rulecreationinstance.createRule();
	    
	}

	@Then("^i load lead form to create cookie$")
	public void i_load_lead_form_to_create_cookie() throws Throwable {
		rulecreationinstance.executeCampaign();
		leadformccpinstance.signUp();
	}

	@Then("^again load form$")
	public void again_load_form() throws Throwable {
		rulecreationinstance.loadagainCampaign();
	}

}
