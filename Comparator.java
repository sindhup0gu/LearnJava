/*2. Write a program to find given number is odd or even?*/
import java.util.Scanner;
class Comparator{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the number:");
		int number=sc.nextInt();

		if(number%2==0){

			System.out.println("The given number is even");
		}

		else
		{
			System.out.println("The given number is odd");
		}




	}


}
