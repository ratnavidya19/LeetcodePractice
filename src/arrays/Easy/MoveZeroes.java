package arrays.Easy;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Youtube - https://www.youtube.com/watch?v=AgiGd763srg
public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
        }

        while(count < nums.length){
            nums[count] = 0;
            count++;
        }

    }
}
