package com.KwanzooTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.CommonFunctions.PropertyManager;

public class LeadFormImpressionTest {
	public WebDriver driver;
	private static String FIRSTNAME = "//input[@id='field_1']";
	private static String LASTNAME = "//input[@id='field_2']";
	private static String EMAIL ="//input[@id='field_3']";
	private static String SIGNUP ="//img[@id='optin-signup-bttn-img']";
	//private static String EXPORT_BUTTON = "Export";
	private static String GET_IMPRESSION = "(//table[@id=\"table_header\"]/tbody/tr/td[3])[1]";
	
	public LeadFormImpressionTest(WebDriver driver) {
		this.driver=driver;
	}
	
	public void loadWidget()throws InterruptedException{
		driver.manage().window().maximize();
		for (int i=0;i<1;i++){
		driver.get(PropertyManager.getProp("CCP1_URL"));
		Thread.sleep(2000);
		if(i==0){
		signUp();
		Thread.sleep(5000);
		}
		driver.get(PropertyManager.getProp("CCP2_URL"));
		Thread.sleep(2000);
		if(i==0){
		signUp();
		Thread.sleep(5000);
		}
		driver.get(PropertyManager.getProp("ADS1_URL"));
		Thread.sleep(2000);
		if(i==0){
		signUp();
		Thread.sleep(5000);
		}
		driver.get(PropertyManager.getProp("ADS2_URL"));
		Thread.sleep(2000);
		if(i==0){
		signUp();
		Thread.sleep(5000);
		}
	}
  }
	
	public void signUp() throws InterruptedException{
	
		WebElement firstname = driver.findElement(By.xpath(FIRSTNAME));
		firstname.sendKeys(PropertyManager.getProp("FirstName"));
		WebElement lastname = driver.findElement(By.xpath(LASTNAME));
		lastname.sendKeys(PropertyManager.getProp("LastName"));
		WebElement email = driver.findElement(By.xpath(EMAIL));
		email.sendKeys(PropertyManager.getProp("EmailAdd"));
		Thread.sleep(15000);
		WebElement signup = driver.findElement(By.xpath(SIGNUP));
		signup.click();
  }
	
	public void readImpression(){
		
		driver.get(PropertyManager.getProp("View_All-Campaign"));
		driver.get(PropertyManager.getProp("Campaign-Details"));
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement getimpression = driver.findElement(By.xpath(GET_IMPRESSION));
		System.out.println("Impression :" + getimpression.getText());
	}
}
