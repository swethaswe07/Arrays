package Exception;

public class Custom {
	public static void main(String args[]) {
		try {
			throw  new CustomExcep("New Exception");
			
		}
		catch(CustomExcep ex) {
			System.out.println("exception caught");
			System.out.println(ex.getMessage());
		
	}
		try {
			throw new InvalidInputException("New ");
			
		}
		catch(InvalidInputException ex1) {
			System.out.println("invalid input exception caught");
			System.out.println(ex1.getMessage());
			
		}

		try {
			throw new DatabaseConnectionException ("New ");
			
		}
		catch(DatabaseConnectionException  ex2) {
			System.out.println("DatabaseConnection Exception caught");
			System.out.println(ex2.getMessage());
			
		}
		try {
			throw new  UserNotFoundException ("New ");
			
		}
		catch( UserNotFoundException ex3) {
			System.out.println("   UserNotFound Exception caught");
			System.out.println(ex3.getMessage());
			
		}
		
		
		
}
}