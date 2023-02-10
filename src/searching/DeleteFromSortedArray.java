package searching;

public class DeleteFromSortedArray {

    public static int binarySearch(int[] array, int n, int key){

        int low = 0, high = n-1;
        int mid = (low+high)/2;

        if(high < low){
            return -1;
        }
        if(key == array[mid]){
            return mid;
        }
        else if(key < mid){
            return binarySearch(array, n, key);
        }
        else{
            return binarySearch(array, n, key);
        }
    }

    public static int deleteElement(int[] arr, int n, int key){

        int pos = binarySearch( arr,  n,  key);
        if(pos == -1)
        {
            System.out.print("Element not found");

        }

        for(int i = pos; i < n-1; i++)
        {
            arr[i] = arr[i+1];
        }
        return n-1;
    }

    public static void main(String[] args)
    {

        int i;
        int arr[] = { 10, 20, 30, 40, 50 };

        int n = arr.length;
        int key = 30;

        System.out.print("Array before deletion:\n");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Function call
        n = deleteElement(arr, n, key);

        System.out.print("\n\nArray after deletion:\n");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
