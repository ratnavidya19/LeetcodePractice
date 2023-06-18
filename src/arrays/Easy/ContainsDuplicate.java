package arrays.Easy;

import java.util.HashSet;
//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
public class ContainsDuplicate {

    public boolean checkDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else
            {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args){

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] arr = {3,5,8,6,4,12,98};
        boolean val = containsDuplicate.checkDuplicate(arr);
        if(val){
            System.out.println("Array contains duplicate");
        }
        else {
            System.out.println("Array does not contains duplicate");

        }
    }
}
