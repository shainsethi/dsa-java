package Neetcode;

import java.util.Arrays;
import java.util.HashSet;

//check if an array contains any duplicate values.

public class ProblemOne {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        Boolean result = false;

        // Brute Force
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    result = true;
                    break;
                }
            }
        }
        System.out.println(result);

        // Sorting
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                result = true;
            }
        }

        System.out.println(result);

        // HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                result = true;
                break;
            } else {
                set.add(arr[i]);
            }
        }

        System.out.println(result);

        // Best Approach
        HashSet<Integer> dup = new HashSet<>();
        for (int n : arr) {
            if (!dup.add(n)) {
                result = true;
                break;
            }
        }

        System.out.println(result);

    }
}
