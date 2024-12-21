package Static;
import java.util.Scanner;

public class CircleArea {
	double Area;
	double radius;
	static double pi;
	static {
		pi=3.14;
	}
	void CollectData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius of the circle: ");
		radius=sc.nextDouble();
	}
	void Calculate() {
		Area=2*pi*(radius)*radius;
		
	}
	void Display() {
		System.out.println("Area of the circle: "+Area);
	}

}
