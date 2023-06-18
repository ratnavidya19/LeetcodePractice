package arrays.Easy;
//Given an array nums containing n distinct numbers in the range [0, n], return the only number
// in the range that is missing from the array.
public class MissingNumber {

    public int findMissing(int[] arr){

        int n = arr.length;
        int sum = n*(n+1)/2;
        for(int i=0; i<n; i++){
            sum = sum - arr[i];
        }

        return sum;
    }

    public static void main(String[] args){

        MissingNumber missingNumber = new MissingNumber();
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int number = missingNumber.findMissing(arr);
        System.out.println("Missing number: "+number);

    }
}
