package Interface;
import java.util.Scanner;
public class shapes {
	


	
		public static void main(String args[]) {
			Circle1 c=new Circle1() {
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
			};
			c.CollectData();
			c.Calculate();
			c.Display();
			Rectangle1 r=new Rectangle1() {
			public void CollectData() {
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter length of the rectangle: ");
				length=sc.nextDouble();
				System.out.print("Enter length of the rectangle: ");
				breadth=sc.nextDouble();
				System.out.print("Enter height of the rectangle: ");
				height=sc.nextDouble();
			
			}
			public void Calculate() {
				Area=length*breadth*height;
				
			}
			public void Display() {
				System.out.println("Area of the Rectangle: "+Area);
			}

		};
		r.CollectData();
		r.Calculate();
		r.Display();
		Triangle1 t=new Triangle1() {
			public void CollectData() {
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter height of the triangle: ");
				height=sc.nextDouble();
				System.out.print("Enter base of the triangle: ");
				base=sc.nextDouble();
				
			}
			public void Calculate() {

				Area=(base*height)/2;
				
			}
			public void Display() {
				System.out.println("Area of the triangle: "+Area);
			}
		};
	    t.CollectData();
	    t.Calculate();
	    t.Display();
	}
	}

