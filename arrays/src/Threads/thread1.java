package Threads;

public class thread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}

}

