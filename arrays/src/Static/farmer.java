package Static;
import java.util.Scanner;

public class farmer {
	double principle;
	static double rate;
	double time;
	double simpleInterest;
	static {
		rate=2.5;
		
	}

	void CollectData() {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the principle: ");
		 principle =sc.nextDouble();
		 System.out.print("Enter the time in years: ");
		 time=sc.nextDouble();

	}
	void Calculate() {
		simpleInterest= (principle * time * rate)/100;
		
	}
	void Display() {
		System.out.println("the Simple Interest is : " + simpleInterest);
	}
}
