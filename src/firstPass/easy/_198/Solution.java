package firstPass.easy._198;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/04 13:59
 */

/*
动态规划方程 Dynamic programming equation：
dp[n] = MAX(dp[n-1], dp[n-2] + nums[n])
其中，dp[n]表示从0到n可以打劫到的最大收益（不一定要打劫n）；两种分支（不打劫n，打劫n）
Among them, dp[n] represents the maximum benefit that can be robbed from 0 to n (not necessarily rob n); two branches (not rob n, rob n)

执行用时 :1 ms, 在所有 Java 提交中击败了97.85%的用户
内存消耗 :34.4 MB, 在所有 Java 提交中击败了84.58%的用户
 */

public class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        }
        int[] maxBenefit = new int[n];
        maxBenefit[0] = nums[0];
        maxBenefit[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            maxBenefit[i] = Math.max(maxBenefit[i - 1], maxBenefit[i - 2] + nums[i]);
        }
        return maxBenefit[n - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rob(new int[]{1,2,3,1}));
        System.out.println(solution.rob(new int[]{2,7,9,3,1}));
    }
}
