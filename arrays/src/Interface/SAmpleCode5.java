package Interface;

public class SAmpleCode5 extends SampleCode4 implements Calculator {
	//Rule no 12
	@Override
	public void add() {
		System.out.println("inside sub method of Samplecode 5");
	}
    public void sub() {
		System.out.println("inside sub method of Samplecode 5");
    }
}
