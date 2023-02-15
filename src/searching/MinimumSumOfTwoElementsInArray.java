package searching;

public class MinimumSumOfTwoElementsInArray {

    public void minAbsSumPair(int[] arr, int n){
        int sum, min_sum;
        int min_i = 0;
        int min_j = 1;
        min_sum = arr[min_i] + arr[min_j];

        for(int i=0; i<n-1;i++)
        {
            for(int j=i+1; j<n; j++)
            {
                sum = arr[i] + arr[j];
                if(Math.abs(min_sum) > Math.abs(sum))
                {
                    min_sum = sum;
                    min_i = i;
                    min_j = j;
                }
            }
        }

        System.out.println("The two elements whose sum is minimum are: "+arr[min_i]+"  "+arr[min_j]);
    }

    public static void main(String[] args){
        MinimumSumOfTwoElementsInArray minSum = new MinimumSumOfTwoElementsInArray();
        int[] arr = new int[]{1, 60, -10, 70, -80, 85};
        int n = arr.length;
        minSum.minAbsSumPair(arr,n);
    }
}
