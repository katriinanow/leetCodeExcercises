//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/

public class BestTimeToBuyAndSellStock2 {

    static int findBiggestProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i -1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }



    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(findBiggestProfit(prices));
    }
}
