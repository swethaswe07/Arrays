package Interface;

public class test {
	public static void main(String args[]) {
		//Calculator c1=new Calculator();
		//Calculator2 c2=new Calculator2();
		Calculator c3=new Calculator() {
			@Override
			public void add() {
				System.out.println("inside mul method of CAL1");
			}

			@Override
			public void sub() {
				System.out.println("inside mul method of CAL1");
				
			}
		
		
	};

}
}
