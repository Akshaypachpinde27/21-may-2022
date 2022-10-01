package FacebookPompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessengerPage {

	@FindBy (xpath = "//a[text()='Rooms']")
	private WebElement room ;
	
	@FindBy (xpath = "//a[text()='Features']")
	private WebElement features;
	
	public MessengerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void openRoom() {
		room.click();	
	}
	
	public void openFeatures () {
		features.click();
	}
}
