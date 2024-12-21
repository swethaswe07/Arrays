package Abstraction;
abstract class plane {
public void takeoff() {
	System.out.println("plane took off");
	
}
abstract void fly();
public void land() {
	System.out.println("plane landed");
}

}
 class CargoPlane extends plane{
	 @Override
	 void fly() {
		 System.out.println("cargo plane took off");
	 }
	 
 }
 