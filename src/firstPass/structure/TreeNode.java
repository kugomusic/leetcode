package firstPass.structure;


// 定义二叉树
// Definition for Binary tree
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; };

    // 根据字符串创建测试数据
    // Create test data from string
    public static TreeNode createTestData(String data){
        if (data.equals("[]")){
            return null;
        }
        data = data.replaceAll("[\\[\\]\\{\\}]", "");
        String[] data_split = data.split(",");
        int len = data_split.length;
        TreeNode[] treeNodes = new TreeNode[len];
        for (int i = 0; i <len ; i++) {
            if (!data_split[i].equals("null")){
                treeNodes[i] = new TreeNode(Integer.valueOf(data_split[i]));
            }
        }
        for (int i = 0; i < len ; i++) {
            int leftIndex = i * 2 + 1;
            if (leftIndex < len) {
                treeNodes[i].left = treeNodes[leftIndex];
            }
            int rightIndex = leftIndex + 1;
            if (rightIndex < len) {
                treeNodes[i].right = treeNodes[rightIndex];
            }
        }
        return treeNodes[0];
    }


    // 从github上抄来的直观打印二叉树的方法，回头再学
    // The method of visually printing a binary tree copied from github, learn it later
    public static void printTree(TreeNode head) {
        System.out.println("Binary Tree:");
        printInOrder(head, 0, "H", 16);
        System.out.println();
    }

    private static void printInOrder(TreeNode head, int height, String to, int len) {
        if (null == head) {
            return;
        }
        printInOrder(head.right, height + 1, "v", len);
        String val = to + head.val + to;
        int lenM = val.length(); // val的字符长度
        int lenL = (len - lenM) / 2; // val左边填充的空格符长度
        int lenR = len - lenM - lenL; // val右边填充的空格符长度
        val = getSpace(lenL) + val + getSpace(lenR);
        System.out.println(getSpace(height * len) + val);
        printInOrder(head.left, height + 1, "^", len);
    }

    private static String getSpace(int num) {
        String space = " ";
        StringBuffer buf = new StringBuffer("");
        for (int i = 0; i < num; i++) {
            buf.append(space);
        }
        return buf.toString();
    }
}
