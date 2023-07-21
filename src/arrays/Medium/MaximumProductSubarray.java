package arrays.Medium;

//Given an integer array nums, find a subarray that has the largest product, and return the product.
//Youtube - https://www.youtube.com/watch?v=GbJh0MjUa5U
public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {

        int maxProduct = Integer.MIN_VALUE;
        int prod = 1;
        for(int i=0; i<nums.length;i++){
            prod = prod * nums[i];
            maxProduct = Math.max(maxProduct, prod);
            if(prod == 0){
                prod = 1;
            }

        }

        prod = 1;
        for(int i=nums.length-1; i>=0;i--){
            prod = prod * nums[i];
            maxProduct = Math.max(maxProduct, prod);
            if(prod == 0){
                prod = 1;
            }

        }

        return maxProduct;

    }
}
