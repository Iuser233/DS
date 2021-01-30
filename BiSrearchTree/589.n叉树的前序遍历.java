import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import jdk.internal.jimage.ImageReader.Node;

/*
 * @lc app=leetcode.cn id=589 lang=java
 *
 * [589] N叉树的前序遍历
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
    public List<Integer> preorder(Node root) {
        List<Integer> res = new LinkedList<>();
Stack <Node> stack= new LinkedList<>();
if (root==null) {
    return res;
}

stack.push(root.val);
while (!stack.isEmpty()) {
    Node 
    for (Node node : root.children) {
        stack.
    }
}
        }
    


}

// @lc code=end

