package Threads;

public class Deadlock{
public static void main(String[] args) {
	 Deadlock1 w1=new Deadlock1();
	 Deadlock1 w2=new Deadlock1();
	w1.setName("Student1");
	w2.setName("Student2");
	w1.start();
	w2.start();
}
}
