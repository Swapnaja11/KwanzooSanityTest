package com.KwanzooPages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RuleCreationPage {

	WebDriver driver;
	private static String ENABLERULES = "enableRuleBasedTargeting_cbox";
	private static String EDITTARGETINGRULES = "editRules";
	private static String CREATENEWRULE = "//div[@id='title-container']/div[3]/a";
	private static String BUILDRULEUSINGKEYVALUEINFO = "url_key_val_rule_based";
	private static String EDIT = "edit_campaign_button";
	private static String KEYVALRULEBASED = "url_key_val_rule_based";
	private static String NEXT = "//div[@class=\"ui-dialog-buttonpane ui-widget-content ui-helper-clearfix\"]/button[2]";
	private static String RULENAME = "rule_name";
	private static String SELECTCREATIVE = "camp_disp_name_list";
	private static String VALUE = "//input[@value=\"1\"]";
	private static String FIELD = "filterField1";
	private static String FILTERFIELD = "filterEloquaField1_list"; 
	private static String CITYVALUE ="//select[@id='filterEloquaField1_list']/option[@value=\"C_City\"]";
	private static String OPERATORLIST ="filterOperator1_list";
	private static String IS ="//select[@id='filterOperator1_list']/option[@value=\"Is\"]";
	private static String FILTERPRAMETER ="filterParam1_1_input";
	private static String EXECUTECAMPAIGN ="permalink_to_campaign";

	public RuleCreationPage(WebDriver driver) {
		this.driver = driver;
	}

	public static void scrollTo(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

	public void enableRule() throws InterruptedException {
		//driver.get("http://www.kwanzoo.com/run-campaign/7625");
		Thread.sleep(20000);
		scrollTo(driver, driver.findElement(By.id(EDIT)));
		driver.findElement(By.id(ENABLERULES)).click();
	}

	public void editTargetingRule() throws InterruptedException  {
		driver.findElement(By.id(EDITTARGETINGRULES)).click();
	}

	public void createNewRule() throws InterruptedException {
		Thread.sleep(5000);
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle); // switch focus of WebDriver to
													// the next found window
													// handle (that's your newly
													// opened window)
		}
		driver.findElement(By.xpath(CREATENEWRULE)).click();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle); // switch focus of WebDriver to
													// the next found window
													// handle (that's your newly
													// opened window)
		}
		driver.findElement(By.id(KEYVALRULEBASED)).click();
		driver.findElement(By.xpath(NEXT)).click();
		
		// rule defination
		
		WebElement rulename = driver.findElement(By.id("key_val_rule_name"));
		rulename.sendKeys("TestRule");
		
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='url_key_val_camp_disp_name_list']")));
		s1.selectByVisibleText("creative_two");
		
		WebElement key = driver.findElement(By.id("keyValFilterField1"));
		key.click();
		
		WebElement keyvalue = driver.findElement(By.id("filterKeyValField1_list"));
		keyvalue.sendKeys("City");
		//
		/*WebElement keyfield = driver.findElement(By.id("keyValFilterOperator1_list"));
		keyfield.click();
		
		WebElement keyfieldvalue = driver.findElement(By.xpath("//select[@id='keyValFilterOperator1_list']/option[2]"));
		Thread.sleep(5000);
		keyfieldvalue.click();*/
	//	keyfieldvalue.click();
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='keyValFilterOperator1_list']")));
		s.selectByVisibleText("Is");
		
	/*	Select oSelect = new Select(driver.findElement(By.xpath("//select[@id='keyValFilterOperator1_list']/option[4]")));
		oSelect.selectByIndex(3);*/
		
		WebElement keyparameter = driver.findElement(By.id("keyValFilterParam1_1_input"));
		keyparameter.sendKeys("Pune");
		
		WebElement save = driver.findElement(By.xpath("(//div[@class=\"ui-dialog-buttonpane ui-widget-content ui-helper-clearfix\"])[2]/button[2]"));
		save.click();
		
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(2));
		    driver.close();
		    driver.switchTo().window(tabs2.get(1));
		
		Thread.sleep(15000);
		WebElement savesettings = driver.findElement(By.xpath("//input[@id='save_setting_button_top']"));
		savesettings.click();
		
	}
	
	public void executeCampaign() throws InterruptedException{
		System.out.println(driver.getCurrentUrl());
	    driver.get(driver.getCurrentUrl());
		Thread.sleep(30000);
		scrollTo(driver,driver.findElement(By.id("secton-header")));
	    WebElement run = driver.findElement(By.id(EXECUTECAMPAIGN));
	    run.click();
		
	}

	public void createRule() throws InterruptedException {
		enableRule();
		editTargetingRule();
		createNewRule();
		
	}
	
	public void loadagainCampaign(){
		driver.get(driver.getCurrentUrl());
	}
}
