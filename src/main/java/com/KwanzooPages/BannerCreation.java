package com.KwanzooPages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.CommonFunctions.PropertyManager;
import com.CommonFunctions.SharedDriver;

public class BannerCreation {
	
	private static String CNAME = "widgetCampaignName";
	private static String DESC ="widgetCampaignDesc";
	private static String BNAME = "campaign_name";
	private static String BDESC = "campaign_desc";
	private static String SIZE ="select_size_of_img";
	private static String UIMG = "kz_image_upload_dialog_button_2";
	private static String BROWSE = "submit-image-file";
	private static String CLOSE = "kz_image_upload_dialog_button_1";
	private static String LPURL = "display_ad_url";
	private static String SAVEALL ="save-settings";
	private static String RUNCAMP ="run_campaign_top";
	private static String ACTIVATECAMP ="activate_campaign_button";
	private static String DYNAMICTEXT ="enable_dynamic_text_checkbox";
	private static String DYNAMICTEXTLINK ="edit_dynamic_text_dialog_link";
	private static String ACCOUNTNAME ="enable_account_param_checkbox_1";
	private static String ACCOUNTNAMEVALUE ="default_account_val_1";
	private static String OK="(//button[@type='button'])[3]";
	private static String CONVERTTOUPPER = "enable_uppercase_dynamic_text_checkbox";
	private static String ADDSAFEICON = "enable_ad_choice_checkbox";
	private static String ADDSAFEREDIRECT ="ad_choice_redirect_url";
	private static String UPLOADIMG1 = "//div[@id='widget_Configuration']/a";
	SharedDriver sd = new SharedDriver();
	WebDriver driver;
	
	public BannerCreation(WebDriver driver) {
		this.driver = driver;
	}
	
	public  WebDriver getDriver(){
		return driver;
	} 
	
	private StringBuilder generateCampName(){
		DateFormat df = new SimpleDateFormat("dd-MM-yy HH_mm_ss");
		Date dateobj = new Date();
		StringBuilder cname = new StringBuilder("Campaign_");
	    cname.append(df.format(dateobj));	
		return cname; 
	}
	
	public void campaignDetails(){
		WebElement c_name = driver.findElement(By.id(CNAME));
		c_name.clear();
		c_name.sendKeys(generateCampName());
	    WebElement c_desc = driver.findElement(By.id(DESC));
		c_desc.clear();
		c_desc.sendKeys(PropertyManager.getProp("CampaignDescription"));
		
	}
	
	public void bannerDetails(WebDriver driver){
		WebElement b_name = driver.findElement(By.id(BNAME));
		b_name.clear();
		String bnm = PropertyManager.getProp("BannerName");
		DateFormat df = new SimpleDateFormat("dd-MM-yy HH_mm_ss");
		Date dateobj = new Date();
		StringBuilder nm = new StringBuilder(bnm);
		nm.append(df.format(dateobj));
		b_name.sendKeys(nm);
		WebElement b_desc = driver.findElement(By.id(BDESC));
		b_desc.clear();
		b_desc.sendKeys(PropertyManager.getProp("BannerDescription"));
	}
	
	
	public void setImage(WebDriver driver , String pathforImg) throws InterruptedException{
		Thread.sleep(10000);
		
		//driver.findElement(By.linkText("Upload Image")).click();
		scrollTo(driver ,driver.findElement(By.xpath("//div[@id='addisplay_steps']/span[1]")));
		driver.findElement(By.xpath(UPLOADIMG1)).click();
		WebElement browse = driver.findElement(By.id(BROWSE));
		browse.sendKeys(pathforImg);
		if ( !driver.findElement(By.id("submit-image-certify")).isSelected()){
		     driver.findElement(By.id("submit-image-certify")).click();
		}
		WebElement upload  = driver.findElement(By.id(UIMG));
		upload.click();
        WebElement close = driver.findElement(By.id(CLOSE));
		close.click();
	}
	
	public void selectSize(WebDriver driver){
		Select s = new Select(driver.findElement(By.id(SIZE)));
		s.selectByVisibleText(PropertyManager.getProp("Size"));
	}
	
	public void setLandingUrl(WebDriver driver){
		WebElement landingurl  = driver.findElement(By.id(LPURL));
		landingurl.sendKeys(PropertyManager.getProp("LURL"));
	}
	
	public void setTitle(){
		/*WebElement title  = driver.findElement(By.id(TITLE));
		title.click();
		
		WebElement settitle = driver.findElement(By.id(SETTITLE));
		
		settitle.clear();
		settitle.sendKeys(PropertyManager.getProp("Titletext"));*/
		
	}
	
	public static void scrollTo(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }

	public void escKey(){
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
	}
	
	public void saveSettings(WebDriver driver){
		sd.addimplicitWait();
		sd.addimplicitWait();
		WebDriverWait wait = new WebDriverWait(driver, 200);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id(SAVEALL)));
	    WebElement savesetting  = driver.findElement(By.id(SAVEALL));
	    savesetting.click();
	    escKey();
	}

	public void runcampaign() throws InterruptedException{
	    Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 200);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id(RUNCAMP)));
	    WebElement run = driver.findElement(By.id(RUNCAMP));
		scrollTo(driver,run);
	    run.click();
	}
	
	
	public void activateCamp(){
		WebDriverWait wait = new WebDriverWait(driver, 200);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id(ACTIVATECAMP)));
	    WebElement activate = driver.findElement(By.id(ACTIVATECAMP));
	    activate.click();
	}
	
	public void executeCamp(){
	    WebElement run = driver.findElement(By.id("permalink_to_campaign"));
	    run.click();
	}
	
	public void loadBanner() throws InterruptedException{
		for (String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement(By.id("wiget_iframe_id"))); // replace by your frame name
	    String childtFrame = driver.getWindowHandle();
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 200);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("custom-cover-img")));
	    WebElement activate = driver.findElement(By.id("custom-cover-img"));
	    activate.click();
	}
	
	public void addDynamicText(){
		WebElement dynamictext = driver.findElement(By.id(DYNAMICTEXT));
		dynamictext.click();
		WebElement link = driver.findElement(By.id(DYNAMICTEXTLINK));
		link.click();
		WebElement accountname = driver.findElement(By.id(ACCOUNTNAME));
		accountname.click();
		WebElement accountnamevalue = driver.findElement(By.id(ACCOUNTNAMEVALUE));
		accountnamevalue.sendKeys(PropertyManager.getProp("AccountNameValue"));
		WebElement ok = driver.findElement(By.xpath(OK));
		ok.click();
		WebElement converttoupper = driver.findElement(By.id(CONVERTTOUPPER));
		converttoupper.click();
	}
	
	public void addSafeIcon(){
		WebElement addsafeicon = driver.findElement(By.id(ADDSAFEICON));
		addsafeicon.click();
		WebElement addsaferedirect = driver.findElement(By.id(ADDSAFEREDIRECT));
		addsaferedirect.clear();
		addsaferedirect.sendKeys(PropertyManager.getProp("AddSafeRedirectUrl"));
	}
	
	public void details() throws InterruptedException{
		campaignDetails();
		String img = PropertyManager.getProp("Img");
		setImage(driver,img);
		bannerDetails(this.driver);
		sd.addimplicitWait();
		setLandingUrl(driver);
		addDynamicText();
		addSafeIcon();
		sd.addimplicitWait();
		//time to load image
		 driver.findElement(By.linkText("Upload Image")).click();
		 WebElement upload1  = driver.findElement(By.id(UIMG));
		 upload1.click();
		 WebElement close1 = driver.findElement(By.id(CLOSE));
		 close1.click();
		 saveSettings(driver);
	}
}
