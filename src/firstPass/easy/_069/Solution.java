package firstPass.easy._069;

/*
调用Math包即可实现, 做一个快乐的调包侠
Call the Math package to achieve, calling makes me happy

执行用时 : 5 ms, 在Sqrt(x)的Java提交中击败了99.24% 的用户
内存消耗 : 33.6 MB, 在Sqrt(x)的Java提交中击败了75.30% 的用户
 */

public class Solution {
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(4));
    }
}
