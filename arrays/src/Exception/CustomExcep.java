package Exception;

public class CustomExcep extends Exception{
public CustomExcep(String s) {
	super(s);
}
}


//Custom exception 1
class InvalidInputException extends Exception {
 public InvalidInputException(String message) {
     super(message);
 }
}

//Custom exception 2
class DatabaseConnectionException extends Exception {
 public DatabaseConnectionException(String message) {
     super(message);
 }
}

//Custom exception 3
class UserNotFoundException extends Exception {
 public UserNotFoundException(String message) {
     super(message);
 }
}
