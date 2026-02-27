package Neetcode;

import java.util.HashMap;

public class Problemthree {

    // addition of two number is equal to key

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int target = 4;

        // brute force
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.print(i + "" + j);
                }
            }
        }

        // hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                System.out.println(map.get(diff) + " " + i);
                break;
            } else {
                map.put(nums[i], i);
            }
        }
    }
}
