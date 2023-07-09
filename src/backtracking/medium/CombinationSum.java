package backtracking.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

    List<List<Integer>> list = new ArrayList<>();
    List<Integer> tempList = new ArrayList<>();
    backtracking(list, tempList, candidates, target, 0);
    return list;

}

    public void backtracking(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int target, int start ){
        if(target < 0) return;
        else if(target == 0){
            list.add(new ArrayList<>(tempList));
        }
        else
        {
            for(int i =start; i< candidates.length; i++){
                tempList.add(candidates[i]);
                backtracking(list, tempList, candidates, target - candidates[i], i);
                tempList.remove(tempList.size() - 1);

            }
        }


    }
}
