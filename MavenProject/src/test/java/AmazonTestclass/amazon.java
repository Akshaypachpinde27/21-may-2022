package AmazonTestclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AmazonPomPages.HomePage;

public class amazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay pachpinde\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		HomePage homePage = new HomePage (driver);
		homePage.clickonAccountandlists ();
		
		HomePage homePage1 = new HomePage (driver);
		homePage1.clickonsignin();
		
		driver.navigate().back();
		
	//	HomePage homePage2 = new HomePage (driver);
	//	homePage2.moveonlanguagetab();
		
	//	HomePage homePage3 = new HomePage (driver);
	//	homePage.clickonmobiles();
		
	//	HomePage homePage4 = new HomePage (driver);
	//	homePage4.clickonsearchbox();
		
		HomePage homePage5 = new HomePage (driver);
		homePage5.clickonAlltab();
		
		Thread.sleep(2000);
		
		HomePage homePage7 = new HomePage (driver);
		homePage7.clickonprimevideo();
		
		Thread.sleep(2000);
		
		HomePage homePage8 = new HomePage (driver);
		homePage8.clickonmovies();
		
		HomePage homePage9 = new HomePage (driver);
		homePage9.clickdagadichawl();
		
		HomePage homePage10 = new HomePage (driver);
		homePage10.clickontrailer();
	}

}
