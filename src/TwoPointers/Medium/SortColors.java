package TwoPointers.Medium;

//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color
// are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//reference - https://www.youtube.com/watch?v=Kov-M_lTuOA
public class SortColors{

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    public void sortColorsFn(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                mid++;
                low++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {

        SortColors sortColors = new SortColors();
        int[] nums = {2,0,2,1,1,0};
        sortColors.sortColorsFn(nums);


    }

}
