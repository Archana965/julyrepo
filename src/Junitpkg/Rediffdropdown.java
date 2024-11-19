package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdropdown 
{
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
	WebElement day=driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
	Select s=new Select(day);
	s.selectByValue("02");
	WebElement Month=driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
	Select s1=new Select(Month);
	s1.selectByVisibleText("JAN");
	WebElement year=driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
Select s2=new Select(year);
s2.selectByIndex(1);
}

@Test
public void text()
{
	WebElement button=driver.findElement(By.xpath("//input[contains(name,'asdfdff')]"));
	String button_text=button.getAttribute("value");
	if(button_text.equals("Check availability"))
	{
		System.out.println(button_text);
	}
	else
	{
		System.out.println("no");
	}
}

}