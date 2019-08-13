package firstPass.medium._015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/08/13 16:17
 */

/*
解题步骤：
1、将nums排序
2、固定最左侧指针i，某些i需要跳过
3、在i的右侧使用双指针法找到sum为0的组合（指针j、k向中间逼近，每次逼近需要跳过1~n个位置）

Steps:
1、sort nums
2、fix the leftmost pointer i, some i need to be skipped
3、Find the combination of sum 0 on the right side of i using the double pointer method((The pointers j and k are approaching in the middle, and each approximation needs to skip 1~n positions))

执行用时 :73 ms, 在所有 Java 提交中击败了59.93%的用户
内存消耗 :55.8 MB, 在所有 Java 提交中击败了71.68%的用户
 */

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    while (j < k && nums[j] == nums[++j]){}
                }else if (sum > 0) {
                    while (j < k && nums[k] == nums[--k]){}
                }else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[++j]){}
                    while (j < k && nums[k] == nums[--k]){}
                }
            }
        }
        return result;
    }



    // 解法超时 TimeOut
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 0; i < nums.length - 2; i++) {
//            List<Integer> list = findFromIndex(nums, i, -nums[i]);
//            appendAndSplitList(list, result);
//        }
//        return result;
//    }
//
//    private List<Integer> findFromIndex(int[] nums, int index, int sum) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = index + 1; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == sum) {
//                    list.add(nums[index]);
//                    list.add(nums[i]);
//                    list.add(nums[j]);
//                }
//            }
//        }
//        return list;
//    }
//
//    private void appendAndSplitList(List<Integer> list, List<List<Integer>> result) {
//        if (list.size() > 3) {
//            List<Integer> temp = new ArrayList<>();
//            for (int i = 0; i < list.size(); i++) {
//                temp.add(list.get(i));
//                if (i % 3 == 2) {
//                    boolean isDuplicate = false;
//                    for (int j = 0; j < result.size(); j++) {
//                        if (isSame(result.get(j), temp)) {
//                            isDuplicate = true;
//                            break;
//                        }
//                    }
//                    if (!isDuplicate) {
//                        result.add(new ArrayList<>(temp));
//                    }
//                    temp.clear();
//                }
//            }
//        }else if (list.size() != 0) {
//            boolean isDuplicate = false;
//            for (int j = 0; j < result.size(); j++) {
//                if (isSame(result.get(j), list)) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate) {
//                result.add(list);
//            }
//        }
//    }
//
//    private boolean isSame(List<Integer> listA, List<Integer> listB) {
//        List<Integer> copyOfListB = new ArrayList<>(listB);
//        for (int i = 0; i < listA.size(); i++) {
//            if (copyOfListB.contains(listA.get(i))) {
//                copyOfListB.remove(listA.get(i));
//            }else {
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.threeSum(new int[]{-2,0,1,1,2}));
//        System.out.println(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(solution.threeSum(new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0}));
    }
}
