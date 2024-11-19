package pkg;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver obj=new EdgeDriver();
		obj.get("https://www.google.com");
		String etitle="google";
		String atitle=obj.getTitle();
		if(etitle.equalsIgnoreCase(atitle))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}

		String src=obj.getPageSource();
		String etext="About";
		if(src.contains(etext))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		// obj.close();
		obj.quit();
	}

}
