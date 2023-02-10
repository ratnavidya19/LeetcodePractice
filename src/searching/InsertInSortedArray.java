package searching;

public class InsertInSortedArray {

    public int insertNumber(int[] array, int n, int capacity, int key){

        if(n >= capacity){
            System.out.println("Cannot insert capacity full");
            return n;
        }
        int i;
        for (i = n - 1; (i >= 0 && array[i] > key); i--)
            array[i + 1] = array[i];

        array[i + 1] = key;

        return (n + 1);

    }

    public static void main(String[] args){
        InsertInSortedArray insertInSortedArray = new InsertInSortedArray();
        int[] array = new int[20];
        array[0] = 12;
        array[1] = 16;
        array[2] = 20;
        array[3] = 40;
        array[4] = 50;
         array[5] = 70;
        int capacity = array.length;
        int n = 6;
        int key = 26;
        for(int i = 0; i < n; i++){
            System.out.println("Before insertion:  "+array[i]);

        }
        int size = insertInSortedArray.insertNumber(array, n, capacity, key);
        for(int i = 0; i < size; i++){
            System.out.println("After insertion:  "+array[i]);

        }

    }
}
