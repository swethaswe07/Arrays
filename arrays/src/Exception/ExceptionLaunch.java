package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionLaunch {
public static void main(String args[]) {

	try {
		Scanner sc=new Scanner (System.in);
		System.out.println("Division Operation");
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
			try {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Array Operation");
		System.out.println("enter array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter position number");
		int pos=sc.nextInt();
		
		System.out.println("enter value");
		int value=sc.nextInt();
		arr[pos]=value;
		System.out.println("Data added");
			}
			
			catch(InputMismatchException e1) {
				System.out.println("input not valid");
				
			}
			catch(ArithmeticException  e2) {
				System.out.println("input not valid");
				
			}
			catch(NegativeArraySizeException e3) {
				System.out.println("array size cannot be negative");
				
			}
			catch(ArrayIndexOutOfBoundsException e4) {
				System.out.println("specified index is out of range");
			}
			catch(Exception e) {
				System.out.println("Generic EXception");
			}
			
		
		
	}
}

