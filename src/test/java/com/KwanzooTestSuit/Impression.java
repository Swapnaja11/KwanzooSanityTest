package com.KwanzooTestSuit;

import org.openqa.selenium.WebDriver;
import com.CommonFunctions.SharedDriver;
import com.KwanzooPages.LoginPage;
import com.KwanzooTests.LeadFormImpressionTest;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Impression {
	
	public WebDriver driver;
	public LoginPage loginpage;
	public LeadFormImpressionTest leadformimpressiontest;
	
	public Impression(SharedDriver driver) {
		this.driver = driver;
	}
	@Before
	public void setUp(){
		loginpage = new LoginPage(driver);
		leadformimpressiontest = new LeadFormImpressionTest(driver);
	}
	
	@Given("^I observe impresssion before test$")
	public void i_observe_impresssion_before_test() throws Throwable {
		System.out.println("# Impression Before Test ");
		loginpage.onKwanzooSite();
		loginpage.loginToKwanzoo();
		leadformimpressiontest.readImpression();
	 }

	@When("^I load kwanzoo widget$")
	public void i_load_kwanzoo_widget() throws Throwable {
		leadformimpressiontest.loadWidget();
	}

	@Then("^I observe impression after test$")
	public void i_observe_impression_after_test() throws Throwable {
		System.out.println("# Impression After Test ");
		leadformimpressiontest.readImpression();
	}
}
