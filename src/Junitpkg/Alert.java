package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
ChromeDriver driver;
@Before
public void setup()
{
  driver=new ChromeDriver();
  driver.get("file:///C:/Users/ADARSH/Desktop/alert.html");
  driver.manage().window().maximize();
}
@Test
public void testing()
{
	driver.findElement(By.xpath("//input[@input type='button']")).click();
	Alert a=driver.switchTo().alert();
	String s=a.getText();
	System.out.println("alert messages"+s);
	a.accept();
	driver.findElement(By.name("//input[@name='firstname']")).sendKeys("arya");
	driver.findElement(By.name("//input[@name='lastname']")).sendKeys("prakash");
	driver.findElement(By.xpath("//input[@value='submit']")).click();
}
	
}
