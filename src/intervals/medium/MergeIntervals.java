package intervals.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array
// of the non-overlapping intervals that cover all the intervals in the input.
//Youtube - https://www.youtube.com/watch?v=qKczfGUrFY4
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> (a[0]-b[0]));
        int[] curr_interval = intervals[0];
        list.add(curr_interval);

        for(int[] interval : intervals){
            int curr_begin = curr_interval[0];
            int curr_end = curr_interval[1];

            int next_begin = interval[0];
            int next_end = interval[1];

            if(curr_end >= next_begin){
                curr_interval[1] = Math.max(curr_end, next_end);

            }
            else{
                curr_interval = interval;
                list.add(curr_interval);
            }
        }


        return list.toArray(new int[list.size()][]);
    }
}
