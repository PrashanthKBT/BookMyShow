package bms_TestScripts;

import static org.testng.Assert.assertEquals;
/***
 * 
 * @author Prashanth KB
 *
 */

//import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bms_Generic_lib.BaseClass;
import bms_Generic_lib.ListnerImplementation;
import bms_POM_Repositories.AddSeatsPage;
import bms_POM_Repositories.BookPage;
import bms_POM_Repositories.HomePage;
import bms_POM_Repositories.PlaysPage;
@Listeners(bms_Generic_lib.ListnerImplementation.class)
public class TC_Plays_001_Test extends BaseClass {

	@Test(groups="smoke")
	public void bookusinglanguagefilter() {
		//Entering the Home Page
		HomePage ho=new HomePage(driver);
		String actualhomepageTitle = driver.getTitle();
		String homepageTitle = "Movie Tickets, Plays, Sports, Events & Cinemas near Bengaluru - BookMyShow";
		ho.getnotnow().click();
		assertEquals(actualhomepageTitle, homepageTitle , "HomePage is not displayed");
		ho.getplaysmodule().click();

		//Entering the plays module
		PlaysPage pp=new PlaysPage(driver);
		String actualplaystitle = driver.getTitle();
		String playspagetitle = "Top Upcoming Plays Plays in Bengaluru | Best Live Plays Plays in Bengaluru - BookMyShow";
		assertEquals(actualplaystitle, playspagetitle , "Plays  is not displayed");

		//clicking on language filter
		WebElement language = pp.getlanguage();
		language.click();
		String actuallanguagebutton = language.getText();
		String languagebutton = "Language";
		assertEquals(actuallanguagebutton, languagebutton , " language filter is not clicked");

		//selecting the kannada language
		WebElement kannada = pp.getkannada();
		kannada.click();
		String actualkannadabutton = kannada.getText();
		String kannadabutton = "Kannada";
		assertEquals(actualkannadabutton, kannadabutton , " kannada language is not selected");

		//selecting the Hakki Kathe play
		WebElement ammamattusuhilplay = pp.getammamattusuhilplay();
		String actualammamattusuhilplay = ammamattusuhilplay.getText();
		String expetedammamattusuhilplay = "Hakki Kathe";
		assertEquals(actualammamattusuhilplay, expetedammamattusuhilplay , "AMMA MATTU SUHAIL is not selected");
		ammamattusuhilplay.click();


		//Booking the play
		BookPage bp=new BookPage(driver);
		String actualbookpagetitle = driver.getTitle();
		String bookpagetitle = "Hakki Kathe Kannada theatre-plays Play in Bengaluru Tickets - BookMyShow";
		assertEquals(actualbookpagetitle, bookpagetitle , "Book page  is not displayed");

		//clicking on book button
		WebElement bookbutton = bp.getbookbutton();
		String actualbookbutton = bookbutton.getText();
		String expetedbookbutton = "Book";
		assertEquals(actualbookbutton, expetedbookbutton , "Book button   is not clicked");
		bookbutton.click();

		// entering the seats details
		AddSeatsPage as=new AddSeatsPage(driver);
		String actualaddseatstitle = driver.getTitle();
		String expetedaddseatstitle = "Movie Tickets, Plays, Sports, Events & Cinemas around you - BookMyShow";
		assertEquals(actualaddseatstitle, expetedaddseatstitle , "Add Seats page   is not displayed");

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
