package com.KwanzooPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgramPage {
	private static String pid = "//div[@id='sidebar-wrapper']/ul/li[4]/a";
	private static String viewallcamp = "//table[@id='allProgramsTable']/thead/tr/th/div[2]/a";
	private static String createCampaign = "//div[@id='searchform-container']/div/a";
	public WebDriver driver;
	private static String CAMPAIGN_CUSTOMIZER_BUTTON = "#customize_button > img";
	
	public ProgramPage(WebDriver driver ) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	
	
	public void viewAllCampaigns() throws InterruptedException{
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(viewallcamp)));
		WebElement viewAllCamp = driver.findElement(By.xpath(viewallcamp));
		viewAllCamp.click();
	}
	
	public static void scrollTo(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }

	
	public void createNewTemplateLink() throws InterruptedException {
	
		driver.get("http://www.kwanzoo.com/select-marketing-unit");
		for (String winHandle : driver.getWindowHandles()) 
		{
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		Thread.sleep(7000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(createCampaign)));
		WebElement createCamp = driver.findElement(By.xpath(createCampaign));
		createCamp.click();
		
	}
	
	public void createNewTemplate() throws InterruptedException{
		for (String winHandle : driver.getWindowHandles()) 
		{
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		Thread.sleep(7000);
		driver.get("http://www.kwanzoo.com/select-marketing-unit");
	}
	
	public void selectProgram(){
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pid)));
		WebElement temp = driver.findElement(By.xpath(pid));
		temp.click();
		
	}
	
	public void selectTemplate(String SELECT_TEMPLATE)
	{
		WebDriverWait waittemplateselection = new WebDriverWait(driver, 5000);
		waittemplateselection.until( ExpectedConditions.presenceOfElementLocated(By.id(SELECT_TEMPLATE)));
		driver.findElement(By.id(SELECT_TEMPLATE)).click();
	
	}
	
	// Click on Customized Campaign Button.
	public void customizeCampaignClick()
	{
		driver.findElement(By.cssSelector(CAMPAIGN_CUSTOMIZER_BUTTON)).click();
	}
	

}
