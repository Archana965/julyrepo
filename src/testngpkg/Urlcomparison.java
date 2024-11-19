package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Urlcomparison {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void testing()
	{
		driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("archanaprabhakar123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
		String eurl="https://keralaproperty.in/member/myhome/";
		Thread.sleep(3000);
		String aurl=driver.getCurrentUrl();
		if(eurl.equalsIgnoreCase(aurl));
		{
			System.out.println("same");
		}
		else
	
			System.out.println("different");
		
	}
}























