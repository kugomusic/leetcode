package firstPass.medium._060;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/09/05 10:27
 */

/*
看k是否大于(n-1)!，判断首字符；循环
See if k is greater than (n-1)!, judge the first character; loop

执行用时 :3 ms, 在所有 Java 提交中击败了90.01%的用户
内存消耗 :34.9 MB, 在所有 Java 提交中击败了88.32%的用户
 */

public class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i > 0 && k > 1; i--) {
            int fac = factorial(i);
            int index = (k - 1) / fac;
            sb.append(list.get(index));
            k = k - index * fac;
            list.remove(index);
        }
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    private int factorial(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getPermutation(3, 3));
    }
}
