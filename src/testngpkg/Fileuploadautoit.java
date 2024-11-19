package testngpkg;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadautoit {
	ChromeDriver driver;
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		driver=new ChromeDriver();
			
	}

	@Test
	public void testing() throws AWTException, InterruptedException, IOException 
	{
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");	
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();//BUTTON CLICK
		Thread.sleep(3000);
		Runtime.getRuntime().exec("\"C:\\Users\\ADARSH\\Downloads\\AutoItFolder\\ilovepdffileupload.exe\"");
		Thread.sleep(3000);
	}
}

