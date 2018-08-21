/*
Q3. (Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
*/

import java.util.Scanner;

class FinancialApplication{

	 public static void main(String[] args) {

	 	//promts the user

     Scanner sc=new Scanner(System.in);

     System.out.println("Enter the subtotal:");

      double subtotal = sc.nextDouble();
      System.out.println("Enter the gratuity rate:");
      double gratuityRate = sc.nextDouble();

      //calculation

      double gratuity = gratuityRate*subtotal/100;

      double total = gratuity+subtotal;

      //display

      System.out.println("The gratuity is :" +"$"+ gratuity);
      System.out.println("The total is :" +"$"+ total);

		
	}
}