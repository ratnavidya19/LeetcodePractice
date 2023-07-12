package priorityQueueORHeap.Hard;

import java.util.Collections;
import java.util.PriorityQueue;

//The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value,
// and the median is the mean of the two middle values.
//Time complexity =
//Youtube - https://www.youtube.com/watch?v=KtJlTfHtMhc
public class FindMedianfromDataStream {

    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public FindMedianfromDataStream() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {

        if(maxHeap.isEmpty() && minHeap.isEmpty()){
            maxHeap.add(num);
        }
        else
        {
            if(maxHeap.peek() < num){
                minHeap.add(num);
            }
            else{
                maxHeap.add(num);
            }
        }

        int n = maxHeap.size();
        int m = minHeap.size();
        if(n-m == 2 || n-m == -2){
            if(maxHeap.size() > minHeap.size()){
                int element = maxHeap.peek();
                maxHeap.poll();
                minHeap.add(element);
            }
            else
            {
                int element = minHeap.peek();
                minHeap.poll();
                maxHeap.add(element);
            }
        }

    }

    public double findMedian() {

        int n = maxHeap.size();
        int m = minHeap.size();

        if((n+m)%2 == 0){
            return (maxHeap.peek()+minHeap.peek())/2.0;
        }
        else
        {
            if(n > m){
                return maxHeap.peek();
            }
            else
            {
                return minHeap.peek();
            }

        }
    }
}
