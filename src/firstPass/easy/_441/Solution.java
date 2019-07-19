package firstPass.easy._441;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/19 19:48
 */

/*
数学题。。。浪费老子时间
Math problem ... You are killing the time of your father!

执行用时 :7 ms, 在所有 Java 提交中击败了93.45%的用户
内存消耗 :34.5 MB, 在所有 Java 提交中击败了75.12%的用户
 */

public class Solution {
//    public int arrangeCoins(int n) {
//        BigInteger n2 = BigInteger.valueOf(n);
//        BigInteger res = n2.multiply(BigInteger.valueOf(2));
//        BigInteger i = res.sqrt().add(BigInteger.valueOf(1));
//        while (i.multiply(i.add(BigInteger.valueOf(1)).divide(BigInteger.valueOf(2))).compareTo(BigInteger.valueOf(n)) > 0) {
//            i = i.subtract(BigInteger.valueOf(1));
//        }
//        return i.intValue();
//    }

    public int arrangeCoins(int n) {
        return (int)((-1+Math.sqrt(1+8*(long)n))/2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.arrangeCoins(1804289383));
    }
}
