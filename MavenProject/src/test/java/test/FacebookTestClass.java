package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FacebookPompages.LoginandSinUp;
import FacebookPompages.MessengerPage;

public class FacebookTestClass {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay pachpinde\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		LoginandSinUp Username = new LoginandSinUp (driver);
		Username.sendusername();
		
		
		LoginandSinUp password = new LoginandSinUp (driver);
		password.sendpassword();
		
		LoginandSinUp login = new LoginandSinUp (driver);
		login.login ();
	}

}
