package firstPass.easy._038;

/*
将字符串的拼接从 “+” 换成StringBuilder.append后，性能获得了极大的提升
After the string splicing was changed from "+" to StringBuilder.append, the performance was greatly improved.
可能是编译的原因，若追求性能，在循环中使用StringBuilder更好
May be the reason for compiling, if you are looking for performance, it is better to use StringBuilder in the loop.

+：
执行用时 : 35 ms, 在Count and Say的Java提交中击败了26.00% 的用户
内存消耗 : 63.4 MB, 在Count and Say的Java提交中击败了20.92% 的用户

StringBuilder.append：
执行用时 : 4 ms, 在Count and Say的Java提交中击败了88.52% 的用户
内存消耗 : 33.4 MB, 在Count and Say的Java提交中击败了99.42% 的用户
 */

public class Solution {
    public String countAndSay(int n) {
        String str = "1";
        // 报数n-1次
        // Say n-1 times
        while (n-- > 1){
            int len = 1;
//            String temp = "";
            StringBuilder temp = new StringBuilder();
            // 累计同字符数量，当字符不同或遍历至末尾时，将报数内容添加至temp中并把len置1
            // count the number of same character, add the string into temp and make len=1 when find different character or traverse to the end
            for (int i = 0; i < str.length(); i++){
                if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)){
//                    temp = temp + len + str.charAt(i);
                    temp.append(len).append(str.charAt(i));
                    len = 1;
                }
                else {
                    len++;
                }
            }
            str = temp.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("1\n" + solution.countAndSay(1));
        System.out.println("4\n" + solution.countAndSay(4));
    }
}
