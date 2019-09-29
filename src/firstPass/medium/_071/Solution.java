package firstPass.medium._071;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/09/29 16:03
 */

/*
将path以"/"分割，并分情况讨论
Split path with "/" and discuss it by case

执行用时 :5 ms, 在所有 Java 提交中击败了98.51%的用户
内存消耗 :37 MB, 在所有 Java 提交中击败了94.43%的用户
 */

public class Solution {
    public String simplifyPath(String path) {
        String[] strings = path.split("/");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if ("..".equals(strings[i])) {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
            }else if (!"".equals(strings[i]) && !".".equals(strings[i])) {
                list.add(strings[i]);
            }
        }
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append("/");
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.simplifyPath("/home/"));
        System.out.println(solution.simplifyPath("/../"));
        System.out.println(solution.simplifyPath("/home//foo/"));
        System.out.println(solution.simplifyPath("/a/./b/../../c/"));
        System.out.println(solution.simplifyPath("/a/../../b/../c//.//"));
        System.out.println(solution.simplifyPath("/a//b////c/d//././/.."));
    }
}
