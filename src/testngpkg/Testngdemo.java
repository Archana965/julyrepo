package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {

@BeforeTest(alwaysRun = true)
public void setup()
{
	System.out.println("beforetest,browser open");
}
	
	@BeforeMethod(alwaysRun = true)
	public void mthd()
	{
		System.out.println("url loading");
	}
	@Test(priority = 2,invocationCount = 3,dependsOnMethods = {"test2"},groups = "sanity")
		public void test1()
		{
			System.out.println("test1");
		}
	@Test(priority = 4,groups = {"smoke","sanity"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority = 1,groups ={"regression"})
	public void test3()
	{
		System.out.println("test3");
	}
	@Test(priority = 3,groups = {"regression"})
	public void test4()
	{
		System.out.println("test4");
	}
	@AfterMethod
	public void aftmthd()
	{
		System.out.println("After method ");
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("After test");
	}
	
	
	}
	
	

