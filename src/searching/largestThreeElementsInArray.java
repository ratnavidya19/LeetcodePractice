package searching;

import java.util.Arrays;

public class largestThreeElementsInArray {

    public static void main (String[] args) {
        int[] a = new int []{10,4,3,50,23,90};
        int count = 0;
      //  System.out.println(a.length);

        Arrays.sort(a);
            for (int i = 5; i > 0; i--) {
               if(count < 3) {
                   count++;
                   System.out.println(a[i]);
               }

            }

    }
}
