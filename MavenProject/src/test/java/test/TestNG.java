package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	 WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay pachpinde\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void beforeMethods() {
		 driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test() {
		MessengerPage messengerPage= new MessengerPage();
		messengerPage.openRoom();
	}
	@AfterMethod
	public void afterMethod() {
		
	}@AfterClass
	public void afterClass() {
		
	}
}
