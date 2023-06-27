package TwoPointers.Hard;

//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much
// water it can trap after raining.
//Youtube - https://www.youtube.com/watch?v=Lrp9v-NQPXw
//Time complexity - O(n) O(1)
public class TrappingRainWater {

    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int leftbar = height[0];
        int rightbar = height[right];
        int answer = 0;

        while(left <= right)
        {
            if(leftbar < rightbar){
                if(height[left] > leftbar){
                    leftbar = height[left];
                }
                else
                {
                    answer += leftbar - height[left];
                    left++;
                }
            }
            else
            {
                if(height[right] > rightbar){
                    rightbar = height[right];
                }
                else
                {
                    answer += rightbar - height[right];
                    right--;
                }
            }
        }
        return answer;
    }
}
