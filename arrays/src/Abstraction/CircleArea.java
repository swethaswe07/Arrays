package Abstraction;

abstract class CircleArea {
	double Area;
	double radius;
	static double pi;
	static {
		pi=3.14;
	}
	abstract void CollectData() ;
	abstract void Calculate() ;
	abstract void Display() ;	

}
