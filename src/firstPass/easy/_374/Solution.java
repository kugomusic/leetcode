package firstPass.easy._374;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/13 21:26
 */

/*
二分查找
Binary search

执行用时 :1 ms, 在所有 Java 提交中击败了97.85%的用户
内存消耗 :33.5 MB, 在所有 Java 提交中击败了67.19%的用户
 */

public class Solution {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) == 0) {
                return mid;
            }else if (guess(mid) == -1) {
                right = mid - 1;
            }else if (guess(mid) == 1) {
                left = mid + 1;
            }
        }
        return left;
    }

    private int guess(int n) {
        return 0;
    }
}
