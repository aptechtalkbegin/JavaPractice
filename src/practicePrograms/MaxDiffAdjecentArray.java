package practicePrograms;

public class MaxDiffAdjecentArray {

	public static void main(String[] args) {
		//write a program which will accept an array and in that array find the Max difference between any adjacent index in array
      
		int [] arr = {2,3,5,11,14,24};
		
		int maxDiff=0;

		for(int i=0;i<arr.length-1;i++)
		{
			
			if((arr[i+1]-arr[i])>maxDiff)
			{
				maxDiff=arr[i+1]-arr[i];
			}
		}
		System.out.println("Maximum diff in the given array is : "+ maxDiff);

	}
}
