package arrays;

public class array {
	public static void main(String args[]) {
		int arr[]= {10,20,5,70};
		  int min = arr[0];
		  int max = arr[0];
		  int sum =0;
		  for (int array :  arr) {
			  if (array < min) {
				  min = array;
			  }
			  if (array > max) {
				  max = array;
			  }
			  sum +=array;
		  }
		  System.out.println("minimum "+min);
		  System.out.println("maximum "+max);
		  System.out.println("sum "+sum);
	}
  
}

