
/*
//Q9. Write a program that solves the following equation and displays the value for x and y:

					//3.4x + 50.2y = 44.5
					//2.1x + .55y = 5.9

class Equation{

static	double a=3.4;
static	double b= 50.2;
static	double c=2.1;

static	double d=0.55;
static	double e= 44.5;
static	double f=5.9;


public static void main(String[] args) {

	double x=(e*d - b*f)/(a*d - b*c);
double y=(a*f - e*c)/(a*d - b*c);
	
	System.out.println("X="+ x +"Y=" + y);
}


}

/**/

public class Equation {

    public static void main(String[] args) {

        // Variables for Cramer's formula
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        System.out.println("x = " + x );
        System.out.println(" y = " + y);

    }
}

