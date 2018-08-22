/*4.Write a program to check given number is Armstrong number or not?
Description: Armstrong numberÂ is a number that is the sum of its own digits each raised to the power of the number
 of digits is equal to the number itself.
For example:Â 
Three Digits Armstrong number is 153, 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 153Â 
Four Digits Armstrong number is 1634, 1 ^ 4 + 6 ^ 4 + 3 ^ 4 + 4 ^ 4 + = 1634
*/


import java.util.Scanner;

class Armstrong{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an input number:");

		int inputValue= sc.nextInt();
		sc.close();

		int temp=inputValue;

		int digits=0;
		while(temp>0){
			temp=temp/10;
			digits++;
		}

		temp=inputValue;
		int sum=0;

		while(temp>0){
			int extractedNumber=temp%10;
			temp=temp/10;
			sum= sum+(int)Math.pow(extractedNumber,digits);
		}

		if (inputValue==sum){
			System.out.println("Yes, it is an Armstrong number");
		}else{
			System.out.println("No, it is not an Armstrong number");
		}
 	}
}