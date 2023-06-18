package arrays.Easy;

public class BuyAndSellStock {

    public int maxProfit(int[] arr){

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i< arr.length;i++){
            if(arr[i] < minPrice){
                minPrice = arr[i];
            } else if (arr[i] - minPrice > maxProfit) {

                maxProfit = arr[i] - minPrice;

            }
        }

        return maxProfit;

    }

    public static void main(String[] args){

        BuyAndSellStock buyAndSellStock = new BuyAndSellStock();
        int[] arr = {7,1,5,3,6,4};
        int maxProfit = buyAndSellStock.maxProfit(arr);
        System.out.println("maxProfit "+maxProfit);

    }
}
