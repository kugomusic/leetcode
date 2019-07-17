package firstPass.structure;

import java.util.List;

/**
 * @description:
 * @author: tc
 * @create: 2019/07/17 21:51
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
