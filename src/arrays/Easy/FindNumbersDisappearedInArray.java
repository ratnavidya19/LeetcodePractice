package arrays.Easy;

import java.util.ArrayList;
import java.util.HashSet;
//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers
//in the range [1, n] that do not appear in nums.
public class FindNumbersDisappearedInArray{

    public static ArrayList<Integer> findMissingNumbers(int[] arr, int n){

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<n;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }

        for(int i=1; i<=n;i++){
            if(!set.contains(i)){
                 arrayList.add(i);
            }
        }

        return arrayList;
    }

    public static void main(String[] args){

        int[] arr = {4,3,2,7,8,2,3,1};
        int n = arr.length;
        ArrayList<Integer> arrayList = findMissingNumbers(arr, n);
      //  for(int i=0; i<arrayList.size();i++){
            System.out.println("List of missing numbers: "+arrayList.toString());

       // }
    }
}
