package Junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Realestateprgm {

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		
	}
	@Test
	public void keralalogin()
	{
		driver.findElement(By.id("ulogin")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("upass")).sendKeys("123tyu");
		driver.findElement(By.id("sub_logbtn")).click();
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
	
}
