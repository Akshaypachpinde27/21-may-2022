package FB2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLOGIN {

	// variable declaration
	
		@FindBy (xpath = "//input [@id='email']")
		private WebElement username ;

		@FindBy (xpath = "//input [@id='pass']")
		private WebElement password ;
		
		@FindBy (xpath = "//button[@name='login']")
		private WebElement login ;
		 
		@FindBy (xpath = "//a[text ()='Messenger']")
		private WebElement Messenger ;
		 
		
		//variable initialization
		
		public FBLOGIN (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}	
			
		// variable use 
		public void sendUsername () {
			username.sendKeys("8329607761");
		}
		
		public void sendpassword() {
			password.sendKeys("8329607761");
		}
		public void clickonlogin() {
			login.click();
		}
		public void openmessenger() {
			Messenger.click();
		}
}
