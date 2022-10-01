import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Adidas.FootwareHomepage;
import Adidas.Login;

public class AdidasTest {
	
	/*public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay pachpinde\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.adidas.co.in/");
	
	Thread.sleep(2000);
	
	Login login = new Login (driver);
	login.clickonfootwear();
	
	Thread.sleep(2000);
	
	Login login1 = new Login (driver);
	login1.clickontshirt();
	
	}*/
	private WebDriver driver;
	//private FootwareHomepage footwareHomepage;
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay pachpinde\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
			driver = new ChromeDriver();
			driver.manage().window().maximize();
				
			driver.get("https://www.adidas.co.in/");
			//FootwareHomepage footwareHomepage = new FootwareHomepage(driver);
			Thread.sleep(3000);
			Login login =new Login(driver);
			login.clickonfootwear();
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		System.out.println("Start");
		Thread.sleep(3000);
	}
	
	@Test
	public void VerifytshirtButton() throws InterruptedException
	{
		FootwareHomepage footwareHomepage = new FootwareHomepage(driver);
		footwareHomepage.ClickOntShirt();
		
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		
		String URL =driver.getCurrentUrl();
		String Title=driver.getTitle();
		
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(URL,"https://www.adidas.co.in/t_shirt");
		}
	
	@Test
	public void VerifyWaterBottleButton() throws InterruptedException
	{
		FootwareHomepage footwareHomepage1 = new FootwareHomepage(driver);
		footwareHomepage1.ClickOnWaterBottle();
		
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		driver.navigate().back();
	}
	
	/*@AfterClass
	public void afterClass()
	{
		
	}*/

}
