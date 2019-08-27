package firstPass.medium._054;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/27 15:35
 */

/*
对于每层，分右、下、左、上四个方向分别遍历；需要注意：当最后一层只剩一行或一列时，要加入条件避免重复遍历
For each layer, it is traversed in four directions: right, down, left, and up. Note: When there is only one row or one column left in the last layer, add conditions to avoid repeated traversal

执行用时 :
1 ms, 在所有 Java 提交中击败了90.72%的用户
内存消耗 :35.4 MB, 在所有 Java 提交中击败了41.86%的用户
 */

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int count = (Math.min(m, n) + 1) / 2;
        while (i < count) {
            for (int j = i; j < n - i; j++) {
                result.add(matrix[i][j]);
            }
            for (int j = i + 1; j < m - i; j++) {
                result.add(matrix[j][n - 1 - i]);
            }
            for (int j = i + 1; j < n - i && m - 1 - i != i; j++) {
                result.add(matrix[m - 1 - i][n - 1 - j]);
            }
            for (int j = i + 1; j < m - i - 1 && n - 1 - i != i; j++) {
                result.add(matrix[m - 1 - j][i]);
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.spiralOrder(new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        }));
    }
}
