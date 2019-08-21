package firstPass.medium._036;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/21 09:36
 */

/*
分别检查所在row、column、box是否存在相同的数字；其中boxIndex的计算方法为：rowIndex / 3 * 3 + columnIndex / 3
Check whether the row, column, and box have the same number; the boxIndex is calculated as: rowIndex / 3 * 3 + columnIndex / 3

执行用时 :11 ms, 在所有 Java 提交中击败了51.78%的用户
内存消耗 :41.9 MB, 在所有 Java 提交中击败了83.96%的用户
 */

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer>[] rows = new Set[9];
        Set<Integer>[] columns = new Set[9];
        Set<Integer>[] boxs = new Set[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxs[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int num = c - '0';
                    if (rows[i].contains(num) || columns[j].contains(num) || boxs[i / 3 * 3 + j / 3].contains(num)) {
                        return false;
                    }
                    rows[i].add(num);
                    columns[j].add(num);
                    boxs[i / 3 * 3 + j / 3].add(num);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValidSudoku(new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'},
        }));
    }
}
