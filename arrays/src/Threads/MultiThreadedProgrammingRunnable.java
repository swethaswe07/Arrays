package Threads;

public class MultiThreadedProgrammingRunnable{
	public static void main(String args[]) throws InterruptedException{
		Operation2 op1=new Operation2();
		Operation2 op2=new Operation2();
		Operation2 op3=new Operation2();
		Thread t1=new Thread((java.lang.Runnable) op1);
		Thread t2=new Thread((java.lang.Runnable) op2);
		Thread t3=new Thread((java.lang.Runnable) op3);
		t1.setName("Add");
		t2.setName("Print");
		t3.setName("Bank");
		
		t1.start();
		t2.start();
		t3.start();
		 
		
	}

}
