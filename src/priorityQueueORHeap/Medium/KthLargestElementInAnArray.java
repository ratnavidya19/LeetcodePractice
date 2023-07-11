package priorityQueueORHeap.Medium;

import java.util.PriorityQueue;

//Given an integer array nums and an integer k, return the kth largest element in the array.

public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){

            minHeap.offer(num);

        }

        while(minHeap.size() > k){
            minHeap.poll();
        }


        return minHeap.peek();

    }
}
