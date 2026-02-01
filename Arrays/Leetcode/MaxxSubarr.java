package Arrays.Leetcode;

public class MaxxSubarr {

    public static void maxx(int nums[]) {
        int sum = nums[0];
        int currsum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currsum = Math.max(nums[i], currsum + nums[i]);
            sum = Math.max(currsum, sum);
        }
    }

    public static void main(String args[]) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        maxx(arr);
    }
}
