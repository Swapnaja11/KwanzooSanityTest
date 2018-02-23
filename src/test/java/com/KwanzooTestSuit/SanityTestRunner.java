package com.KwanzooTestSuit;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}, features = {"src/main/resources"}, tags = {"@BannerCreationWithHTML5 , @BannerCreation, @LeadFormCCP , @leadformcreationeloqua , @leadformcreationemail, @leadformcreationmarketo , @leadformcreationsilverpop, @leadformcreationposttolandingpage"} )
public class SanityTestRunner {
	
	@AfterClass
    public static void teardown() throws IOException {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
       // Reporter.addScreenCaptureFromPath("C:/Users/GS-1455/Kwanzoo_Automation/Kwanzoo_ImpressionTest");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}
