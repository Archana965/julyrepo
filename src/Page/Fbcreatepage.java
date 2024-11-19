package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage {
WebDriver driver;

@FindBy(id="email")
WebElement fbemail;

@FindBy(id="pass")
WebElement fbpassword;

@FindBy(id="login")
WebElement fblogin;


public Fbcreatepage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void setvalues(String email,String password)
{
	fbemail.sendKeys(email);
	fbpassword.sendKeys(password);
}
public void login()
{
	fblogin.click();
}


	
}

