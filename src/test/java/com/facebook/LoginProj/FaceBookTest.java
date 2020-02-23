package com.facebook.LoginProj;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FaceBookTest {

	
	@Test
	public void launchFB() throws Exception
	{
		
		//System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumJar\\geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		dr.quit();
		
		
		
	}
	
	
	
}
