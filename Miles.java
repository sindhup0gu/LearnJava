/*Q7.(Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
seconds. Write a program that displays the average speed in miles per hour. (Note
that 1 mile is 1.6 kilometers.)
/**/

class Miles{
 public static void main(String[] args) {

 	double distanceInMiles=14.0/1.6;
 	double timeInHours=45.0/60.0+30.0/3600.0;

 	double Speed = distanceInMiles/timeInHours;

 	System.out.println(Speed);
		
	}
}