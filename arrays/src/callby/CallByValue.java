package callby;

public class CallByValue {

	private static void add(int a, int b) {
		a=1;
		
		System.out.println("result: "+(a+b));
	}
	public static void main(String args[]) {
		int e=9;int d =3;
		System.out.println("before:"+(e+d));
		add(e,d);
		System.out.println("after: "+(e+d));
		
		
	

}
}