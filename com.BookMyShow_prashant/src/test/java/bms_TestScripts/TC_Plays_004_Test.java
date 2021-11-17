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
@Listeners(bms_Generic_lib.ITestListnerImplementation.class)
public class TC_Plays_004_Test extends BaseClass {

	@Test(groups="smoke")
	public void bookusingbrowsebyvenuefilter() {
		//Navigating to the Home Page
		HomePage homepage=new HomePage(driver);
		String actualhomepageTitle = driver.getTitle();
		String homepageTitle = "Movie Tickets, Plays, Sports, Events & Cinemas near Bengaluru - BookMyShow";
		homepage.getnotnow().click();
		assertEquals(actualhomepageTitle, homepageTitle , "HomePage is not displayed");
		homepage.getplaysmodule().click();

		//Navigating the plays module
		PlaysPage playspage=new PlaysPage(driver);
		String actualplaystitle = driver.getTitle();
		String playspagetitle = "Top Upcoming Plays Plays in Bengaluru | Best Live Plays Plays in Bengaluru - BookMyShow";
		assertEquals(actualplaystitle, playspagetitle , "Plays  is not displayed");

		//click on browse by venue button
		WebElement browsebyvenuebutton = playspage.getbrowsebyvenuebutton();
		String actualbrowsebyvenuebutton = browsebyvenuebutton.getText();
		String expetedbrowsebyvenuebutton = "Browse by Venues";
		assertEquals(actualbrowsebyvenuebutton, expetedbrowsebyvenuebutton , "Browse by Venues  is not displayed");
		browsebyvenuebutton.click();

		//Infinate loop for to Scroll to RangaShankara Theater
		JavascriptExecutor js= (JavascriptExecutor) driver;
		for(;;) {
			try {
				playspage.getRangaShankara().click();
				break;
			}
			catch(NoSuchElementException e) {
				js.executeScript("window.scrollBy(0,800);");
			}
		} 
		//select the amma mattu suhil play
		WebElement ammamattusuhilplay = playspage.getAatankavaadiyaAakasmikaSaavu();
		String actualammamattusuhilplay = ammamattusuhilplay.getText();
		String expetedammamattusuhilplay = "Aatankavaadiya Aakasmika Saavu";
		assertEquals(actualammamattusuhilplay, expetedammamattusuhilplay , "Aatankavaadiya Aakasmika Saavu");
		ammamattusuhilplay.click();

		//Book the play
		BookPage bookpage=new BookPage(driver);
		String actualbookpagetitle = driver.getTitle();
		String bookpagetitle = "Aatankavaadiya Aakasmika Saavu Kannada theatre-plays Play in Bengaluru Tickets - BookMyShow";
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