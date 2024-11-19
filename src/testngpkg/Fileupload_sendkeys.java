package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload_sendkeys {
	ChromeDriver driver;
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		driver=new ChromeDriver();
			
	}
	@BeforeMethod(alwaysRun=true)
	public void beforemthd()
	{
		driver.get("https://demo.guru99.com/test/upload/");	
	}
	@Test
	public void testing() 
	{
		WebElement fileupload=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		fileupload.sendKeys("C:\\Users\\ADARSH\\Desktop\\works\\TEST SCENARIOS.docx");
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		checkbox.click();
		WebElement button=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		String text=button.getText();
		if(text.equals("submit")) {
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		button.click();
		
		
		
	}

}

