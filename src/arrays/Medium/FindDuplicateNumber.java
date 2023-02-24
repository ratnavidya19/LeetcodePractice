package arrays.Medium;

import java.util.HashSet;

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
public class FindDuplicateNumber {

    public int findDuplicate(int[] arr){

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args){

        FindDuplicateNumber findDuplicateNumber = new FindDuplicateNumber();
        int[] arr = {1,3,4,2,2};
        int number = findDuplicateNumber.findDuplicate(arr);
        if(number != -1) {
            System.out.println("Duplicate number: " + number);
        }



    }
}
