package TwoPointers.Medium;

import arrays.Medium.SetMatrixZeroes;
import queue.QueueUsingArray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
// and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.
//reference - https://www.youtube.com/watch?v=qJSPYnS35SE
public class ThreeSum {

    public List<List<Integer>> findThreeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> output_list = new LinkedList<>();
        for(int i = 0; i<nums.length-2; i++){
            if(i == 0 || (i>0 && nums[i] != nums[i-1])){
                int low = i+1;
                int high = nums.length - 1;
                int sum = 0-nums[i];
                while(low < high){
                    if(nums[low] + nums[high] == sum){
                        output_list.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low<high && nums[low] == nums[low+1]) low++;
                        while(low<high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    }else if(nums[low] + nums[high] > sum){
                        high--;
                    }else{
                        low++;
                    }
                }
            }

        }

        return output_list;

    }

    public static void main(String[] args) {

        ThreeSum threeSum = new ThreeSum();
        int[] matrix = {-1,0,1,2,-1,-4};
        List<List<Integer>>  output_list= threeSum.findThreeSum(matrix);

        System.out.println(output_list);


    }
}
