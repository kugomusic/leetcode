package firstPass.easy._121;

/*
动态规划
Dynamic planning

执行用时 : 3 ms, 在Best Time to Buy and Sell Stock的Java提交中击败了70.95% 的用户
内存消耗 : 37.3 MB, 在Best Time to Buy and Sell Stock的Java提交中击败了81.62% 的用户
 */

public class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min_price) {
                min_price = prices[i];
            }
            max = Math.max(prices[i] - min_price, max);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(solution.maxProfit(new int[]{7,6,4,3,1}));
    }
}
