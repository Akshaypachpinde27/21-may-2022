package FB2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class messengerPage {

	//variable declaration
	
	@FindBy (xpath = "//a[text()='Rooms']")
	private WebElement room;
	
	@FindBy (xpath = "//a[text()='Features']")
	private WebElement features;
	
	
	
	////variable initialization
	public messengerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// variable use
	
	public void openRoom() {
		room.click();
	}
	public void openfeatures() {
		room.click();
	}
}

