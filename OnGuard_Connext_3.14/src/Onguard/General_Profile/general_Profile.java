package Onguard.General_Profile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Configration_Files.ReadXclData;
import Configration_Files.ScreenShotOnFailure;
import Configration_Files.WebDriverManager;
import Event_commands.events;
import Technical_Configration.Request_server_settings;
import appMan_Pages.General_Profile_Page;
@Listeners(ScreenShotOnFailure.class)
public class general_Profile {
	File file= new File("Autoit_Script");
	ReadXclData rddata=new ReadXclData();
	 ArrayList<String>arr= new ArrayList<>();
	 @BeforeClass
	 public void  testData() throws Exception{
		 String[][] t = rddata.readdata("General_Profile");
			for(String[] rt : t){
				 for(String val : rt){
				    arr.add(val);
				    }
				 }
	}
  @Test(priority=1)
  public void Help_and_Documentation() throws IOException, InterruptedException {
	  WebDriver driver=WebDriverManager.getDriverInstance();
	  General_Profile_Page gp_page = new General_Profile_Page(driver);
	  events eve= new events(driver);
	  gp_page.Goto_General_profile_DDlist();
	  Thread.sleep(1500);
	  eve.handle_browser_tab("help_and_documentation","tripane");
  }
  @Test(priority=2)
  public void OnGuard_Customer_portal() throws IOException, InterruptedException {
	  WebDriver driver=WebDriverManager.getDriverInstance();
	  General_Profile_Page gp_page = new General_Profile_Page(driver);
	  events eve= new events(driver);
	  gp_page.Goto_General_profile_DDlist();
	  Thread.sleep(1500);
	  eve.handle_browser_tab("onguard_customer_portal","user_email");
  }
  @Test(priority=3)
  public void OnGuard_Service_Centre_Cancel_Functionality() throws IOException, InterruptedException {
	  WebDriver driver=WebDriverManager.getDriverInstance();
	  General_Profile_Page gp_page = new General_Profile_Page(driver);
	  Reporter.log("<<======================{General Profile Section}=======================>> ");
	  Reporter.log("Verify cancel button Functionality----------->");
	  gp_page.Goto_General_profile_DDlist();
	  Thread.sleep(500);
	  gp_page.General_profile_items("onguard_Service_centre");
	  Thread.sleep(500);
	  gp_page.to(arr.get(0));
	  gp_page.CC(arr.get(1));
	  gp_page.BCC(arr.get(2));
	  gp_page.Subject(arr.get(3));
	  gp_page.Body(arr.get(4));
	  gp_page.Add_Attachment(file.getAbsolutePath()+"/upload.exe", "file:///"+file.getAbsolutePath()+"/upload.au3");
	  Thread.sleep(500);
	  gp_page.Attachments();
	  Thread.sleep(500);
	  gp_page.Cancel();
	  Thread.sleep(500);
  }
  @Test(priority=4)
  public void OnGuard_Service_Centre_Send_Functionality_with_Invalid_Configration() throws IOException, InterruptedException {
	  WebDriver driver=WebDriverManager.getDriverInstance();
	  General_Profile_Page gp_page = new General_Profile_Page(driver);
	  Reporter.log("Verify Send button Functionality with Invalid Configration----------->");
	  gp_page.Goto_General_profile_DDlist();
	  Thread.sleep(800);
	  gp_page.General_profile_items("onguard_Service_centre");
	  Thread.sleep(500);
	  gp_page.to(arr.get(0));
	  gp_page.CC(arr.get(1));
	  gp_page.BCC(arr.get(2));
	  gp_page.Subject(arr.get(3));
	  gp_page.Body(arr.get(4));
	  gp_page.Add_Attachment(file.getAbsolutePath()+"/upload.exe", "file:///"+file.getAbsolutePath()+"/upload.au3");
	  Thread.sleep(1500);
	  gp_page.Send();
	  Thread.sleep(1000);
	  gp_page.Notification();
	  Thread.sleep(500);
	  gp_page.Notification();
	  Thread.sleep(500);
  }
  @Test(priority=5)
  public void OnGuard_Service_Centre_Send_Functionality_with_Valid_Configration() throws IOException, InterruptedException {
	  WebDriver driver=WebDriverManager.getDriverInstance();
	  General_Profile_Page gp_page = new General_Profile_Page(driver);
	  Request_server_settings rspage= new Request_server_settings();
	  Reporter.log("Verify Send button Functionality with Valid Configration----------->");
	/*  Home_index_Page HI_page = new Home_index_Page(driver);
		HI_page.Select_Technical_Configration_Tab();
		System.out.println("Technical Configration tab is clicked");*/
		Thread.sleep(1500);
	  rspage.SetUp_valid_Request_server_settings_Configration();//Valid Server Configration
	  Thread.sleep(2000);
	  gp_page.Goto_General_profile_DDlist();
	  Thread.sleep(1500);
	  gp_page.General_profile_items("onguard_Service_centre");
	  Thread.sleep(1000);
	  gp_page.to(arr.get(0));
	  gp_page.CC(arr.get(1));
	  gp_page.BCC(arr.get(2));
	  gp_page.Subject(arr.get(3));
	  gp_page.Body(arr.get(4));
	  gp_page.Add_Attachment(file.getAbsolutePath()+"/upload.exe", "file:///"+ file.getAbsolutePath()+"/upload.au3");
	  Thread.sleep(1500);
	  gp_page.Send();
	  Thread.sleep(3000);
	  gp_page.Notification();
	  Thread.sleep(1000);
	  gp_page.Notification();
	  Thread.sleep(1000);
  }
  
   @Test(priority=6)
  public void Show_Error_Log() throws IOException, InterruptedException {
	  WebDriver driver=WebDriverManager.getDriverInstance();
	  General_Profile_Page gp_page = new General_Profile_Page(driver);
	  Reporter.log("Verify Show Error Log Functionality----------->");
	  gp_page.Goto_General_profile_DDlist();
	  Thread.sleep(500);
	  gp_page.General_profile_items("onguard_Show_Error_log");
	  Thread.sleep(500);
	  gp_page.Read_Error_Log();
	  Thread.sleep(500);
  }
  @Test(priority=7)
  public void About() throws IOException, InterruptedException {
	  WebDriver driver=WebDriverManager.getDriverInstance();
	  General_Profile_Page gp_page = new General_Profile_Page(driver);
	  Reporter.log("Verify About Functionality----------->");
	  gp_page.Goto_General_profile_DDlist();
	  Thread.sleep(500);
	  gp_page.General_profile_items("About");
	  Thread.sleep(500);
	  gp_page.About();
	  Thread.sleep(500);
	  Reporter.log("<<======================{End :General Profile Section}=======================>> ");
  }
}
