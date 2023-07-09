package backtracking.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an integer array nums of unique elements, return all possible
//subsets
// (the power set).
//
//The solution set must not contain duplicate subsets. Return the solution in any order.
//Youtube - https://www.youtube.com/watch?v=h4zNvA4lbtc
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        Arrays.sort(nums);
        backtacking(list, tempList, 0, nums);
        return list;

    }

    public void backtacking(List<List<Integer>> list, List<Integer> tempList, int start, int[] nums){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtacking(list, tempList, i+1, nums);
            tempList.remove(tempList.size() -1);
        }
    }
}
