package firstPass.easy._258;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/10 18:54
 */

/*
执行用时 :6 ms, 在所有 Java 提交中击败了82.38%的用户
内存消耗 :34.8 MB, 在所有 Java 提交中击败了11.84%的用户
 */

public class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int result = 0;
        while (num != 0) {
            result += num % 10;
            num /= 10;
        }
        return addDigits(result);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addDigits(38));
    }
}
