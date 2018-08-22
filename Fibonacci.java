/*3. Write a program to print Fibonacci Series?
Description : Fibonacci seriesÂ is in the form of 0, 1, 1, 2, 3, 5, 8, 13, 21,...... 
Hint: To find this series we add two previous terms/digits and get next term/number
*/




class Fibonacci{

	public static int fibo(int number)
	{
		if(number==1){
			return 0;
		}
		if(number==2){
			return 1;
		}
		return fibo(number-2)+fibo(number-1);
	}

	public static void main(String[] args) {

		for (int i=1; i<=8 ; i++ ) {
			System.out.println(fibo(i));
		}
	}
}
