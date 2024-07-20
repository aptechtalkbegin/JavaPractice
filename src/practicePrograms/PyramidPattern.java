package practicePrograms;

public class PyramidPattern {

	public static void main(String[] args) {
		// Write a program to print * pyramid
		
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
			System.out.print("\t");
			}
			System.out.println();
		}

	}

}
