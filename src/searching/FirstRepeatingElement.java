package searching;

import java.util.HashSet;

public class FirstRepeatingElement {

    int min = -1;
    public void printFirstRepeating(int[] arr){


        HashSet<Integer> set = new HashSet<>();
        for(int i = arr.length - 1; i >= 0; i--)
        {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
            }
            else {
                min = i;
            }
        }

        if(min == -1){
            System.out.println("There are no repeating elements");
        }
        else {
            System.out.println("First repeating element is at position: "+min);

        }


    }

    public static void main(String[] args)
            throws java.lang.Exception
    {
        FirstRepeatingElement firstRepeatingElement = new FirstRepeatingElement();

        int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
        firstRepeatingElement.printFirstRepeating(arr);
    }
}
