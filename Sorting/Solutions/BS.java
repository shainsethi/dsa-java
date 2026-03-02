package Sorting.Solutions;

public class BS {

    public static void main(String args[]) {

        // Bubble Sort
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}