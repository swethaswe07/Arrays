package Exception;

public class excep1 {
	public static void main(String args[]) {
		try {
			throw  new CustomExcep("New Exception");
			throw new CustomExcep("New Exception");
			throw new CustomExcep("New Exception");
			
			
		}
		catch(CustomExcep ex) {
			System.out.println("exception caught");
			System.out.println(ex.getMessage());
		}
		catch(CustomExcep ex1) {
			System.out.println("Exception 1 caught");
			System.out.println(ex1.getMessage());
		
		}
		catch(CustomExcep ex2) {
			System.out.println("Exception 2 caught");
			System.out.println(ex2.getMessage());
		}
	}
}
}