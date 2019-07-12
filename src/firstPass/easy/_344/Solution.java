package firstPass.easy._344;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/12 15:27
 */

/*
执行用时 :4 ms, 在所有 Java 提交中击败了85.60%的用户
内存消耗 :54.8 MB, 在所有 Java 提交中击败了60.77%的用户
 */

public class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        if (len <= 1) {
            return;
        }
        for (int i = 0; i < len / 2; i++) {
            char temp = s[i];
            s[i] = s[len - i - 1];
            s[len - i  - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = new char[]{'h','e','l','l','o'};
        solution.reverseString(s);
        System.out.println(s);
    }
}
