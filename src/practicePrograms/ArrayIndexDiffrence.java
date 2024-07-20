package practicePrograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayIndexDiffrence {

	public static void main(String[] args) {
		// compare same indexes of 2 different arrays and create another array for matching values
		
		int[] a = {4,8,3,1,15};
		int[] b = {2,8,3,6,15};
		List<Integer> al = new ArrayList();
		
		for(int i=0;i<a.length;i++)
		{
			if (a[i]==b[i])
             {
            	 al.add(a[i]);
             }
		}
         Object[] c= al.toArray();
         for(Object arr:c)
         {
         System.out.println(arr);
	}
	}

}
