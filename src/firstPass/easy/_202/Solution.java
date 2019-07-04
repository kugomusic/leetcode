package firstPass.easy._202;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/04 15:37
 */

/*
检测到循环（重复数字出现），则需返回false
Return false when loop appears (one number repeated)

执行用时 :6 ms, 在所有 Java 提交中击败了62.80%的用户
内存消耗 :34.3 MB, 在所有 Java 提交中击败了23.97%的用户
 */

public class Solution {
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        if (appearedNums.contains(n)) {
            return false;
        } else {
            appearedNums.add(n);
        }
        int next = 0;
        while (n > 0) {
            next += Math.pow(n % 10, 2);
            n /= 10;
        }
        return isHappy(next);
    }

    private Set<Integer> appearedNums = new HashSet<>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(19));
        System.out.println(solution.isHappy(2));
    }
}
