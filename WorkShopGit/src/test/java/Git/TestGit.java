package Git;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGit {
	WebDriver driver; 
	@org.junit.Before
public void initData() {
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		  String url = "http:\\www.google.com";
		  driver = new ChromeDriver();
		  driver.get(url);
		  
	 }
	 

	
	@org.junit.Test
	public void googleTitleMustBeCorrect() {
		String actualresult = driver.getTitle(); 
		String expectresult = "Google";
		Assert.assertEquals(actualresult,expectresult);
	}
	@org.junit.Test
	public void googleTitleMustBeFailed() {
		String actualResult = driver.getTitle();
		String expectResult = "Narjess";
		Assert.assertNotSame(actualResult,expectResult);
		
	}
	@org.junit.After
	 public void tearDown() {
		 driver.close();
		 driver.quit();
	 }
	
	
	 
}


