package appMan_Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Configration_Files.Common;
import Event_commands.events;
public class Request_Server_Settings_page {
	Common c = new Common();	 
	final WebDriver driver;
	public  Request_Server_Settings_page(WebDriver driver)
	{   
		this.driver = driver;
	}
	
	 public void Goto_Request_Server_Settings_Page() throws IOException, InterruptedException {	
		Home_index_Page HI_page = new Home_index_Page(driver);
		/*HI_page.Select_Technical_Configration_Tab();
		System.out.println("Technical Configration tab is clicked");
		Thread.sleep(1500);*/
		Technical_Configration_page TC_page = new Technical_Configration_page(driver);
		TC_page.Req_Server_Settings_Tab();
		Thread.sleep(1500);
		HI_page.Render_Notifications();
		System.out.println("Request Server Settings tab is clicked");
		Reporter.log("Request Server Settings tab is clicked");
	    }
	 
	 public void Clickon_Change_icon() throws IOException, InterruptedException {	
			events eve=new events(driver);
			eve.Click_event("Change_Existing_User");
			System.out.println("Change button is Clicked");
			Reporter.log("Change button is Clicked");
	    }
	 public void Select_Email_Settings(String text) throws IOException {	
		events eve=new events(driver);
		eve.DropDown_list_event("RSS_Email_Settings", text);
		System.out.println("Item Selected from DDlist");
	    }
	
	 public void Enter_Request_Processing_Interval(String text) throws IOException {	
		events eve=new events(driver);
		eve.SendKey_event("RSS_Req_Proc_interval", text);	
		System.out.println("Request Processing Interval is Entered");
		Reporter.log(text+ " : is Entered in the Request Processing Interval Input field ");
	    }
	
	 public void Enter_Email_Address(String text) throws IOException {	
		events eve=new events(driver);
		eve.SendKey_event("RSS_Email_Adderss",text);
		System.out.println("Email Address is Entered");
		Reporter.log(text+ ": is Entered in the Email Address Input field.");
	   }
	
	 public void Enter_WebService_URL(String text) throws IOException {	
		events eve=new events(driver);
		eve.SendKey_event("RSS_WebServices_URL", text);
		System.out.println("Web Service URL is entered");
		Reporter.log(text+ ": is Entered in the Web Service URL Input field.");
       }
	
	 public void Enter_SMTP_Server_Name(String text) throws IOException {	
		events eve=new events(driver);
		eve.SendKey_event("RSS_SMTP_Server_name", text);
		Reporter.log(text + ": is Entered in the SMTP Server name field.");
      }
	
	 public void Enter_IMAP_Server_Name(String text) throws IOException {	
		events eve=new events(driver);
		eve.SendKey_event("RSS_IMAP_Server_name", text);
		Reporter.log(text + ": is Entered in the IMAP Server Name field.");
     }
	
	 public void Enter_Mail_Server_UserName(String text) throws IOException {	
		events eve=new events(driver);
		eve.SendKey_event("RSS_MailServer_username", text);
		Reporter.log(text +": is Entered in the Mail Server User Name Input Field");
    }
	
	 public void Enter_Mail_Server_Password(String text) throws IOException {	
		events eve=new events(driver);
		eve.SendKey_event("RSS_MailServer_PWD",text);
		Reporter.log(text +": is Entered in the Mail Server Password Input Field");
    }
	public void Enter_MailServer_Confirm_Password(String text) throws IOException {	
		events eve=new events(driver);
		eve.SendKey_event("RSS_PWD_Check", text);
		Reporter.log(text +": is Entered in the Password (Check) Input Field");
    }
	public void Enter_SMTP_Port(String text) throws IOException {	
		events eve=new events(driver);
		eve.SendKey_event("RSS_SMTP_port", text);
		Reporter.log(text +" : is Entered in the SMTP Port input field.");
    }
	public void Enter_IMAP_Port(String text) throws IOException {	
		events eve=new events(driver);
		eve.SendKey_event("RSS_IMAP_port", text);
		Reporter.log(text + ": is Entered in the IMAP Port Input field.");
    }
	
	public void Clickon_TestMailSettins_button() throws IOException, InterruptedException {	
		events eve=new events(driver);
		eve.Click_event("RSS_TestMailSettins_button");
		System.out.println("Test MailSettings button is clicked");
		Reporter.log("Test MailSettings button is clicked");
    }
	public void Check_SSL_Checkbox(String text) throws IOException {	
		events eve=new events(driver);
		eve.Check_box_JS("UseSsl", text);
	//	eve.Checkbox("RSS_SSl_checkbox",text);
    }
	 public void Save_Req_Server_Settings_Changes() throws IOException, InterruptedException {	
			events eve=new events(driver);
			eve.Click_event("Save_Panal_Changes");
			System.out.println("Save button is Clicked");
			Reporter.log("Save button is Clicked");
	       }
	 public void Notification() throws IOException, InterruptedException {
		 events eve = new events(driver);
			if(driver.findElement(By.xpath(c.getElementName("Save_changes_notification_Message"))).isDisplayed()){
				Reporter.log("Notifications: ------------------------------------");
				eve.GetText_event("Save_changes_notification_Message");
				eve.Click_event("Save_changes_notification_OK_button");
				Reporter.log("---------------------------------------------------");
			}else{
				System.out.println("No notification Found");
			}
	 }
	 public void Refresh_Licence_Changes() throws IOException, InterruptedException {	
		events eve=new events(driver);
		eve.Click_event("refresh");
      }
}
