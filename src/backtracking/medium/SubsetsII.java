package backtracking.medium;

import java.util.ArrayList;
import java.util.List;

public class SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tempList = new ArrayList();
        backtracking(list, tempList, nums, 0);
        return list;

    }

    public void backtracking(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start){

        list.add(new ArrayList<>(tempList));
        for(int i = start; i<nums.length; i++){
            if(i>start &&  nums[i] == nums[i-1]) continue;
            tempList.add(nums[i]);
            backtracking(list, tempList, nums, i+1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
