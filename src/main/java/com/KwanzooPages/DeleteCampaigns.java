package com.KwanzooPages;





import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.CommonFunctions.PropertyManager;

public class DeleteCampaigns{
	PropertyManager prop = new PropertyManager();
	WebDriver driver;
	
	public DeleteCampaigns(WebDriver driver){
		this.driver = driver;
	}
	
    public void deletecampaigns() throws InterruptedException{
    	driver.get("http://www.kwanzoo.com/my-campaigns");
    	Thread.sleep(15000);
    	WebElement deactiavte = driver.findElement(By.xpath("//table[@id=\"table_header\"]/tbody/tr[1]/td[6]/a[1]"));
    	deactiavte.click();
    	WebElement confirmdeactivate = driver.findElement(By.xpath("//button[@id='kzdialog_button_2']"));
    	confirmdeactivate.click();
    	WebElement delete = driver.findElement(By.xpath("//table[@id=\"table_header\"]/tbody/tr[1]/td[6]/a[5]"));
    	delete.click();
    	WebElement confirmdelete = driver.findElement(By.xpath("//button[@id='kzdialog_button_2']"));
    	confirmdelete.click();
    }
    //	
    
    public void delete() throws InterruptedException{
    	driver.get("http://www.kwanzoo.com/my-campaigns");
    	Thread.sleep(15000);
    	List<WebElement> delete =  driver.findElements(By.xpath("//table[@id=\"table_header\"]/tbody/tr/td[6]/a[5]"));
    	int i = delete.size();
    	for(int j=0;j<i;i++ ){
    		WebElement deletet =driver.findElement(By.xpath("//table[@id=\"table_header\"]/tbody/tr[1]/td[6]/a[5]"));
    		deletet.click();
    		Thread.sleep(2000);
    		WebElement confirmdelete = driver.findElement(By.xpath("//button[@id='kzdialog_button_2']"));
	    	confirmdelete.click();
	    	Thread.sleep(4000);
    	}
    }
    public static void scrollTo(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }
    
    public void deactivate() throws InterruptedException{
    	driver.get("http://www.kwanzoo.com/my-campaigns");
    	Thread.sleep(15000);
    	List<WebElement> tr = driver.findElements(By.xpath("//table[@id=\"table_header\"]/tbody/tr/td[1]/b[3]"));
    	List<WebElement> deactivate = driver.findElements(By.xpath("//table[@id=\"table_header\"]/tbody/tr/td[6]/a[1]"));
    	Iterator<WebElement> itr = deactivate.iterator();
    	Iterator<WebElement> itr2 = tr.iterator();
    	while(itr.hasNext()) {
    		WebElement t1 = itr.next();
    	    System.out.println( "Text for deactivation : "+ t1.getText());
    	    if(t1.getText().equalsIgnoreCase("De-activate")){
    	    	t1.click();
    	    	WebElement confirmdeactivate = driver.findElement(By.xpath("//button[@id='kzdialog_button_2']"));
    	    	confirmdeactivate.click();
    	    	Thread.sleep(2000);
    	    }
    	    scrollTo(driver,itr2.next());
    	}
    }
    
    public void deactivateanddelete() throws InterruptedException{
    	driver.get("http://www.kwanzoo.com/my-campaigns");
    	Thread.sleep(15000);
    	List<WebElement> deactivate = driver.findElements(By.xpath("//table[@id=\"table_header\"]/tbody/tr/td[6]/a[1]"));
    	Iterator<WebElement> itrdeactivate = deactivate.iterator();
    	while(itrdeactivate.hasNext()) {
    		WebElement t1 = itrdeactivate.next();
    	    //deactivate campaign
    	    if(t1.getText().equalsIgnoreCase("De-activate")){
    	    	t1.click();
    	    	WebElement confirmdeactivate = driver.findElement(By.xpath("//button[@id='kzdialog_button_2']"));
    	    	confirmdeactivate.click();
    	    	Thread.sleep(2000);
    	    }
    	    //delete campaign
    	    Thread.sleep(2000);
            WebElement deletecampaign = driver.findElement(By.xpath("//table[@id=\"table_header\"]/tbody/tr[1]/td[6]/a[5]")); 
    	    deletecampaign.click();
    	    WebElement confirmdelete = driver.findElement(By.xpath("//button[@id='kzdialog_button_2']"));
	    	confirmdelete.click();
	    	Thread.sleep(2000);
    	}
    }
    
   /* public void delete() throws InterruptedException{
    	driver.get("http://www.kwanzoo.com/my-campaigns");
    	Thread.sleep(15000);
    	List<WebElement> delete =  driver.findElements(By.xpath("//table[@id=\"table_header\"]/tbody/tr/td[6]/a[5]"));
    	Iterator<WebElement> itr = delete.iterator();
    	while(itr.hasNext()) {
    		WebElement t1 = itr.next();
    		Thread.sleep(15000);
    	    System.out.println( "Text for deactivation : "+ t1.getText());
    	   // scrollTo(driver,t1);
    	    	t1.click();
    	    	WebElement confirmdelete = driver.findElement(By.xpath("//button[@id='kzdialog_button_2']"));
    	    	confirmdelete.click();
    	    	Thread.sleep(2000);
    	    	}	
    }*/
}
