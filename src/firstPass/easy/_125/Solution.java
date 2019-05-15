package firstPass.easy._125;

/*
初步字符使用，只需要一些细心
Easy character use, only need to be careful

执行用时 : 8 ms, 在Valid Palindrome的Java提交中击败了88.74% 的用户
内存消耗 : 36.7 MB, 在Valid Palindrome的Java提交中击败了96.73% 的用户
 */

public class Solution {
    public boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (!letterOrNumber(s.charAt(i)) && i < j) {
                i++;
            }
            while (!letterOrNumber(s.charAt(j)) && j > i) {
                j--;
            }
            char a = Character.toLowerCase(s.charAt(i));
            char b = Character.toLowerCase(s.charAt(j));
            if (a != b) {
                return false;
            }
        }
        return true;
    }

    // 判断是否为字母或数字
    // judge whether it is a letter or number
    public static boolean letterOrNumber(char a) {
        if ((a >= '0' && a <= '9') || (a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome("race a car"));
        System.out.println(solution.isPalindrome("0P"));
        System.out.println(solution.isPalindrome("`l;`` 1o1 ??;l`"));
    }
}
