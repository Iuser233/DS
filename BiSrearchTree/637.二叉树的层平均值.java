/*
 * @lc app=leetcode.cn id=637 lang=java
 *
 * [637] 二叉树的层平均值
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        if (root != null)
          queue.add(root);
        while(!queue.isEmpty()) {
          int size = queue.size();
          long sum = 0;
          for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            sum += node.val;
            if (node.left != null)
              queue.add(node.left);
            if(node.right != null)
              queue.add(node.right);
          }
          res.add((double) sum/size);
        }
        return res;
      }


}
// @lc code=end

