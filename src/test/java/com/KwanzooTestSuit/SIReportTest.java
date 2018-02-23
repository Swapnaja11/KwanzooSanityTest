package com.KwanzooTestSuit;

import org.openqa.selenium.WebDriver;

import com.CommonFunctions.SharedDriver;
import com.KwanzooPages.LoginPage;
import com.KwanzooPages.Report;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SIReportTest {
	public WebDriver driver;
	public LoginPage login;
	public Report reportinstance;

	
	public SIReportTest(SharedDriver driver) {
		this.driver = driver;
	}
	@Before
	public void setUp(){
		login = new LoginPage(driver);
		reportinstance = new Report(driver);
	}
	
	
	@Given("^I have logged in to kwanzoo for SIR$")
	public void i_have_logged_in_to_kwanzoo_for_SIR() throws Throwable {
		/*login.onKwanzooSite();
		login.loginToKwanzoo();*/
	}

	@When("^I go to Report tab to create SIR$")
	public void i_go_to_Report_tab_to_create_SIR() throws Throwable {
		//reportinstance.selectReportTab();
	}

	@Then("^I genarate new Sales Insight report$")
	public void i_genarate_new_Sales_Insight_report() throws Throwable {
		reportinstance.SIReport();
		reportinstance.SIRReportForSelectiveProgram();
	}
	
	
}
