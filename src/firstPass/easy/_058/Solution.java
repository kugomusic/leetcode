package firstPass.easy._058;

/*
结果较好，无需优化
No optimization required

执行用时 : 1 ms, 在Length of Last Word的Java提交中击败了98.71% 的用户
内存消耗 : 34.8 MB, 在Length of Last Word的Java提交中击败了86.65% 的用户
 */

public class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) == ' ' && res == 0){
                continue;
            }
            if (s.charAt(i) != ' '){
                res++;
            }
            else {
                return res;
            }
            if (i == 0){
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World"));
    }
}
