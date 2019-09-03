package firstPass.medium._056;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @description:
 * @author: tc
 * @create: 2019/09/03 13:59
 */

/*
先用Arrays.sort()排序一下，自定义Comparator: 按照数列的首数字排序；之后就简单了
First sort with Arrays.sort(), customize the Comparator: sort by the first number of the array; then it's simple

执行用时 :17 ms, 在所有 Java 提交中击败了65.54%的用户
内存消耗 :42.9 MB, 在所有 Java 提交中击败了73.19%的用户
 */

public class Solution {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        int[][] result = new int[len][];
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (i != len - 1) {
                if (intervals[i][1] >= intervals[i + 1][0]) {
                    intervals[i + 1] = new int[]{intervals[i][0], Math.max(intervals[i][1], intervals[i + 1][1])};
                }else {
                    result[count++] = intervals[i];
                }
            }else {
                result[count++] = intervals[i];
            }
        }
        return Arrays.copyOfRange(result, 0, count);
    }

    private static void arrayPrinter(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int[] temp = array[i];
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[j]);
                if (j != temp.length - 1) {
                    System.out.print(",");
                }else {
                    System.out.println(";");
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        arrayPrinter(solution.merge(new int[][]{
//                {1,3},
//                {2,6},
//                {8,10},
//                {15,18}
//        }));
        arrayPrinter(solution.merge(new int[][]{
                {1,4},
                {2,3}
        }));
    }
}
