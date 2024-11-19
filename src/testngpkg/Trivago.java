package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivago {

	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.trivago.com/");
	}
	@Test
	public void testing()
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section/div[2]/div/div[4]/div/div/fieldset/button[1]/span/span[2]/span[1]"));
		
	}
}




