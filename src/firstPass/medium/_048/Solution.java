package firstPass.medium._048;


/**
 * @description:
 * @author: tc
 * @create: 2019/08/23 16:20
 */

/*
先上下翻转，再对角翻转
Flip up and down first, then flip it diagonally

执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
内存消耗 :36.4 MB, 在所有 Java 提交中击败了58.92%的用户
 */

public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[n - i -1];
            matrix[n - i -1] = temp;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.rotate(new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        });
    }
}
