package bms_TestScripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.LocalDateTime;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import bms_Generic_lib.BaseClass;
import bms_Generic_lib.Excelutil;
import bms_Generic_lib.ITestListnerImplementation;
import bms_POM_Repositories.AddSeatsPage;
import bms_POM_Repositories.BookPage;
import bms_POM_Repositories.HomePage;
import bms_POM_Repositories.PlaysPage;
import bms_POM_Repositories.RegisterPage;
/***
 * 
 * @author Prashanth KB
 *
 */
@Listeners(bms_Generic_lib.ITestListnerImplementation.class)
public class TC_Plays_002_Test extends BaseClass  {
	@Test(groups="regression")
	public void bookusingcatagoryfilter() throws EncryptedDocumentException, IOException {
		//Entering the Home Page
		HomePage homepage=new HomePage(driver);
		String actualhomepageTitle = driver.getTitle();
		String homepageTitle = "Movie Tickets, Plays, Sports, Events & Cinemas near Bengaluru - BookMyShow";
		homepage.getnotnow().click();
		assertEquals(actualhomepageTitle, homepageTitle , "HomePage is not displayed");
		homepage.getplaysmodule().click();

		//Entering the Plays Page 
		PlaysPage playspage=new PlaysPage(driver);
		String actualplaystitle = driver.getTitle();
		String playspagetitle = "Top Upcoming Plays Plays in Bengaluru | Best Live Plays Plays in Bengaluru - BookMyShow";
		assertEquals(actualplaystitle, playspagetitle , "Plays  is not displayed");

		//Filtering by using the Catagary Filter
		WebElement Category = playspage.getCategories();
		String actualCategorybutton = Category.getText();
		String expetedCategorybutton = "Categories";
		assertEquals(actualCategorybutton, expetedCategorybutton , "Categories button   is not clicked");
		Category.click();

		//Selecting the Story telling from the Categories 
		WebElement StoryTelling = playspage.getStorytelling();
		String actualStoryTellingbutton = StoryTelling.getText();
		String expetedStoryTellingbutton = "Storytelling";
		assertEquals(actualStoryTellingbutton, expetedStoryTellingbutton , "Storytelling from the Categories  is not clicked");
		StoryTelling.click();

		//Selecting the Stories from the Mahabharata play
		WebElement StoriesfromtheMahabharataplay = playspage.getStoriesfromtheMahabharata();
		String actualStoriesfromtheMahabharataplay = StoriesfromtheMahabharataplay.getText();
		String expetedStoriesfromtheMahabharataplay = "Stories from the Mahabharata";
		assertEquals(actualStoriesfromtheMahabharataplay, expetedStoriesfromtheMahabharataplay , "Stories from the Mahabharata play is noy displayed");
		StoriesfromtheMahabharataplay.click();

		//Booking the play
		BookPage bookpage=new BookPage(driver);
		String actualBookpagetitle = driver.getTitle();
		String expetedBookpagetitle = "Stories from the Mahabharata English Hindi storytelling Play in Bengaluru Tickets - BookMyShow";
		assertEquals(actualBookpagetitle, expetedBookpagetitle , "Stories from the Mahabharata play page is not displayed");

		//clicking on Register button
		WebElement Registerbutton = bookpage.getRegister();
		String actualRegisterbutton = Registerbutton.getText();
		String expetedRegisterbutton = "Register";
		assertEquals(actualRegisterbutton, expetedRegisterbutton , "Register button is not clicked");
		Registerbutton.click();


		//bp.getContinue().click();
		//Selecting the time of play
		WebElement Sat20November = bookpage.getSat20November5PM();
		String actualSat20November = Sat20November.getText();
		String expetedSat20November = "5:00 PM";
		assertEquals(actualSat20November, expetedSat20November , "5:00 PM button is not clicked");
		Sat20November.click();

		//click on Continue button
		WebElement Continue = bookpage.getContinue();
		String actualContinuebutton = Continue.getText();
		String expetedContinuebutton = "Continue";
		assertEquals(actualContinuebutton, expetedContinuebutton , "Continue  button is not clicked");
		Continue.click();

		//add the Number of Seats 
		AddSeatsPage addseat=new AddSeatsPage(driver);

		//click on add button
		WebElement Addbutton = addseat.getaddbutton();
		String actualAddbutton = Addbutton.getText();
		String expetedAddbutton = "Add";
		assertEquals(actualAddbutton, expetedAddbutton , "Add button is not clicked");
		Addbutton.click();

		//click on proceed button
		WebElement Proceedbutton = addseat.getproceedbutton();
		String actualProceedbutton = Proceedbutton.getText();
		String expetedProceedbutton = "Proceed";
		assertEquals(actualProceedbutton, expetedProceedbutton , "Proceed  button is not clicked");
		Proceedbutton.click();

		//Register for the play
		RegisterPage registerpage=new RegisterPage(driver);
		String name = Excelutil.readstringfromexcel("Boss", 0, 0);

		//Enter the Name
		registerpage.getnametextfiled().sendKeys(name);
		String phonenumber = Excelutil.readstringfromexcel("Boss", 0, 1);

		//Enter the Phone Number
		registerpage.getphonenumbertextfiled().sendKeys(phonenumber);
		String emailid = Excelutil.readstringfromexcel("Boss", 0, 2);

		//Enter the mail id
		registerpage.getemailidtextfiled().sendKeys(emailid);

		//click on Iagree button
		WebElement agree=registerpage.getiagreebutton();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", agree);
		agree.click();

		//click on submit button
		WebElement Submitbutton = registerpage.getsubmitbutton();
		String actualSubmitbutton = Submitbutton.getText();
		String expetedSubmitbutton = "Submit";
		assertEquals(actualSubmitbutton, expetedSubmitbutton , "Submit  button is not clicked");

	}
}