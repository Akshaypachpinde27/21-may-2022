package FacebookPompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginandSinUp {
	
	// variable declaration
	
	@FindBy (xpath = "//input [@id='email']")
	private WebElement username ;

	@FindBy (xpath = "//input [@id='pass']")
	private WebElement password ;
	
	@FindBy (xpath = "//button[@name='login']")
	private WebElement login ;
	 
	//variable initialization
	
	public LoginandSinUp (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 // variable use - WebElement Actoins
	public void sendusername() {
		username.sendKeys("akshay@gmail.com");
	}
	
	public void sendpassword () {
		password.sendKeys("123456");
	}
	public void login () {
		login.click();
	}
	// OR
	
	public void logintoapplication() {
		username.sendKeys("akshay@gmail.com");
		password.sendKeys("123456");
		login.click();
	}
	
}
