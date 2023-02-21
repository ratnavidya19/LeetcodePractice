package arrays;

import java.util.HashMap;
import java.util.Map;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
public class SingleNumber {

    public int findSingleNumber(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args){

        SingleNumber singleNumber = new SingleNumber();
        int[] arr = {4,1,2,1,2};
        int number = singleNumber.findSingleNumber(arr);
        System.out.println("Single number: "+number);



    }
}
