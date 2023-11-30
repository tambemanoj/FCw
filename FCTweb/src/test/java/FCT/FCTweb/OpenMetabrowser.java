package FCT.FCTweb;

import org.testng.annotations.Test;


import pageObject.Open_Meta_Browser;
import utilites.TestBase;

public class OpenMetabrowser extends TestBase{
	
	@Test
	public static void openBrowser() {
		Open_Meta_Browser ob = new Open_Meta_Browser();
		ob.openBrowser();
		
	}

}
