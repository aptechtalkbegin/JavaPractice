package streamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {

	
	//Find even numbers from the list of integer numbers
	public static void main(String[] args) {

     List<Integer> numList = Arrays.asList(2,5,6,3,8,7,15,1,20);
     
     List<Integer> newList = numList.stream().filter(num->num%2==0).collect(Collectors.toList());
     System.out.println(newList);

	}

}
