package firstPass.easy._447;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/25 16:58
 */

/*
数学题做的我脑壳疼
Math problems knocked my head

执行用时 :83 ms, 在所有 Java 提交中击败了96.98%的用户
内存消耗 :41.4 MB, 在所有 Java 提交中击败了98.21%的用户
 */

public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++){
                if (j != i) {
                    int dis = (points[i][0]-points[j][0])*(points[i][0]-points[j][0])+(points[i][1]-points[j][1])*(points[i][1]-points[j][1]);
                    int count = map.getOrDefault(dis, 0);
                    res += 2 * count;
                    map.put(dis, count+1);
                }
            }
            map.clear();
        }
        return res;
    }
}
