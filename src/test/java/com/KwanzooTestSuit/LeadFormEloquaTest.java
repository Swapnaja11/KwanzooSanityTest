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

public class LeadFormEloquaTest {
	
	public WebDriver driver;
	public LeadFormCCP leadformccpinstance;
	public LoginPage login;
	public ProgramPage programpage;
	CampaignFunctions campaignFunctions;
	
	public LeadFormEloquaTest(SharedDriver driver) {
		this.driver = driver;
	}
	@Before
	public void setUp(){
		login = new LoginPage(driver);
		leadformccpinstance = new LeadFormCCP(driver);
		programpage = new ProgramPage(driver);
		campaignFunctions = new CampaignFunctions(driver);
	}
	
	
	@Given("^I have logged in to kwanzoo for eloqua$")
	public void i_have_logged_in_to_kwanzoo_for_eloqua() throws Throwable {
	/*	login.onKwanzooSite();
		login.loginToKwanzoo();*/
	}

	@When("^I go to Template create Page for eloqua$")
	public void i_go_to_Template_create_Page_for_eloqua() throws Throwable {
	/*	programpage.viewAllCampaigns();
		programpage.createNewTemplateLink();*/
		programpage.createNewTemplate();
		programpage.selectTemplate("template_opt4");
		programpage.customizeCampaignClick();
	}

	@Then("^I create a Leadform for eloqua$")
	public void i_create_a_Leadform_for_eloqua() throws Throwable {
		leadformccpinstance.createLeadfomCCP();
		leadformccpinstance.Eloqua();
	}

	@Then("^I save Leadform Widget for eloqua$")
	public void i_save_Leadform_Widget_for_eloqua() throws Throwable {
		campaignFunctions.saveSettings();
		campaignFunctions.runcampaign();
	}

	@Then("^I go to Run Campaign Page and Activate the Leadform for eloqua$")
	public void i_go_to_Run_Campaign_Page_and_Activate_the_Leadform_for_eloqua() throws Throwable {
		campaignFunctions.activateCampaign();
		campaignFunctions.executeCampaign();
		leadformccpinstance.signUp();
	}


}
