package arrays.Easy;

import java.util.HashMap;

//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
// such that nums[i] == nums[j] and abs(i - j) <= k.
//https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
            else
            {
                int pastindex = map.get(nums[i]);
                if((Math.abs(pastindex-i)) <= k){
                    return true;
                }
                else{
                    map.put(nums[i], i);
                }

            }
        }

        return false;
    }
}
