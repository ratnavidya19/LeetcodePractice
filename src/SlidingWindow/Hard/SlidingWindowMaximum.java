package SlidingWindow.Hard;


import java.util.ArrayDeque;
import java.util.Deque;

//You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the
// array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right
// by one position.
//Youtube - https://www.youtube.com/watch?v=l_CFMVPKv2Q
//Time complexity - Brute force - O(n*k) optimized = O(n)
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> deque=new ArrayDeque<>();
        int ans[]=new int[nums.length-k+1];
        int j = 0;
        for(int i = 0; i < k; i++){
            while(!deque.isEmpty() && deque.peekLast() < nums[i])
            {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        ans[j++] = deque.peekFirst();
        for(int i = k; i<nums.length; i++){
            if(!deque.isEmpty() && deque.peek() == nums[i-k]){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && deque.peekLast() < nums[i])
            {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            ans[j++] = deque.peekFirst();
        }

        return ans;

    }
}
