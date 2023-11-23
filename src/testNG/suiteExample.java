package testNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class suiteExample {
long starttime;
long endtime,testtime;
WebDriver driver;
	@BeforeSuite
	public void launchBrowser()
	{
		starttime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
			}
	
	@Test
	public void openGoogle()
	{
	
		driver.get("http://www.google.co.in");
		}
	@Test
	public void openYahoo()
	{
		driver.get("http://www.yahoo.co.in");
		}
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
		endtime=System.currentTimeMillis();
		testtime=endtime-starttime;
		System.out.println("Duration of Test: "+testtime);
		
	}
}
