package practice;

public class prime {
	public static void main(String args[]) {
		int num = 5;
		boolean isprime = true;
		if (num<=1) {
			isprime= false;
		}
		for(int i=2;i<num;i++) {
			if(num % i==0) {
				isprime= false;
		
			}else {
			    isprime=true;
			}
			
		}
		
		System.out.print(isprime);
	}

}
