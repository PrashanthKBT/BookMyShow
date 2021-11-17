package bms_TestScripts;

import static org.testng.Assert.assertEquals;
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

 public class TC_Plays_003_Test extends BaseClass {
	@Test(groups="regression")
	public void bookusinggeneresfilter() {
		//Navigate to the Home Page
		HomePage homepage=new HomePage(driver);
		String actualhomepageTitle = driver.getTitle();
		String homepageTitle = "Movie Tickets, Plays, Sports, Events & Cinemas near Bengaluru - BookMyShow";
		homepage.getnotnow().click();
		assertEquals(actualhomepageTitle, homepageTitle , "HomePage is not displayed");
		homepage.getplaysmodule().click();

		//Navigate the Plays Page 
		PlaysPage playspage=new PlaysPage(driver);
		String actualplaystitle = driver.getTitle();
		String playspagetitle = "Top Upcoming Plays Plays in Bengaluru | Best Live Plays Plays in Bengaluru - BookMyShow";
		assertEquals(actualplaystitle, playspagetitle , "Plays  is not displayed");
		
		//click on Generes 
		WebElement genres = playspage.getGenres();
		String actualgenresbutton = genres.getText();
		String expetedgenresbutton = "Genres";
		assertEquals(actualgenresbutton, expetedgenresbutton , "generes button  is not clicked");
		genres.click();
		
		//click on drama
		WebElement drama = playspage.getdrama();
		String actualdramabutton = drama.getText();
		String expeteddramabutton = "Drama";
		assertEquals(actualdramabutton, expeteddramabutton , "drama button  is not clicked");
		drama.click();
		
		//select the The Note Play
		WebElement thenoteplay = playspage.getthenote();
		String actualthenoteplay = thenoteplay.getText();
		String expetedthenoteplay = "The Note";
		assertEquals(actualthenoteplay, expetedthenoteplay , "the note play is not selected");
		thenoteplay.click();
		
		//Book the play
		BookPage bookpage=new BookPage(driver);
		WebElement bookbutton = bookpage.getbookbutton();
		String actualbookbutton = bookbutton.getText();
		String expetedbookbutton = "Book";
		assertEquals(actualbookbutton, expetedbookbutton , "Book button   is not clicked");
		bookbutton.click();
		
		//select the timing
		WebElement sat11december7PM = bookpage.getsat11december7PM();
		String actualsat11december7PM = sat11december7PM.getText();
		String expetedsat11december7PM = "7:00 PM";
		assertEquals(actualsat11december7PM, expetedsat11december7PM , "7 PM Book button   is not clicked");
		sat11december7PM.click();

		//click  on continue
		WebElement continuebutton = bookpage.getContinue();
		String actualcontinuebutton = continuebutton.getText();
		String expetedcontinuebutton = "Continue";
		assertEquals(actualcontinuebutton, expetedcontinuebutton , "continue button   is not clicked");
		continuebutton.click();
		
	
		AddSeatsPage addseat=new AddSeatsPage(driver);
		//click on add button
		WebElement addbutton = addseat.getaddbutton();
		String actualaddbutton = addbutton.getText();
		String expetedaddbutton = "Add";
		assertEquals(actualaddbutton, expetedaddbutton , "Add button    is not clicked");
		addbutton.click();

		//clicking on Proceed button
		WebElement Proceedbutton = addseat.getproceedbutton();
		String actualProceedbutton = Proceedbutton.getText();
		String expetedProceedbutton = "Proceed";
		assertEquals(actualProceedbutton, expetedProceedbutton , "Proceed  button    is not clicked");
		Proceedbutton.click();


	}
}