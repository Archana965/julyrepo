package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Fbloginpage;

public class Fblogintest {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void testlogin()
{
	Fbloginpage ob=new Fbloginpage(driver);
	ob.setvalues("arc@gmail.com", "adadc");
	ob.login();
	
	
	//Fbcreatepage ob1=new Fbcreatepage(driver);
}
}

