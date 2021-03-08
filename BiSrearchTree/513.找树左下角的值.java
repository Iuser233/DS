import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=513 lang=java
 *
 * [513] 找树左下角的值
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

class Solution{
    int maxDepth = -1, res = -1;

    public int findBottomLeftValue(TreeNode root) {
        helper(root, 0);
        return res;
    }

    private void helper(TreeNode root, int depth) {
        if (root == null) return;
        helper(root.left, depth + 1);
        //判断是否是最大深度
        if (depth > maxDepth) {
            maxDepth = depth;
            res = root.val;
        }
        helper(root.right, depth + 1);
    }
}



// @lc code=end

