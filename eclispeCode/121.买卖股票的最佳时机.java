/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;//最大利润
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int Profit=prices[j]-prices[i];
                if (Profit>maxProfit) {
                    maxProfit=Profit;
                }
            }
        }
        return maxProfit;
    }
}
// @lc code=end

