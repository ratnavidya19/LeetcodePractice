package hashing.Medium;

import java.util.HashMap;
//Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
//
//A good subarray is a subarray where:
//
//its length is at least two, and
//the sum of the elements of the subarray is a multiple of k.
public class ContinuousSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm  = new HashMap<>();
        hm.put(0,-1);

        int sum = 0;
        // hm.put(0,-1);
        for( int  i = 0;i < nums.length; i++){
            //int num = nums[i];
            sum+=nums[i];

            if(hm.containsKey(sum%k)){
                if((i - (hm.get(sum%k))) > 1)
                    return true;
            }else
                hm.put(sum%k, i);

        }
        return false;
    }
}
