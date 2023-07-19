package intervals.easy;

import java.util.Arrays;

//Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person could attend all meetings.
public class MeetingRoom {

    public boolean canAttendMeetings(int[][] intervals) {
        if(intervals.length == 0)
            return true;
        Arrays.sort(intervals, (a, b)->a[0]-b[0]);
        for (int i=1;i<intervals.length;i++){
            if (intervals[i][0]<intervals[i-1][1])
                return false;
        }
        return true;
    }
}
