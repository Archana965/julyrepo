package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	}
	@Test
	public void testing()
	{
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");		
		driver.findElement(By.name("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("archa");
		driver.findElement(By.id("last-name")).sendKeys("prakash");
		driver.findElement(By.id("postal-code")).sendKeys("654345");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		
	}
	
}