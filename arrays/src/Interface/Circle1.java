package Interface;

import java.util.Scanner;

public class Circle1 implements circle{
	double Area ;
    double radius;
	static double pi=3.14;


		public void CollectData() {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter radius of the circle: ");
			radius=sc.nextDouble();
	}
		public void Calculate() {
			Area=2*pi*(radius)*radius;
		}
		public void Display() {
			System.out.println("Area of the circle: "+Area);
		
		}
	}

