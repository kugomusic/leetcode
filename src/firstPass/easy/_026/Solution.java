package firstPass.easy._026;

/*
对比升序数组，发现不同时保存一个数字即可
Compare the ascending array, save a number when find a difference

执行用时 : 1 ms, 在Remove Duplicates from Sorted Array的Java提交中击败了100.00% 的用户
内存消耗 : 41 MB, 在Remove Duplicates from Sorted Array的Java提交中击败了92.43% 的用户
 */

public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 1){
            return len;
        }
        int res = 1;
        for (int i = 1; i < len; i++){
            if (nums[i - 1] != nums[i]){
                nums[res++] = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] data = new int[]{0,0,1,1,1,2,2,3,3,4};
        int len = solution.removeDuplicates(data);
        System.out.println(len);
        for (int i = 0; i < len; i++){
            // print方法连续打印不换行
            // print method print continuously without wrap
            System.out.print(data[i] + (i == len - 1 ? "" : ", "));
        }
    }
}
