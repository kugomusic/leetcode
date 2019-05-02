package Easy._013;

import java.util.HashMap;
import java.util.Map;

/*
简单地使用了Map的get方法
Simply used get method of Map

执行用时 : 34 ms, 在Roman to Integer的Java提交中击败了76.34% 的用户
内存消耗 : 39.5 MB, 在Roman to Integer的Java提交中击败了77.41% 的用户
 */

public class Solution {
    public int romanToInt(String s) {
        // Map是一个接口不能实例化，HashMap是Map的一个实现
        Map<Character, Integer> map = new HashMap<>(){
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);

            }
        };
        int len = s.length();
        int result = map.get(s.charAt(len - 1));
        for(int i = 0; i < len -1; i++){
            /*
            若当前字母所代表的数值大于下一个字母所代表的数值，加上当前字母所代表的值，否则减去;
            if current letter's value is greater than the next one, add the current letter's value to result;
            else, subtract if from result;
             */
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                result -= map.get(s.charAt(i));
            }
            else{
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("x=III, y=" + solution.romanToInt("III"));
        System.out.println("x=IV, y=" + solution.romanToInt("IV"));
        System.out.println("x=IX, y=" + solution.romanToInt("IX"));
        System.out.println("x=LVIII, y=" + solution.romanToInt("LVIII"));
        System.out.println("x=MCMXCIV, y=" + solution.romanToInt("MCMXCIV"));
    }
}
