package JavaPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {

	 //Approach-1 FileReader and BufferedReader classes
		
      FileReader file = new FileReader(System.getProperty("user.dir")+ "\\Files\\textRead.txt");
      
      BufferedReader br= new BufferedReader(file);
      
      String str;
      while ((str = br.readLine())!= null)
      {
    	  System.out.println(str);
      }
      br.close();
	

	
	//Approach-2 using scanner and file classes
	
	try {
     File fi = new File(System.getProperty("user.dir")+"Files\\textRead.txt");
     Scanner sc = new Scanner (fi);
     while (sc.hasNext())
     {
    	 System.out.println(sc.nextLine());
     }
	
	}catch (Exception e)
	{
		System.out.println(e.getMessage());
	}

}

}