package arrays.Medium;

//Given an integer array nums, return an array answer such that answer[i] is equal to the
// product of all the elements of nums except nums[i].
public class ProductOfArrayExceptSelf {

    public int[] arrayProduct(int[] arr){

        int total = 1; int flag = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                total = total * arr[i];
            }
            else {
                flag++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(flag > 1)
            {
                arr[i] = 0;
            } else if (flag == 1) {
                if(arr[i] != 0){
                    arr[i] = 0;
                }
                else {
                    arr[i] = total;
                }
            }
            else {
                arr[i] = total/arr[i];
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] arr = {1, 2, 3, 4};
        int[] number = productOfArrayExceptSelf.arrayProduct(arr);
        for(int i = 0; i<number.length; i++){
            System.out.println(number[i]);

        }
    }
}
