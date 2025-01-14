package testngpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void testing() throws IOException, InterruptedException 
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\ADARSH\\Desktop\\book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int r=sh.getLastRowNum();
		for(int i=1;i<=r;i++)
		{
			String email=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("email");
			driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("password");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
			
		}
	}
}
