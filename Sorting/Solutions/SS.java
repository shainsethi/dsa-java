package Sorting.Solutions;

public class SS {

    public static void main(String args[]) {

        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // selection smallest element without swapping conitnous

        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    minpos = j;
                }
            }

            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }

    }
}
