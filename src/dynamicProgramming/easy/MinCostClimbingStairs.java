package dynamicProgramming.easy;

//You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost,
// you can either climb one or two steps.
//You can either start from the step with index 0, or the step with index 1.
//Return the minimum cost to reach the top of the floor.
//Youtube - https://www.youtube.com/watch?v=kLCGmZGtImM
public class MinCostClimbingStairs {

    //using memoization
    public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length];

        return Math.min(helper(cost, 0, dp), helper(cost, 1, dp));
    }

    public int helper(int[] cost, int i, int[] dp){

        if(i >= cost.length) return 0;
        if(dp[i] != 0) return dp[i];

        int oneStep = cost[i] + helper(cost, i+1, dp);
        int twoStep = cost[i] + helper(cost, i+2, dp);

        return Math.min(oneStep, twoStep);

    }
}
