package searching;

public class PeakIndexInMountainArray {

    public int findPeakIndex(int[] array){

        int low = 0;
        int high = array.length-1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(array[mid] < array[mid+1]){
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args){
        PeakIndexInMountainArray peakIndexInMountainArray = new PeakIndexInMountainArray();
        int[] array = new int[]{0,2,1,0};

        int n = peakIndexInMountainArray.findPeakIndex(array);

        System.out.println("Index of Peak element: "+n);

    }
}
