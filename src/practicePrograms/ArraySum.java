package practicePrograms;

public class ArraySum {

	public static void main(String[] args) {
		// Write a program to accept number of arrays and print the sum of all the array inputs.
		
		int[] arr= { 1,2,3,4,5,6};
		int sum = arraySum(arr);
		
		System.out.println("The sum of given array is : "+ sum);

	}
	
	
	public static int arraySum(int[]a)
	{
		int sum=0;
		
		for (int i=0; i<a.length;i++)
		{
			sum= sum+a[i];
		}
		
		return sum;
		
		
	}

}
