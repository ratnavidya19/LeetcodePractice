package searching.Hard;

//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
public class MedianOfTwoSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] result = new int[n1+n2];

        int i=0, j=0, k=0;
        while(i < n1 && j < n2){
            if(nums1[i] <= nums2[j]){
                result[k] = nums1[i];
                i++;
            }
            else
            {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            result[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n2){
            result[k] = nums2[j];
            j++;
            k++;
        }

        Double median;
        int mid = result.length/2;
        if((result.length % 2) == 0){
            median =  (double)(result[mid]+result[mid-1])/2;
        }
        else{
            median = (double)result[mid];
        }

        return median;
    }
}
