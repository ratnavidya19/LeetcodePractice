package searching;

public class DeleteInUnsortedArray {

    public static int findElement(int[] arr, int n, int key){

        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int deleteElement(int[] arr, int n, int key){

        int pos = findElement(arr, n, key);
        if(pos == -1){
            System.out.print("Element not found");
        }

        for(int i = pos; i < n-1; i++){
         arr[i] = arr[i+1];
        }

        return n-1;

    }

    public static void main(String[] args)
    {

        int i;
        int arr[] = { 10, 20, 30, 40, 50 };

        int n = arr.length;
        int key = 20;

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
