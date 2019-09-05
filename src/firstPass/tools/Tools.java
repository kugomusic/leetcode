package firstPass.tools;

/**
 * @description:
 *      工具类，提供一些方法供解题时调用
 *      Tools for resolutions
 * @author: tc
 * @create: 2019/09/03 15:32
 */
public class Tools {

    /**
     * 打印二维数组
     * @param array 二维数组
     */
    public static void printTwoDimensionArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int[] temp = array[i];
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[j]);
                if (j != temp.length - 1) {
                    System.out.print(",");
                }else {
                    System.out.println(";");
                }
            }
        }
    }
}
