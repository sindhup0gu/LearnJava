/*Q7. (Geometry: distance of two points) Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance between them.
*/



import java.util.Scanner;

class Geometry{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter x1:");
		double x1= sc.nextDouble();

		System.out.println("Enter y1:");
		double y1= sc.nextDouble();

		System.out.println("Enter x2:");
		double x2= sc.nextDouble();

		System.out.println("Enter y2:");
		double y2= sc.nextDouble();


		//calculation

		double x=x2-x1;
		double y=y2-y1;

		double distance=Math.sqrt( Math.pow(x,2)+Math.pow(y,2));
System.out.println("Distance between two points is:"+ distance);

}
}