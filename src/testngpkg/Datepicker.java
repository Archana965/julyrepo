package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
	}
	@Test
	public void testing()
	{
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		datepickermthd("December 2024","29");
	}
	  private void datepickermthd(String expmonth, String expdate) {
	       
	        while (true) 
	        	
	        {
	        	 String month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
	             
	             
	            if (month.equalsIgnoreCase(expmonth))
	            {
	                break;
	            }
	            else 
	            {
	                driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();

	            }
	        }
	        
	        List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
	        for (WebElement d : dates) {
	            if (d.getText().equals(expdate)) {
	                d.click();
	                break;
	                	
	                
	            }
	        }
	    }
	}
	

//*[@id=\"datepicker1\"]
