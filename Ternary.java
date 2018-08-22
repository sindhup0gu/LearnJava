/*1. Find largest number among three numbers using ternary operator?*/

import java.util.Scanner;
class Ternary{
		
	

	public static void main(String[] args) {

	


		Scanner sc= new Scanner(System.in);

		System.out.println("Enter number1:");

		 int num1= sc.nextInt();
		System.out.println("Enter number1:");
		  int num2= sc.nextInt();
		System.out.println("Enter number1:");
		  int num3= sc.nextInt();

		sc.close();

				int result = num3 > (num1>num2 ? num1:num2) ? num3:((num1>num2) ? num1:num2);


		System.out.println(result);



		




	}
}
