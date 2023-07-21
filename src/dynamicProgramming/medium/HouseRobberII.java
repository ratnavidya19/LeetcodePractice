package dynamicProgramming.medium;

//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed.
// All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one.
// Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent
// houses were broken into on the same night.
public class HouseRobberII {

    public int rob(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        int ans1 = helper(nums, 1);
        int ans2 = helper(nums, 0);
        return Math.max(ans1, ans2);

    }

    public int helper(int nums[], int i) {
        int dp[] = new int[nums.length];
        dp[0] = 0;
        dp[1] = nums[i++];
        for (int a = 2; a < dp.length; a++) {
            dp[a] = Math.max(dp[a - 1], (dp[a - 2] + nums[i++]));
        }
        return dp[dp.length - 1];
    }
}
