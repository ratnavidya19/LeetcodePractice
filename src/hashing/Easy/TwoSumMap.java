package hashing.Easy;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
public class TwoSumMap {

    public int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int sumValue = target - nums[i];
            if(map.containsKey(sumValue))
            {
                return new int[]{i, map.get(sumValue)};
            }
            map.put(nums[i],i);
        }
        return null;
    }


        public static void main(String[] args) {

        TwoSumMap twoSum = new TwoSumMap();
        int[] nums = {2,7,11,15};
        int target = 13;
        int[] output_list= twoSum.findTwoSum(nums, target);
        for(int i=0; i<output_list.length;i++){
            System.out.println(output_list[i]);

        }



    }
}
