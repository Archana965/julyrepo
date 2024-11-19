package Junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;

import org.junit.Test;

public class Responsecode {
String link="https://www.google.com";

@Test
public void test() throws Exception
{
	URI obj=new URI(link);
	HttpURLConnection con=(HttpURLConnection) obj.toURL().openConnection();
	int code=con.getResponseCode();
	System.out.println("responsecode="+code);
}
	
	
}
