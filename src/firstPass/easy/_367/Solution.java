package firstPass.easy._367;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/12 19:55
 */

/*


执行用时 :6 ms, 在所有 Java 提交中击败了16.17%的用户
内存消耗 :33.9 MB, 在所有 Java 提交中击败了11.05%的用户
 */

public class Solution {
    public boolean isPerfectSquare(int num) {
        for (int i = 0; i < 999999; i++) {
            int squre = i * i;
            if (squre == num) {
                return true;
            }else if (squre > num) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPerfectSquare(16));
        System.out.println(solution.isPerfectSquare(14));
    }
}
