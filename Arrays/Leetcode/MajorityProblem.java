package Arrays.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityProblem {

    public static int majorityProblem(int n[]) {
        Map<String, Integer> map = new HashMap<>();
        int key = 0;
        for (int i = 0; i < n.length; i++) {
            if (map.containsKey(String.valueOf(n[i]))) {
                map.put(String.valueOf(n[i]), map.get(String.valueOf(n[i])) + 1);
            } else {
                map.put(String.valueOf(n[i]), 1);
            }

            if (map.get(String.valueOf(n[i])) > n.length / 2) {
                key = n[i];
            }
        }

        return key;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityProblem(arr));
    }
}