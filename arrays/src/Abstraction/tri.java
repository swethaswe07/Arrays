package Abstraction;

import java.util.Scanner;

public class tri extends Triangle {
	void CollectData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter height of the triangle: ");
		height=sc.nextDouble();
		System.out.print("Enter base of the triangle: ");
		base=sc.nextDouble();
		
	}
	void Calculate() {

		Area=(base*height)/2;
		
	}
	void Display() {
		System.out.println("Area of the triangle: "+Area);

	}
	

}
