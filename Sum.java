/*Q4. (Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93

*/

import java.util.Scanner;

class Sum{

	
	 public static void main(String[] args) {

	 	//promts the user

	 	Scanner sc = new Scanner(System.in);

	 	System.out.println("Enter an interger value:");

	 	int integerValue=sc.nextInt();

	 	// Compute the sum of the digits in the integer.
		int lessThan10 = integerValue % 10;	//  932%10=2	// Extract the digit less than 10
		integerValue /= 10;			       //   932/10=93				// Remove the extracted digit


		int tens = integerValue % 10;	   //93%10=3			// Extract the digit between 10 to 99
		integerValue /= 10;		          //93/10=9					// Remove the extracted digit


		int hundreds = integerValue % 10;	//9%10=9	// Extract the digit between 100 to 999
		integerValue /= 10;					//9/10=0		// Remove the extracted digit
		int sum = hundreds + tens + lessThan10;	

		// Display results
		System.out.println("The sum of the digits is " + sum);
	}
}

