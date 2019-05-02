package Easy._7;

/*
结果较好，无需优化
No optimization required

执行用时 : 6 ms, 在Reverse Integer的Java提交中击败了95.64% 的用户
内存消耗 : 33.2 MB, 在Reverse Integer的Java提交中击败了85.54% 的用户
 */

public class Solution {
    public int reverse(int x) {
        long result = 0;
        while (x != 0){
            result = result * 10 + x % 10;
            x /= 10;
        }
        if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
            return 0;
        }
        else{
            return (int)result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("x=123, y=" + solution.reverse(123));
        System.out.println("x=-123, y=" + solution.reverse(-123));
        System.out.println("x=120, y=" + solution.reverse(120));
        System.out.println("x=1000000003, y=" + solution.reverse(1000000003));
    }
}
