package searching;

import java.util.HashMap;

public class PairWithGivenDifference {

    public static void findPair(int[] arr, int size, int diff){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<size; i++){
            int number = arr[i] + diff;
            if(map.containsKey(number)){
                System.out.println("The two numbers are: "+arr[i]+" "+number);
                return;
            }
            else {
               map.put(arr[i], i);
            }
        }
    }

    public static void main(String[] args)
    {
        PairWithGivenDifference pairDiff = new PairWithGivenDifference();
        int[] arr = { 1, 8, 30, 40, 100 };
        int size = arr.length;
        int difference = -10;
        pairDiff.findPair(arr, size, difference);
    }
}

