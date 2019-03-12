package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TCS_003 {
	
	
	@Test
	
	public void testcases01()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/krishnanv/git/E2EIntegration/E2ESeleniumJenkins/Driver/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Kanna");
		driver.findElement(By.id("pass")).sendKeys("abc123");
		driver.quit();
	}
	

}
