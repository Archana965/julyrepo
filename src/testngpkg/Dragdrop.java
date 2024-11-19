package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragdrop {
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
}
@Test
public void test()
{
	WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement pbank=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement psales=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	WebElement bamt=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement pbamt=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	WebElement samt=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement psamt=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	Actions act=new Actions(driver);
	act.dragAndDrop(bank,pbank).perform();
	act.dragAndDrop(sales,psales).perform();
	act.dragAndDrop(bamt,pbamt).perform();
	act.dragAndDrop(samt,psamt).perform();
	

WebElement button=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
if(button.isDisplayed())
{
	System.out.println("present");
}
else
{
	System.out.println("Not present");
}
}
}





