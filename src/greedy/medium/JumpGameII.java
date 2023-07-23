package greedy.medium;

//https://leetcode.com/problems/jump-game-ii/description/
//https://www.youtube.com/watch?v=wLPdkLM_BWo
public class JumpGameII {

    public int jump(int[] nums) {

        int farthest = 0;
        int jumps = 0;
        int current = 0;

        for(int i = 0; i<nums.length-1; i++){
            farthest = Math.max(farthest, nums[i]+i);
            if(i == current){
                current = farthest;
                jumps++;
            }
        }

        return jumps;
    }
}
