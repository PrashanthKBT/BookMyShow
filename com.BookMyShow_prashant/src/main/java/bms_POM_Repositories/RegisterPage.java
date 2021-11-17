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
public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement nametextfiled;
	
	@FindBy(xpath = "//input[@name='primary_phoneNo']")
	private WebElement phonenumbertextfiled;
	
	
	@FindBy(xpath = "//input[@name='primary_email']")
	private WebElement emailidtextfiled;
	
	@FindBy(xpath = "//label[text()='I agree to the Terms and Conditions.']")
	private WebElement iagreebutton;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitbutton;
	
	public WebElement getnametextfiled() {
		return nametextfiled;
	}
	
	public WebElement getphonenumbertextfiled() {
		return phonenumbertextfiled;
	}
	public WebElement getemailidtextfiled() {
		return emailidtextfiled;
	}
	public WebElement getiagreebutton() {
		return iagreebutton;
	}
	public WebElement getsubmitbutton() {
		return submitbutton;
	}
	public void register() {
		iagreebutton.click();
		emailidtextfiled.click();
		phonenumbertextfiled.click();
		nametextfiled.click();
		submitbutton.click();
		
	}
}
