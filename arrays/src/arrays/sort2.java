package arrays;
import java.util.Arrays;

public class sort2 {
	public static void main(String args[]) {
		int arr[] = {1,0,1,0};
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==1) {
				arr[j]=1;
				j++;                   
				
				
			}
			
		}
		System.out.print(Arrays.toString(arr));
	}

}
