package com.KwanzooPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CampaignFunctions {

	private static String RUNCAMPAIGN ="run_campaign_top";
	private static String ACTIVATECAMPAIGN ="activate_campaign_button";
	private static String EXECUTECAMPAIGN ="permalink_to_campaign";
	private static String SAVE_SETTINGS = "save-settings";
	WebDriver driver;
	
	public CampaignFunctions() {
	}
	public CampaignFunctions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setDriver(WebDriver driver){
		this.driver= driver;
	}
	
	public void logout() throws InterruptedException{
		driver.get("http://www.kwanzoo.com/");
		Thread.sleep(5000);
		WebElement logout= driver.findElement(By.xpath("//li[@id='menu-item-3594']/a"));
		logout.click();
	}
	
	public void saveSettings() throws InterruptedException{
	    Thread.sleep(7000);
	    WebElement saveSettings = driver.findElement(By.id(SAVE_SETTINGS));		
		saveSettings.click();
	}
	
	public void runcampaign() throws InterruptedException{
		Thread.sleep(7000);
		WebDriverWait wait = new WebDriverWait(driver, 200);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id(RUNCAMPAIGN)));
	     WebElement run = driver.findElement(By.id(RUNCAMPAIGN));
	    run.click();
	}
	
	public void activateCampaign(){
		WebDriverWait wait = new WebDriverWait(driver, 200);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id(ACTIVATECAMPAIGN)));
	    
	    WebElement activate = driver.findElement(By.id(ACTIVATECAMPAIGN));
	    activate.click();
	}
	
	public void executeCampaign() throws InterruptedException{
	    WebElement run = driver.findElement(By.id(EXECUTECAMPAIGN));
	    run.click();
	}
}