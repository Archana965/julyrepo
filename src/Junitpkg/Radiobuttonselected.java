package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonselected {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void testing()
	{
		WebElement radiobutton=driver.findElement(By.xpath("//input[1][contains(@name,'gender')]")); 
		boolean l=radiobutton.isSelected();
		if(l)
		{
			System.out.println("radiobutton is present");
		}
		else
		{
			System.out.println("radiobutton is not present");
		}
	}
}
