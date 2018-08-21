/*
2. Write a program to reverse number?
Description : Reverse numberÂ means reverse the position of all digits of any number. For example reverse of 839 is 938. 
Hint: For this program you need modulus operator concept and while loop, while loop is used for check condition and modulus
 used for find the remainder.
*/
import java.util.Scanner;

 public class Reverse{

 	public static int reverse(int input){
 		int quotient = input;
 		int result=0;
 		int remainder=0;
	 	while(quotient!=0){
	 		remainder=quotient%10;
	 		result=remainder+(result*10);
	 		quotient=quotient/10;

	 	}

	 	return result;
 	}

 	public static void main(String[] args) {

 		Scanner sc= new Scanner(System.in);
 		System.out.println("Enter input value:");
 		 int input=sc.nextInt();
 		sc.close();

 		 System.out.println(reverse(input));
 	}

}



