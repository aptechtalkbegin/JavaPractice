package practicePrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo {

	public static void main(String[] args) {
    //This program is to find, how many times a number is repeated in the given number
	// And print the count of the numbers.
		
		int arr[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,8,8,8};
		HashMap<Integer,Integer> duplicates = new HashMap<Integer,Integer>();
		
		for (int number: arr)
		{
			if(duplicates.containsKey(number))
			{
				duplicates.put(number,duplicates.get(number)+1);
			}else
			
			 duplicates.put(number, 1);
		}
           System.out.println(duplicates);
           
           //To iterate and print the HashMap contents in the key and value form
           for(Map.Entry<Integer,Integer> entry : duplicates.entrySet())
           {
        	   System.out.println("Key :"+ entry.getKey()+ " Value :"+entry.getValue());
           }
	}

}
