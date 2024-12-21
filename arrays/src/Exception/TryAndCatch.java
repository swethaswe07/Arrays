package Exception;
import java.util.Scanner;
public class TryAndCatch {
	public static void main(String args[]) {
	try {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter numerator");
	int num=sc.nextInt();//critical statement
	System.out.println("enter denominator");
	int deno=sc.nextInt();
	int res=num/deno;//critical statement
	System.out.println(res);//critical statement
	}
	catch(Exception e) {
		System.out.println("exception handled");
	}
	finally {
		System.out.println("inside final block");
	}
	}	

}
