
/*Q5. (Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days.*/


import java.util.Scanner;
class TimeCalculator{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the minutes:");
		int minutes=sc.nextInt();

		//calculation

		double years= 1.90259e-6*minutes;
		double days=0.000694444*minutes;

		//display

		System.out.println("number of years for" +minutes+" minutes is:"+years);
		System.out.println("number of days for" +minutes+" minutes is:"+days);
	}


}