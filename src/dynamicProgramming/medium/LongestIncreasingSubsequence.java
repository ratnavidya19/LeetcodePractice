package dynamicProgramming.medium;

//Given an integer array nums, return the length of the longest strictly increasing
//subsequence
//Youtube - https://www.youtube.com/watch?v=EsgaVYo9McI
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i]=1;
        }
        int ans = 1;
        for(int i=1; i<nums.length; i++){
            for(int j=i-1; j>=0; j--){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                    ans = Math.max(ans, dp[i]);
                }
            }

        }

        return ans;


    }
}
