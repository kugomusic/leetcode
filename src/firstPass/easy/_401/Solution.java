package firstPass.easy._401;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/15 19:35
 */

/*
写的比较繁琐，主要思路是根据num枚举所有符合条件的array，然后转化成time；枚举时借助了Integer.bitCount方法（输出某二进制数字中1的位数）
The code is complicated, the main idea is to enumerate all the qualified arrays according to num, and then convert them into time;
the enumeration uses the Integer.bitCount method (outputs the number of 1 in a binary number)

执行用时 :2 ms, 在所有 Java 提交中击败了93.16%的用户
内存消耗 :35.2 MB, 在所有 Java 提交中击败了78.33%的用户
 */

public class Solution {

    /**
     * 权重数组
     * power array
     */
    private int[] power = new int[]{8,4,2,1,32,16,8,4,2,1};

    /**
     * 功能描述:
     *      主功能函数，根据num输出所有可能的time
     *      main method，output all times according to num
     * @param num
     * @return: java.util.List<java.lang.String>
     * @Author: tc
     * @date: 2019/7/15 21:37
     */
    public List<String> readBinaryWatch(int num) {

        List<String> result = new LinkedList<>();
        List<int[]> list = generateList(num);
        for (int i = 0; i < list.size(); i++) {
            String temp = listToTime(list.get(i));
            if (temp != null) {
                result.add(temp);
            }
        }
        return result;
    }

    /**
     * 功能描述:
     *      根据num枚举所有的排列组合，以数组形式
     *      enumerate all the qualified arrays according to num
     * @param num
     * @return: java.util.List<int[]>
     * @Author: tc
     * @date: 2019/7/15 21:38
     */
    private List<int[]> generateList(int num) {
        List<int[]> list = new LinkedList<>();
        for (int i = 0; i < 1024; i++) {
            if (Integer.bitCount(i) == num) {
                list.add(numToArray(i));
            }
        }
        return list;
    }

    /**
     * 功能描述:
     *      将数字转换成二进制形式的数组
     *      convert int to binary array
     * @param n
     * @return: int[]
     * @Author: tc
     * @date: 2019/7/15 21:39
     */
    private int[] numToArray(int n) {
        int[] array = new int[10];
        int i = 9;
        while (n > 0) {
            if (n % 2 == 1) {
                array[i] = 1;
            }
            i--;
            n /= 2;
        }
        return array;
    }

    /**
     * 功能描述:
     *      根据数组产生对应的time字符串
     *      generate String time according to array
     * @param list
     * @return: java.lang.String
     * @Author: tc
     * @date: 2019/7/15 20:26
     */
    private String listToTime(int[] list) {
        int hour = 0;
        for (int i = 0; i < 4; i++) {
            hour += list[i] * power[i];
        }
        int minute = 0;
        for (int i = 4; i < 10; i++) {
            minute += list[i] * power[i];
        }
        /*
            hour必须小于12，minute必须小于60，否则返回null
            hour must less than 12 and minute less than 60, otherwise return null
         */
        if (hour >= 12 || minute >= 60) {
            return null;
        }
        if (minute < 10) {
            return hour + ":0" + minute;
        }
        return hour + ":" + minute;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.readBinaryWatch(3));
    }
}
