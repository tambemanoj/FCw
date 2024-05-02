package utilites;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	
	static RemoteWebDriver driver = null;

	@BeforeMethod
    public static void bowserinstance()
    {
//        System.out.println( "Test cases started" );
//    	ChromeOptions options = new ChromeOptions();
//		options.addArguments("incognito");
//		options.setBrowserVersion("118");
		driver = new ChromeDriver();
		
		driver.get("https://meta.com");
    }
	
	@AfterMethod
	public static void closebrowser() {
//		driver.close();
	}

}

