package Inheritance;

public class M_three extends M_two {
	
	public double division(double a,double b) {
		System.out.println("Division : "+ a/b);
		return a/b;
	}
	public double square(double a) {
		System.out.println("Square : " + (a*a));
		return a*a;
	}

}
