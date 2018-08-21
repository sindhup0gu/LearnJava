/*1. Write a program to find sum of two numbers?*/
import java.util.Scanner;
class SumNumbers{


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number1:");
		int number1=sc.nextInt();
		System.out.println("Enter number2:");
		int number2=sc.nextInt();

		int total= number1+number2;

		System.out.println("Sum of two numbers is:"+ total);




	}
}

