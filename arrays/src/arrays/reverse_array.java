package arrays;

public class reverse_array {
	public static void main(String args[]) {
		int n = 5;
		int j=0;
	    int arr[]=new int[n];
	    int arr1[]=new int[n];
	    arr[0]=1;
	    arr[1]=2;
	    arr[2]=3;
        arr[3]=4;
	    arr[4]=5;
	    System.out.println("the reverse elements in array");
	    
	    for (int i=n-1 ;i>=0;i--) {
	    	
	    	arr1[j]=arr[i];
	    	j++;
	    	
	    }
	    for (int value : arr1) {
	    	System.out.print(value + "  ");
	    }
   }
}	
