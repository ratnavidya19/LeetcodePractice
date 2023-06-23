package searching.Medium;

//Time compexity - O(logn)
public class MinimumInRotatedSortedArray {

    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length;

        while(start < end){
            int mid = (start + end)/2;
            if(nums[mid] < nums[end]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return nums[start];
    }
}
