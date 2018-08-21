/*Q6: (Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
*/

import java.util.Scanner;
class HealthApplication{

public static void main(String[] args) {

	final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;

	//prompts the user

	Scanner sc = new Scanner(System.in);
			// Prompt the user to enter a weight in pounds


	System.out.println("Enter your weight in pounds:");
	double weight=sc.nextDouble();
		// Prompt the user to enter height in inches

	System.out.println("Enter your height in inches:");
	double height=sc.nextDouble();


		// Convert weight to kilograms
		weight = weight * KILOGRAMS_PER_POUND;

		// Convert height to meters
		height = height * METERS_PER_INCH;

		// Compute BMI
		double bodyMassIndex = weight / Math.pow(height, 2);

		// Display result
		System.out.println("BMI is " + bodyMassIndex);

	
}
}