package practicePrograms;

public class ArraySort {

	public static void main(String[] args) {
		// Sorting an Array in the ascending or descending order

		int[] a= {5,2,9,7, 15,12,1};
		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			 for(int j=i+1;j<a.length;j++)
			 {
			if (a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
			  
	}
		for(int i=0;i<a.length;i++)
		{
		 System.out.println(a[i]);
		}
  
	}
}
