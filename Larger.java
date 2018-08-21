/*5. Write a program to Find Largest Number Among Three Numbers
Input three number from user and compare these number with each others and find largest number among these three numbers. 

*/


import java.util.Scanner;

class Larger{


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number1:");
		int number1= sc.nextInt();


		System.out.println("Enter number2:");
		int number2=sc.nextInt();


		System.out.println("Enter number3:");
		int number3=sc.nextInt();

		sc.close();


		if(number1>number2&&number1>number3)
		{

			System.out.println(number1 + "is greater among number2 and number3");

		}

		else if(number2>number1&&number2>number3)
		{

			System.out.println(number2 + "is greater among number1 and number3");
		}

		else if(number3>number1&&number3>number2)
		{

			System.out.println(number3 + "is greater among number1 and number2");

		}


		
	}
}