package greedy.medium;

//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array
// represents your maximum jump length at that position.
//Return true if you can reach the last index, or false otherwise.
//Yoututbe = https://www.youtube.com/watch?v=EgMPjWliYGY
//Time Complexity = 0(n)

public class JumpGame {
    public boolean canJump(int[] nums) {


        //sol 1
        int index = nums.length-1;
        for(int i = nums.length-1; i>=0; i--){
            if((nums[i]+i) >= index){
                index = i;
            }
        }

        if(index == 0){
            return true;
        }
        else{
            return false;
        }


        //Sol 2
        // int index = nums.length-1;
        // int max_reach = 0;
        // for(int i =0; i<index; i++){
        //     max_reach = Math.max(max_reach, nums[i]+i);
        //     if(max_reach >= index){
        //         return true;
        //     }
        // }
        // return false;

    }
}
