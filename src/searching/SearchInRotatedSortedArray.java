package searching;

//Given the array nums after the possible rotation and an integer target,
// return the index of target if it is in nums, or -1 if it is not in nums.
//reference - https://www.youtube.com/watch?v=NiM1B0M6YRE&t=757s
public class SearchInRotatedSortedArray {

    public int searchInArray(int[] array, int target){

        int n = array.length;
        int left = 0;
        int right = n-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(array[mid] == target)
            {
                return mid;
            }
            if(array[left] <= array[mid]){
                if(array[left] <= target && target <= array[mid]){
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else {
                if(array[mid] <= target && target <= array[right]){
                    left = mid + 1;
                }
                else {
                    right = mid + 1;
                }
            }
        }

        return -1;

    }

    public static void main(String[] args){
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        int[] array = new int[]{4,5,6,7,0,1,2};
        int target = 6;
        int n = searchInRotatedSortedArray.searchInArray(array, target);

        System.out.println("Index of target element: "+n);

    }
}
