package firstPass.easy._168;

/*
26进制数，循环时-1即可
26-digit number, n-- when looping

执行用时 : 0 ms, 在Excel Sheet Column Title的Java提交中击败了100.00% 的用户
内存消耗 : 33.4 MB, 在Excel Sheet Column Title的Java提交中击败了91.36% 的用户
 */

public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.append((char)(n % 26 + 'A'));
            n = n / 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convertToTitle(1));
        System.out.println(solution.convertToTitle(28));
        System.out.println(solution.convertToTitle(701));
        System.out.println(solution.convertToTitle(111111));
    }
}
