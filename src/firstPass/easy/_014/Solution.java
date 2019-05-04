package firstPass.easy._014;

/*
第一趟遍历找出最短字符串长度len，第二趟遍历检查公共前缀
First traversal: find out the length of the shortest String, Second traversal: check the common prefix

执行用时 : 3 ms, 在Longest Common Prefix的Java提交中击败了86.94% 的用户
内存消耗 : 35 MB, 在Longest Common Prefix的Java提交中击败了93.50% 的用户
 */

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        // 特例判断
        // judge for special cases
        int str_len = strs.length;
        if (str_len == 0){
            return res;
        }
        else if (str_len == 1){
            return strs[0];
        }
        // 找出最短字符串的长度len
        // find out the length of the shortest String: len
        int len = Integer.MAX_VALUE;
        for(int i = 0; i < str_len; i++){
            if(strs[i].length() < len){
                len = strs[i].length();
            }
        }
        // 遍历找出最长公共前缀
        // Traversing to find the longest common prefix
        if (len == 0){
            return res;
        }
        for(int i = 0; i < len; i++){
            char temp = strs[0].charAt(i);
            boolean flag = true;
            for(int j = 1; j < strs.length; j++){
                if(strs[j].charAt(i) != temp){
                    flag = false;
                    break;
                }
            }
            if(flag){
                res += temp;
            }
            else{
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("x=[\"flower\",\"flow\",\"flight\"], y=" + solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println("x=[\"dog\",\"racecar\",\"car\"], y=" + solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}