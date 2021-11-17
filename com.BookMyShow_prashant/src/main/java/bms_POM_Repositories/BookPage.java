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
public class BookPage {

	public BookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Book']")
	private WebElement bookbutton;
	
	@FindBy(xpath = "//button[text()='Register']")
	private WebElement Register;
	
	@FindBy(xpath = "//div[text()='Sat, 20 November']/../..//li[text()='5:00 PM']")
	private WebElement Sat20November5PM;
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement Continue;
	
	@FindBy(xpath = "//div[text()='Sat, 11 December']/../..//li[text()='7:00 PM']")
	private WebElement sat11december7PM;
	
	public WebElement getsat11december7PM() {
		return sat11december7PM;
	}
	public WebElement getbookbutton() {
		return bookbutton;
	}
	
	public WebElement getRegister() {
		return Register;
	}
	
	public WebElement getSat20November5PM() {
		return Sat20November5PM;
	}
	public void bookpage() {
		bookbutton.click();
		Register.click();
		Sat20November5PM.click();
		Continue.click();
		sat11december7PM.click();
	}
	public WebElement getContinue() {
		// TODO Auto-generated method stub
		return Continue;
	}

	
}
