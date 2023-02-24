package arrays.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer
// appears once or twice, return an array of all the integers that appears twice.
public class FindAllDuplicatesInArray {

    public List<Integer> findDuplicates(int[] nums) {


        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                arr.add(nums[i]);
            }
        }

        return arr;

    }

    public static void main(String[] args) {

        FindAllDuplicatesInArray findAllDuplicatesInArray = new FindAllDuplicatesInArray();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> number = findAllDuplicatesInArray.findDuplicates(nums);

        System.out.println("Duplicate number: " + number);


    }
}
