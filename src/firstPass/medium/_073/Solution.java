package firstPass.medium._073;

import firstPass.tools.Tools;

/**
 * @description:
 * @author: tc
 * @create: 2019/10/14 16:28
 */

/*
原数组的首行、首列的元素记录其所在列/行是否需要全置0；在此之前，需要两个布尔型变量，记录首行、首列是否需要置0
The first row and the first column of the original array record whether the column/row of the array need to be set to 0.
Before that, two Boolean variables are needed to record whether the first row and the first column need to be set to 0.

执行用时 :1 ms, 在所有 java 提交中击败了100.00%的用户
内存消耗 :43.1 MB, 在所有 java 提交中击败了97.99%的用户
 */

public class Solution {
    public void setZeroes(int[][] matrix) {
        // 用于记录首行和首列是否需要置0
        // To record whether the first row and the first column needed to be changed to 0
        boolean row = false;
        boolean column = false;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                column = true;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                row = true;
                break;
            }
        }
        // matrix的首行和首列记录其所在列/行是否需要全置0
        // The first row and the first column of the matrix record whether the column/row of the matrix needs to be fully set to 0
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 1; j < m; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        if (row) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] = 0;
            }
        }
        if (column) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[][]{
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        solution.setZeroes(matrix);
        Tools.printTwoDimensionArray(matrix);
    }
}
