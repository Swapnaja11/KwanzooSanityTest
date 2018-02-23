package com.KwanzooTestSuit;

import org.openqa.selenium.WebDriver;

import com.CommonFunctions.SharedDriver;
import com.KwanzooPages.DeleteCampaigns;
import com.KwanzooPages.LoginPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteCampaignTest {
	public WebDriver driver;
	public LoginPage login;
	public DeleteCampaigns deletecampaigninstance;
	public DeleteCampaignTest(SharedDriver driver) {
		this.driver=driver;
	}
	@Before
	public void setUp(){
		login = new LoginPage(driver);
		deletecampaigninstance = new DeleteCampaigns(driver);
	}
	
	@Given("^I have logged in to kwanzoo for campaign deletion$")
	public void i_have_logged_in_to_kwanzoo_for_campaign_deletion() throws Throwable {
		login.onKwanzooSite();
		login.loginToKwanzoo();
	}

	@When("^I go to my-campaigns page$")
	public void i_go_to_my_campaigns_page() throws Throwable {
		deletecampaigninstance.deactivate();
		deletecampaigninstance.delete();
	}

	@Then("^I  deactivate campaign$")
	public void i_deactivate_campaign() throws Throwable {
	
	}

	@Then("^I  delete campaign\\.$")
	public void i_delete_campaign() throws Throwable {
	   
	}
}
