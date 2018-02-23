package com.KwanzooPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CommonFunctions.PropertyManager;
import com.CommonFunctions.SharedDriver;

public class BannerCreationWithHTML5 {
	
	private static String HTML5OPTION = "enable_html5";
	private static String UPLOADHTML5 = "//div[@id='widget_Configuration_html5']/a";
	private static String BROWSE = "submit-html5-image-file";
	private static String CERTIFY = "submit-html5-image-certify";
	private static String UPLOADZIP = "kz_image_upload_dialog_button_2";
	private static String CLOSE = "kz_image_upload_dialog_button_1";
	private static String STOREACTIVITY = "campaign_name_optin";
	private static String LOADCLICK = "animation_container";
	private static String SELECTSIZE = "select_size_of_img";
	private static String OPTION2 = "//select[@id='select_size_of_img']/option[2]";
	SharedDriver sd = new SharedDriver();
	WebDriver driver;
	
	public BannerCreationWithHTML5(WebDriver driver) {
		this.driver = driver;
	}
	public static void scrollTo(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }
	
	public void enableHTML5() throws InterruptedException{
		WebElement storeactivity = driver.findElement(By.id(STOREACTIVITY));
		WebElement enablehtml = driver.findElement(By.id(HTML5OPTION));
		scrollTo(driver,storeactivity);
		Thread.sleep(12000);
		enablehtml.click();
	}
	
	public void uploadZipFileFor300_250(){
		WebElement uploadlink = driver.findElement(By.xpath(UPLOADHTML5));
		scrollTo(driver, uploadlink );
		uploadlink.click();
		
		WebElement browse = driver.findElement(By.id(BROWSE));
		String html5zip = PropertyManager.getProp("HTML5Zip300_250");
		browse.sendKeys(html5zip);
		
		WebElement certify = driver.findElement(By.id(CERTIFY));
		certify.click();
		
		WebElement uploadzip = driver.findElement(By.id(UPLOADZIP));
		uploadzip.click();
		WebElement close = driver.findElement(By.id(CLOSE));
		close.click();
	}
	
	public void uploadZipFileFor728_90() throws InterruptedException{
		WebElement select_options = driver.findElement(By.id(SELECTSIZE));
		Select select_options_dropdown = new Select(select_options);
		select_options_dropdown.selectByIndex(1);
		Thread.sleep(10000);
		WebElement uploadlink = driver.findElement(By.xpath(UPLOADHTML5));
		scrollTo(driver, uploadlink );
		uploadlink.click();
		
		WebElement browse = driver.findElement(By.id(BROWSE));
		String html5zip = PropertyManager.getProp("HTML5Zip728_90");
		browse.sendKeys(html5zip);
		
		WebElement certify = driver.findElement(By.id(CERTIFY));
		certify.click();
		
		WebElement uploadzip = driver.findElement(By.id(UPLOADZIP));
		uploadzip.click();
		WebElement close = driver.findElement(By.id(CLOSE));
		close.click();
	}
	
	public void uploadZipFileFor160_600() throws InterruptedException{
		WebElement select_options = driver.findElement(By.id(SELECTSIZE));
		Select select_options_dropdown = new Select(select_options);
		select_options_dropdown.selectByIndex(2);
		Thread.sleep(10000);
		
		WebElement uploadlink = driver.findElement(By.xpath(UPLOADHTML5));
		scrollTo(driver, uploadlink );
		uploadlink.click();
		
		WebElement browse = driver.findElement(By.id(BROWSE));
		String html5zip = PropertyManager.getProp("HTML5Zip");
		browse.sendKeys(html5zip);
		
		WebElement certify = driver.findElement(By.id(CERTIFY));
		certify.click();
		
		WebElement uploadzip = driver.findElement(By.id(UPLOADZIP));
		uploadzip.click();
		WebElement close = driver.findElement(By.id(CLOSE));
		close.click();
	}
	public void loadBanner() throws InterruptedException{
		driver.get("http://ads.kwanzoo.com/widget/customized/8166/load");
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
}
