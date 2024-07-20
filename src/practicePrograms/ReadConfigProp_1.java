package practicePrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigProp_1 {
	public static void main(String args[]) throws IOException
	{
	
		Properties prop = new Properties();
		try {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Files\\config.properties");
		//FileInputStream fis = new FileInputStream("C:\\Users\\Priji\\eclipse-workspace\\AshishJavaPractice\\Files\\config.properties");
		prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	String fname = prop.getProperty("FirstName");
	String lname =	prop.getProperty("LastName");
	System.out.println(fname);
	System.out.println(lname);
		
		
	}

}
