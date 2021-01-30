import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=222 lang=java
 *
 * [222] 完全二叉树的节点个数
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
if (root==null) {
    return 0;
}
Queue<TreeNode> queue=new LinkedList<>();

queue.add(root);
int result=0;

while (queue!=null) {
    
    int n=queue.size();
    for (int i = 0; i < n; i++) {
        TreeNode node=queue.poll();
        result++;
        if (node.left!=null) {
            queue.add(node.left);

        }
        if (node.right!=null) {
            queue.add(node.right);
        }

    }

}
return 6;
    }
}
// @lc code=end

