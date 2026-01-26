package Sorting;

public class SelectionSort {

    public static void selection_sort(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n.length; j++) {
                if (n[min] > n[j]) {
                    min = j;
                }
            }
            int temp = n[min];
            n[min] = n[i];
            n[i] = temp;
        }
    }

    public static void printArray(int n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selection_sort(arr);
        printArray(arr);
    }

}
