package intervals.medium;

import java.util.ArrayList;
import java.util.List;

//Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does
// not have any overlapping intervals (merge overlapping intervals if necessary).
//Youtube - https://www.youtube.com/watch?v=sJUj1zzGfhE
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>();
        for(int[] interval:intervals){
            if(interval[1] < newInterval[0]){
                list.add(interval);
            }
            else if(interval[0] > newInterval[1]){
                list.add(newInterval);
                newInterval = interval;
            }
            else
            {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        list.add(newInterval);

        return list.toArray(new int[list.size()][]);
    }
}
