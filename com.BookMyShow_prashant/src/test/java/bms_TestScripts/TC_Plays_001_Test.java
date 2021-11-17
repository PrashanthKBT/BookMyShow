package bms_TestScripts;

import static org.testng.Assert.assertEquals;
//import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import bms_Generic_lib.BaseClass;
import bms_Generic_lib.ITestListnerImplementation;
import bms_POM_Repositories.AddSeatsPage;
import bms_POM_Repositories.BookPage;
import bms_POM_Repositories.HomePage;
import bms_POM_Repositories.PlaysPage;
/***
 * 
 * @author Prashanth KB
 *
 */
@Listeners(bms_Generic_lib.ITestListnerImplementation.class)

public class TC_Plays_001_Test extends BaseClass {

	@Test(groups="smoke")
	public void bookusinglanguagefilter() {
		//Navigate to  the Home Page
		HomePage homepage=new HomePage(driver);
		String actualhomepageTitle = driver.getTitle();
		String homepageTitle = "Movie Tickets, Plays, Sports, Events & Cinemas near Bengaluru - BookMyShow";
		homepage.getnotnow().click();
		assertEquals(actualhomepageTitle, homepageTitle , "HomePage is not displayed");
		homepage.getplaysmodule().click();

		//Navigate to  the plays module
		PlaysPage playspage=new PlaysPage(driver);
		String actualplaystitle = driver.getTitle();
		String playspagetitle = "Top Upcoming Plays Plays in Bengaluru | Best Live Plays Plays in Bengaluru - BookMyShow";
		assertEquals(actualplaystitle, playspagetitle , "Plays  is not displayed");

		//click on language filter
		WebElement language = playspage.getlanguage();
		language.click();
		String actuallanguagebutton = language.getText();
		String languagebutton = "Language";
		assertEquals(actuallanguagebutton, languagebutton , " language filter is not clicked");

		//select the kannada language
		WebElement kannada = playspage.getkannada();
		kannada.click();
		String actualkannadabutton = kannada.getText();
		String kannadabutton = "Kannada";
		assertEquals(actualkannadabutton, kannadabutton , " kannada language is not selected");

		//select the Hakki Kathe play
		WebElement ammamattusuhilplay = playspage.getammamattusuhilplay();
		String actualammamattusuhilplay = ammamattusuhilplay.getText();
		String expetedammamattusuhilplay = "Hakki Kathe";
		assertEquals(actualammamattusuhilplay, expetedammamattusuhilplay , "AMMA MATTU SUHAIL is not selected");
		ammamattusuhilplay.click();


		//Book the play
		BookPage bookpage=new BookPage(driver);
		String actualbookpagetitle = driver.getTitle();
		String bookpagetitle = "Hakki Kathe Kannada theatre-plays Play in Bengaluru Tickets - BookMyShow";
		assertEquals(actualbookpagetitle, bookpagetitle , "Book page  is not displayed");

		//click on book button
		WebElement bookbutton = bookpage.getbookbutton();
		String actualbookbutton = bookbutton.getText();
		String expetedbookbutton = "Book";
		assertEquals(actualbookbutton, expetedbookbutton , "Book button   is not clicked");
		bookbutton.click();

		//Enter the seats details
		AddSeatsPage addseat=new AddSeatsPage(driver);
		String actualaddseatstitle = driver.getTitle();
		String expetedaddseatstitle = "Movie Tickets, Plays, Sports, Events & Cinemas around you - BookMyShow";
		assertEquals(actualaddseatstitle, expetedaddseatstitle , "Add Seats page   is not displayed");

		//click on add button
		WebElement addbutton = addseat.getaddbutton();
		String actualaddbutton = addbutton.getText();
		String expetedaddbutton = "Add";
		assertEquals(actualaddbutton, expetedaddbutton , "Add button    is not clicked");
		addbutton.click();

		//click on Proceed button
		WebElement Proceedbutton = addseat.getproceedbutton();
		String actualProceedbutton = Proceedbutton.getText();
		String expetedProceedbutton = "Proceed";
		assertEquals(actualProceedbutton, expetedProceedbutton , "Proceed  button    is not clicked");
		Proceedbutton.click();

	}
}
