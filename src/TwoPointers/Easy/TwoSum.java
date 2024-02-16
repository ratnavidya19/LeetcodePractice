package TwoPointers.Easy;

import TwoPointers.Medium.ThreeSum;

import java.util.List;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
public class TwoSum {

    public int[] findTwoSum(int[] nums, int target) {

      //  int[] result = new int[5];
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            if(nums[low] + nums[high] == target){
                return new int[]{low, high};
            }
            else if(nums[low] + nums[high] > target){
                high--;
            }
            else {
                low ++;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 13;
        int[] output_list= twoSum.findTwoSum(nums, target);
        for(int i=0; i<output_list.length;i++){
            System.out.println(output_list[i]);

        }



    }
}
