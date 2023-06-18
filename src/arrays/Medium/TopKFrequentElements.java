package arrays.Medium;

import java.util.HashMap;
import java.util.PriorityQueue;

//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
//
// Time complexity = nlogk
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(int num:map.keySet()){
            minHeap.offer(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for(int i= k-1; i>=0; i--){
            result[i] = minHeap.poll();
        }

        return result;
    }
}
