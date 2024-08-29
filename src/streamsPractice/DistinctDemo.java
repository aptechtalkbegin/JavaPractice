package streamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Ram","Mohan","Tom","Andy","Ram","Tom","Smith");
 
		List<String> distinctFruitList = fruits.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctFruitList);
	}

}
