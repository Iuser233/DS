import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (getdepth(root) == -1) {
            return false;
        } else {
            return true;
        }
    }

    public int getdepth(TreeNode node) {
        int result = 0;
        if (node == null) {
            return 0;
        }
        int left = getdepth(node.left);
        if (left == -1) {
            return -1;
        }
        int right = getdepth(node.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            result = -1;
        } else {
            result = Math.max(left, right) + 1;
        }
        return result;
    }
}
// @lc code=end
