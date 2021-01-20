/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层序遍历 II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        Queue <TreeNode> queue= new LinkedList<TreeNode>();
        if (root!=null) {
         
        queue.add(root);   
        }
        while (!queue.isEmpty()) {
            List<Integer> level=new LinkedList<Integer>();

            int n=queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node=queue.poll();
                level.add(node.val);
            if (node.left!=null) {
                queue.add(node.left);
            };
            if (node.right!=null) {
                queue.add(node.right);
            }   
            }        res.add(0,level);

        }
        // reverse(res.begin(), res.end());
                // Collections.reverse(list);
        reverse(res.begin(), res.end()); // 在这里反转一下数组即可

        return res;
    }
    }

// @lc code=end

