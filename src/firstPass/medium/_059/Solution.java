package firstPass.medium._059;


import firstPass.tools.Tools;

/**
 * @description:
 * @author: tc
 * @create: 2019/09/03 15:24
 */

/*
与054思路相同，逐层遍历即可
Same idea with 054, just traverse layer by layer

执行用时 :1 ms, 在所有 Java 提交中击败了70.37%的用户
内存消耗 :34.8 MB, 在所有 Java 提交中击败了49.02%的用户
 */

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int num = 1;
        int i = 0;
        int count = (n + 1) / 2;
        while (num <= n * n && i < count) {
            for (int j = i; j < n - i; j++) {
                result[i][j] = num++;
            }
            for (int j = i + 1; j < n - i; j++) {
                result[j][n - 1 - i] = num++;
            }
            for (int j = i + 1; j < n - i && n - 1 - i != i; j++) {
                result[n - 1 - i][n - 1 - j] = num++;
            }
            for (int j = i + 1; j < n - i - 1 && n - 1 - i != i; j++) {
                result[n - 1 - j][i] = num++;
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Tools.printTwoDimensionArray(solution.generateMatrix(5));
    }
}
