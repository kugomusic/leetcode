package firstPass.easy._278;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/11 09:57
 */

/*
二分查找
Binary search

执行用时 :15 ms, 在所有 Java 提交中击败了99.78%的用户
内存消耗 :32.9 MB, 在所有 Java 提交中击败了68.20%的用户
 */

public class Solution{
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            /**
             * 使用 Use : mid = left + (right - left) / 2;
             * 代替 Instead : mid = (left + right) / 2;
             * 防止溢出 To prevent overflow
             */
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    // 只是为了让前面调用方法的地方不是红色的 Keep it normal
    private boolean isBadVersion(int n) {
        return n == 2;
    }
}
