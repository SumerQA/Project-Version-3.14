package appMan_Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Configration_Files.Common;
import Event_commands.events;
public class Email_Servers_page {
	
	Common c = new Common();	 
	final WebDriver driver;
	public  Email_Servers_page(WebDriver driver)
	{   
		this.driver = driver;
	}
	
	 public void Goto_Email_Server_Page() throws IOException, InterruptedException {	
			Home_index_Page HI_page = new Home_index_Page(driver);
			/*HI_page.Select_Technical_Configration_Tab();
			Thread.sleep(2000);
			System.out.println("Technical Configration tab is clicked");*/
			Technical_Configration_page TC_page = new Technical_Configration_page(driver);
			TC_page.Email_Servers_Tab();
			Thread.sleep(1500);
			HI_page.Render_Notifications();
			System.out.println("Email Servers tab is clicked");
		    }
	 public void New_Email_Server_icon() throws IOException, InterruptedException {	
			events eve=new events(driver);
			eve.Click_event("Create_NewUser_panal");
			System.out.println("Create Icon is Clicked");
		    }
	 public void Change_icon() throws IOException, InterruptedException {	
			events eve=new events(driver);
			eve.Click_event("Change_Existing_User");
			System.out.println("Change button is Clicked");
		    }
	 public void Delete_icon() throws IOException, InterruptedException {	
			events eve=new events(driver);
			eve.Click_event("delete_user");
			System.out.println("Delete button is Clicked");
		    }
	 public void Server_Name(String text) throws IOException {	
			events eve=new events(driver);
			eve.SendKey_event("ES_S_name", text);
		    }
	 public void Description(String text) throws IOException {	
			events eve=new events(driver);
			eve.SendKey_event("ES_description", text);
			}
	 public void UserName(String text) throws IOException {	
		 events eve=new events(driver);
			eve.SendKey_event("ES_UName", text);
			}
	 public void Password(String text) throws IOException {	
			events eve=new events(driver);
			eve.SendKey_event("ES_PWD", text);
			System.out.println("Email Server Password is Entered");
			}
	 public void Check_Password(String text) throws IOException {	
		 events eve=new events(driver);
			eve.SendKey_event("ES_Check_PWD", text);
		    }
	 public void Email_Address(String text) throws IOException {	
			events eve=new events(driver);
			eve.SendKey_event("ES_Email_address", text);
		    }
	 public void Server_Name_SMTP( String text) throws IOException {	
			events eve=new events(driver);
			eve.SendKey_event("ES_SMTP_Server_Name",text);
		    }
	 public void port_SMTP(String text) throws IOException {	
			events eve=new events(driver);
			eve.SendKey_event("ES_SMPT_Port",text);
			System.out.println("SMPT Port is Entered");
		    }
	 public void Use_Encryption(String text) throws IOException {	
			events eve=new events(driver);
			eve.DropDown_list_event("ES_USe_Encrypt", text);
			System.out.println("Item is Selected from DDlist");
		    }
	 public void Listof_EmailServers(String text) throws IOException {	
		    events eve=new events(driver);
			eve.Table_event(text, "ES_Listof_Email_Server_table");
		    }
	 public void Test_Account_Settings_Button() throws IOException, InterruptedException {	
		    events eve=new events(driver);
			eve.Click_event("ES_Test_Acc_Settings");
		    }
	 public void Save_Email_Server_Changes() throws IOException, InterruptedException {	
			events eve=new events(driver);
			eve.Click_event("Save_Panal_Changes");
			System.out.println("Client Settings Changes Done successfully");
	       }
	public void Email_Server_Settings_Notification_Message() throws IOException, InterruptedException {	
			events eve=new events(driver);
			eve.GetText_event("Save_changes_notification_Message");
			eve.Click_event("Save_changes_notification_OK_button");
	       }
	 public void Refresh_EmailServer_Settings_Changes() throws IOException, InterruptedException {	
			events eve=new events(driver);
			eve.Click_event("refresh");
			System.out.println("Refreshed Client Settings Page");
	       }
	 public void Notification() throws IOException, InterruptedException {	
			events eve = new events(driver);
			if(driver.findElement(By.xpath(c.getElementName("Save_changes_notification_Message"))).isDisplayed()){
				Reporter.log("Notifications : ---------------------------------------");
				eve.GetText_event("Save_changes_notification_Message");
				eve.Click_event("Save_changes_notification_OK_button");
				Reporter.log("-------------------------------------------------------");
			}else{
				System.out.println("No notification Found");
			}
	       }
	 
	 
}
