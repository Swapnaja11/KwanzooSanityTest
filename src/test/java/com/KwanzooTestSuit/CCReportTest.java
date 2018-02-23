package com.KwanzooTestSuit;

import org.openqa.selenium.WebDriver;

import com.CommonFunctions.SharedDriver;
import com.KwanzooPages.LoginPage;
import com.KwanzooPages.Report;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCReportTest {
	
	public WebDriver driver;
	public LoginPage login;
	public Report reportinstance;

	
	public CCReportTest(SharedDriver driver) {
		this.driver = driver;
	}
	@Before
	public void setUp(){
		login = new LoginPage(driver);
		reportinstance = new Report(driver);
	}
	
	
	@Given("^I have logged in to kwanzoo for CCR$")
	public void i_have_logged_in_to_kwanzoo_for_CCR() throws Throwable {
/*	  login.maximizeWindow();
	  login.onKwanzooSite();
	  login.loginToKwanzoo();*/
	}

	@When("^I go to Report tab$")
	public void i_go_to_Report_tab() throws Throwable {
		//reportinstance.selectReportTab();
         
	}

	@Then("^I genarate new report$")
	public void i_genarate_new_report() throws Throwable {
	  System.out.println("In CCR test");
		reportinstance.CCRReport();
	}

	@Then("^I add email recipient$")
	public void i_add_email_recipient() throws Throwable {
	  
	}

	@Then("^I schedule report\\.$")
	public void i_schedule_report() throws Throwable {
	  
	}


}
