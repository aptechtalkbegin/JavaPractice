package practicePrograms;

public class MultiplicationWithoutMultiply {

	public static void main(String[] args) {
		// write a method which will accept 2 integers and do the multiplication between 2 integer values
        // without using multiplication operator (*)
           
		int multiplicationResult = multiplicationWithoutMultiply(5,10);
		System.out.println(multiplicationResult);
	}
	
	
	public static int multiplicationWithoutMultiply(int i, int j)
	{    int result=0;
	      int k=1;
	      while(k<=j)
	      {
	    	  result= result+i;
	    			  k++;
	      }
		return result;
	}

}
