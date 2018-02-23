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

import com.CommonFunctions.PropertyManager;

public class Report {
	PropertyManager prop = new PropertyManager();
	WebDriver driver;
	private static String REPORTTAB = "//div[@id='top-tabs']/ul/li[3]/a";
	private static String CCRGENERATEREPORT = "(//span[@class=\"pull-right\"])[1]";
	private static String PORGENERATEREPORT = "(//span[@class=\"pull-right\"])[2]";
	private static String AERGENERATEREPORT = "(//span[@class=\"pull-right\"])[3]";
	private static String SIRGENERATEREPORT = "(//span[@class=\"pull-right\"])[4]";
	private static String CCRNEWCREATEREPORT = "(//div[@class=\"radio\"])[1]/label/input";
	private static String CCRREPORTNAME ="(//input[@ ng-model=\"$report.inputReportName\"])[1]";
	private static String NEXTONREPORTTAB ="//div[@id='reportTab0']/center/button";
	private static String CCRCREATECREATIVEGROUP ="//input[@name=\"47\"]";
	private static String CCRCREATIVEGROUPNAME = "//input[@ ng-model=\"$report.inputCreativeGroupName\"]";
	private static String NEXTONFILTERTAB = "//div[@id='filterTab0']/center/button";
	private static String ASSIGNCREATIVE = "//select[@id='leftCreativeSelect']/option[1]";
	private static String MOVECREATIVE = "(//button[@title=\"move selected Creatives\"])[1]";
	private static String ASSIGNCREATIVEGROUPINTOREPORT = "//select[@id='leftGroupSelect']/option[@value=\"CCRCreativeGroupTest\"]";
	private static String MOVEALLCREATIVEGROUP ="//div[@id='filterTab0']/div[2]/div[2]/div[2]/fieldset/div/div[2]/div/button[4]";
	private static String MOVECREATIVEGROUP = "//div[@id='filterTab0']/div[2]/div[2]/div[2]/fieldset/div/div[2]/div/button[2]";
	private static String EMAILRECIPIENT = "(//input[@ng-model=\"$report.currReport.emailRecipientModel\"])[1]";
	private static String ADDEMAILRECIPIENT ="//div[@id='audienceTab0']/div[2]/div[1]/fieldset/div/div/div/span/button";
	private static String SELECTDURATION = "(//select[@ ng-model=\"$report.currReport.reportDuration\"])[1]";
	private static String THISWEEK ="(//select[@ ng-model=\"$report.currReport.reportDuration\"])[1]/option[2]";
	private static String APPLY = "//div[@id='audienceTab0']/center/button";
	private static String SELECTFILTERS ="//a[@id='filter_tab_anchor_0']";
	private static String PORNEWCREATEREPORT="//div[@id='reportTab1']/div/div/fieldset/div/div[1]/div[1]/label/input";
	private static String POREPORTNAME ="//div[@id='reportTab1']/div/div/fieldset/div/div[1]/div[2]/input";
	private static String PORNEXTONREPORTTAB = "//div[@id='reportTab1']/center/button";
	private static String MOVEALLPROGRAMS ="//div[@id='filterTab1']/div[2]/div/div/fieldset/div/div[2]/div/button[4]";
	private static String SELECTPROGRAM = "//select[@id='leftProgramSelect-programs_overview']/option[1]";
	private static String MOVESELECTEDPROGRAM = "//div[@id='filterTab1']/div[2]/div/div/fieldset/div/div[2]/div/button[2]";
	private static String PORNEXTONFILTERTAB ="//div[@id='filterTab1']/center/button";
	private static String POREMAILRECIPIENT ="(//input[@ng-model=\"$report.currReport.emailRecipientModel\"])[2]";
	private static String PORADDEMAILRECIPIENT ="//div[@id='audienceTab1']/div[2]/div[1]/fieldset/div/div/div/span/button";
	private static String PORAPPLY = "//div[@id='audienceTab1']/center/button";
	private static String AERMOVEALLPROGRAMS ="//div[@id='filterTab2']/div[2]/div/div/fieldset/div/div[2]/div/button[4]";
	private static String AERMOVESELECTEDPROGRAM = "//div[@id='filterTab2']/div[2]/div/div/fieldset/div/div[2]/div/button[2]";
	private static String AERNEXTONFILTERTAB ="//div[@id='filterTab2']/center/button";
	private static String AERSELECTDURATION = "(//select[@ ng-model=\"$report.currReport.reportDuration\"])[3]";
	private static String AERTHISWEEK ="(//select[@ ng-model=\"$report.currReport.reportDuration\"])[3]/option[2]";
	private static String AERAPPLY = "//div[@id='audienceTab2']/center/button";
	private static String SIRNEXTONFILTERTAB ="//div[@id='filterTab3']/center/button";
	private static String SIRSELECTDURATION = "(//select[@ ng-model=\"$report.currReport.reportDuration\"])[4]";
	private static String SIRTHISWEEK ="(//select[@ ng-model=\"$report.currReport.reportDuration\"])[4]/option[2]";
	private static String SIRAPPLY = "//div[@id='audienceTab3']/center/button";
	private static String SIRNEWCREATEREPORT ="//div[@id='reportTab3']/div/div/fieldset/div/div[1]/div[1]/label/input";
	private static String SIREPORTNAME ="//div[@id='reportTab3']/div/div/fieldset/div/div[1]/div[2]/input";
	private static String SIRNEXTONREPORTTAB = "//div[@id='reportTab3']/center/button";
	private static String SIREMAILRECIPIENT="//div[@id='audienceTab3']/div[2]/div[1]/fieldset/div/div/div/input";
	private static String SIRADDEMAILRECIPIENT="//div[@id='audienceTab3']/div[2]/div[1]/fieldset/div/div/div/span/button";
	private static String AERNEWCREATEREPORT ="//div[@id='reportTab2']/div/div/fieldset/div/div[1]/div[1]/label/input";
	private static String AEREPORTNAME ="//div[@id='reportTab2']/div/div/fieldset/div/div[1]/div[2]/input";
	private static String AERNEXTONREPORTTAB = "//div[@id='reportTab2']/center/button";
	private static String AERSELECTPROGRAM="//select[@id='leftProgramSelect-account_engagement']/option[1]";
	private static String AEREMAILRECIPIENT="//div[@id='audienceTab2']/div[2]/div[1]/fieldset/div/div/div/input";
	private static String AERADDEMAILRECIPIENT="//div[@id='audienceTab2']/div[2]/div[1]/fieldset/div/div/div/span/button";
    private static String WebsiteVisitorTrackingPixel = "//div[@id='filterTab2']/div[3]/div/div/fieldset/div/div/div/div/label/input";
	private static String SELECTPROGRAMFORSIR = "//input[@name=\"78\"]";
	private static String SELECTIVEPROG = "//div[@id='filterTab3']/div[2]/div[1]/div/fieldset/div/div[2]/div[2]/div[1]/div/div[2]/input";
	private static String REPORTDURATION="//div[@id='audienceTab3']/div[2]/div[2]/fieldset/div/div[1]/div/div[1]/div/label/select";
	private static String DURATION="//div[@id='audienceTab3']/div[2]/div[2]/fieldset/div/div[1]/div/div[1]/div/label/select/option[3]";
    
    
	private StringBuilder generateReportName(){
		DateFormat df = new SimpleDateFormat("dd-MM-yy HH_mm_ss");
		Date dateobj = new Date();
		StringBuilder cname = new StringBuilder("Report_");
	    cname.append(df.format(dateobj));	
		return cname; 
		}
	
	public Report(WebDriver driver){
		this.driver = driver;
	}
	
	public void selectReportTab() throws InterruptedException{
		Thread.sleep(20000);
		driver.get("http://www.kwanzoo.com/reports");
	}
	
	public void CCRReport() throws InterruptedException{
		driver.get("http://www.kwanzoo.com/reports");
		Thread.sleep(5000);
		WebElement ccrgeneratereport = driver.findElement(By.xpath(CCRGENERATEREPORT));
		ccrgeneratereport.click();
		Thread.sleep(10000);
		WebElement createnewreport = driver.findElement(By.xpath(CCRNEWCREATEREPORT));
		createnewreport.click();
		WebElement reportname = driver.findElement(By.xpath(CCRREPORTNAME));
		reportname.sendKeys(generateReportName());
		WebElement next = driver.findElement(By.xpath(NEXTONREPORTTAB));
		next.click();
		Thread.sleep(5000);
		escKey();
		Thread.sleep(10000);
		//creating new creative group
		WebElement selectfilters = driver.findElement(By.xpath(SELECTFILTERS));
		selectfilters.click();
		WebElement createnewcreativegroup = driver.findElement(By.xpath(CCRCREATECREATIVEGROUP));
		createnewcreativegroup.click();
		//step A
		WebElement newcreativegroupname = driver.findElement(By.xpath(CCRCREATIVEGROUPNAME));
		newcreativegroupname.sendKeys(prop.getProp("CCRCreativeGroupName"));
		// step B
		WebElement assigncreative = driver.findElement(By.xpath(ASSIGNCREATIVE));
		assigncreative.click();
		WebElement moveselectedcreative = driver.findElement(By.xpath(MOVECREATIVE));
		moveselectedcreative.click();
		WebElement nextonfiltertab = driver.findElement(By.xpath(NEXTONFILTERTAB));
		nextonfiltertab.click();
		Thread.sleep(1000);
		//Step C
		WebElement moveallcreativegroup = driver.findElement(By.xpath(MOVEALLCREATIVEGROUP));
		moveallcreativegroup.click();
		WebElement assigncreativegroupintoreport = driver.findElement(By.xpath(ASSIGNCREATIVEGROUPINTOREPORT));
		assigncreativegroupintoreport.click();
		WebElement moveselectedcreativegroup = driver.findElement(By.xpath(MOVECREATIVEGROUP));
		moveselectedcreativegroup.click();
		// save
		nextonfiltertab.click();
		Thread.sleep(10000);
		//select duration
		//step A
		WebElement emailrecipient = driver.findElement(By.xpath(EMAILRECIPIENT));
		emailrecipient.sendKeys(prop.getProp("EMAILRECIPIENT"));
		WebElement addemailrecipient = driver.findElement(By.xpath(ADDEMAILRECIPIENT));
		scrollTo(driver,addemailrecipient);
		addemailrecipient.click();
		//step B
		WebElement selectduration = driver.findElement(By.xpath(SELECTDURATION));
		selectduration.click();
		WebElement thisweek = driver.findElement(By.xpath(THISWEEK));
		thisweek.click();
		//Apply
		WebElement apply = driver.findElement(By.xpath(APPLY));
		apply.click();
	/*	driver.switchTo().alert().accept();
		Thread.sleep(5000);*/
	}
	
	public void POReport() throws InterruptedException{
		driver.get("http://www.kwanzoo.com/reports");
		Thread.sleep(5000);
		WebElement ccrgeneratereport = driver.findElement(By.xpath(PORGENERATEREPORT));
		scrollTo(driver, ccrgeneratereport);
		ccrgeneratereport.click();
		Thread.sleep(10000);
		WebElement createnewreport = driver.findElement(By.xpath(PORNEWCREATEREPORT));
		createnewreport.click();
		WebElement reportname = driver.findElement(By.xpath(POREPORTNAME));
		reportname.sendKeys(generateReportName());
		WebElement next = driver.findElement(By.xpath(PORNEXTONREPORTTAB));
		next.click();
		Thread.sleep(5000);
		WebElement moveallprograms = driver.findElement(By.xpath(MOVEALLPROGRAMS));
		moveallprograms.click();
		WebElement selectprograms = driver.findElement(By.xpath(SELECTPROGRAM));
		selectprograms.click();
		WebElement moveselectedprograms = driver.findElement(By.xpath(MOVESELECTEDPROGRAM));
		moveselectedprograms.click();
		WebElement nextonfiltertab  = driver.findElement(By.xpath(PORNEXTONFILTERTAB));
		nextonfiltertab.click();
		WebElement emailrecipient = driver.findElement(By.xpath(POREMAILRECIPIENT));
		emailrecipient.sendKeys(prop.getProp("EMAILRECIPIENT"));
		WebElement addemailrecipient  = driver.findElement(By.xpath(PORADDEMAILRECIPIENT));
		addemailrecipient.click();
		Thread.sleep(8000);
		WebElement apply  = driver.findElement(By.xpath(PORAPPLY));
		apply.click();
		driver.switchTo().alert().accept();
		Thread.sleep(10000);	
	}
	
	public void AEReport() throws InterruptedException{
		Thread.sleep(10000);
		WebElement ccrgeneratereport = driver.findElement(By.xpath(AERGENERATEREPORT));
		scrollTo(driver, ccrgeneratereport);
		ccrgeneratereport.click();
		Thread.sleep(10000);
		WebElement createnewreport = driver.findElement(By.xpath(AERNEWCREATEREPORT));
		createnewreport.click();
		WebElement reportname = driver.findElement(By.xpath(AEREPORTNAME));
		reportname.sendKeys(generateReportName());
		WebElement next = driver.findElement(By.xpath(AERNEXTONREPORTTAB));
		next.click();
		Thread.sleep(5000);
		WebElement moveallprograms = driver.findElement(By.xpath(AERMOVEALLPROGRAMS));
		moveallprograms.click();
		WebElement selectprograms = driver.findElement(By.xpath(AERSELECTPROGRAM));
		selectprograms.click();
		WebElement moveselectedprograms = driver.findElement(By.xpath(AERMOVESELECTEDPROGRAM));
		moveselectedprograms.click();
		WebElement websitevisitortrackingpixel = driver.findElement(By.xpath(WebsiteVisitorTrackingPixel));
		websitevisitortrackingpixel.click();
		WebElement nextonfiltertab  = driver.findElement(By.xpath(AERNEXTONFILTERTAB));
		nextonfiltertab.click();
		WebElement emailrecipient = driver.findElement(By.xpath(AEREMAILRECIPIENT));
		emailrecipient.sendKeys(prop.getProp("EMAILRECIPIENT"));
		WebElement addemailrecipient  = driver.findElement(By.xpath(AERADDEMAILRECIPIENT));
		addemailrecipient.click();
		Thread.sleep(15000);
		WebElement apply  = driver.findElement(By.xpath(AERAPPLY));
		scrollTo(driver ,apply );
		apply.click();
		/*driver.switchTo().alert().accept();
		Thread.sleep(10000);	*/
	}
	
	public void SIReport() throws InterruptedException{
		driver.get("http://www.kwanzoo.com/reports");
		Thread.sleep(5000);
		WebElement ccrgeneratereport = driver.findElement(By.xpath(SIRGENERATEREPORT));
		scrollTo(driver, ccrgeneratereport);
		ccrgeneratereport.click();
		Thread.sleep(10000);
		WebElement createnewreport = driver.findElement(By.xpath(SIRNEWCREATEREPORT));
		createnewreport.click();
		WebElement reportname = driver.findElement(By.xpath(SIREPORTNAME));
		reportname.sendKeys(generateReportName());
		WebElement next = driver.findElement(By.xpath(SIRNEXTONREPORTTAB));
		next.click();
		Thread.sleep(5000);
		WebElement nextonfiltertab  = driver.findElement(By.xpath(SIRNEXTONFILTERTAB));
		nextonfiltertab.click();
		WebElement emailrecipient = driver.findElement(By.xpath(SIREMAILRECIPIENT));
		emailrecipient.sendKeys(prop.getProp("EMAILRECIPIENT"));
		WebElement addemailrecipient  = driver.findElement(By.xpath(SIRADDEMAILRECIPIENT));
		addemailrecipient.click();
		Thread.sleep(15000);
		WebElement apply  = driver.findElement(By.xpath(SIRAPPLY));
		scrollTo(driver ,apply );
		apply.click();
		/*driver.switchTo().alert().accept();
		Thread.sleep(10000);	*/
	}
	
	public void SIRReportForSelectiveProgram() throws InterruptedException{
		driver.get("http://www.kwanzoo.com/reports");
		Thread.sleep(5000);
		//SELECTIVEPROG
		Thread.sleep(5000);
		WebElement ccrgeneratereport = driver.findElement(By.xpath(SIRGENERATEREPORT));
		scrollTo(driver, ccrgeneratereport);
		ccrgeneratereport.click();
		Thread.sleep(10000);
		WebElement createnewreport = driver.findElement(By.xpath(SIRNEWCREATEREPORT));
		createnewreport.click();
		WebElement reportname = driver.findElement(By.xpath(SIREPORTNAME));
		reportname.sendKeys(generateReportName());
		WebElement next = driver.findElement(By.xpath(SIRNEXTONREPORTTAB));
		next.click();
		Thread.sleep(5000);
		WebElement selectprog = driver.findElement(By.xpath(SELECTPROGRAMFORSIR));
		selectprog.click();
		WebElement selectiveprogram = driver.findElement(By.xpath(SELECTIVEPROG));
		selectiveprogram.click();
		WebElement nextonfiltertab  = driver.findElement(By.xpath(SIRNEXTONFILTERTAB));
		nextonfiltertab.click();
		WebElement emailrecipient = driver.findElement(By.xpath(SIREMAILRECIPIENT));
		emailrecipient.sendKeys(prop.getProp("EMAILRECIPIENT"));
		WebElement addemailrecipient  = driver.findElement(By.xpath(SIRADDEMAILRECIPIENT));
		addemailrecipient.click();
		
		//REPORTDURATION
		/*WebElement reportduration  = driver.findElement(By.xpath(REPORTDURATION));
		reportduration.click();
		Thread.sleep(2000);
		WebElement duration  = driver.findElement(By.xpath(DURATION));
		duration.click();
		duration.click();*/
		Thread.sleep(10000);
		WebElement apply  = driver.findElement(By.xpath(SIRAPPLY));
		scrollTo(driver ,apply );
		apply.click();
		driver.switchTo().alert().accept();
		Thread.sleep(10000);	
	}
	
	public static void scrollTo(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }

	public void escKey(){
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
	}
}
