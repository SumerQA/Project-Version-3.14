package appMan_Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Configration_Files.Common;
import Event_commands.events;

public class UserGroups_Page {
	Common c = new Common();
	final WebDriver driver;
	public  UserGroups_Page(WebDriver driver)
	{   
		this.driver = driver;
	}
	@Test
	 public void Clickon_UserGroups_Tab() throws IOException, InterruptedException {                                //Will Click on Uses tab under User manager
		events eve = new events(driver);
	  	eve.Click_event("usergroups");
		Thread.sleep(1000);
	  	if(driver.findElement(By.xpath(c.getElementName("TC_Notification_No_button"))).isDisplayed()){
	  		
	  		driver.findElement(By.xpath(c.getElementName("TC_Notification_No_button"))).click();
	  		Thread.sleep(1500);
	  	 }
	    }
	@Test
	 public void Create_New_UserGroups_panal() throws IOException, InterruptedException {	                   //Click and Open the Create New User Panal 
		events eve = new events(driver);
	  	eve.Click_event("Create_New_usergroups");
	    }
}
	
	
	
	
	
	
	
	
	
	
	