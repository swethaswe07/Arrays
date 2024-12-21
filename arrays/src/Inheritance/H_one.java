package Inheritance;

public class H_one {
	public void print_A() {
		System.out.println("class A");
	}
}
 class H_two extends H_one{	
	public void print_B() {
		System.out.println("class B");
	}
}

class H_three extends H_one{
	public void print_C() {
		System.out.println("class C");
	}
}