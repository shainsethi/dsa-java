package Sorting.Solutions;

public class CS {

    public static void main(String args[]) {

        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        // min - max range
        // auxlaries array = helpers arrays

        // [] = freq
        // [3 , 1 ]
        // 1 7

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int freq[] = new int[largest + 1];
        // 7
        // 0 - 6 + 1
        // [1 , 1 , 2, 3]
        // 1[2] 2[1] 3[1]

        for (int i = 0; i < arr.length; i++) {
            // freq[1]
            freq[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
    }
}
