package bms_TestScripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
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
public class TC_Plays_005_Test extends BaseClass {
	@Test(groups="smoke")
	public void bookusingpricefilter() throws EncryptedDocumentException, IOException {
		//Navigate to  the Home Page
		HomePage homepage=new HomePage(driver);
		String actualhomepageTitle = driver.getTitle();
		String homepageTitle = "Movie Tickets, Plays, Sports, Events & Cinemas near Bengaluru - BookMyShow";
		homepage.getnotnow().click();
		assertEquals(actualhomepageTitle, homepageTitle , "HomePage is not displayed");
		homepage.getplaysmodule().click();

		//Navigate to the Plays Page 
		PlaysPage playpage=new PlaysPage(driver);
		String actualplaystitle = driver.getTitle();
		String playspagetitle = "Top Upcoming Plays Plays in Bengaluru | Best Live Plays Plays in Bengaluru - BookMyShow";
		assertEquals(actualplaystitle, playspagetitle , "Plays page is not displayed");

		//click on price filter
		WebElement pricebutton = playpage.getprice();
		String actualpricebutton = pricebutton.getText();
		String exptedpricebutton = "Price";
		assertEquals(actualpricebutton, exptedpricebutton , "price button   is not clicked");
		pricebutton.click();

		//select 0-500 price range
		WebElement price0to500 = playpage.getprice0to500();
		String actualprice0to500 = price0to500.getText();
		String expetedprice0to500 = "0 - 500";
		assertEquals(actualprice0to500, expetedprice0to500 , "price rage of 0-500 button   is not clicked");
		price0to500.click();

		////select the Hakki Kathe play
		WebElement ammamattusuhilplay = playpage.getammamattusuhilplay();
		String actualammamattusuhilplay = ammamattusuhilplay.getText();
		String expetedammamattusuhilplay = "Hakki Kathe";
		assertEquals(actualammamattusuhilplay, expetedammamattusuhilplay , "AMMA MATTU SUHAIL is not selected");
		ammamattusuhilplay.click();

		//	//Booking the play
		BookPage bookpage=new BookPage(driver);
		String actualbookpagetitle = driver.getTitle();
		String bookpagetitle = "Hakki Kathe Kannada theatre-plays Play in Bengaluru Tickets - BookMyShow";
		assertEquals(actualbookpagetitle, bookpagetitle , "Book page  is not displayed");

		//clicking on book button
		WebElement bookbutton = bookpage.getbookbutton();
		String actualbookbutton = bookbutton.getText();
		String expetedbookbutton = "Book";
		assertEquals(actualbookbutton, expetedbookbutton , "Book button   is not clicked");
		bookbutton.click();

		// entering the seats details
		AddSeatsPage addseat=new AddSeatsPage(driver);
		String actualaddseatstitle = driver.getTitle();
		String expetedaddseatstitle = "Movie Tickets, Plays, Sports, Events & Cinemas around you - BookMyShow";
		assertEquals(actualaddseatstitle, expetedaddseatstitle , "Add Seats page   is not displayed");

		//clicking on add button
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

		//as.getLogintoProceed().click();
		//driver.findElement(By.xpath("//button[text()='Login to Proceed']")).click();
		//driver.findElement(By.xpath("//button[@data-id='proceed-home-delivery']")).click();
	}
}
