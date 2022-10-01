package AmazonPomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//variable Declaration
	
	@FindBy (xpath = "//span [text ()='Account & Lists']")
	private WebElement Accountandlists;
	
	@FindBy (xpath = "(//span[text()='Sign in'])[1]")
	private WebElement signin;
	
	@FindBy (xpath = "(//span[@class='nav-icon nav-arrow'])[1]")
	private WebElement languagetab;
	
	@FindBy (xpath = "//a[text()='Mobiles']")
	private WebElement mobiles;
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchbox;
	
	@FindBy (xpath = "(//span [text()='All'])[2]")//amazon all tab on home page
	private WebElement Alltab;
	
	@FindBy (xpath = "(//a[@class='hmenu-item'])[8]")
	private WebElement primevideo;
	
	@FindBy (xpath = "//a[text()='Movies']")
	private WebElement movies;
	
	@FindBy (xpath = "//a[@title='Daagadi Chawl 2']")
	private WebElement dagadichawl;
	
	@FindBy (xpath = "//span[@class='dv-dp-node-trailer']")
	private WebElement trailer;
	
	
	private WebDriver driver;
	private Actions act;
	
	//variable iniatialization
	
	public HomePage (WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
		this.driver= driver;
		
		 act = new Actions(driver);
	}
	
	//variable use
	
	public void clickonAccountandlists() {
	act.moveToElement(Accountandlists).perform();
	}
	public void clickonsignin() {
		signin.click();
		}
	public void moveonlanguagetab() {
		act.moveToElement(languagetab).perform();
	}
	public void clickonmobiles() {
		mobiles.click();
	}
	public void clickonsearchbox() {
		searchbox.sendKeys("iphone13");
	}
	public void clickonAlltab() {
		Alltab.click();
	}
	
	public void clickonprimevideo() {
		primevideo.click();
	}
	
	public void clickonmovies() {
		movies.click();
	}
	public void clickdagadichawl() {
		dagadichawl.click();
	}
	public void clickontrailer() {
		trailer.click();
	}
}
