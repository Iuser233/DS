import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

import jdk.internal.jshell.tool.resources.l10n;

/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树
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
/*
判断两棵树是否相同  当且仅当两棵树结构及其对应的值也相同
1.DFS
a.两棵树都为空
b.有一颗树为空
c.两棵树都不为空时先判断它们的根节点是否一样，如果不相同，说明这两棵树不同
否则在对这个节点的左右子树依次进行比较。


*/
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
  
}

// @lc code=end

