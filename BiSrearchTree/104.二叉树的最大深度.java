import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
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
    public int maxDepth(TreeNode root) {
//迭代法求高度
if (root==null) {
    return 0;
}

Queue que=new LinkedList<>();
que.add(root);
int deepth=0;
while (!que.isEmpty()) {
 int n=que.size();
 deepth=deepth+1;

for (int i = 0; i < n; i++) {
    TreeNode node= (TreeNode) que.poll();
   if (node.left!=null) {
    que.add(node.left);   
   }
   if (node.right!=null) {
    que.add(node.right);       
   }

}   
}
return deepth;
    }
}
// @lc code=end

