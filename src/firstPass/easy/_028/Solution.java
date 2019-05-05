package firstPass.easy._028;

/*
简单的字符串匹配
Simple string match

执行用时 : 3 ms, 在Implement strStr()的Java提交中击败了80.86% 的用户
内存消耗 : 35 MB, 在Implement strStr()的Java提交中击败了94.40% 的用户
 */

public class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if (len == 0){
            return 0;
        }
        boolean flag = false;
        int res = 0;
        for (int i = 0; !flag && i < haystack.length() - len + 1; i++){
            if (haystack.charAt(i) == needle.charAt(0)){
                flag = true;
                res = i;
                for (int j = 1; j < len; j++){
                    if (haystack.charAt(i + j) != needle.charAt(j)){
                        flag = false;
                        break;
                    }
                }
            }
        }
        return flag ? res : -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("haystack = \"hello\", needle = \"ll\"");
        System.out.println(solution.strStr("hello", "ll"));
        System.out.println("haystack = haystack = \"aaaaa\", needle = \"bba\"");
        System.out.println(solution.strStr("aaaaa", "bba"));
    }
}
