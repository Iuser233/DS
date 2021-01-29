import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // List<List<Integer>> ret=new Arraylist<List<Integer>>();

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        Queue <TreeNode> queue= new LinkedList<TreeNode>();
        if (root!=null) {
         
        queue.add(root);   
        }
        while (!queue.isEmpty()) {
            // List<Integer> level=new Arraylist<Integer>();
List<Integer> level=new ArrayList<>();
            int n=queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node=queue.poll();
                level.add(node.val);
            if (node.left!=null) {
                queue.offer(node.left);
            };
            if (node.right!=null) {
                queue.offer(node.right);
            }   
            } 
                res.add(level);

        }
        return res;
    }
    }
   
// @lc code=end

