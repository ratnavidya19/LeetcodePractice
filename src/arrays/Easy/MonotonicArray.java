package arrays.Easy;

//An array is monotonic if it is either monotone increasing or monotone decreasing.
public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {
        boolean increasing = false, decreasing = false;
        for(int i = 0 ; i<nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                increasing = true;
            }
            else if(nums[i] > nums[i+1]){
                decreasing = true;
            }

        }

        if(increasing && decreasing){
            return false;
        }
        else{
            return true;
        }
    }
}
