package firstPass.easy._118;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList的简单使用
Simple use of ArrayList

执行用时 : 1 ms, 在Pascal's Triangle的Java提交中击败了97.39% 的用户
内存消耗 : 33.8 MB, 在Pascal's Triangle的Java提交中击败了29.45% 的用户
 */

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j<= i; j++) {
                if (j == 0 || j ==i) {
                    temp.add(1);
                }
                else {
                    List<Integer> pre_list = list.get(i - 1);
                    temp.add(pre_list.get(j - 1) + pre_list.get(j));
                }
            }
            list.add(temp);
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generate(5));
    }
}
