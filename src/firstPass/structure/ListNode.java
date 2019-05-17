package firstPass.structure;

// 定义单链表
// Definition for singly-linked list.
public class ListNode {
    public int val;
    public ListNode next;
//    public ListNode(int x) { val = x; }

    // 141题的构造方法  Construction method for Question.141
    public ListNode(int x) {
        val = x;
        next = null;
    }

    // 根据字符串创建测试数据
    // Create test data from string
    public static ListNode createTestData(String data){
        if (data.equals("[]")){
            return null;
        }
        data = data.replaceAll("[\\[\\]\\{\\}]", "");
        String[] data_split = data.split(",");
        int len = data_split.length;
        ListNode[] listNode = new ListNode[len + 1];
        listNode[0] = new ListNode(Integer.valueOf(data_split[0]));
        for (int i = 1; i < len; i++){
            listNode[i] = new ListNode(Integer.valueOf(data_split[i]));
            listNode[i - 1].next = listNode[i];
        }
        return listNode[0];
    }

    public static void print(ListNode listNode){
        if (listNode == null){
            System.out.println("null");
            return;
        }
        String res = "[" + listNode.val;
        ListNode p = listNode.next;
        while(p != null){
            res += "," + p.val;
            p = p.next;
        }
        res += "]";
        System.out.println(res);
    }

    // 为141题构造环形链表  Construct a circular linked list for Question.141
    public static ListNode createCircularLinkedList(String data, int pos) {
        if (data.equals("[]")){
            return null;
        }
        data = data.replaceAll("[\\[\\]\\{\\}]", "");
        String[] data_split = data.split(",");
        int len = data_split.length;
        ListNode[] listNode = new ListNode[len + 1];
        listNode[0] = new ListNode(Integer.valueOf(data_split[0]));
        for (int i = 1; i < len; i++){
            listNode[i] = new ListNode(Integer.valueOf(data_split[i]));
            listNode[i - 1].next = listNode[i];
        }
        if (pos != -1) {
            listNode[len - 1].next = listNode[pos];
        }
        return listNode[0];
    }
}
