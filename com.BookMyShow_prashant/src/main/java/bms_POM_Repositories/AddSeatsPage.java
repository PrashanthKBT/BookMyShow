package bms_POM_Repositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/***
 * 
 * @author Prashanth KB
 *
 */
public class AddSeatsPage {

	public AddSeatsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Add']")
	private WebElement addbutton;
	
	@FindBy(xpath = "//button[@data-id='ticket-selector-proceed']")
	private WebElement proceedbutton;
	
	@FindBy(xpath = "//button[text()='Login to Proceed']")
	private WebElement LogintoProceed;
	
	public WebElement getLogintoProceed() {
		return LogintoProceed;
	}
	public WebElement getaddbutton() {
		return addbutton;
	}
	public WebElement getproceedbutton() {
		return proceedbutton;
	}
 
	public void addsetas() {
		addbutton.click();
		proceedbutton.click();
		LogintoProceed.click();
	}
	
}
