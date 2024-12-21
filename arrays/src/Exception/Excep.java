package Exception;
import java.util.Scanner;
public class Excep {
	public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter numerator");
	int num=sc.nextInt();//critical statement
	System.out.println("enter denominator");
	int deno=sc.nextInt();
	int res=num/deno;//critical statement
	System.out.println(res);//critical statement
	
	}	

}
