package Exception;

public class ThrowsExcep {
	public static void main(String[] args) {
		checkage(9);
		
	}
	static void checkage(int age) throws ArithmeticException{
		if(age<18) {
			throw new ArithmeticException ("you must be above 18");
			
		}else {
			System.out.println("you are eligible");
		}
	}

}
