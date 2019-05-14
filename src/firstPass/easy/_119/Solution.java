package firstPass.easy._119;

import java.util.ArrayList;
import java.util.List;

/*
直接复用_118的结果list
Reuse _118's list directly

执行用时 : 2 ms, 在Pascal's Triangle II的Java提交中击败了72.49% 的用户
内存消耗 : 33.3 MB, 在Pascal's Triangle II的Java提交中击败了37.71% 的用户
 */

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
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
        return list.get(rowIndex);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getRow(4));
    }
}
