package arrays;

public class array1 {
	public static void main(String args[]) {
		
	    int n=5;
		int arr[]= {1,0,1,1,0,1};
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int j=0;
		int k=0;
		for(int i=0;i<6;i++) {
			if (arr[i]==1) {
				arr1[j]=arr[i];
			}
			else {
				arr2[k]=arr[i];
				
			}
	    }
	
	
    }
}
