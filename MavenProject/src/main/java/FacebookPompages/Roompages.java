package FacebookPompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Roompages {
	
	@FindBy (xpath = " //a[text()=' Return to messenger.com ']")
	private WebElement returntomessenger ;

	@FindBy (xpath = " //a[text()=' Visit our help center ']")
	private WebElement helpcenter ;
	
	public Roompages (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void goBackToMessenger() {
	returntomessenger.click();
	}
	public void contactToHelpCenter () {
		helpcenter.click();
	}
	
}
