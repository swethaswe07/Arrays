package Threads;

public class Warrior extends Thread {
	String res1="Ak45";
	String res2="M416";
	String res4="AWM";
	
	@Override
	
	public void run() {
		if (Thread.currentThread().getName().equals("Student1"))
		{
			Student1Acq();
		}
		else {
			Student2Acq();
		}
	}
	public void Student1Acq() {
		try {
			synchronized(res4) {
				System.out.println("Student1 acquired the resource: "+res1);
				Thread.sleep(3000);
			synchronized(res2) {
				System.out.println("Student1 acquired the resource: "+res2);
				Thread.sleep(3000);
			synchronized(res1) {
				System.out.println("Student1 acquired the resource: "+res4);
				Thread.sleep(3000);
	 }//Release of resource:1
	 }//Release of resource:2
	 }//Release of resource:4
	}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void Student2Acq() {
		try {
			synchronized(res4) {
				System.out.println("Student2 acquired the resource: "+res1);
				Thread.sleep(3000);
			synchronized(res2) {
				System.out.println("Student2 acquired the resource: "+res2);
				Thread.sleep(3000);
			synchronized(res1) {
				System.out.println("Student2 acquired the resource: "+res4);
				Thread.sleep(3000);
	 }//Release of resource:3
	 }//Release of resource:2
	 }//Release of resource:1
	}
		catch(InterruptedException e1) {
			e1.printStackTrace();
		}
	}


}
