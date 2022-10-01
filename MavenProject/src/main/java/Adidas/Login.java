package Adidas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	//variable declaration
	
	@FindBy (xpath = "(//span[text()='Footwear'])[6]")
	private WebElement footwear;
	
	@FindBy (xpath = "(//p[text()='T Shirts'])[1]")
	private WebElement tshirt;
	
	WebDriver driver;
	private Actions act;
	
	//variable iniatialization
	
	public Login (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
				
		act = new Actions(driver);
	}
	
	//variable use
	
	public void clickonfootwear() {
	footwear.click();	
	}
	
	public void clickontshirt() {
	tshirt.click();
	}
	
	
	
}
