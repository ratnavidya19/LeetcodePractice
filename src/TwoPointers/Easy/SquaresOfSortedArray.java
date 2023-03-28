package TwoPointers.Easy;

import TwoPointers.Medium.ThreeSum;
import java.util.List;

//Given an integer array nums sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.
//reference - https://www.youtube.com/watch?v=XgRIr8CCCVk
public class SquaresOfSortedArray {

    public static int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length-1;
        int n = nums.length;
        int[] result = new int[n];
        int square;
        for(int i = n-1; i >=0; i--){
            if(Math.abs(nums[left]) < Math.abs(nums[right]))
            {
                square = nums[right];
                right--;
            }
            else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }

        return result;
    }

    public static void main(String[] args) {

        SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();
        int[] nums = {-4,-1,0,3,10};
        int [] result = SquaresOfSortedArray.sortedSquares(nums);
        System.out.println(result);


    }
}
