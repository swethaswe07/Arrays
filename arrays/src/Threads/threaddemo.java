package Threads;
public class threaddemo {
	public static void main(String args[]) {
		
		thread1 t=new thread1();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
	}

}
