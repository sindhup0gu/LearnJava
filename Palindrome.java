/*2. Write a program to check the given number is palindrome or not?
Descritpion : A Palindrome number is a number that remains the same when its digits are reversed. 
Like 16461, for example: we take 121 and reverse it, after revers it is same as original number.

*/

import java.util.Scanner;
class Palindrome{

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);

		System.out.println("Enter an input number:");
		int inputValue=sc.nextInt();

		sc.close();

		//local variables

		int temp=inputValue;
		int sum=0;

	

		while(inputValue>0){

		int remainderExtract=inputValue%10;
		inputValue=inputValue/10;

		sum=sum*10+remainderExtract;
	}

	if(temp==sum){
		System.out.println("The given number is palindrome");

	}
	else{

		System.out.println("The given number is not a palindrome");
	}
	}
}