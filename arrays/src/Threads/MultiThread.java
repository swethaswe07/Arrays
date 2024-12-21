package Threads;

public class MultiThread extends Operations {
	public static void main(String args[]) throws InterruptedException{
		Operations op1=new Operations();
		Operations op2=new Operations();
		Operations op3=new Operations();
		op1.setName("Add");
		op2.setName("Print");
		op3.setName("Bank");
		op1.setPriority(1);
		op2.setPriority(10);
		op3.setPriority(4);
		op1.start();
		op2.start();
		op3.start();
	}

}
