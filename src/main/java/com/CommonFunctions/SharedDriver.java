package com.CommonFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SharedDriver extends EventFiringWebDriver{
	
	private static WebDriver driver = new FirefoxDriver();
	/*private static WebDriver driver ;
	static {
		File file = new File("C:/Program Files/phantomjs-2.1.1-windows/bin/phantomjs.exe");
		System.setProperty("phantomjs.binary.path",file.getAbsolutePath());
	Capabilities caps = new DesiredCapabilities();
	((DesiredCapabilities) caps).setJavascriptEnabled(true);
	((DesiredCapabilities) caps).setCapability("takesScreenshot", false);
	((DesiredCapabilities) caps).setCapability("locationContextEnabled", true);
	((DesiredCapabilities) caps).setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, new String[] {"--web-security=false", "--ssl-protocol=any", "--ignore-ssl-errors=true"});
	//((DesiredCapabilities) caps).setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"C:/Program Files/phantomjs-2.1.1-windows/bin/phantomjs.exe");
	 driver = new PhantomJSDriver(caps);
	} */

	
      public SharedDriver(){
		super(driver);	
	}
	
	public void maximizeWindow(){
		driver.manage().window().maximize();
	}
	
	public void addimplicitWait(){
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	public static void scrollTo(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }

}
