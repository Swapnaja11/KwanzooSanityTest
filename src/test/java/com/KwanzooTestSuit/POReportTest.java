package com.KwanzooTestSuit;

import org.openqa.selenium.WebDriver;

import com.CommonFunctions.SharedDriver;
import com.KwanzooPages.LoginPage;
import com.KwanzooPages.Report;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class POReportTest {
	
	public WebDriver driver;
	public LoginPage login;
	public Report reportinstance;

	
	public POReportTest(SharedDriver driver) {
		this.driver = driver;
	}
	@Before
	public void setUp(){
		login = new LoginPage(driver);
		reportinstance = new Report(driver);
	}
	
	
	@Given("^I have logged in to kwanzoo for POR$")
	public void i_have_logged_in_to_kwanzoo_for_POR() throws Throwable {
		/*login.onKwanzooSite();
		login.loginToKwanzoo();*/
	}

	@When("^I go to Report tab to create POR$")
	public void i_go_to_Report_tab_to_create_POR() throws Throwable {
		//reportinstance.selectReportTab();
	}

	@Then("^I genarate new program overview report$")
	public void i_genarate_new_program_overview_report() throws Throwable {
		 reportinstance.POReport();
	}

}
