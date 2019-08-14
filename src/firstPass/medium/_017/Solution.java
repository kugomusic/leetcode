package firstPass.medium._017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/14 14:26
 */

/*
结合HashMap，递归调用addLetters
Recursively call addLetters in conjunction with HashMap

执行用时 :2 ms, 在所有 Java 提交中击败了72.95%的用户
内存消耗 :35.7 MB, 在所有 Java 提交中击败了76.71%的用户
 */

public class Solution {

    private Map<Character, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if ("".equals(digits)) {
            return result;
        }

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        addLetters(digits, result, 0, "");

        return result;
    }

    private void addLetters(String digits, List<String> result, int index, String s) {
        if (index == digits.length()) {
            result.add(s);
            return;
        }
        String letters = map.get(digits.charAt(index));
        for (int i = 0; i < letters.length(); i++) {
            addLetters(digits, result, index + 1, s + letters.charAt(i));
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
    }
}
