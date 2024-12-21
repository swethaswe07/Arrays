package Static;

public class test {
	static int a,b,c;
	static int m,n,o;
	static {
		a=100;
		b=200;
		c=300;
		m=1000;
		n=2000;
		o=3000;
		
	}
	{
		a=1001;
		b=2001;
		c=3001;
		m=10001;
		n=20002;
		o=30001;
		
	}
	static void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}
    void display1() {
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);
    	System.out.println(m);
    	System.out.println(n);
    	System.out.println(o);
    }
}
