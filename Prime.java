/*5. Write a program to check the given number is prime or not?*/

import java.util.Scanner;
class Prime
{


	 public static void main(String[] args) 
	 {
		int i, count=0;

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a number:");

		int number = sc.nextInt();

		sc.close();


		for (i = 2; i <= number/2; i++)
		{
			if(number % i == 0)
		    {
				count++;
		        break;
		    }	
		}
		if(count == 0 && number != 1 )
		{
			System.out.println( number + " is a Prime Number");
		}
		else
		{
		   System.out.println(number + " is Not a Prime Number");
		}
	}
}