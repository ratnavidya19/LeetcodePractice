package searching;

public class MissingNumber {

    int findMissingNumber(int array[], int n) {
        // Your Code Here

        // Arrays.sort(array);
        for(int i = 1; i < n; i++)
        {
            if(array[i-1] != i)
            {
                return i;

            }
        }
        return 0;
    }

    public static void main(String[] args){
        MissingNumber missingNumber = new MissingNumber();
        int[] array = new int[]{1,2,3,5};
        int n = missingNumber.findMissingNumber(array, 5);
        System.out.println("Missing number is "+n);

    }
}
