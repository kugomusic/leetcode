package firstPass.medium._063;

/**
 * @description:
 * @author: tc
 * @create: 2019/09/17 21:00
 */

/*
执行用时 :2 ms, 在所有 Java 提交中击败了43.81%的用户
内存消耗 :36.2 MB, 在所有 Java 提交中击败了40.82%的用户
 */

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        boolean flagRow = false;
        boolean flagColumn = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    if (flagRow || obstacleGrid[i][j] == 1) {
                        dp[i][j] = 0;
                        flagRow = true;
                    }else {
                        dp[i][j] = 1;
                    }
                }
                if (j == 0) {
                    if (flagColumn || obstacleGrid[i][j] == 1) {
                        dp[i][j] = 0;
                        flagColumn = true;
                    }else {
                        dp[i][j] = 1;
                    }
                }
                if (i != 0 && j != 0) {
                    if (obstacleGrid[i][j] == 1) {
                        dp[i][j] = 0;
                    }else {
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    }
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.uniquePathsWithObstacles(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        }));
    }
}
