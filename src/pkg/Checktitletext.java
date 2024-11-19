package pkg;

import org.openqa.selenium.edge.EdgeDriver;

public class Checktitletext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       EdgeDriver obj=new EdgeDriver();
       obj.get("https://www.vpslakeshorehospital.com/");
       String etitle="vpslakeshorehospital";
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
       String etext="robotics";
       if(src.contains(etext))
       {
    	   System.out.println("Pass");
       }
       else
       {
    	   System.out.println("Fail");
       }
       obj.quit();
	}

}
