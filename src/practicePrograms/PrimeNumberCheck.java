package practicePrograms;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// To verify whether a number is prime or not, 11%2=1
		
		
		
//		######################################

		// 11%i= 0
		//31
		boolean flag = false;
		int val =30;
		
		for(int i=2;i<=val/2;i++)
		{
			
			if(val%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("it is not prime");
		else
			System.out.println("it is prime");
			
//############################
		
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter a number to verify for prime number: ");
//		int number = sc.nextInt();
//		
////       int a=12;
//       if(!(number%2==0))
//       {
//    	   System.out.println(number +" is a prime number");
//       }
//       else
//       {
//    	   System.out.println(number+" is not a prime number");
//       }

	}

}
