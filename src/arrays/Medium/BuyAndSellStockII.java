package arrays.Medium;

public class BuyAndSellStockII {

    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        for(int i = 1; i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                maxProfit += (prices[i] - prices[i-1]);
            }
        }
        return maxProfit;

    }

    public static void main(String[] args){

        BuyAndSellStockII buyAndSellStock = new BuyAndSellStockII();
        int[] arr = {7,1,5,3,6,4};
        int maxProfit = buyAndSellStock.maxProfit(arr);
        System.out.println("maxProfit "+maxProfit);

    }
}
