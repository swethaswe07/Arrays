package Threads;


	import java.util.InputMismatchException;
	import java.util.Scanner;
	public class Runnable1 extends Thread {
		public void run() {
			if(Thread.currentThread().getName().equals("Add")) {
				Add();
			}
			else if (Thread.currentThread().getName().equals("Print")){
				Print();
			}
			else {
				Bank();
				
			}
		}

			
		
		public void Add() {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Task 1: Addition operation started");
				System.out.println("Enter the First Number");
				int num1=sc.nextInt();
				System.out.println("Enter the second Number");
				int num2=sc.nextInt();
				int res=num1+num2;
				System.out.println("Result: "+res);
				System.out.println("Task 1: Addition operation completed");
			}
			catch(ArithmeticException e) {
				e.printStackTrace();
			
			}
			catch(InputMismatchException e1) {
				e1.printStackTrace();
			}
		}
		public void Print() 
		{
			try {
			
			
			for(int i=0;i<5;i++) {
				System.out.println("Swetha");
				Thread.sleep(1000);
							}
				System.out.println("Task 2:Printing operation completed");
		}
		catch(InterruptedException  e2) {
			e2.printStackTrace();
		}
			
		}
		public void Bank() {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Task 3:Banking operation started");
				
				System.out.println("Enter the account number: ");
				int acc=sc.nextInt();
					System.out.println("enter pin code: ");
					int pin =sc.nextInt();
					System.out.println("Account details recorded");
					System.out.println("Task 3: Banking operation completed");
			
			}
			catch(ArithmeticException e4) {
				e4.printStackTrace();
			}
		}
		
		}
