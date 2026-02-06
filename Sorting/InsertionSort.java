package Sorting;

public class InsertionSort {

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }

         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 * { 5 , 4 , 1 , 3 , 2}
 * 5 > 4
 * 4 5 1 3 2
 * 5 > 1
 * 4 > 1
 * 1 4 5 3 2
 * 5 > 3
 * 4 > 3
 * 1 > 3
 * 1 3 4 5 2
 * 5 > 2
 * 4 > 2
 * 3 > 2
 * 1 > 2
 * 1 2 3 4 5
 */
