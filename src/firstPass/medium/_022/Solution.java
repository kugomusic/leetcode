package firstPass.medium._022;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/16 13:51
 */

/*
执行用时 :3 ms, 在所有 Java 提交中击败了83.91%的用户
内存消耗 :37.9 MB, 在所有 Java 提交中击败了65.36%的用户
 */

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateString("(", 1, 1, n, result);
        return result;
    }

    private void generateString(String str, int currentLeft, int totalLeft, int n, List<String> result) {
        if (totalLeft == n) {
            int remainRight = n * 2 - str.length();
            StringBuilder sb = new StringBuilder(str);
            for (int i = 0; i < remainRight; i++) {
                sb.append(")");
            }
            result.add(sb.toString());
            return;
        }
        if (currentLeft == 0) {
            generateString(str + "(", currentLeft + 1, totalLeft + 1, n, result);
        }else {
            generateString(str + "(", currentLeft + 1, totalLeft + 1, n, result);
            generateString(str + ")", currentLeft - 1, totalLeft, n, result);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(3));
    }
}
