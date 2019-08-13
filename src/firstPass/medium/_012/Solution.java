package firstPass.medium._012;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/13 13:47
 */

/*
执行用时 :7 ms, 在所有 Java 提交中击败了97.55%的用户
内存消耗 :38 MB, 在所有 Java 提交中击败了97.87%的用户
 */

public class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num != 0) {
            int count = num / values[i];
            for (int j = 0; j < count; j++) {
                sb.append(symbols[i]);
                num -= values[i];
            }
            i++;
        }
        return sb.toString();
    }

    private static final int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4,
            1};

    private static final String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV",
            "I"};

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intToRoman(3));
        System.out.println(solution.intToRoman(4));
        System.out.println(solution.intToRoman(9));
        System.out.println(solution.intToRoman(58));
        System.out.println(solution.intToRoman(1994));
    }
}
