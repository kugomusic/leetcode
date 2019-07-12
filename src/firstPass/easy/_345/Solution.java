package firstPass.easy._345;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/12 15:46
 */

/*
要交换字符，需要先将String转换为char[]；最后返回String，则需要使用String的构造方法，用char[]作为参数构造String
To exchange characters, you need to convert the String to char[]; finally, return String, you need to use the String constructor, construct the String with char[] as a parameter

执行用时 :8 ms, 在所有 Java 提交中击败了78.97%的用户
内存消耗 :41.9 MB, 在所有 Java 提交中击败了39.20%的用户
 */

public class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (!isVowel(chars[i])) {
                i++;
                continue;
            }
            if (!isVowel(chars[j])) {
                j--;
                continue;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
    
    private boolean isVowel(char c) {
        return c == 'A' || c== 'E' || c== 'I' || c== 'O' || c== 'U' || c== 'a' || c== 'e' || c== 'i' || c== 'o' || c== 'u';
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels("hello"));
        System.out.println(solution.reverseVowels("leetcode"));
    }
}
