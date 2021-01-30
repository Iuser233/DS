import java.util.LinkedList;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
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
    public List<Integer> preorderTraversal(TreeNode root) {
   //1.定义一个返回值数组result
   List<Integer> result=new LinkedList<Integer>();
//    Stack <TreeNode> toVisit = new LinkedList<>();
   Stack<TreeNode> toVisit = new Stack<TreeNode>();

if (root==null) {
    return result;
}
toVisit.push(root);
while (!toVisit.empty()) {
    TreeNode visiting=toVisit.pop();
    if (visiting.right!=null) toVisit.add(visiting.right);
    if (visiting.left!=null) toVisit.add(visiting.left);
}
   return result;
    }
}
// @lc code=end

