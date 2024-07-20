package practicePrograms;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// Swap 2 variables without using a temp variable.
		
		int a=5;
		int b=10;
		System.out.println("Before");
	    System.out.println(a);
	    System.out.println(b);	
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    
	    System.out.println("After");
	    System.out.println(a);
	    System.out.println(b);

	}

}
