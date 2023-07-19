package intervals.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

//Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], return the minimum number
// of conference rooms required.
//Youtube - https://www.youtube.com/watch?v=s8oOsWGHIl4
public class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {
        int rooms = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Arrays.sort(intervals, (a, b)->(a[0]-b[0]));
        for(int i = 0; i < intervals.length; i++){
            if(i == 0){
                rooms++;
            }
            else if(queue.peek() > intervals[i][0]){
                rooms++;
            }
            else
            {
                queue.poll();
            }
            queue.add(intervals[i][1]);
        }

        return rooms;
    }
}
