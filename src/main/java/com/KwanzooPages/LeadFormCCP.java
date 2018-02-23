package com.KwanzooPages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CommonFunctions.PropertyManager;
import com.CommonFunctions.SharedDriver;

public class LeadFormCCP {
	WebDriver driver;
	private static String CAMPAIGN_NAME = "widgetCampaignName";
	private static String CAMPAIGN_DESC = "widgetCampaignDesc";
	private static String CREATIVE_NAME = "campaign_name";
	private static String CREATIVE_DESCRIPTION = "campaign_desc";
	private static String EXPANDBAR = "collapse_img_6";
	private static String COLLAPSE_IMAGE1 = "collapse_img_1";
	private static String ELOQUA_EDIT_SETTIGNS = "eloquaProfilerEditLink";
	private static String USERDATA_CHECKBOX = "enable_disable_field_4";
	private static String TEXT_FILED = "field_4_label_input";
	private static String SELECT_OPTION = "select_contact_capture_options";
	private static String ELOQUA_COMPANY = "eloqua_company_id";
	private static String ELOQUA_USERNAME = "eloqua_username_id";
	private static String ELOQUA_PASSWORD = "eloqua_password_id";
	private static String ADACTIVITY_ELOQUA_COMPANY = "eloqua_company_id_in_dialog";
	private static String ADACTIVITY_ELOQUA_USERNAME = "eloqua_username_id_in_dialog";
	private static String ADACTIVITY_ELOQUA_PASSWORD = "eloqua_password_id_in_dialog";
	private static String ADACTIVITY_VALIDATE_BUTTON = "validate-cc-creds_in_dialog";
	private static String VALIDATE_BUTTON = "validate-cc-creds";
	private static String ELOQUA_FIELD_DROPDOWN = "select_cc_list_field_1";
	private static String ELOQUA_FIELD_DROPDOWN1 = "select_cc_list_field_2";
	private static String ELOQUA_FIELD_DROPDOWN2 = "select_cc_list_field_3";
	private static String ELOQUA_FIELD_DROPDOWN3 = "select_cc_list_field_4";
	private static String ACTIVITY_DETAILS_CHECKBOX1 = "front_screen_click_checkbox_1";
	private static String ACTIVITY_DETAILS_DROPDOWN1 = "front_screen_click_selectbox_1";
	private static String ACTIVITY_DETAILS_TEXTBOX1 = "front_screen_click_textbox_1";
	private static String AD_PLACEMENT_DETAILS_TAB = "tab3";
	private static String AD_PLACEMENT_DETAILS_CHECKBOX = "eloqua_prof_dlg_adPlacement_dtls_checkbox_1"; 
	private static String AD_PLACEMENT_DETAILS_DROPDOWN = "eloqua_prof_dlg_adPlacement_dtls_selectbox_1";
	private static String ADDITIONAL_DETAILS_TAB = "tab4";
	private static String ADDITIONAL_DETAILS_CHECKBOX1 = "eloqua_prof_dlg_additional_dtls_checkbox_1";
	private static String ADDITIONAL_DETAILS_DROPDOWN1 = "eloqua_prof_dlg_additional_dtls_selectbox_1";
	private static String ADDITIONAL_DETAILS_TEXTBOX1 = "front_screen_click_textbox_1";
	
	private static String MARKETO_USER_UID = "marketo_user_id";
	private static String MARKETO_ENCRYPTION_KEY = "marketo_encr_key";
	private static String MARKETO_SOAP_ENDPOINT = "marketo_soap_endpoint";
	
	private static String MARKETO_FIELD_DROPDOWN = "select_cc_list_field_1";
	private static String MARKETO_FIELD_DROPDOWN1 = "select_cc_list_field_2";
	private static String MARKETO_FIELD_DROPDOWN2 = "select_cc_list_field_3";
	private static String MARKETO_FIELD_DROPDOWN3 = "select_cc_list_field_4";
	
	private static String EMAIL_ADDRESS = "email-info_email";
	private static String EMAIL_SUBJECT = "email-info_subject";
	
	private static String SILVERPOP_REFRESH_TOKEN = "silverpop_refresh_token"; 
	private static String SILVERPOP_DB_DROPDOWN = "select_silverpop_db_list";
	private static String SILVERPOP_DROPDOWN = "select_cc_list_field_1";
	private static String SILVERPOP_DROPDOWN1 = "select_cc_list_field_2";
	private static String SILVERPOP_DROPDOWN2= "select_cc_list_field_3";
	private static String SILVERPOP_DROPDOWN3 = "select_cc_list_field_4";
	
	private static String SALESFORCE_LOGIN = "salesForceLogin";
	private static String SALESFORCE_USERNAME = "username";
	private static String SALESFORCE_PASSWORD = "password";
	private static String SALESFORCE_LOGIN_BUTTON = "Login";
	
	private static String TITLE_TEXT = "input_optin_signup_title";
	
	private static String TINYMC_ID = "editor_ifr";
	private static String TINYMX_OK_BUTTON = "tiny_mce_2";
	private static String FIRSTNAME = "//input[@id='field_1']";
	private static String LASTNAME = "//input[@id='field_2']";
	private static String EMAIL ="//input[@id='field_3']";
	private static String NEW ="//input[@id='field_4']";
	private static String SIGNUP ="//img[@id='optin-signup-bttn-img']";
	//private static String FONT_TEXT = "editor_fontselect_open";
	//private static String FONT_SIZE = "editor_fontsizeselect_open";
	//private static String FONT_COLOR = "editor_forecolor_open";
	private static String STORELEADS = "//input[@id='store_leads_in_both_radio']";
	private static String NEWCREATIVELINK ="new_creative_link";
	
	// Object Creation for Property File.
		PropertyManager prop = new PropertyManager();
	
	public LeadFormCCP(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public static void scrollTo(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }
	
	public void createAnotherLeadForm() throws InterruptedException{
		Thread.sleep(10000);
		driver.findElement(By.id(NEWCREATIVELINK)).click();
		Thread.sleep(20000);
		//Creative Name
		WebElement creativeName = driver.findElement(By.id(CREATIVE_NAME));
		creativeName.clear();
		creativeName.sendKeys(PropertyManager.getProp("CreativeName2"));
					
		// Creative Description
		WebElement campaign_desc = driver.findElement(By.id(CREATIVE_DESCRIPTION));
		campaign_desc.clear();
		campaign_desc.sendKeys(PropertyManager.getProp("CreativeDescription"));
					
		// Expand Step 2C: Customize Signup Screen
		WebElement expandbar = driver.findElement(By.id(EXPANDBAR));
		expandbar.click();
				
		
		// Title Text
		WebElement title_text = driver.findElement(By.id(TITLE_TEXT));
		title_text.click();		
		Thread.sleep(3000);
		WebElement tinymc_id = driver.findElement(By.id(TINYMC_ID));
		tinymc_id.sendKeys(PropertyManager.getProp("Tinymc_Text2"));
		tinymc_id.click();
		WebElement tinymc_ok_button = driver.findElement(By.id(TINYMX_OK_BUTTON));
		tinymc_ok_button.click();
			
					
		// Select User Data field
		WebElement userdata_checkbox = driver.findElement(By.id(USERDATA_CHECKBOX));
		WebElement userdata_textfield = driver.findElement(By.id(TEXT_FILED));
		scrollTo(driver, expandbar);
		Thread.sleep(5000);
		userdata_checkbox.click();
		userdata_textfield.clear();
		userdata_textfield.sendKeys(PropertyManager.getProp("Titletext"));
	}
	
	


	public void createLeadfomCCP() throws InterruptedException
	{
		// Banner Campaign Name
		WebElement campaignName = driver.findElement(By.id(CAMPAIGN_NAME));
		// Creating object of UtilFile.java class 
		SharedDriver sd = new SharedDriver();
		campaignName.clear();
		campaignName.sendKeys(generateCampName() );
					
		// Banner Campaign Description
		WebElement campaignDescription = driver.findElement(By.id(CAMPAIGN_DESC));
		campaignDescription.clear();
		campaignDescription.sendKeys(PropertyManager.getProp("CampaignDescription"));
					
		//Creative Name
		WebElement creativeName = driver.findElement(By.id(CREATIVE_NAME));
		creativeName.clear();
		creativeName.sendKeys(PropertyManager.getProp("CreativeName"));
					
		// Creative Description
		WebElement campaign_desc = driver.findElement(By.id(CREATIVE_DESCRIPTION));
		campaign_desc.clear();
		campaign_desc.sendKeys(PropertyManager.getProp("CreativeDescription"));
					
		// Expand Step 2C: Customize Signup Screen
		WebElement expandbar = driver.findElement(By.id(EXPANDBAR));
		expandbar.click();
				
		
		// Title Text
		WebElement title_text = driver.findElement(By.id(TITLE_TEXT));
		title_text.click();		
		Thread.sleep(3000);
		WebElement tinymc_id = driver.findElement(By.id(TINYMC_ID));
		tinymc_id.sendKeys(PropertyManager.getProp("Tinymc_Text"));
		tinymc_id.click();
		WebElement tinymc_ok_button = driver.findElement(By.id(TINYMX_OK_BUTTON));
		tinymc_ok_button.click();
			
					
		// Select User Data field
		WebElement userdata_checkbox = driver.findElement(By.id(USERDATA_CHECKBOX));
		WebElement userdata_textfield = driver.findElement(By.id(TEXT_FILED));
		scrollTo(driver, expandbar);
		Thread.sleep(5000);
		userdata_checkbox.click();
		userdata_textfield.clear();
		userdata_textfield.sendKeys(PropertyManager.getProp("Titletext"));
										
	}
	private StringBuilder generateCampName(){
		DateFormat df = new SimpleDateFormat("dd-MM-yy HH_mm_ss");
		Date dateobj = new Date();
		StringBuilder cname = new StringBuilder("Campaign_");
	    cname.append(df.format(dateobj));	
		return cname; 
	}
	public void Eloqua() throws InterruptedException
	{
		WebElement select_options = driver.findElement(By.id(SELECT_OPTION));
		Select select_options_dropdown = new Select(select_options);
		select_options_dropdown.selectByValue("eloqua_leadconnect");
		
/*		WebElement eloqua_company = driver.findElement(By.id(ELOQUA_COMPANY));
		eloqua_company.clear();
		eloqua_company.sendKeys(PropertyManager.getProp("Eloquacompany"));
		
		WebElement eloqua_username = driver.findElement(By.id(ELOQUA_USERNAME));
		eloqua_username.clear();
		eloqua_username.sendKeys(PropertyManager.getProp("Eloquausername"));
		
		WebElement eloqua_password = driver.findElement(By.id(ELOQUA_PASSWORD));
		eloqua_password.clear();
		eloqua_password.sendKeys(PropertyManager.getProp("Eloquapassword"));*/
		
		Thread.sleep(10000);
		WebElement eloqua_validate = driver.findElement(By.id(VALIDATE_BUTTON));
		eloqua_validate.click();

		
		
		WebElement select_dropdown = driver.findElement(By.id(ELOQUA_FIELD_DROPDOWN));
		Select dropdown = new Select(select_dropdown);
		dropdown.selectByValue("100002");
		
		WebElement select_dropdown1 = driver.findElement(By.id(ELOQUA_FIELD_DROPDOWN1));
		Select dropdown1 = new Select(select_dropdown1);
		dropdown1.selectByValue("100003");
		
		WebElement select_dropdown2 = driver.findElement(By.id(ELOQUA_FIELD_DROPDOWN2));
		Select dropdown2 = new Select(select_dropdown2);
		dropdown2.selectByValue("100001");
		
		WebElement select_dropdown3 = driver.findElement(By.id(ELOQUA_FIELD_DROPDOWN3));
		Select dropdown3 = new Select(select_dropdown3);
		dropdown3.selectByValue("100016");
		
		
		WebElement storeleads = driver.findElement(By.xpath(STORELEADS));
		storeleads.click();
			
		// To scroll top of the page
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250);");
		
		// Eloqua Ad Activity
	/*	WebElement lead_collapse1 = driver.findElement(By.id(COLLAPSE_IMAGE1));
		lead_collapse1.click();
		WebElement eloqua_edit_settigns = driver.findElement(By.id(ELOQUA_EDIT_SETTIGNS));
		eloqua_edit_settigns.click();	
		
		// Handle seperate window opening and operation on that window (textbox and button click)
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		driver.findElement(By.xpath("//*[@id='ui-dialog-title-store_eloqua_profiler_dialog']")).click(); // click some link that opens a new window

		for (String winHandle : driver.getWindowHandles()) 
		{
				    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		
		WebElement adactivity_eloqua_company = driver.findElement(By.id(ADACTIVITY_ELOQUA_COMPANY));
		WebElement adactivity_eloqua_username = driver.findElement(By.id(ADACTIVITY_ELOQUA_USERNAME));
		WebElement adactivity_eloqua_password = driver.findElement(By.id(ADACTIVITY_ELOQUA_PASSWORD));
		WebElement adactivity_validate_button = driver.findElement(By.id(ADACTIVITY_VALIDATE_BUTTON));
		WebElement adactivity_ok_button = driver.findElement(By.id(ADACTIVITY_VALIDATE_BUTTON));
		
		adactivity_eloqua_company.clear();
		adactivity_eloqua_company.sendKeys(PropertyManager.getProp("AdActivity_Eloquacompany"));
		adactivity_eloqua_username.clear();
		adactivity_eloqua_username.sendKeys(PropertyManager.getProp("AdActivity_Eloquausername"));
		adactivity_eloqua_password.clear();
		adactivity_eloqua_password.sendKeys(PropertyManager.getProp("AdActivity_Eloquapassword"));
		Thread.sleep(10000);
		adactivity_validate_button.click();
		
		// Activity Details data
		WebElement activity_details_field1_ckeckbox = driver.findElement(By.id(ACTIVITY_DETAILS_CHECKBOX1));
		WebElement activity_details_field1_dropdown = driver.findElement(By.id(ACTIVITY_DETAILS_DROPDOWN1));
		WebElement activity_details_field1_textbox = driver.findElement(By.id(ACTIVITY_DETAILS_TEXTBOX1));
		Thread.sleep(10000);
		activity_details_field1_ckeckbox.click();
		Thread.sleep(5000);
		Select activity_dropdown = new Select(activity_details_field1_dropdown);
		activity_dropdown.selectByVisibleText("City");
		Thread.sleep(5000);
		activity_details_field1_textbox.sendKeys(PropertyManager.getProp("ActivityData_text1"));
		Thread.sleep(5000);
		// Ad placement Details
		WebElement ad_placement_details_tab = driver.findElement(By.id(AD_PLACEMENT_DETAILS_TAB));
		ad_placement_details_tab.click();
		
		WebElement ad_placement_field1_ckeckbox = driver.findElement(By.id(AD_PLACEMENT_DETAILS_CHECKBOX));
		WebElement ad_placement_field1_dropdown = driver.findElement(By.id(AD_PLACEMENT_DETAILS_DROPDOWN));
		ad_placement_field1_ckeckbox.click();
		Thread.sleep(5000);
		Select ad_placement_dropdown = new Select(ad_placement_field1_dropdown);
		ad_placement_dropdown.selectByVisibleText("Title");
		Thread.sleep(5000);
		// Additional Details
		WebElement additional_details_tab = driver.findElement(By.id(ADDITIONAL_DETAILS_TAB));
		additional_details_tab.click();
		Thread.sleep(15000);
		
			WebElement additional_details_field1_ckeckbox = driver.findElement(By.id(ADDITIONAL_DETAILS_CHECKBOX1));
		WebElement additional_details_field1_dropdown = driver.findElement(By.id(ADDITIONAL_DETAILS_DROPDOWN1));
		WebElement additional_details_field1_textbox = driver.findElement(By.id(ADDITIONAL_DETAILS_TEXTBOX1));
		additional_details_field1_ckeckbox.click();
		Thread.sleep(15000);
	    Select addditional_details_dropdown = new Select(additional_details_field1_dropdown);
		addditional_details_dropdown.selectByVisibleText("Fax");
		
		
		WebElement ok_Button = driver.findElement(By.xpath("//div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix']/button[@type='button']"));
		Thread.sleep(10000);
		ok_Button.click();*/
	}
	
	public void marketo()
	{
		WebElement select_options = driver.findElement(By.id(SELECT_OPTION));
		WebElement marketo_uid = driver.findElement(By.id(MARKETO_USER_UID));
		WebElement encryption_key = driver.findElement(By.id(MARKETO_ENCRYPTION_KEY));
		WebElement soap_endpoint = driver.findElement(By.id(MARKETO_SOAP_ENDPOINT));
		WebElement marketo_validate = driver.findElement(By.id(VALIDATE_BUTTON));		
		
		
		Select select_options_dropdown = new Select(select_options);
		select_options_dropdown.selectByValue("marketo_leadconnect");
		
		marketo_uid.clear();
		marketo_uid.sendKeys(PropertyManager.getProp("Marketo_uid"));
		encryption_key.clear();
		encryption_key.sendKeys(PropertyManager.getProp("Marketoencryption_key"));
		soap_endpoint.clear();
		soap_endpoint.sendKeys(PropertyManager.getProp("Marketosoap_endpoint"));
		marketo_validate.click();
		
		WebElement select_dropdown = driver.findElement(By.id(MARKETO_FIELD_DROPDOWN));
		Select dropdown = new Select(select_dropdown);
		dropdown.selectByValue("FirstName");
		
		WebElement select_dropdown1 = driver.findElement(By.id(MARKETO_FIELD_DROPDOWN1));
		Select dropdown1 = new Select(select_dropdown1);
		dropdown1.selectByValue("LastName");
		
		WebElement select_dropdown2 = driver.findElement(By.id(MARKETO_FIELD_DROPDOWN2));
		Select dropdown2 = new Select(select_dropdown2);
		dropdown2.selectByValue("Email");
		
		WebElement select_dropdown3 = driver.findElement(By.id(MARKETO_FIELD_DROPDOWN3));
		Select dropdown3 = new Select(select_dropdown3);
		dropdown3.selectByValue("Title");
		
	}
	public void receive_Email()
	{
		WebElement select_options = driver.findElement(By.id(SELECT_OPTION));
		
		Select select_options_dropdown = new Select(select_options);
		select_options_dropdown.selectByValue("receive_email");
		
		WebElement email_address = driver.findElement(By.id(EMAIL_ADDRESS));
		email_address.clear();
		email_address.sendKeys(PropertyManager.getProp("Receive_Email_Address"));
		
		WebElement email_subject = driver.findElement(By.id(EMAIL_SUBJECT));
		email_subject.clear();
		email_subject.sendKeys(PropertyManager.getProp("Receive_Email_Subject"));
		
	}
	public void post_To_Landing_Page()
	{
		WebElement select_options = driver.findElement(By.id(SELECT_OPTION));
		
		Select select_options_dropdown = new Select(select_options);
		select_options_dropdown.selectByValue("post_to_landing_page");
	}
	public void silverpop()
	{
		WebElement select_options = driver.findElement(By.id(SELECT_OPTION));
		WebElement silverpop_validate = driver.findElement(By.id(VALIDATE_BUTTON));
		
		Select select_options_dropdown = new Select(select_options);
		select_options_dropdown.selectByValue("silverpop_leadconnect");
		
		WebElement refresh_token = driver.findElement(By.id(SILVERPOP_REFRESH_TOKEN)); 
		refresh_token.clear();
		refresh_token.sendKeys(PropertyManager.getProp("Silverpop_Refresh_Token"));
		silverpop_validate.click();
		
		WebElement select_db_dropdown = driver.findElement(By.id(SILVERPOP_DB_DROPDOWN));
		Select db_dropdown = new Select(select_db_dropdown);
		db_dropdown.selectByValue("20102");
		
		WebElement select_dropdown = driver.findElement(By.id(SILVERPOP_DROPDOWN));
		Select dropdown = new Select(select_dropdown);
		dropdown.selectByValue("First Name");
		
		WebElement select_dropdown1 = driver.findElement(By.id(SILVERPOP_DROPDOWN1));
		Select dropdown1 = new Select(select_dropdown1);
		dropdown1.selectByValue("Last Name");
		
		WebElement select_dropdown2 = driver.findElement(By.id(SILVERPOP_DROPDOWN2));
		Select dropdown2 = new Select(select_dropdown2);
		dropdown2.selectByValue("EMAIL");
		
		WebElement select_dropdown3 = driver.findElement(By.id(SILVERPOP_DROPDOWN3));
		Select dropdown3 = new Select(select_dropdown3);
		dropdown3.selectByValue("Title");
		
	}
	public void salesforce()
	{
		WebElement select_options = driver.findElement(By.id(SELECT_OPTION));
		WebElement salesforce_validate = driver.findElement(By.id(VALIDATE_BUTTON));
		
		Select select_options_dropdown = new Select(select_options);
		select_options_dropdown.selectByValue("salesforce_leadconnect");
		
		WebElement salesforce_login = driver.findElement(By.id(SALESFORCE_LOGIN));
		salesforce_login.click();
		
		// Handle seperate window opening and operation on that window (textbox and button click)
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		driver.findElement(By.xpath("//*[@id='salesForceLogin']")).click(); // click some link that opens a new window

		for (String winHandle : driver.getWindowHandles()) 
		{
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		
		WebElement salesforce_username = driver.findElement(By.id(SALESFORCE_USERNAME));
		salesforce_username.clear();
		salesforce_username.sendKeys(PropertyManager.getProp("Salesforce_Username"));
		
		WebElement salesforce_password = driver.findElement(By.id(SALESFORCE_PASSWORD));
		salesforce_password.clear();
		salesforce_password.sendKeys(PropertyManager.getProp("Salesforce_Password"));
		
		WebElement salesforce_login_popup = driver.findElement(By.id(SALESFORCE_LOGIN_BUTTON));
		salesforce_login_popup.click();
		
	}
	
	public void signUp() throws InterruptedException{
		for (String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement(By.id("wiget_iframe_id"))); // replace by your frame name
	    String childtFrame = driver.getWindowHandle();
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 200);
		WebElement firstname = driver.findElement(By.xpath(FIRSTNAME));
		firstname.sendKeys(PropertyManager.getProp("FirstName"));
		WebElement lastname = driver.findElement(By.xpath(LASTNAME));
		lastname.sendKeys(PropertyManager.getProp("LastName"));
		WebElement email = driver.findElement(By.xpath(EMAIL));
		email.clear();
		email.sendKeys(PropertyManager.getProp("EmailAdd"));
		WebElement newfield = driver.findElement(By.xpath(NEW));
		newfield.sendKeys(PropertyManager.getProp("NewField"));
		Thread.sleep(10000);
		WebElement signup = driver.findElement(By.xpath(SIGNUP));
		signup.click();
	/*	signup.click();
		Thread.sleep(30000);
		WebElement learnmore = driver.findElement(By.id("optin-sponsor-button-img"));
		learnmore.click();
		Thread.sleep(10000);
		driver.close();*/
  }

}
