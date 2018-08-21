/*4. Write a program to Swap two numbers without using third variable?*/

import java.util.Scanner;
class Swapping{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.println("enter value of a :");

		int a= sc.nextInt();
		System.out.println("enter b:");

		int b= sc.nextInt();


		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("Swapping of a and b is:"+ a +"\t"+b);




	}


}
