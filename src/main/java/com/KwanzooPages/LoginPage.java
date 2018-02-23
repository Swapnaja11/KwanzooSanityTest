package com.KwanzooPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.CommonFunctions.PropertyManager;
import com.CommonFunctions.SharedDriver;

public class LoginPage {
	
	private static String UNAME ="u_username";
	private static String UPASS = "u_password";
	private static String lOG = "login-submit";
    private static String lOGIN = "//a[contains(text(),'Login')]" ;
    private static String LOGOUT = "//a[contains(text(),'Logout')]" ;
	public WebDriver driver;
	private SharedDriver shareddriver = new SharedDriver();
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void maximizeWindow(){
		shareddriver.maximizeWindow();
	}
	
	public void onKwanzooSite(){
		
		driver.get(PropertyManager.getProp("Url"));
		 System.out.println("Page title is: " +PropertyManager.getProp("Url") );
	}
	
	public void loginToKwanzoo() throws InterruptedException{
		Thread.sleep(1000);
	/*	WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(lOGIN)));
		
	    WebElement temp = driver.findElement(By.xpath(lOGIN));
		temp.click();*/
		WebElement uname = driver.findElement(By.id(UNAME));
		uname.sendKeys(PropertyManager.getProp("Uname"));
		WebElement upass = driver.findElement(By.id(UPASS));
		upass.sendKeys(PropertyManager.getProp("Upass"));
		WebElement loginbutton = driver.findElement(By.name(lOG));
		loginbutton.click();	
	}
	
	public void loginToKwanzooForReport() throws InterruptedException{
		Thread.sleep(1000);
	/*	WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(lOGIN)));
		
	    WebElement temp = driver.findElement(By.xpath(lOGIN));
		temp.click();*/
		WebElement uname = driver.findElement(By.id(UNAME));
		uname.sendKeys(PropertyManager.getProp("UnmaeForReport"));
		WebElement upass = driver.findElement(By.id(UPASS));
		upass.sendKeys(PropertyManager.getProp("PassForReport"));
		WebElement loginbutton = driver.findElement(By.name(lOG));
		loginbutton.click();	
	}
	
	public void logout() throws InterruptedException{
		driver.get("http://www.kwanzoo.com/");
		Thread.sleep(5000);
		WebElement logout= driver.findElement(By.name(LOGOUT));
		logout.click();
	}
}
