package priorityQueueORHeap.Easy;

import java.util.Collections;
import java.util.PriorityQueue;

//You are given an array of integers stones where stones[i] is the weight of the ith stone.
//Time complexity = O(nlogn)
//Youtube - https://www.youtube.com/watch?v=FLQQx84XqFE
public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : stones){
            maxHeap.offer(num);
        }

        while(maxHeap.size() > 1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if(x > y){
                int val = x - y;
                maxHeap.offer(val);
            }
        }

        if(maxHeap.isEmpty()) return 0;
        else return maxHeap.poll();
    }
}
