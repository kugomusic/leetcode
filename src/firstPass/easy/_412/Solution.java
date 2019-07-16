package firstPass.easy._412;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/16 21:36
 */

/*
执行用时 :3 ms, 在所有 Java 提交中击败了88.62%的用户
内存消耗 :37.3 MB, 在所有 Java 提交中击败了100.00%的用户
 */

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                list.add("Fizz");
            }else if (i % 3 != 0 && i % 5 == 0) {
                list.add("Buzz");
            }else if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            }else {
                list.add("" + i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fizzBuzz(15));
    }
}
