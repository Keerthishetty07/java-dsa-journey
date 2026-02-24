// Problem: Best Time to Buy and Sell Stock (LeetCode #121)
// Approach: Greedy + Prefix Minimum Tracking (Single Pass)
//  Time: O(n)
// Space: O(1)
// Insight: Track the minimum price seen so far and compute profit if selling today
  
public class Day2_BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
