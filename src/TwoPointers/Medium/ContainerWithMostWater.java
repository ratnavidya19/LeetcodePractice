package TwoPointers.Medium;

//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints
// of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store.
//reference - https://www.youtube.com/watch?v=aO9eAw1wKvE     Time complexity - 0(n2)
public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int start = 0;
        int end = height.length-1;
        int area;
        int maxarea = 0;
        while(start < end){
            area = Math.min(height[start], height[end]) * (end - start);
            if(area > maxarea){
                maxarea = area;
            }

            if(Math.min(height[start], height[end]) == height[start]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {

        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] nums = {1,8,6,2,5,4,8,3,7};
        int maxarea = containerWithMostWater.maxArea(nums);
        System.out.println(maxarea);


    }
}
