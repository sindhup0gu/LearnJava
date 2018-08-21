/*Q2: (Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * pi
volume = area * length

*/

import java.util.Scanner;

class Cylinder{

	static float pi=3.14f;

	public static void main(String[] args) {

		

		//prompts the user

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius:");
		double radius= sc.nextDouble();
        System.out.println("Enter length:");
		double length= sc.nextDouble();

		double area = radius * radius * pi;
		double volume = area * length;

		System.out.println("The area of cylinder is:"+ area);
		System.out.println("The volume of cylinder is:"+ volume);


	 	
	 }
}