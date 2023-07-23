package greedy.medium;

//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
//Time Complexity = 0(n)
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int max_so_far = Integer.MIN_VALUE;
        int max_end_here = 0;

        for(int i = 0; i<nums.length; i++){
            max_end_here = max_end_here + nums[i];
            if(max_so_far < max_end_here){
                max_so_far = max_end_here;
            }
            if(max_end_here < 0){
                max_end_here = 0;
            }
        }
        return max_so_far;

    }
}
