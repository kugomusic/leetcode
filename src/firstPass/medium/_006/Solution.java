package firstPass.medium._006;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/07 20:58
 */

/*
执行用时 :28 ms, 在所有 Java 提交中击败了47.08%的用户
内存消耗 :46.1 MB, 在所有 Java 提交中击败了69.49%的用户
 */

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int n = numRows * 2 - 2;
        List<StringBuilder> sbs = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            sbs.add(new StringBuilder());
        }
        for (int i = 0; i < s.length(); i++) {
            int j = i % n;
            if (j < numRows) {
                sbs.get(j).append(s.charAt(i));
            }else {
                sbs.get(n - j).append(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sbs.size(); i++) {
            sb.append(sbs.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convert("LEETCODEISHIRING", 3));
    }
}
