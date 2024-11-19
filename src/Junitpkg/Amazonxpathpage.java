package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonxpathpage{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}

	@Test
	public void testing()
{
		driver.findElement(By.xpath("//Input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//Input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
		
}
}
