package google;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadEx {

	
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\\\seleniumJar\\\\geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("http://demo.guru99.com/test/upload/");
		//dr.findElement(By.linkText("Insurance Project")).click();
		dr.findElement(By.id("uploadfile_0")).click();
		//Thread.sleep(5000);
		//dr.quit();
		
		
//		dr.get("http://demo.automationtesting.in/Register.html");
//		Thread.sleep(2000);
//		
//		dr.findElement(By.id("imagesrc")).click();
//		Thread.sleep(3000);
//	   StringSelection ss=new StringSelection("C:\\Users\\c29ra\\Documents\\u.txt");
//	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//	   Robot robot=new Robot();
//	   robot.keyPress(KeyEvent.VK_CONTROL);
//	   robot.keyPress(KeyEvent.VK_V);
//	   robot.keyRelease(KeyEvent.VK_V);
//	   robot.keyRelease(KeyEvent.VK_CONTROL);
//	   robot.keyPress(KeyEvent.VK_ENTER);
//	   robot.keyRelease(KeyEvent.VK_ENTER);
//	   Thread.sleep(3000);
//	   
//	   dr.quit();
		
		
		
	}
	
	
}
