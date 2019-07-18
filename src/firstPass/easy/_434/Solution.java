package firstPass.easy._434;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/18 20:57
 */

/*
执行用时 :1 ms, 在所有 Java 提交中击败了72.05%的用户
内存消耗 :34.9 MB, 在所有 Java 提交中击败了41.82%的用户
 */

public class Solution {
    public int countSegments(String s) {
        int result = 0;
        if ("".equals(s)) {
            return result;
        }
        if (s.length() == 1) {
            if (s.charAt(0) != ' ') {
                return 1;
            }else {
                return 0;
            }
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                result++;
            }
            if (i == s.length() - 1 && s.charAt(i) != ' ') {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countSegments("Hello, my name is John"));
        System.out.println(solution.countSegments(", , , ,        a, eaefa"));
    }
}
