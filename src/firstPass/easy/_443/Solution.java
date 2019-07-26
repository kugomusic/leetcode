package firstPass.easy._443;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/25 16:10
 */

/*
双指针 Two pointers

执行用时 :3 ms, 在所有 Java 提交中击败了81.11%的用户
内存消耗 :39.2 MB, 在所有 Java 提交中击败了44.49%的用户
 */

public class Solution {
    public int compress(char[] chars) {
        int left = 0;
        int size = 0;

        for (int right = 0; right <= chars.length; right++) {
            if (right == chars.length || chars[right] != chars[left]) {
                chars[size++] = chars[left];
                if (right - left > 1) {
                    for(char c : String.valueOf(right - left).toCharArray()) {
                        chars[size++] = c;
                    }
                }
                left = right;
            }
        }

        return size;
    }
}
