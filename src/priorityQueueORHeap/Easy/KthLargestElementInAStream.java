package priorityQueueORHeap.Easy;

import java.util.PriorityQueue;

//Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order,
// not the kth distinct element.
//Time complexity - O(log k)
//Youtube - https://www.youtube.com/watch?v=0tFmP1Eiilg
public class KthLargestElementInAStream {


    PriorityQueue<Integer> minHeap;
    int k;

    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>(k);
        for(int num : nums){
            add(num);
        }
    }

    public int add(int val) {
        if(minHeap.size() < k){
            minHeap.offer(val);
        }
        else if(minHeap.size() >= k){
            if(val > minHeap.peek()){
                minHeap.poll();
                minHeap.offer(val);
            }
        }

        return minHeap.peek();
    }
}
