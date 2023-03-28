package TwoPointers.Medium;

import TwoPointers.Easy.SquaresOfSortedArray;

import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosestCal(int[] nums, int target) {

        int ans = 0;
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length;i++){
            int first = nums[i];
            int start = i+1;
            int end = nums.length-1;
            while(start < end){
                if(first+nums[start]+nums[end] == target){
                    return target;
                }
                else if(Math.abs(first+nums[start]+nums[end] - target) < diff){
                    diff = Math.abs(first+nums[start]+nums[end] - target);
                    ans = first+nums[start]+nums[end];
                }

                if(first+nums[start]+nums[end] > target) end--;
                else if(first+nums[start]+nums[end] < target) start++;

            }
        }
        return ans;
    }

    public static void main(String[] args) {

        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        int[] nums = {-1,2,1,-4};
        int target = 1;
        int ans = threeSumClosest.threeSumClosestCal(nums, target);
        System.out.println(ans);


    }
}
