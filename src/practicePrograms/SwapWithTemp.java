package practicePrograms;

public class SwapWithTemp {

	public static void main(String[] args) {
		// Swap 2 variables by using temp variable.

		int a=5;
		int b=10;
		System.out.println("Before Swap");
		System.out.println(a);
		System.out.println(b);
		
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swap");
		System.out.println(a);
		System.out.println(b);

	}

}
