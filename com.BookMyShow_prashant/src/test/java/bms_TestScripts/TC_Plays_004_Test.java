package bms_TestScripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bms_Generic_lib.BaseClass;
import bms_POM_Repositories.AddSeatsPage;
import bms_POM_Repositories.BookPage;
import bms_POM_Repositories.HomePage;
import bms_POM_Repositories.PlaysPage;
/***
 * 
 * @author Prashanth KB
 *
 */
@Listeners(bms_Generic_lib.ListnerImplementation.class)
public class TC_Plays_004_Test extends BaseClass {

	@Test(groups="smoke")
	public void bookusingbrowsebyvenuefilter() {
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
		
		//click on browse by venue button
		WebElement browsebyvenuebutton = pp.getbrowsebyvenuebutton();
		String actualbrowsebyvenuebutton = browsebyvenuebutton.getText();
		String expetedbrowsebyvenuebutton = "Browse by Venues";
		assertEquals(actualbrowsebyvenuebutton, expetedbrowsebyvenuebutton , "Browse by Venues  is not displayed");
		browsebyvenuebutton.click();
		
		//Infinate loop for to Scroll to RangaShankara Theater
		JavascriptExecutor js= (JavascriptExecutor) driver;
		for(;;) {
			try {
				pp.getRangaShankara().click();
				break;
			}
			catch(NoSuchElementException e) {
				js.executeScript("window.scrollBy(0,800);");
			}
		} 
		//selecting the amma mattu suhil play
		WebElement ammamattusuhilplay = pp.getAatankavaadiyaAakasmikaSaavu();
		String actualammamattusuhilplay = ammamattusuhilplay.getText();
		String expetedammamattusuhilplay = "Aatankavaadiya Aakasmika Saavu";
		assertEquals(actualammamattusuhilplay, expetedammamattusuhilplay , "Aatankavaadiya Aakasmika Saavu");
		ammamattusuhilplay.click();
		
		//Booking the play
		BookPage bp=new BookPage(driver);
		String actualbookpagetitle = driver.getTitle();
		String bookpagetitle = "Aatankavaadiya Aakasmika Saavu Kannada theatre-plays Play in Bengaluru Tickets - BookMyShow";
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