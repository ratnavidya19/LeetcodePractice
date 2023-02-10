package searching;

public class InsertInUnsortedArray {
     public int insertNumberAtEnd(int[] array, int n, int capacity, int key){

         if(n > capacity){
             System.out.println("Cannot insert...array is full  ");
         }

         array[n] = key;

         return n+1;
     }

    public int insertNumberAtAnyPosition(int[] array, int n, int capacity, int key, int pos){

        if(n > capacity){
            System.out.println("Cannot insert...array is full  ");
        }

        for(int i = n-1; i >= pos; i--){
            array[i+1] = array[i];
            array[i] = key;
        }
        return n+1;
    }


    public static void main(String[] args){
        InsertInUnsortedArray insertInUnsortedArray = new InsertInUnsortedArray();
        int[] array = new int[20];
        array[0] = 12;
        array[1] = 16;
        array[2] = 20;
        array[3] = 40;
        array[4] = 50;
        array[5] = 70;
        int capacity = 20;
        int n = 6;
        int key = 26;
        int pos = 3;
        for(int i = 0; i < n; i++){
            System.out.println("Before insertion:  "+array[i]);

        }
       // int size = insertInUnsortedArray.insertNumberAtEnd(array, n, capacity, key);
        int size = insertInUnsortedArray.insertNumberAtAnyPosition(array, n, capacity, key, pos);

        for(int i = 0; i < size; i++){
            System.out.println("After insertion:   "+array[i]);

        }

    }
}
