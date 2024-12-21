package Interface;

public interface Calculator6 {
	void Addition();
	void Subtraction();
	default void multiplication() {
		System.out.println("inside mul method of CAL6");
	}
	static void division() {
		System.out.println("inside div method of CAL6");
	}

}
