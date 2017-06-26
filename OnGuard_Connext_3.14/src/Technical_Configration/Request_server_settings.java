package Technical_Configration;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Configration_Files.Common;
import Configration_Files.ReadXclData;
import Configration_Files.ScreenShotOnFailure;
import Configration_Files.WebDriverManager;
import Event_commands.events;
import appMan_Pages.Request_Server_Settings_page;
@Listeners(ScreenShotOnFailure.class)
public class Request_server_settings {
	Common c= new Common();
	ReadXclData RD= new ReadXclData();
	ReadXclData rddata=new ReadXclData();
	 ArrayList<String>arr= new ArrayList<>();
	 @BeforeClass
	 public void  testData() throws Exception{
		 String[][] t = rddata.readdata("TC_Req_Server_settings");
			for(String[] rt : t){
				 for(String val : rt){
				    arr.add(val);
				    }
				 }
	}
	 @Test(priority=1)
	  public void Goto_Request_server_settings_page() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("________________________ Request server settings Page_____________________________ ");
		  RSS_page.Goto_Request_Server_Settings_Page();
		  Thread.sleep(2000);
	  }
	  @Test(priority=2)
	  public void Clickon_Change_Icon() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Click on Change Icon -");
		  RSS_page.Clickon_Change_icon();
		  Thread.sleep(2000);
	  }
	  @Test(priority=3)
	  public void Select_Email_Settingsfrom_DDList() throws IOException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Select Email Settings from DDlist");
		  RSS_page.Select_Email_Settings(arr.get(0));
		  
	  }
	  @Test(priority=4)
	  public void Enter_request_Processing_Interval() throws IOException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Enter request processing interval");
		  RSS_page.Enter_Request_Processing_Interval(arr.get(1));
	  }
	  @Test(priority=5)
	  public void Enter_Email_Address() throws IOException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Enter Email Address - ");
		  RSS_page.Enter_Email_Address(arr.get(2));
	  }
	  @Test(priority=5)
	  public void Enter_WebService_URL() throws IOException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Enter Web service URL - ");
		  RSS_page.Enter_WebService_URL(arr.get(3));
	  }
	  @Test(priority=6)
	  public void Enter_SMTPServer_Name() throws IOException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Enter SMTP Server Name - ");
		  RSS_page.Enter_SMTP_Server_Name(arr.get(4));
	  }
	  @Test(priority=7)
	  public void Enter_IMAPServer_Name() throws IOException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Enter IMAP Server Name - ");
		  RSS_page.Enter_IMAP_Server_Name(arr.get(5));
	  }
	  @Test(priority=8)
	  public void Enter_MailServer_UserName() throws IOException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Enter Mail Server User Name - ");
		  RSS_page.Enter_Mail_Server_UserName(arr.get(6));
	  }
	  @Test(priority=9)
	  public void Enter_MailServer_Password() throws IOException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Enter Mail Server Password - ");
		  RSS_page.Enter_Mail_Server_Password(arr.get(7));
	  }
	  @Test(priority=10)
	  public void Confirm_Password() throws IOException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Enter Mail Server Password for confirmation - ");
		  RSS_page.Enter_MailServer_Confirm_Password(arr.get(8));
	  }
	  @Test(priority=11)
	  public void Enter_SMTP_port() throws IOException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Enter SMTP Port - ");
		  RSS_page.Enter_SMTP_Port(arr.get(9));
	  }
	  @Test(priority=12)
	  public void Enter_IMAP_port() throws IOException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Enter IMAP Port - ");
		  RSS_page.Enter_IMAP_Port(arr.get(10));
	  }
	  @Test(priority=13)
	  public void Check_SSL_Checkbox() throws IOException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Check SSl Checkbox -");
		  RSS_page.Check_SSL_Checkbox(arr.get(11));
	  }
	  @Test(priority=14)
	  public void Clickon_TestMailSettings_button() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Click on Test mailSettings Button -  ");
		  RSS_page.Clickon_TestMailSettins_button();
		  Thread.sleep(8000);
		  RSS_page.Notification();
	  }
	  @Test(priority=15)
	  public void Save_Changes() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Save All Changes -  ");
		  RSS_page.Save_Req_Server_Settings_Changes();
		  Thread.sleep(2000);
		  RSS_page.Notification();
		  Thread.sleep(500);
		  RSS_page.Notification();
		  Reporter.log("______________________ End of Request Server Settings Section___________________________");
	  }
	  @Test(priority=16)
	  public void Validate_Email_Settings_DDList() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  Reporter.log("Click on Change Icon -");
		  RSS_page.Clickon_Change_icon();
		  Thread.sleep(1500);
		  //RSS_page.Select_Email_Settings(arr.get(0));
		  Reporter.log("Enter request processing interval");
		  RSS_page.Enter_Request_Processing_Interval(arr.get(1));
		  Reporter.log("Enter Email Address - ");
		  RSS_page.Enter_Email_Address(arr.get(2));
		  Reporter.log("Enter Web service URL - ");
		  RSS_page.Enter_WebService_URL(arr.get(3));
		  Reporter.log("Enter SMTP Server Name - ");
		  RSS_page.Enter_SMTP_Server_Name(arr.get(4));
		  Reporter.log("Enter IMAP Server Name - ");
		  RSS_page.Enter_IMAP_Server_Name(arr.get(5));
		  Reporter.log("Enter Mail Server User Name - ");
		  RSS_page.Enter_Mail_Server_UserName(arr.get(6));
		  Reporter.log("Enter Mail Server Password - ");
		  RSS_page.Enter_Mail_Server_Password(arr.get(7));
		  Reporter.log("Enter Mail Server Password for confirmation - ");
		  RSS_page.Enter_MailServer_Confirm_Password(arr.get(8));
		  Reporter.log("Enter SMTP Port - ");
		  RSS_page.Enter_SMTP_Port(arr.get(9));
		  Reporter.log("Enter IMAP Port - ");
		  RSS_page.Enter_IMAP_Port(arr.get(10));
		  Reporter.log("Check SSl Checkbox -");
		  RSS_page.Check_SSL_Checkbox(arr.get(11));
		  Reporter.log("Save All Changes -  ");
		  RSS_page.Save_Req_Server_Settings_Changes();
		  Thread.sleep(2000);
		  RSS_page.Notification();
		  Thread.sleep(500);
		  RSS_page.Notification();
		  
	  }
	  @Test(priority=17)
	  public void Validate_Request_Processing_Interval_inputfield() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  events eve = new events(driver);
		  Reporter.log("Click on Change Icon -");
		  RSS_page.Clickon_Change_icon();
		  Thread.sleep(500);
		  Reporter.log("Select Email Settings from DDlist");
		  RSS_page.Select_Email_Settings(arr.get(0));
		  eve.Clear_InputField("RSS_Req_Proc_interval");   // Clear Request processing interval (seconds) Input field
		 // Reporter.log("Enter request processing interval");
		  //RSS_page.Enter_Request_Processing_Interval(arr.get(1));
		  Reporter.log("Enter Email Address - ");
		  RSS_page.Enter_Email_Address(arr.get(2));
		  Reporter.log("Enter Web service URL - ");
		  RSS_page.Enter_WebService_URL(arr.get(3));
		  Reporter.log("Enter SMTP Server Name - ");
		  RSS_page.Enter_SMTP_Server_Name(arr.get(4));
		  Reporter.log("Enter IMAP Server Name - ");
		  RSS_page.Enter_IMAP_Server_Name(arr.get(5));
		  Reporter.log("Enter Mail Server User Name - ");
		  RSS_page.Enter_Mail_Server_UserName(arr.get(6));
		  Reporter.log("Enter Mail Server Password - ");
		  RSS_page.Enter_Mail_Server_Password(arr.get(7));
		  Reporter.log("Enter Mail Server Password for confirmation - ");
		  RSS_page.Enter_MailServer_Confirm_Password(arr.get(8));
		  Reporter.log("Enter SMTP Port - ");
		  RSS_page.Enter_SMTP_Port(arr.get(9));
		  Reporter.log("Enter IMAP Port - ");
		  RSS_page.Enter_IMAP_Port(arr.get(10));
		  Reporter.log("Check SSl Checkbox -");
		  RSS_page.Check_SSL_Checkbox(arr.get(11));
		  Reporter.log("Save All Changes -  ");
		  RSS_page.Save_Req_Server_Settings_Changes();
		  Thread.sleep(2000);
		  RSS_page.Notification();
		  Thread.sleep(500);
		  RSS_page.Notification();
		  
	  }
	  @Test(priority=18)
	  public void Validate_Email_Address_inputfield() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  events eve = new events(driver);
		  Reporter.log("Click on Change Icon -");
		  RSS_page.Clickon_Change_icon();
		  Thread.sleep(500);
		  Reporter.log("Select Email Settings from DDlist");
		  RSS_page.Select_Email_Settings(arr.get(0));
		  Reporter.log("Enter request processing interval");
		  RSS_page.Enter_Request_Processing_Interval(arr.get(1));
		  //Reporter.log("Enter Email Address - ");
		 // RSS_page.Enter_Email_Address(arr.get(2));
		  eve.Clear_InputField("RSS_Email_Adderss");   // Clear Email Address Input field
		  Reporter.log("Enter Web service URL - ");
		  RSS_page.Enter_WebService_URL(arr.get(3));
		  Reporter.log("Enter SMTP Server Name - ");
		  RSS_page.Enter_SMTP_Server_Name(arr.get(4));
		  Reporter.log("Enter IMAP Server Name - ");
		  RSS_page.Enter_IMAP_Server_Name(arr.get(5));
		  Reporter.log("Enter Mail Server User Name - ");
		  RSS_page.Enter_Mail_Server_UserName(arr.get(6));
		  Reporter.log("Enter Mail Server Password - ");
		  RSS_page.Enter_Mail_Server_Password(arr.get(7));
		  Reporter.log("Enter Mail Server Password for confirmation - ");
		  RSS_page.Enter_MailServer_Confirm_Password(arr.get(8));
		  Reporter.log("Enter SMTP Port - ");
		  RSS_page.Enter_SMTP_Port(arr.get(9));
		  Reporter.log("Enter IMAP Port - ");
		  RSS_page.Enter_IMAP_Port(arr.get(10));
		  Reporter.log("Check SSl Checkbox -");
		  RSS_page.Check_SSL_Checkbox(arr.get(11));
		  Reporter.log("Save All Changes -  ");
		  RSS_page.Save_Req_Server_Settings_Changes();
		  Thread.sleep(1000);
		  RSS_page.Notification();
		  Thread.sleep(500);
		  RSS_page.Notification();
		  if(driver.findElement(By.xpath(c.getElementName("RSS_Email_Adderss"))).isEnabled()){
			  System.out.println("Changes Not Saved");
			  Reporter.log("Changes Not Saved");
		  }
		  
	  }
	  @Test(priority=19)
	  public void Validate_WebService_URL_inputfield() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  events eve = new events(driver);
		  Reporter.log("Select Email Settings from DDlist");
		  RSS_page.Select_Email_Settings(arr.get(0));
		  Reporter.log("Enter request processing interval");
		  RSS_page.Enter_Request_Processing_Interval(arr.get(1));
		  Reporter.log("Enter Email Address - ");
		  RSS_page.Enter_Email_Address(arr.get(2));
		  eve.Clear_InputField("RSS_WebServices_URL");   // Clear 'Webservice URL' Input field
		  //Reporter.log("Enter Web service URL - ");
		 // RSS_page.Enter_WebService_URL(arr.get(3));
		  Reporter.log("Enter SMTP Server Name - ");
		  RSS_page.Enter_SMTP_Server_Name(arr.get(4));
		  Reporter.log("Enter IMAP Server Name - ");
		  RSS_page.Enter_IMAP_Server_Name(arr.get(5));
		  Reporter.log("Enter Mail Server User Name - ");
		  RSS_page.Enter_Mail_Server_UserName(arr.get(6));
		  Reporter.log("Enter Mail Server Password - ");
		  RSS_page.Enter_Mail_Server_Password(arr.get(7));
		  Reporter.log("Enter Mail Server Password for confirmation - ");
		  RSS_page.Enter_MailServer_Confirm_Password(arr.get(8));
		  Reporter.log("Enter SMTP Port - ");
		  RSS_page.Enter_SMTP_Port(arr.get(9));
		  Reporter.log("Enter IMAP Port - ");
		  RSS_page.Enter_IMAP_Port(arr.get(10));
		  Reporter.log("Check SSl Checkbox -");
		  RSS_page.Check_SSL_Checkbox(arr.get(11));
		  Reporter.log("Save All Changes -  ");
		  RSS_page.Save_Req_Server_Settings_Changes();
		  Thread.sleep(1000);
		  RSS_page.Notification();
		  Thread.sleep(500);
		  RSS_page.Notification();
		  if(driver.findElement(By.xpath(c.getElementName("RSS_WebServices_URL"))).isEnabled()){
			  System.out.println("Changes Not Saved");
			  Reporter.log("Changes Not Saved");
			  //throw new InvalidInputException("Changes Not Saved");
		  }
		  
	  }
	  @Test(priority=20)
	  public void Validate_SMTP_Server_Name_inputfield() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  events eve = new events(driver);
		  if(driver.findElement(By.xpath(c.getElementName("RSS_SMTP_Server_name"))).isEnabled()){
			  System.out.println("Previous Changes Not Saved");
		  }else{
			  Reporter.log("Click on Change Icon -");
			  RSS_page.Clickon_Change_icon();
			  Thread.sleep(1500);
		  }
		  Reporter.log("Select Email Settings from DDlist");
		  RSS_page.Select_Email_Settings(arr.get(0));
		  Reporter.log("Enter request processing interval");
		  RSS_page.Enter_Request_Processing_Interval(arr.get(1));
		  Reporter.log("Enter Email Address - ");
		  RSS_page.Enter_Email_Address(arr.get(2));
		  Reporter.log("Enter Web service URL - ");
		  RSS_page.Enter_WebService_URL(arr.get(3));
		  eve.Clear_InputField("RSS_SMTP_Server_name");   // Clear 'SMTP Server Name' Input field
		  //Reporter.log("Enter SMTP Server Name - ");
		  //RSS_page.Enter_SMTP_Server_Name(arr.get(4));
		  Reporter.log("Enter IMAP Server Name - ");
		  RSS_page.Enter_IMAP_Server_Name(arr.get(5));
		  Reporter.log("Enter Mail Server User Name - ");
		  RSS_page.Enter_Mail_Server_UserName(arr.get(6));
		  Reporter.log("Enter Mail Server Password - ");
		  RSS_page.Enter_Mail_Server_Password(arr.get(7));
		  Reporter.log("Enter Mail Server Password for confirmation - ");
		  RSS_page.Enter_MailServer_Confirm_Password(arr.get(8));
		  Reporter.log("Enter SMTP Port - ");
		  RSS_page.Enter_SMTP_Port(arr.get(9));
		  Reporter.log("Enter IMAP Port - ");
		  RSS_page.Enter_IMAP_Port(arr.get(10));
		  Reporter.log("Check SSl Checkbox -");
		  RSS_page.Check_SSL_Checkbox(arr.get(11));
		  Reporter.log("Save All Changes -  ");
		  RSS_page.Save_Req_Server_Settings_Changes();
		  Thread.sleep(1000);
		  RSS_page.Notification();
		  Thread.sleep(500);
		  RSS_page.Notification();
	  }
	  @Test(priority=21)
	  public void Validate_IMAP_Server_Name_inputfield() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  events eve = new events(driver);
		  if(driver.findElement(By.xpath(c.getElementName("RSS_SMTP_Server_name"))).isEnabled()){
			  System.out.println("Previous Changes Not Saved");
		  }else{
			  Reporter.log("Click on Change Icon -");
			  RSS_page.Clickon_Change_icon();
			  Thread.sleep(1500);
		  }
		  Reporter.log("Select Email Settings from DDlist");
		  RSS_page.Select_Email_Settings(arr.get(0));
		  Reporter.log("Enter request processing interval");
		  RSS_page.Enter_Request_Processing_Interval(arr.get(1));
		  Reporter.log("Enter Email Address - ");
		  RSS_page.Enter_Email_Address(arr.get(2));
		  Reporter.log("Enter Web service URL - ");
		  RSS_page.Enter_WebService_URL(arr.get(3));
		  Reporter.log("Enter SMTP Server Name - ");
		  RSS_page.Enter_SMTP_Server_Name(arr.get(4));
		 // Reporter.log("Enter IMAP Server Name - ");
		  //RSS_page.Enter_IMAP_Server_Name(arr.get(5));
		  eve.Clear_InputField("RSS_SMTP_Server_name");   // Clear 'IMAP Server Name' Input field
		  Reporter.log("Enter Mail Server User Name - ");
		  RSS_page.Enter_Mail_Server_UserName(arr.get(6));
		  Reporter.log("Enter Mail Server Password - ");
		  RSS_page.Enter_Mail_Server_Password(arr.get(7));
		  Reporter.log("Enter Mail Server Password for confirmation - ");
		  RSS_page.Enter_MailServer_Confirm_Password(arr.get(8));
		  Reporter.log("Enter SMTP Port - ");
		  RSS_page.Enter_SMTP_Port(arr.get(9));
		  Reporter.log("Enter IMAP Port - ");
		  RSS_page.Enter_IMAP_Port(arr.get(10));
		  Reporter.log("Check SSl Checkbox -");
		  RSS_page.Check_SSL_Checkbox(arr.get(11));
		  Reporter.log("Save All Changes -  ");
		  RSS_page.Save_Req_Server_Settings_Changes();
		  Thread.sleep(1000);
		  RSS_page.Notification();
		  Thread.sleep(500);
		  RSS_page.Notification();
	  }
	  @Test(priority=22)
	  public void Validate_Mail_Server_Username_inputfield() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  events eve = new events(driver);
		  if(driver.findElement(By.xpath(c.getElementName("RSS_MailServer_username"))).isEnabled()){
			  System.out.println("Previous Changes Not Saved");
		  }else{
			  Reporter.log("Click on Change Icon -");
			  RSS_page.Clickon_Change_icon();
			  Thread.sleep(1500);
		  }
		  Reporter.log("Select Email Settings from DDlist");
		  RSS_page.Select_Email_Settings(arr.get(0));
		  Reporter.log("Enter request processing interval");
		  RSS_page.Enter_Request_Processing_Interval(arr.get(1));
		  Reporter.log("Enter Email Address - ");
		  RSS_page.Enter_Email_Address(arr.get(2));
		  Reporter.log("Enter Web service URL - ");
		  RSS_page.Enter_WebService_URL(arr.get(3));
		  Reporter.log("Enter SMTP Server Name - ");
		  RSS_page.Enter_SMTP_Server_Name(arr.get(4));
		  Reporter.log("Enter IMAP Server Name - ");
		  RSS_page.Enter_IMAP_Server_Name(arr.get(5));
		 // Reporter.log("Enter Mail Server User Name - ");
		 // RSS_page.Enter_Mail_Server_UserName(arr.get(6));
		  eve.Clear_InputField("RSS_MailServer_username");   // Clear 'Mail Server Username ' Input field
		  Reporter.log("Enter Mail Server Password - ");
		  RSS_page.Enter_Mail_Server_Password(arr.get(7));
		  Reporter.log("Enter Mail Server Password for confirmation - ");
		  RSS_page.Enter_MailServer_Confirm_Password(arr.get(8));
		  Reporter.log("Enter SMTP Port - ");
		  RSS_page.Enter_SMTP_Port(arr.get(9));
		  Reporter.log("Enter IMAP Port - ");
		  RSS_page.Enter_IMAP_Port(arr.get(10));
		  Reporter.log("Check SSl Checkbox -");
		  RSS_page.Check_SSL_Checkbox(arr.get(11));
		  Reporter.log("Save All Changes -  ");
		  RSS_page.Save_Req_Server_Settings_Changes();
		  Thread.sleep(1000);
		  RSS_page.Notification();
		  Thread.sleep(500);
		  RSS_page.Notification();
	  }
	  @Test(priority=23)
	  public void Validate_Mail_Server_Password_inputfield() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  events eve = new events(driver);
		  if(driver.findElement(By.xpath(c.getElementName("RSS_MailServer_PWD"))).isEnabled()){
			  System.out.println("Previous Changes Not Saved");
		  }else{
			  Reporter.log("Click on Change Icon -");
			  RSS_page.Clickon_Change_icon();
			  Thread.sleep(1500);
		  }
		  Reporter.log("Select Email Settings from DDlist");
		  RSS_page.Select_Email_Settings(arr.get(0));
		  Reporter.log("Enter request processing interval");
		  RSS_page.Enter_Request_Processing_Interval(arr.get(1));
		  Reporter.log("Enter Email Address - ");
		  RSS_page.Enter_Email_Address(arr.get(2));
		  Reporter.log("Enter Web service URL - ");
		  RSS_page.Enter_WebService_URL(arr.get(3));
		  Reporter.log("Enter SMTP Server Name - ");
		  RSS_page.Enter_SMTP_Server_Name(arr.get(4));
		  Reporter.log("Enter IMAP Server Name - ");
		  RSS_page.Enter_IMAP_Server_Name(arr.get(5));
		  Reporter.log("Enter Mail Server User Name - ");
		  RSS_page.Enter_Mail_Server_UserName(arr.get(6));
		 // Reporter.log("Enter Mail Server Password - ");
		  //RSS_page.Enter_Mail_Server_Password(arr.get(7));
		  eve.Clear_InputField("RSS_MailServer_PWD");   // Clear 'Mail Server Password ' Input field
		  Reporter.log("Enter Mail Server Password for confirmation - ");
		  RSS_page.Enter_MailServer_Confirm_Password(arr.get(8));
		  Reporter.log("Enter SMTP Port - ");
		  RSS_page.Enter_SMTP_Port(arr.get(9));
		  Reporter.log("Enter IMAP Port - ");
		  RSS_page.Enter_IMAP_Port(arr.get(10));
		  Reporter.log("Check SSl Checkbox -");
		  RSS_page.Check_SSL_Checkbox(arr.get(11));
		  Reporter.log("Save All Changes -  ");
		  RSS_page.Save_Req_Server_Settings_Changes();
		  Thread.sleep(1000);
		  RSS_page.Notification();
		  Thread.sleep(500);
		  RSS_page.Notification();
	  }
	  @Test(priority=24)
	  public void Validate_Mail_Server_Confirm_Password_inputfield() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  events eve = new events(driver);
		  if(driver.findElement(By.xpath(c.getElementName("RSS_PWD_Check"))).isEnabled()){
			  System.out.println("Previous Changes Not Saved");
		  }else{
			  Reporter.log("Click on Change Icon -");
			  RSS_page.Clickon_Change_icon();
			  Thread.sleep(1500);
		  }
		  Reporter.log("Select Email Settings from DDlist");
		  RSS_page.Select_Email_Settings(arr.get(0));
		  Reporter.log("Enter request processing interval");
		  RSS_page.Enter_Request_Processing_Interval(arr.get(1));
		  Reporter.log("Enter Email Address - ");
		  RSS_page.Enter_Email_Address(arr.get(2));
		  Reporter.log("Enter Web service URL - ");
		  RSS_page.Enter_WebService_URL(arr.get(3));
		  Reporter.log("Enter SMTP Server Name - ");
		  RSS_page.Enter_SMTP_Server_Name(arr.get(4));
		  Reporter.log("Enter IMAP Server Name - ");
		  RSS_page.Enter_IMAP_Server_Name(arr.get(5));
		  Reporter.log("Enter Mail Server User Name - ");
		  RSS_page.Enter_Mail_Server_UserName(arr.get(6));
		  Reporter.log("Enter Mail Server Password - ");
		  RSS_page.Enter_Mail_Server_Password(arr.get(7));
		  //Reporter.log("Enter Mail Server Password for confirmation - ");
		  //RSS_page.Enter_MailServer_Confirm_Password(arr.get(8));
		  eve.Clear_InputField("RSS_PWD_Check");   // Clear 'Mail Server Confirm password ' Input field
		  Reporter.log("Enter SMTP Port - ");
		  RSS_page.Enter_SMTP_Port(arr.get(9));
		  Reporter.log("Enter IMAP Port - ");
		  RSS_page.Enter_IMAP_Port(arr.get(10));
		  Reporter.log("Check SSl Checkbox -");
		  RSS_page.Check_SSL_Checkbox(arr.get(11));
		  Reporter.log("Save All Changes -  ");
		  RSS_page.Save_Req_Server_Settings_Changes();
		  Thread.sleep(1000);
		  RSS_page.Notification();
		  Thread.sleep(500);
		  RSS_page.Notification();
	  }
	  @Test(priority=25)
	  public void Validate_SMTP_port_inputfield() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  events eve = new events(driver);
		  if(driver.findElement(By.xpath(c.getElementName("RSS_SMTP_port"))).isEnabled()){
			  System.out.println("Previous Changes Not Saved");
		  }else{
			  Reporter.log("Click on Change Icon -");
			  RSS_page.Clickon_Change_icon();
			  Thread.sleep(1500);
		  }
		  Reporter.log("Select Email Settings from DDlist");
		  RSS_page.Select_Email_Settings(arr.get(0));
		  Reporter.log("Enter request processing interval");
		  RSS_page.Enter_Request_Processing_Interval(arr.get(1));
		  Reporter.log("Enter Email Address - ");
		  RSS_page.Enter_Email_Address(arr.get(2));
		  Reporter.log("Enter Web service URL - ");
		  RSS_page.Enter_WebService_URL(arr.get(3));
		  Reporter.log("Enter SMTP Server Name - ");
		  RSS_page.Enter_SMTP_Server_Name(arr.get(4));
		  Reporter.log("Enter IMAP Server Name - ");
		  RSS_page.Enter_IMAP_Server_Name(arr.get(5));
		  Reporter.log("Enter Mail Server User Name - ");
		  RSS_page.Enter_Mail_Server_UserName(arr.get(6));
		  Reporter.log("Enter Mail Server Password - ");
		  RSS_page.Enter_Mail_Server_Password(arr.get(7));
		  Reporter.log("Enter Mail Server Password for confirmation - ");
		  RSS_page.Enter_MailServer_Confirm_Password(arr.get(8));
		  //Reporter.log("Enter SMTP Port - ");
		 // RSS_page.Enter_SMTP_Port(arr.get(9));
		  eve.Clear_InputField("RSS_SMTP_port");   // Clear 'Mail Server Confirm password ' Input field
		  Reporter.log("Enter IMAP Port - ");
		  RSS_page.Enter_IMAP_Port(arr.get(10));
		  Reporter.log("Check SSl Checkbox -");
		  RSS_page.Check_SSL_Checkbox(arr.get(11));
		  Reporter.log("Save All Changes -  ");
		  RSS_page.Save_Req_Server_Settings_Changes();
		  Thread.sleep(1000);
		  RSS_page.Notification();
		  Thread.sleep(500);
		  RSS_page.Notification();
	  }
	  @Test(priority=26)
	  public void Validate_IMAP_port_inputfield() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  events eve = new events(driver);
		  if(driver.findElement(By.xpath(c.getElementName("RSS_IMAP_port"))).isEnabled()){
			  System.out.println("Previous Changes Not Saved");
		  }else{
			  Reporter.log("Click on Change Icon -");
			  RSS_page.Clickon_Change_icon();
			  Thread.sleep(1500);
		  }
		  Reporter.log("Select Email Settings from DDlist");
		  RSS_page.Select_Email_Settings(arr.get(0));
		  Reporter.log("Enter request processing interval");
		  RSS_page.Enter_Request_Processing_Interval(arr.get(1));
		  Reporter.log("Enter Email Address - ");
		  RSS_page.Enter_Email_Address(arr.get(2));
		  Reporter.log("Enter Web service URL - ");
		  RSS_page.Enter_WebService_URL(arr.get(3));
		  Reporter.log("Enter SMTP Server Name - ");
		  RSS_page.Enter_SMTP_Server_Name(arr.get(4));
		  Reporter.log("Enter IMAP Server Name - ");
		  RSS_page.Enter_IMAP_Server_Name(arr.get(5));
		  Reporter.log("Enter Mail Server User Name - ");
		  RSS_page.Enter_Mail_Server_UserName(arr.get(6));
		  Reporter.log("Enter Mail Server Password - ");
		  RSS_page.Enter_Mail_Server_Password(arr.get(7));
		  Reporter.log("Enter Mail Server Password for confirmation - ");
		  RSS_page.Enter_MailServer_Confirm_Password(arr.get(8));
		  Reporter.log("Enter SMTP Port - ");
		  RSS_page.Enter_SMTP_Port(arr.get(9));
		  //Reporter.log("Enter IMAP Port - ");
		  //RSS_page.Enter_IMAP_Port(arr.get(10));
		  eve.Clear_InputField("RSS_IMAP_port");   // Clear 'Mail Server Confirm password ' Input field
		  Reporter.log("Check SSl Checkbox -");
		  RSS_page.Check_SSL_Checkbox(arr.get(11));
		  Reporter.log("Save All Changes -  ");
		  RSS_page.Save_Req_Server_Settings_Changes();
		  Thread.sleep(1000);
		  RSS_page.Notification();
		  Thread.sleep(500);
		  RSS_page.Notification();
	  }
	  
	
	  public void SetUp_valid_Request_server_settings_Configration() throws IOException, InterruptedException {
		  WebDriver driver=WebDriverManager.getDriverInstance();
		  Request_Server_Settings_page RSS_page= PageFactory.initElements(driver, Request_Server_Settings_page.class);
		  RSS_page.Goto_Request_Server_Settings_Page();
		  Thread.sleep(5000);
		  Reporter.log("Click on Change Icon -");
		  RSS_page.Clickon_Change_icon();
		  Thread.sleep(1500);
		  RSS_page.Select_Email_Settings("Gmail_587");
		  Reporter.log("Enter request processing interval");
		  RSS_page.Enter_Request_Processing_Interval("60");
		  Reporter.log("Enter Email Address - ");
		  RSS_page.Enter_Email_Address("tickytesting@gmail.com");
		  Reporter.log("Enter Web service URL - ");
		  RSS_page.Enter_WebService_URL("/ReqSrv.asmx");
		  Reporter.log("Enter SMTP Server Name - ");
		  RSS_page.Enter_SMTP_Server_Name("smtp.gmail.com");
		  Reporter.log("Enter IMAP Server Name - ");
		  RSS_page.Enter_IMAP_Server_Name("imap.gmail.com");
		  Reporter.log("Enter Mail Server User Name - ");
		  RSS_page.Enter_Mail_Server_UserName("tickytesting@gmail.com");
		  Reporter.log("Enter Mail Server Password - ");
		  RSS_page.Enter_Mail_Server_Password("beschuit");
		  Reporter.log("Enter Mail Server Password for confirmation - ");
		  RSS_page.Enter_MailServer_Confirm_Password("beschuit");
		  Reporter.log("Enter SMTP Port - ");
		  RSS_page.Enter_SMTP_Port("587");
		  Reporter.log("Enter IMAP Port - ");
		  RSS_page.Enter_IMAP_Port("993");
		  Reporter.log("Check SSl Checkbox -");
		  RSS_page.Check_SSL_Checkbox("Yes");
		  Thread.sleep(500);
		  /*RSS_page.Clickon_TestMailSettins_button();
		  Thread.sleep(3000);
		  RSS_page.Notification();*/
		  Thread.sleep(1000);
		  RSS_page.Notification();
		  Reporter.log("Save All Changes -  ");
		  RSS_page.Save_Req_Server_Settings_Changes();
		  Thread.sleep(5000);
		  RSS_page.Notification();
		  Thread.sleep(1500);
		  RSS_page.Notification();
		  
	  }
}
