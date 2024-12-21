package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw {
public static void main(String args[]) {
	try {
		ShowException();
		
	}
	catch(ArithmeticException e) {
	System.out.println("Exception from different functions");
	}
}
static void ShowException() {
	
		try {
			Scanner sc=new Scanner (System.in);
			System.out.println("enter numerator");
			int num=sc.nextInt();//critical statement
			System.out.println("enter denominator");
			int deno=sc.nextInt();
			int res=num/deno;//critical statement
			System.out.println(res);//critical statement
			}
			catch( ArithmeticException e) {
				throw e;
			}
}
}