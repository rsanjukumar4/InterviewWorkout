package array;

public class BuyAndSellStock {
    public static void main(String[] args) {
        BuyAndSellStock buyAndSellStock = new BuyAndSellStock();
        int[] nums = {7,1,5,3,6,4};
//        int[] nums = {7,6,4,3,1};
//        int[] nums = {2,1,2,0,1};
//        System.out.println(buyAndSellStock.maxProfit2(nums));
        System.out.println(buyAndSellStock.maxProfit(nums));
//        System.out.println(buyAndSellStock.maxProfit(nums, nums.length));
    }

    public int maxProfit2(int[] prices) {

        if(prices == null || prices.length <= 1) {
            return 0;
        }
        int maximumprofit = 0;
        for(int i =1; i< prices.length;i++) {
           if(prices[i] >prices[i-1]) {
               maximumprofit = maximumprofit + (prices[i] - prices[i-1]);
           }
        }
        return maximumprofit;
    }

    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1) {
            return 0;
        }
        int maximumProfit = 0;
        int buy = prices[0];
        for(int i =1; i< prices.length;i++) {
            if(buy > prices[i]) {
                buy = prices[i];
            } else if ((prices[i] - buy) > maximumProfit) {
                maximumProfit = prices[i] - buy;

            }
        }
        return maximumProfit;
    }

//    private int maxProfit(int prices[], int n)
//    {
//        int buy = prices[0], max_profit = 0;
//        for (int i = 1; i < n; i++) {
//
//            // Checking for lower buy value
//            if (buy > prices[i])
//                buy = prices[i];
//
//                // Checking for higher profit
//            else if (prices[i] - buy > max_profit)
//                max_profit = prices[i] - buy;
//        }
//        return max_profit;
//    }


}
