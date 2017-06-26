package OnGuard_Login_Functionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import Configration_Files.Common;
import Configration_Files.WebDriverManager;

public class OnGuard_Application_Manager_Login_UserGroup {
	WebDriverManager man = new WebDriverManager();
	Common c = new Common();
	final WebDriver driver;
	public  OnGuard_Application_Manager_Login_UserGroup(WebDriver driver)
	{   
		this.driver = driver;
	}
	
	
	 public void Select_UserGroup_from_DDList(int ug) {
	     Select droplist = new Select(driver.findElement(By.xpath(c.getElementName("User_group"))));   
	     droplist.selectByIndex(ug);
	   }
	
	 public void Select_Administration_from_DDList(String text) {//Demo International
	     Select droplist = new Select(driver.findElement(By.xpath(c.getElementName("administration"))));   
	     droplist.selectByVisibleText(text);
	     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	     Reporter.log("Administration-  Demo International is selected");   
	   }
	 public void Previous_button() {
			driver.findElement(By.xpath(c.getElementName("UserGroup_Previous_Button"))).click();
			Reporter.log("Previous Button is clicked"); 
		   }
	 public void Click_on_Next_button() {
		driver.findElement(By.xpath(c.getElementName("UserGroup_Next_Button"))).click();
		   Reporter.log("Next Button is clicked"); 
	   }
	
	   }
