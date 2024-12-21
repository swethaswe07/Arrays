package arrays;


public class Sort1 {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40};
        boolean isSorted=true;;

        for (int i = 0; i < arr.length - 1; i++) { 
            if (arr[i] > arr[i + 1]) { 
               isSorted = false;
                break;
            }
            else {
               isSorted = true;
            }
        }

        System.out.print(isSorted);
    }
}
