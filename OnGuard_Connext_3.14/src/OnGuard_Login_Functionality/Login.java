package OnGuard_Login_Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Configration_Files.Common;
import Configration_Files.ReadXclData;
import Configration_Files.ScreenShotOnFailure;
import Configration_Files.WebDriverManager;
@Listeners(ScreenShotOnFailure.class)
public class Login extends TestListenerAdapter {	
	ReadXclData RD= new ReadXclData();
	WebDriverManager man = new WebDriverManager();
	 Common c = new Common();
	/*@BeforeClass
	public void setUp() throws Exception {
		WebDriverManager.startDriver();	
	}	*/
	@Test
	@Parameters({"Locale"})
	public void Login_User(String Locale) throws Exception{
		WebDriver driver=WebDriverManager.getDriverInstance();
		OnGuard_Application_Manager_Login OG_Login1= PageFactory.initElements(driver, OnGuard_Application_Manager_Login.class);
		OnGuard_Application_Manager_Login_UserGroup OG_Login2= PageFactory.initElements(driver, OnGuard_Application_Manager_Login_UserGroup.class);
		OG_Login1.Enter_User_Name("edwin");//edwin
		Thread.sleep(800);
		switch(Locale){
		 case("EN") :  OG_Login1.Choose_Language("English");
		 break;
		 case("NL") :  OG_Login1.Choose_Language("Dutch");
		 break;
		 case("FR") :  OG_Login1.Choose_Language("French");
		 break;
		 case("DE") :  OG_Login1.Choose_Language("German");
		 break;
		 case("ES") :  OG_Login1.Choose_Language("Spanish");
		 break;
		 case("PT") :  OG_Login1.Choose_Language("Portuguese");
		 break;
		 case("IT") :  OG_Login1.Choose_Language("Italian");
		 break;
		 case("PO") :  OG_Login1.Choose_Language("Polish");
		 break;
		 case("RUS") :  OG_Login1.Choose_Language("Russian");
		 break;
		 case("TUR") :  OG_Login1.Choose_Language("Turkish");
		 break;
		 }
	     OG_Login1.Enter_Password("kim");
	     /*Thread.sleep(500);
		 OnGuard_Application_Manager_Login OG_Login11= PageFactory.initElements(driver, OnGuard_Application_Manager_Login.class);
		 OG_Login11.Choose_Language("French");*/
		 OG_Login1.ClickOn_next_Button();
		 Thread.sleep(3000);
		 if(driver.findElement(By.xpath("//*[@id='messageToDisplay_popover']")).isDisplayed()){
			 driver.findElement(By.xpath("//*[@id='popup']/div[2]/div/a[1]")).click();
			 Thread.sleep(3000);
			 OG_Login2.Select_Administration_from_DDList("Riwal LIVE");
			 Thread.sleep(1500);
			 OG_Login2.Click_on_Next_button();
		 }else{
			 OG_Login2.Select_Administration_from_DDList("Riwal LIVE");
			 Thread.sleep(1500);
			 OG_Login2.Click_on_Next_button();
		 }
	}
}
