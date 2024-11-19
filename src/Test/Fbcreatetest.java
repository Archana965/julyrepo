package Test;

import org.testng.annotations.Test;

import Page.Fbcreatepage;

public class Fbcreatetest {

	@Test
	public void createtest()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.pageclick();
		ob.getstartedbutton();
	}
}
