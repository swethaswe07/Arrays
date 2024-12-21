package Threads;

public class single extends Thread{


	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Swetha");
		}
	}

}
class demo {
	public static void main(String args[]) {
		
		single s=new single();
		s.start();
		
		
		
	}}



