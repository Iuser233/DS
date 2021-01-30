import java.util.LinkedList;
import java.util.Queue;

import jdk.internal.jimage.ImageReader.Node;

/*
 * @lc app=leetcode.cn id=559 lang=java
 *
 * [559] N 叉树的最大深度
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        Queue queue = new LinkedList();
        queue.add(root);
        int deep = 0;

        while (queue != null) {
            int n = queue.size();
            deep++;
            for (int i = 0; i < n; i++) {
                Node node = (Node) queue.poll();
                for (Node iteam : node.children) {
                    if (node.children != null) {
                        queue.add(node.children);
                    }
                }
            }
        }
        return deep;
    }
}
// @lc code=end
