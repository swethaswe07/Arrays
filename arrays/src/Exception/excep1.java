package Exception;

public class excep1 {
	public static void main(String args[]) throws CustomExcep {
		try {
			throw  new CustomExcep("New Exception");
			
			
		}
		catch(CustomExcep ex) {
			System.out.println("exception caught");
			System.out.println(ex.getMessage());
		}
	}
}
