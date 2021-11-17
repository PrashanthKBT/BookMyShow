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
public class PlaysPage {
	
	public PlaysPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Language']")
	private WebElement language;
	
	@FindBy(xpath = "(//div[text()='Language']/../..//div[text()='Kannada'])[2]")
	private WebElement kannada;
	
	@FindBy(xpath = "(//div[text()='Browse by Venues'])[1]")
	private WebElement browsebyvenuebutton;
	
	@FindBy(xpath = "//div[text()='Categories']")
	private WebElement Categories;
	
	@FindBy(xpath = "(//div[text()='Categories']/../..//div[text()='Storytelling'])[2]")
	private WebElement Storytelling;
	
	@FindBy(xpath = "//div[text()='Genres']")
	private WebElement Genres;
	
	@FindBy(xpath ="(//div[text()='Genres']/../../../..//div[text()='Drama'])[2]" )
	private WebElement drama;
	
	@FindBy(xpath = "//div[text()='Price']")
	private WebElement  price;
	
	@FindBy(xpath = "(//div[text()='0 - 500'])[2]")
	private WebElement price0to500;
	
	@FindBy(xpath = "//div[text()='Hakki Kathe']")
	private WebElement ammamattusuhilplay;
	
	@FindBy(linkText = "Ranga Shankara: Bengaluru")
	private WebElement RangaShankara;
	
	@FindBy(xpath = "//div[text()='Stories from the Mahabharata']")
	private WebElement StoriesfromtheMahabharata;
	
	@FindBy(xpath = "//div[text()='The Note']")
	private WebElement thenote;
	
	@FindBy(xpath = "//div[text()='Aatankavaadiya Aakasmika Saavu']")
	private WebElement AatankavaadiyaAakasmikaSaavu;
	
	public WebElement getAatankavaadiyaAakasmikaSaavu() {
		return AatankavaadiyaAakasmikaSaavu;
	}
	
	public WebElement getthenote() {
		return thenote;
	}
	public WebElement getStoriesfromtheMahabharata() {
		return StoriesfromtheMahabharata;
	}
	public WebElement getRangaShankara() {
		return RangaShankara;
	}	
	public WebElement getammamattusuhilplay() {
		return ammamattusuhilplay;
	}
	public WebElement getlanguage() {
		return language;
	}
	
	public WebElement getCategories() {
		return Categories;
	}
	public WebElement getbrowsebyvenuebutton() {
		return browsebyvenuebutton;
	}
	public WebElement getkannada() {
		return kannada;
	}
	public WebElement getStorytelling() {
		return Storytelling;
	}
	public WebElement getprice() {
		return price;
	}
	public WebElement getGenres() {
		return Genres;
	}
	public WebElement getdrama() {
		return drama;
	}
	public WebElement getprice0to500() {
		return price0to500;
	}
	
	public void plays() {
		kannada.click();
		price.click();
		price0to500.click();
		drama.click();
		Genres.click();
		Storytelling.click();
		Categories.click();
		language.click();
		browsebyvenuebutton.click();
		ammamattusuhilplay.click();
		RangaShankara.click();
		StoriesfromtheMahabharata.click();
		thenote.click();
		AatankavaadiyaAakasmikaSaavu.click();
	}
}	

