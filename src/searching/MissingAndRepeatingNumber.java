package searching;

import java.util.HashMap;

public class MissingAndRepeatingNumber {

    public void printMissingRepeating(int[] array){

        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for(Integer i : array)
        {
           if(map.get(i) == null){
               map.put(i, true);
           }
           else {
               System.out.println("Repeating number is: "+i);
           }
        }

        for(int i = 1; i <= array.length; i++){
            if(map.get(i) == null)
            {
                System.out.println("Missing number is: "+i);

            }
        }
    }


    public static void main(String[] args){
        MissingAndRepeatingNumber missingAndRepeatingNumber = new MissingAndRepeatingNumber();
        int[] array = new int[]{2,3,1,4,6,2};
        missingAndRepeatingNumber.printMissingRepeating(array);
    }
}
