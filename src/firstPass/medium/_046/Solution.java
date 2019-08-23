package firstPass.medium._046;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/22 15:32
 */

/*
回溯法 backtrack
注意：使用List.remove()时，如：list.remove(num)具有歧义，num有可能是角标，也有可能是内容；试num的类型而定：int --> 角标，Integer --> 内容
Note: When using List.remove(), such as: list.remove(num) is ambiguous, num may be a index, or it may be content; that depend on the type of num: int --> index, Integer -- > Content

方法一 Solution 1：
执行用时 :15 ms, 在所有 Java 提交中击败了5.24%的用户
内存消耗 :40 MB, 在所有 Java 提交中击败了34.07%的用户

方法二 Solution 2：
执行用时 :4 ms, 在所有 Java 提交中击败了67.70%的用户
内存消耗 :39 MB, 在所有 Java 提交中击败了49.96%的用户
 */

public class Solution {

    // 方法一 Solution 1
//    private List<List<Integer>> result = new ArrayList<>();
//
//    public List<List<Integer>> permute(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            List<Integer> list = new ArrayList<>();
//            List<Integer> reducedNums = new ArrayList<>();
//            for (Integer num: nums) {
//                if (num == nums[i]) {
//                    continue;
//                }
//                reducedNums.add(num);
//            }
//            list.add(nums[i]);
//            addCombination(new ArrayList<>(reducedNums), list);
//        }
//        return result;
//    }
//
//    private void addCombination(List<Integer> reducedNums, List<Integer> list) {
//        if (reducedNums.size() == 0) {
//            result.add(new ArrayList<>(list));
//            return;
//        }else if (reducedNums.size() == 1) {
//            list.add(reducedNums.get(0));
//            result.add(new ArrayList<>(list));
//            return;
//        }
//        for (int i = 0; i < reducedNums.size(); i++) {
//            Integer num = reducedNums.get(i);
//            List<Integer> tempList = new ArrayList<>(list);
//            tempList.add(num);
//            List<Integer> tempNums = new ArrayList<>(reducedNums);
//            tempNums.remove(num);
//            addCombination(tempNums, tempList);
//        }
//    }

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int[] visited = new int[nums.length];
        backtrack(nums, visited, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] nums, int[] visited, List<Integer> list) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) {
                continue;
            }
            visited[i] = 1;
            list.add(nums[i]);
            backtrack(nums, visited, list);
            visited[i] = 0;
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.permute(new int[]{1,2,3}));
    }
}
