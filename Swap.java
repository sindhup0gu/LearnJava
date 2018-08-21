/*3. Write a java program to swap two variables?*/
import java.util.Scanner;
class Swap{

	static int temp;

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number1:");

		int number1=sc.nextInt();
		System.out.println("Enter number2:");
		int number2=sc.nextInt();

		temp=number1;
		number1=number2;
		number2=temp;

		System.out.println("Swap is:"+ number1 + "\t" + number2);

		

	}
}
