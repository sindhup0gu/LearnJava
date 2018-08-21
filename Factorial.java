/*1. Write a program to find factorial?
Description: Factorial of any numberÂ is the product of an integer and all the integers 
below it for example factorial of 4 is 4! = 4 * 3 * 2 * 1 = 24.

or

4!=1*2*3*4
*/


import java.util.Scanner;
class Factorial{

 public static int fact(int number){

 		int result=1;

 		for (int i=1;i<=number;i++){

 			result=result*i;
 		}
 		return result;
 }

public static int add(int a, int b){
	return a+b;
}
 public static void main(String[] args) {
 	
 	Scanner sc= new Scanner(System.in);

 	System.out.println("Enter a number:");

 	int number= sc.nextInt();

 	sc.close();

 	int result = fact(number);

 	System.out.println(result);
 	System.out.println(Factorial.add(2,5));

 
 }
}


         