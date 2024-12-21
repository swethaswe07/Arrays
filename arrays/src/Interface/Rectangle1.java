package Interface;
import java.util.Scanner;
public class Rectangle1 implements Rectangle {
	double Area;
	double length;
    double breadth;
    double height;
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

}
	

