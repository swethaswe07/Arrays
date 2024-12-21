package callby;

public class CallByRef {
	
	int ob;
	int ob1;
	
	private static void add(CallByRef a,CallByRef b) {
		
		a.ob=8;
		System.out.println("result: "+(a.ob+b.ob1));
	}
	public static void main(String args[]) {
	
		CallByRef a=new CallByRef();
		CallByRef b=new CallByRef();
		
		a.ob=9;
		b.ob1=2;
		
		
		System.out.println("before: "+(a.ob+b.ob1));
		add(a,b);

		System.out.println("after: "+(a.ob+b.ob1));
	}
	}


