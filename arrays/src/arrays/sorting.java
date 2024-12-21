package arrays;


public class sorting {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1};

    
        int count = 0;
        for (int num : arr) {
            if (num == 1) {
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < count) {
                arr[i] = 1; 
            } else {
                arr[i] = 0; 
            }
        }

       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
       }   
    }
}

