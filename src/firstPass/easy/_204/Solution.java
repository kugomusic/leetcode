package firstPass.easy._204;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/05 16:44
 */

/*
优化了判断质数的函数（除数小于等于根号n，剔除2以外的偶数），勉强通过
Optimized the function of judging the prime number (the divisor is less than or equal to the root number n, and the even number other than 2), and barely passed

执行用时 :425 ms, 在所有 Java 提交中击败了5.03%的用户
内存消耗 :32.7 MB, 在所有 Java 提交中击败了88.78%的用户
 */

public class Solution {
    public int countPrimes(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                result++;
            }
        }
        return result;
    }

    private static boolean isPrime(int n) {
        if (n <= 3) {
            return n > 1;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countPrimes(10));
        System.out.println(solution.countPrimes(1500000));
    }
}
