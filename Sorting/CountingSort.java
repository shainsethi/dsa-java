package Sorting;

public class CountingSort {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(arr[i], largest);
        }

        int a[] = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            a[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < a.length; i++) {
            while (a[i] > 0) {
                arr[j] = i;
                j++;
                a[i]--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}