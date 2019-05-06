package firstPass.easy._066;

import java.util.Arrays;

/*
语句较为冗杂，考虑进行优化
Statements are stupid and cumbersome, consider optimizing

执行用时 : 1 ms, 在Plus One的Java提交中击败了85.46% 的用户
内存消耗 : 33.9 MB, 在Plus One的Java提交中击败了100.00% 的用户
 */

public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        // 若末尾是9，进行进位
        // if the last position is 9, carry is need
        if (digits[len - 1] == 9){
            if (len == 1){
                return new int[]{1,0};
            }
            digits[len - 1] = 0;
            for (int i = len - 2; i >= 0; i--){
                if (digits[i] == 9){
                    digits[i] = 0;
                }
                else {
                    digits[i]++;
                    break;
                }
            }
            if (digits[0] == 0){
                int[] res_plus = new int[len + 1];
                res_plus[0] = 1;
                for (int i = 0; i < len; i++){
                    res_plus[i + 1] = digits[i];
                }
                return res_plus;
            }
        }
        else {
            digits[len - 1]++;
        }
        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{1,2,3})));
    }
}
