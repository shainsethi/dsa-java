package Sorting.Solutions;

public class IS {

    public static void main(String args[]) {

        // left sorted part h and on right we have unsorted part
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        for (int i = 1; i < arr.length; i++) {
            int prev = i - 1; // 3
            int curr = arr[i]; // 6

            // 0
            // 3 > 6

            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // i - 1 + 1 = i
            arr[prev + 1] = arr[curr];
        }

    }
}
