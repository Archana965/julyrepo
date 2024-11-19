package Junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://google.com");
}

@Test
public void titleverfication()
{
	String atitle=driver.getTitle();
	String etitle="google";
	if(atitle.equals(etitle))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
@After
public void teardown()
{
	driver.quit();
}
}
