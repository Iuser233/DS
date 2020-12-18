import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
    public boolean  check(TreeNode u,TreeNode v) {
      if (u==null&&v==null) {
          return true;
      }
      if (u==null||v==null) {
          return false;
      }
      return u.val==v.val&&check(u.left, v.right)&&check(u.right, v.left);
    }
}
// @lc code=end

