/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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
    public int minDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }
        int leftdepth=minDepth(root.left);//zuo
        int rightdepth=minDepth(root.right);//右
if (root.left==null&&root.right!=null) {
    return 1+rightdepth;
}
if (root.right==null&&root.left!=null) {
    return 1+leftdepth;
}
int result=1+Math.min(leftdepth,rightdepth);
return result;

    }
}
// @lc code=end

