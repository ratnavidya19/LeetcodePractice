package arrays.Medium;

import java.util.HashSet;
import java.util.List;

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//You must write an algorithm that runs in O(n) time.
//https://www.youtube.com/watch?v=pLzOp2_Y9Vk
public class LongestConsecutiveSequence {

    public int findLongestSeq(int[] nums){

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(!set.contains(nums[i]))
            set.add(nums[i]);
        }
        int count = 0;
        int longSeq = 0;
        for(int i=0; i< nums.length; i++){

            if(!set.contains(nums[i]-1)){
                count = 1;
                int next_num = nums[i]+1;
                while(set.contains(next_num)){
                    count++;
                    next_num++;
                }
            }
            longSeq = Math.max(longSeq, count);

        }

        return longSeq;

    }

    public static void main(String[] args) {

        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = {100,4,200,1,3,2};
        int number = longestConsecutiveSequence.findLongestSeq(nums);

        System.out.println("Length of longest sequence: " + number);


    }
}
