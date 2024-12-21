package Threads;
import java.util.Scanner;
public class SingleThreadProgram {
public static void main(String[] args) throws InterruptedException{
	Scanner sc=new Scanner(System.in);
	System.out.println("Task 1: Addition operation started");
	System.out.println("Enter the First Number");
	int num1=sc.nextInt();
	System.out.println("Enter the second Number");
	int num2=sc.nextInt();
	int res=num1+num2;
	System.out.println("Result: "+res);
	System.out.println("Task 1: Addition operation completed");
	System.out.println("Task 2: Printing operation Started");
	for(int i=0;i<5;i++) {
	System.out.println("Swetha");
	Thread.sleep(1000);
				}
	System.out.println("Task 2:Printing operation completed");
	System.out.println("Task 3:Banking operation started");
	
	System.out.println("Enter the account number: ");
	int acc=sc.nextInt();
		System.out.println("enter pin code: ");
		int pin =sc.nextInt();
		System.out.println("Account details recorded");
		System.out.println("Task 3: Banking operation completed");
}
}
