package Abstraction;

import java.util.Scanner;

public class Abstract {
	public static void main(String args[]) {
		circle c=new circle() {
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
		};
		c.CollectData();
		c.Calculate();
		c.Display();
		rectangle_area r=new rectangle_area() {
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

	};
	r.CollectData();
	r.Calculate();
	r.Display();
	Triangle t=new Triangle() {
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
	};
    t.CollectData();
    t.Calculate();
    t.Display();
}
}