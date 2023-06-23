package stack.Medium;

import java.util.Stack;

//Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is
// the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for
// which this is possible, keep answer[i] == 0 instead.
//Youtube -https://www.youtube.com/watch?v=7MIXlgBfr_U
//Time Complexity - O(n)
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i = temperatures.length-1; i >= 0; i--){
            // if(stack.isEmpty()){
            //     stack.push(i);
            // }
            // else
            // {
            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek() - i;
            }
            stack.push(i);
            // }
        }
        return result;

    }
}
