package Arrays.Solutions;

/*
There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.

Example 1:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 0 Output:   4 
Example 2:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 3Output:   -1 

*/

public class Two {

    public static int findIndex(int nums[] , int target){

        int min = searchMin(nums);

    }

    public static int searchMin(int nums[]){
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int midkey = left + (right - left) / 2;

            if(midkey > 0 && arr[midkey - 1])
        }
    }

    public static void main(String args[]) {
        int nums = {7 , 6 , 5 , 4 , 0 , 1  , 2 , 3};
        findIndex(nums,0);
    }
}
