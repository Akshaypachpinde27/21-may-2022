package Adidas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FootwareHomepage {
	private WebDriver driver;
	//Variable Declaration
	
	@FindBy(xpath="(//p[text()=\"T Shirts\"])[1]")
	private WebElement tshirt;
	
	@FindBy(xpath="//p[text()=\"water bottle\"]")
	private WebElement WaterBottle;
	
	//Variable initialization
	
	public FootwareHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Variable Use
	
	public void ClickOntShirt()
	{
		tshirt.click();
	}
	
	public void ClickOnWaterBottle()
	{
		WaterBottle.click();
	}
}
