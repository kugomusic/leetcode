package firstPass.easy._122;

/*
涨价即卖
Sell when the price increase

执行用时 : 2 ms, 在Best Time to Buy and Sell Stock II的Java提交中击败了93.90% 的用户
内存消耗 : 38.3 MB, 在Best Time to Buy and Sell Stock II的Java提交中击败了33.11% 的用户
 */

public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                max += prices[i] - prices[i - 1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(solution.maxProfit(new int[]{1,2,3,4,5}));
        System.out.println(solution.maxProfit(new int[]{7,6,4,3,1}));
    }
}
