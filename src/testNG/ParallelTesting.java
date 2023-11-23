package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
WebDriver driver;
@Test
	public void openGoogle()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		
			}
@Test
	public void openYahoo()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		
	driver.get("http://www.yahoo.co.in");
	}
}
