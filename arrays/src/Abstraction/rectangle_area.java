package Abstraction;


import java.util.Scanner;

public class rectangle_area extends rect{
	void CollectData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of the rectangle: ");
		length=sc.nextDouble();
		System.out.print("Enter length of the rectangle: ");
		breadth=sc.nextDouble();
		System.out.print("Enter height of the rectangle: ");
		height=sc.nextDouble();
	
	}
	void Calculate() {
		Area=length*breadth*height;
		
	}
	void Display() {
		System.out.println("Area of the Rectangle: "+Area);
	}

}
