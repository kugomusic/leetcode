package firstPass.medium._064;

/**
 * @description:
 * @author: tc
 * @create: 2019/09/29 15:48
 */

/*
动态规划
Dynamic programming

执行用时 :3 ms, 在所有 Java 提交中击败了96.83%的用户
内存消耗 :42.3 MB, 在所有 Java 提交中击败了42.86%的用户
 */

public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                }
                if (j == 0 && i > 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                }
                if (i > 0 && j > 0) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minPathSum(new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        }));
    }
}
