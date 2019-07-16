package firstPass.easy._405;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/16 21:19
 */

/*
位运算，每次取后四位
Bit operation, four bits at a time

执行用时 :1 ms, 在所有 Java 提交中击败了100.00%的用户
内存消耗 :34.9 MB, 在所有 Java 提交中击败了94.44%的用户
 */

public class Solution {
    public String toHex(int num) {
        if(num == 0) {
            return "0";
        }
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            sb.append(map[num & 0b1111]);
            num >>>= 4;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.toHex(26));
        System.out.println(solution.toHex(-1));
    }
}
