/***
 * Given an array of stock prices over several days. The task is to find the maximum profit that can be achieved by buying one stock on a specific day and selling it on a future day. If no profit can be made, the function should return 0.
 * Example 1: Input: prices = [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2: Input: prices = [7,6,4,3,1] Output: 0 Explanation: In this case, no transactions are done, so the max profit is 0.
 */
package main.java.codingproblems.arrays;

public class BuySellStock {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4}; // 5
        int maxProfit = maxProfit(prices);
        System.out.println(" Max Profit: " + maxProfit);
    }

    /**
     * 1. At the beginning the minimum price is the first price
     * 2. Iterate through the array
     * 3. If current price is less than buy price then update buy price with current price
     * 4. else If current price is greater than buy price then check if we can get a better profit
     * 5. If current profit is greater than max profit then update max profit
     * 6. Return max profit
     */
    private static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int currentProfit = prices[i] - buyPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }
}
