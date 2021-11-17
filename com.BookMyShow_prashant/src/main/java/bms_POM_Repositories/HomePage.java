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
public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Plays")
	private WebElement playsmodule;
	
	@FindBy(id = "wzrk-cancel")
	private WebElement notnow;
	
	@FindBy(xpath = "//span[text()='Bengaluru']")
	private WebElement bangaloreloccation;
	
	public WebElement getplaysmodule() {
		return playsmodule;
	}
	
	public WebElement getnotnow() {
		return notnow;
	}
	
	public WebElement getbangaloreloccation() {
		return bangaloreloccation;
	}
	
	public void homepage() {
		playsmodule.click();
		notnow.click();
		bangaloreloccation.click();
	}
}
