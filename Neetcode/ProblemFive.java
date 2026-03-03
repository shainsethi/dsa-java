package Neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ProblemFive {

    // Top K Frequent Elements - Bucket Sort

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Integer arr[] = map.keySet().toArray(new Integer[0]);
        // Arrays.sort(arr, (a, b) -> map.get(a) - map.get(b));

        // int result[] = new int[k];

        // for (int i = 0; i < result.length; i++) {
        // result[i] = arr[i];
        // }

        // System.out.println(Arrays.toString(result));

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int key : map.keySet()) {
            int frequency = map.get(key);
            buckets[frequency].add(key);
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            for (int num : buckets[i]) {
                result[index++] = num;
                if (index == k) {
                    break;
                }
            }
        }

        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
    }
}
