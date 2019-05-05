package firstPass.easy._027;

/*
结果较好，无需优化
No optimization required

执行用时 : 1 ms, 在Remove Element的Java提交中击败了99.68% 的用户
内存消耗 : 35.2 MB, 在Remove Element的Java提交中击败了85.25% 的用户
 */

public class Solution {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[res++] = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("nums = [3,2,2,3], val = 3");
        int[] data = new int[]{3,2,2,3};
        int len = solution.removeElement(data, 3);
        for (int i = 0; i < len; i++){
            System.out.print(data[i] + (i == len - 1 ? "\n" : ", "));
        }
        System.out.println("nums = [0,1,2,2,3,0,4,2], val = 2");
        int[] data1 = new int[]{0,1,2,2,3,0,4,2};
        int len1 = solution.removeElement(data1, 2);
        for (int i = 0; i < len1; i++){
            System.out.print(data1[i] + (i == len1 - 1 ? "\n" : ", "));
        }
    }
}
