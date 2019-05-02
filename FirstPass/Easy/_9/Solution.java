package Easy._9;

/*
暴力破解，把int转化为String，并使用charAt方法对比首尾字母是否一致（比较一半即可）
Violent solution, convert int to String, and use charAt method to compare first and last chars (only compare half of the String)

执行用时 : 54 ms, 在Palindrome Number的Java提交中击败了82.91% 的用户
内存消耗 : 38.2 MB, 在Palindrome Number的Java提交中击败了85.29% 的用户
 */

public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String s = Integer.toString(x);
        for(int i = 0; i < s.length() / 2 + 1; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("x=121, y=" + solution.isPalindrome(121));
        System.out.println("x=-121, y=" + solution.isPalindrome(-121));
        System.out.println("x=10, y=" + solution.isPalindrome(10));
    }
}
