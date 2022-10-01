package FB2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomPage {
	
	//variable initialization
	
	@FindBy (xpath= "//a[text()=' Return to messenger.com ']")
	private WebElement returntomesenger;
	
	@FindBy (xpath= " //a[text()=' Visit our help center ']")
	private WebElement visittohelpcenter;

	private WebDriver driver;

	//variable declaration
	
	public RoomPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	// Variable use
	 public void clickonreturntomesenger() {
		 returntomesenger.click();
	 }
	 public void clickonvisittohelpcenter() {
		 visittohelpcenter.click();
	 }
	 
}
