package Static;

public class launch {
	public static void main(String args[])
	{
		System.out.println(test.a);
		System.out.println(test.b);
		System.out.println(test.c);
		System.out.println("------------");
		test t= new test();
		t.display1();
		System.out.println("------------");
		test.display();
	}
}
