package practicePrograms;

public class FibonocciSeriesUsingSwapVar {

	public static void main(String[] args) {
		// Print Fibanocci Series by swapping variables (1,2,3,5,8,13,21)
		int a=0;
		int b=1;
        int sum =0;
        int i=1;
        while(i<8)
        	
        {
        	sum=a+b;
        	System.out.println(sum);
        	a=b;
        	b=sum;
        	i++;
        }
       

		
	}

}
