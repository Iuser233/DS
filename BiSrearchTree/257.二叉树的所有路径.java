import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Role;
import javax.swing.tree.TreeNode;

import singlelist.node;

/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {
List<String> res=new ArrayList<>();
dfs(root, "", res);
return res;

    }
    public void dfs(TreeNode node,String path,List<String> res) {
        if (node==null) {
            return ;
        }
        if (node.left==null&&node.right==null) {
            res.add(path+node.val);
        }
        dfs(node.left, path+node.val +"->", res);
        dfs(node.right, path+node.val +"->", res);
    }
}
// @lc code=end

