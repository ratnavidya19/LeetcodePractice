package searching;
//The time complexity of the binary search algorithm is O(log n).
public class BinarySearch {

    public int searchNumber(int[] array, int key, int low, int high){

        int mid = (low+high)/2;
        if(key == array[mid]){
            return mid;
        }
        else if(key < mid){
            return searchNumber(array, key, low, mid-1);
        }
        else{
            return searchNumber(array, key, mid+1, high);
        }
    }

    public static void main(String[] args){
        BinarySearch binarySearch = new BinarySearch();
        int[] array = new int[]{5, 6, 7, 8, 9, 10};
        int low = 0;
        int key = 7;
        int high = array.length - 1;
        int n = binarySearch.searchNumber(array, key, low, high);
        System.out.println("search element is found at:  "+n);

    }
}
