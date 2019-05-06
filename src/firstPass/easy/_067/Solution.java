package firstPass.easy._067;

/*
代码太长，且可读性差（对比python，如何增加java代码的可读性？）
code is too long and hard to read (compared with python, how to improve the readability of java code ?)

StringBuilder的方法比String更丰富，考虑多使用StringBuilder
StringBuilder's methods are abundant than String, consider using StringBuilder more

执行用时 : 5 ms, 在Add Binary的Java提交中击败了75.11% 的用户
内存消耗 : 35.1 MB, 在Add Binary的Java提交中击败了66.91% 的用户
 */

public class Solution {
    public String addBinary(String a, String b) {
        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        boolean carry = false;
        StringBuilder sb = new StringBuilder();
        // 开始计算两个字符串长度匹配的部分
        // calculate the match part between string a and b
        while (len1 >= 0 && len2 >= 0){
            if (a.charAt(len1) == '1' && b.charAt(len2) == '1'){
                if (carry){
                    sb.append(1);
                }
                else {
                    sb.append(0);
                }
                carry = true;
            }
            else if (a.charAt(len1) == '0' && b.charAt(len2) == '0'){
                if (carry){
                    sb.append(1);
                }
                else {
                    sb.append(0);
                }
                carry = false;
            }
            else {
                if (carry){
                    sb.append(0);
                    carry = true;
                }
                else {
                    sb.append(1);
                    carry = false;
                }
            }
            len1--;
            len2--;
        }
        // 处理剩余字符串、进位
        // deal with the remained string and carry

        // a.length == b.length
        if (len1 == -1 && len2 == -1){
            if (carry){
                sb.append(1);
            }
            return sb.reverse().toString();
        }
        // a.length != b.length
        else {
            // remain为剩余字符串
            // remain is the remained string
            StringBuilder remain;
            if (len1 == -1){
                remain = new StringBuilder(b.substring(0, len2 + 1));
            }
            else {
                remain = new StringBuilder(a.substring(0, len1 + 1));
            }
            if (carry){
                for (int i = remain.length() - 1; i >= 0; i--){
                    if (remain.charAt(i) == '0'){
                        remain.setCharAt(i, '1');
                        carry = false;
                        break;
                    }
                    else {
                        remain.setCharAt(i, '0');
                    }
                }
            }
            sb.append(remain.reverse());
            if (carry){
                sb.append(1);
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("11","1"));
        System.out.println(solution.addBinary("1010","1011"));
        System.out.println(solution.addBinary("101111","10"));
    }
}
