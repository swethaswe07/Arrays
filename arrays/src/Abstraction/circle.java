package Abstraction;

import java.util.Scanner;

public class circle extends CircleArea {
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
