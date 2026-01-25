package Sorting;

public class BubbleSort {

    public static void buble_Sort(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                return;
            }
        }
    }

    public static void printArray(int n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        buble_Sort(arr);
        printArray(arr);
    }
}