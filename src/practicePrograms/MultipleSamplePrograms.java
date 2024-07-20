//package practicePrograms;
//
//public class MultipleSamplePrograms {
//
//	
//	
//	• Swapping two numbers
//	• Reversing a number
//	• Reversing a string
//	• Checking if a number is a palindrome
//	• Checking if a string is a palindrome
//
//	𝐏𝐫𝐨𝐠𝐫𝐚𝐦 1️⃣: 𝐒𝐰𝐚𝐩 2 𝐍𝐮𝐦𝐛𝐞𝐫𝐬
//
//	public class SwapExample {
//	public static void main(String[] args) {
//	int a = 5, b = 10;
//	System.out.println("Before swap: a = " + a + ", b = " + b);
//	a = a + b - (b = a);
//	System.out.println("After swap: a = " + a + ", b = " + b);
//	}
//	}
//
//	𝐎𝐮𝐭𝐩𝐮𝐭: 
//	Before swap: a = 5, b = 10
//	After swap: a = 10, b = 5
//	-----------------------------------------------------------------------------
//
//	𝐏𝐫𝐨𝐠𝐫𝐚𝐦 2️⃣: 𝐑𝐞𝐯𝐞𝐫𝐬𝐞 𝐚 𝐧𝐮𝐦𝐛𝐞𝐫
//
//	public class ReverseNumber {
//	public static void main(String[] args) {
//	int number = 12345, reversed = 0;
//	System.out.println("Original number: " + number);
//	for (; number != 0; number /= 10) reversed = reversed * 10 + number % 10;
//	System.out.println("Reversed number: " + reversed);
//	}
//	}
//
//	𝐎𝐮𝐭𝐩𝐮𝐭:
//	Original number: 12345
//	Reversed number: 54321
//	-----------------------------------------------------------------------------
//	𝐏𝐫𝐨𝐠𝐫𝐚𝐦 3️⃣: 𝐑𝐞𝐯𝐞𝐫𝐬𝐞 𝐚 𝐬𝐭𝐫𝐢𝐧𝐠
//
//	public class ReverseString {
//	public static void main(String[] args) {
//	String original = "Hello World";
//	String reversed = new StringBuilder(original).reverse().toString();
//	System.out.println("Original string: " + original);
//	System.out.println("Reversed string: " + reversed);
//	}
//	}
//
//	𝐎𝐮𝐭𝐩𝐮𝐭:
//	Original string: Hello World
//	Reversed string: dlroW olleH
//	-----------------------------------------------------------------------------
//	𝐏𝐫𝐨𝐠𝐫𝐚𝐦 4️⃣: 𝐏𝐚𝐥𝐢𝐧𝐝𝐫𝐨𝐦𝐞 𝐧𝐮𝐦𝐛𝐞𝐫
//
//	public class PalindromeNumber {
//	public static void main(String[] args) {
//	int number = 12321;
//	boolean isPalindrome = (number == Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString()));
//	System.out.println("Is " + number + " a palindrome? " + isPalindrome);
//	}
//	}
//
//	𝐎𝐮𝐭𝐩𝐮𝐭: 
//	Is 12321 a palindrome? true
//	-----------------------------------------------------------------------------
//	𝐏𝐫𝐨𝐠𝐫𝐚𝐦 5️⃣: 𝐩𝐚𝐥𝐢𝐧𝐝𝐫𝐨𝐦𝐞 𝐬𝐭𝐫𝐢𝐧𝐠
//
//	public class PalindromeString {
//	public static void main(String[] args) {
//	String original = "madam";
//	boolean isPalindrome = original.equals(new StringBuilder(original).reverse().toString());
//	System.out.println("Is \"" + original + "\" a palindrome? " + isPalindrome);
//	}
//	}
//
//	𝐎𝐮𝐭𝐩𝐮𝐭:
//	Is "madam" a palindrome? true
//	
//	
//	
//	
//}
