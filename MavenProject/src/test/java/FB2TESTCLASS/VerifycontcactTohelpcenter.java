package FB2TESTCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FB2.FBLOGIN;
import FB2.RoomPage;
import FB2.messengerPage;


public class VerifycontcactTohelpcenter {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\akshay pachpinde\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe\"");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// click on messenger link
		// object of POM class
		
		FBLOGIN fBLOGIN = new FBLOGIN(driver);
		fBLOGIN.openmessenger();
		
		messengerPage MessengerPage = new messengerPage(driver);
		MessengerPage.openRoom();
		
		RoomPage roomPage = new RoomPage(driver);
		roomPage.clickonreturntomesenger();
		
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if (url.equals(title)))
	}
}
