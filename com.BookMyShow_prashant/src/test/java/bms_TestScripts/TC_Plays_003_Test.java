package bms_TestScripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
/***
 * 
 * @author Prashanth KB
 *
 */
import org.testng.annotations.Test;

import bms_Generic_lib.BaseClass;
import bms_Generic_lib.ListnerImplementation;
import bms_POM_Repositories.AddSeatsPage;
import bms_POM_Repositories.BookPage;
import bms_POM_Repositories.HomePage;
import bms_POM_Repositories.PlaysPage;
@Listeners(bms_Generic_lib.ListnerImplementation.class)
public class TC_Plays_003_Test extends BaseClass {
	@Test(groups="regression")
	public void bookusinggeneresfilter() {
		//Entering the Home Page
		HomePage ho=new HomePage(driver);
		String actualhomepageTitle = driver.getTitle();
		String homepageTitle = "Movie Tickets, Plays, Sports, Events & Cinemas near Bengaluru - BookMyShow";
		ho.getnotnow().click();
		assertEquals(actualhomepageTitle, homepageTitle , "HomePage is not displayed");
		ho.getplaysmodule().click();

		//Entering the Plays Page 
		PlaysPage pp=new PlaysPage(driver);
		String actualplaystitle = driver.getTitle();
		String playspagetitle = "Top Upcoming Plays Plays in Bengaluru | Best Live Plays Plays in Bengaluru - BookMyShow";
		assertEquals(actualplaystitle, playspagetitle , "Plays  is not displayed");
		
		//click on Generes 
		WebElement genres = pp.getGenres();
		String actualgenresbutton = genres.getText();
		String expetedgenresbutton = "Genres";
		assertEquals(actualgenresbutton, expetedgenresbutton , "generes button  is not clicked");
		genres.click();
		
		//click on drama
		WebElement drama = pp.getdrama();
		String actualdramabutton = drama.getText();
		String expeteddramabutton = "Drama";
		assertEquals(actualdramabutton, expeteddramabutton , "drama button  is not clicked");
		drama.click();
		
		//select the The Note Play
		WebElement thenoteplay = pp.getthenote();
		String actualthenoteplay = thenoteplay.getText();
		String expetedthenoteplay = "The Note";
		assertEquals(actualthenoteplay, expetedthenoteplay , "the note play is not selected");
		thenoteplay.click();
		
		//Book the play
		BookPage bp=new BookPage(driver);
		WebElement bookbutton = bp.getbookbutton();
		String actualbookbutton = bookbutton.getText();
		String expetedbookbutton = "Book";
		assertEquals(actualbookbutton, expetedbookbutton , "Book button   is not clicked");
		bookbutton.click();
		
		//select the timing
		WebElement sat11december7PM = bp.getsat11december7PM();
		String actualsat11december7PM = sat11december7PM.getText();
		String expetedsat11december7PM = "7:00 PM";
		assertEquals(actualsat11december7PM, expetedsat11december7PM , "7 PM Book button   is not clicked");
		sat11december7PM.click();

		//click  on continue
		WebElement continuebutton = bp.getContinue();
		String actualcontinuebutton = continuebutton.getText();
		String expetedcontinuebutton = "Continue";
		assertEquals(actualcontinuebutton, expetedcontinuebutton , "continue button   is not clicked");
		continuebutton.click();
		
		//Add  Seats
		AddSeatsPage as=new AddSeatsPage(driver);
		//clicking on add button
		WebElement addbutton = as.getaddbutton();
		String actualaddbutton = addbutton.getText();
		String expetedaddbutton = "Add";
		assertEquals(actualaddbutton, expetedaddbutton , "Add button    is not clicked");
		addbutton.click();

		//clicking on Proceed button
		WebElement Proceedbutton = as.getproceedbutton();
		String actualProceedbutton = Proceedbutton.getText();
		String expetedProceedbutton = "Proceed";
		assertEquals(actualProceedbutton, expetedProceedbutton , "Proceed  button    is not clicked");
		Proceedbutton.click();


	}
}