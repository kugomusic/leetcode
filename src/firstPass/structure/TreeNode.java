package firstPass.structure;

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

//    public static void print(TreeNode treeNode) {
//        if (treeNode == null){
//            System.out.println("null");
//            return;
//        }
//        String res = "[" + treeNode.val;
//
//        res += "]";
//        System.out.println(res);
//    }
}
