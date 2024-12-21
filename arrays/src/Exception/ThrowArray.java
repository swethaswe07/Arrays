package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowArray {
	public static void main(String args[]) {
		try {
			ShowException();
		}
		catch(InputMismatchException e1) {
			System.out.println("Input Mismatch   Exception");
			
		}
		catch(ArithmeticException  e2) {
			System.out.println("Arithmetic Exception");
		}
		catch(NegativeArraySizeException e3) {
			System.out.println("Negative ArraySize Exception");
			
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArraIndexOutOfBoundsException");
			
		}

		catch(Exception e) {
			System.out.println("Exception");
			
		}
		

	

			
			
		}
	static void ShowException(){
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
				throw e1;
				
			}
			catch(ArithmeticException  e2) {
				
				throw e2;
			}
			catch(NegativeArraySizeException e3) {
				
				throw e3;
			}
			catch(ArrayIndexOutOfBoundsException e4) {
				
				throw e4;
			}
	
			catch(Exception e) {
				throw e;
			}
			

		
	
	}
}




