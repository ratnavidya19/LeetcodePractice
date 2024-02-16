package hashing.Easy;

import java.util.HashMap;

//Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
//Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
//Youtube - https://www.youtube.com/watch?v=7wT5sFELf7Q
public class DegreeOfAnArray {

    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> count_num = new HashMap<>();
        int degree = 0;

        HashMap<Integer, Integer> first_seen = new HashMap<>();
        int min_length = 0;

        for(int i = 0; i<nums.length; i++){
            first_seen.putIfAbsent(nums[i],i);
            count_num.put(nums[i], count_num.getOrDefault(nums[i],0)+1);
            if(count_num.get(nums[i]) > degree){
                degree = count_num.get(nums[i]);
                min_length = i - first_seen.get(nums[i]) + 1;
            }
            else if(count_num.get(nums[i]) == degree){
                min_length = Math.min(min_length, i - first_seen.get(nums[i]) + 1);
            }

        }
        return min_length;
    }
}
