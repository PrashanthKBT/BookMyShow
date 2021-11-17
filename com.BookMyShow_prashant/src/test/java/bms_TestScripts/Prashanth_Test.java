package bms_TestScripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import bms_Generic_lib.BaseClass;
import bms_POM_Repositories.HomePage;

public class Prashanth_Test extends BaseClass {
	@Test(groups="smoke")
	public void bookusinglanguagefilter() {
		//Entering the Home Page
		HomePage ho=new HomePage(driver);
		String actualhomepageTitle = driver.getTitle();
		String homepageTitle = "Movie Tickets, Plays, Sports, Events & Cinemas near Bengaluru - BookMyShow";
		ho.getnotnow().click();
		assertEquals(actualhomepageTitle, homepageTitle , "HomePage is not displayed");
		ho.getplaysmodule().click();
}
}
