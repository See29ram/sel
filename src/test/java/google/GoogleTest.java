package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	
	
	@Test
	public void launchGoogle() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.com/");
		dr.findElement(By.linkText("Gmail")).click();
                System.out.println("Gmail click Done..");
		Thread.sleep(2000);
		dr.quit();
		
		
		
	}
	
}
