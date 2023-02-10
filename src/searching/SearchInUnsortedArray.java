package searching;

public class SearchInUnsortedArray {

    public int searchNumber(int[] array, int key){

        for(int i = 0; i<array.length; i++){
            if(array[i] == key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        SearchInUnsortedArray searchInUnsortedArray = new SearchInUnsortedArray();
        int[] array = new int[]{5, 6, 7, 8, 9, 10};
        int key = 4;
        int n = searchInUnsortedArray.searchNumber(array, key);
        if(n == -1)
        {
            System.out.println("Element not found");

        }
        else {
            System.out.println("search element is found at:  "+n);

        }

    }
}
