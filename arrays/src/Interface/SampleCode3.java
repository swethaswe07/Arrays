package Interface;

public class SampleCode3 implements Calculator,Calculator3 {
	//Rule no 6
	@Override
	public void add() {
		System.out.println("inside sub method of sample code3");
	}
	@Override
	public void sub() {
		System.out.println("inside sub method of sample code3");
		
	}
	public void mul() {
		System.out.println("inside sub method of SAmplecode3");
		
	}
	public void div() {
		System.out.println("inside sub method of SAmplecode3");
	}

}
