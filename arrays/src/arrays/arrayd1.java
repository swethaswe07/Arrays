package arrays;
import java.util.Arrays;

public class arrayd1 {
	public static void main(String args[]) {
		int [] arr= {10,20,5,70};
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		System.out.print(Arrays.toString(arr));	
		
		}

}
