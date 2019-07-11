package firstPass.easy._292;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/11 11:10
 */

/*
只要是4的倍数，就肯定会输，无论你拿多少，对方都会跟你凑4
As long as it is a multiple of 4, it will definitely lose. No matter how much you take, the other player will take the remaining of 4

执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
内存消耗 :33.3 MB, 在所有 Java 提交中击败了11.50%的用户
 */

public class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canWinNim(4));
    }
}
