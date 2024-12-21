package arrays;


public class Sort {
    public static void main(String args[]) {
        int arr[] = {7,5,8,10};
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

