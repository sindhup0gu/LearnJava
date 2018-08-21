/*Q1: (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
*/
import java.util.Scanner;

class Temperature{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the temperature in celsius:");

		double celsiusDegree=sc.nextDouble();

		double fahrenheit =  (9.0/5) * celsiusDegree + 32;

		System.out.println("The fahrenheit temperature is:"+ fahrenheit);

      }

}