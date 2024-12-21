package Inheritance;

public class Hierarchical {
	public static void main(String args[]) {
		H_one a=new H_one();
		H_two b=new H_two();
		H_three c=new H_three();
		a.print_A();
		b.print_A();
		b.print_B();
		c.print_A();
		c.print_C();
		
	}

}
