package FaceBookTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FB2.FBLOGIN;
import FB2.RoomPage;
import FB2.messengerPage;

public class loginPage {
	
	private WebDriver driver;
	
	@BeforeClass 
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\akshay pachpinde\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod 
	public void beforeMethod() throws InterruptedException
	{
		driver.get("https://www.facebook.com/"); 
		FBLOGIN fBLOGIN = new FBLOGIN(driver);
		fBLOGIN.openmessenger();
		
		messengerPage MessengerPage = new messengerPage(driver);
		MessengerPage.openRoom();
		
		//RoomPage roomPage = new RoomPage (driver);
		//roomPage.clickonreturntomesenger();
		
		Thread.sleep(3000);
	}
	@Test
	public void test()
	{
		
		RoomPage roomPage = new RoomPage (driver);
		roomPage.clickonreturntomesenger(); 
	}
	@Test
	public void test1()
	{
		
		RoomPage roomPage = new RoomPage (driver);
		roomPage.clickonvisittohelpcenter();
	}
	@AfterMethod 
	public void afterMethod()
	{
		driver.navigate().back();
	}
	
	@AfterClass 
	public void afterClass()
	{
		driver.close();
	}

}
