package Inheritance;

public class launch {
	public static void main(String args[]) {
		child c=new child();
		c.eat();//inherited
		c.sleep();//Overridden
		c.run();//inherited
		c.swim();//specialized class
	}

}
