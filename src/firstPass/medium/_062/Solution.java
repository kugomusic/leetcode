package firstPass.medium._062;

/**
 * @description:
 * @author: tc
 * @create: 2019/09/06 16:41
 */

/*
动态规划，dp[i][j]代表从(0,0)到(i,j)的路径数
Dynamic programming, dp[i][j] represents the number of paths from (0,0) to (i,j)

执行用时 :1 ms, 在所有 Java 提交中击败了97.68%的用户
内存消耗 :33.6 MB, 在所有 Java 提交中击败了13.57%的用户
 */

public class Solution {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                }else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.uniquePaths(7, 3));
    }




    // 超时 TimeOut
//    private int count = 0;
//
//    public int uniquePaths(int m, int n) {
//        int[][] visited = new int[m][n];
//        findPath(0, 0, visited);
//        return count;
//    }
//
//    private void findPath(int p, int q, int[][] visited) {
//        visited[p][q] = 1;
//        int n = visited.length;
//        int m = visited[0].length;
//        if (p == n - 1 && q == m - 1) {
//            count++;
//        }
//        if (q < m - 1 && visited[p][q + 1] == 0) {
//            findPath(p, q + 1, visited);
//            visited[p][q + 1] = 0;
//        }
//        if (p < n - 1 && visited[p + 1][q] == 0) {
//            findPath(p + 1, q, visited);
//            visited[p + 1][q] = 0;
//        }
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.uniquePaths(23, 12));
//    }
}
