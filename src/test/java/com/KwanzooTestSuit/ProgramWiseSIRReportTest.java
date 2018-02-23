package com.KwanzooTestSuit;

import org.openqa.selenium.WebDriver;

import com.KwanzooPages.LoginPage;
import com.KwanzooPages.Report;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProgramWiseSIRReportTest {
	
	public WebDriver driver;
	public LoginPage login;
	public Report reportinstance;
	
	public ProgramWiseSIRReportTest(WebDriver driver) {
		this.driver = driver;
	}
	
	@Before
	public void setUp(){
		login = new LoginPage(driver);
		reportinstance = new Report(driver);
	}
	
	@Given("^I have logged in to kwanzoo for selective program wise SIR$")
	public void i_have_logged_in_to_kwanzoo_for_selective_program_wise_SIR() throws Throwable {
		/*login.onKwanzooSite();
		login.loginToKwanzoo();*/
	}

	@When("^I go to Report tab to create selective program wise SIR$")
	public void i_go_to_Report_tab_to_create_selective_program_wise_SIR() throws Throwable {
		reportinstance.selectReportTab();
	}

	@Then("^I schedule new selective program wise Sales Insight report$")
	public void i_schedule_new_selective_program_wise_Sales_Insight_report() throws Throwable {
		reportinstance.SIRReportForSelectiveProgram();
	}


}
