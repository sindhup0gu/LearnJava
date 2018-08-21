/*Q5.*/
class Circle{

//instance variables
double radius=5.5;
double area=0.0;
double perimeter=0.0;
double pi= 22/7.0;


/*public static void main(String[] args) {

	Circle c= new Circle();
                           
   c.perimeter = 2 * c.radius * c.pi;
   c.area = c.radius * c.radius * c.pi;

   System.out.println("Area of Circle is" + c.area);
   System.out.println("Perimeter of Circle is"+ c.perimeter);	
   System.out.println(c.pi);				
}
*/
public static void main(String[] args) {

	//System.out.println("Area of Circle is" + pi* radius * radius);
	//System.out.println("Perimeter of Circle is" + 2* pi * radius);
	System.out.println(" a \ta^2 \t a^3");

	for (int i=1; i<6 ; i++ ) {
		System.out.println(i+"\t"+i*i +"\t" + i*i*i );
	}

	  


}
}

