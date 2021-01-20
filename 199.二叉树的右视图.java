/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
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
    public List<Integer> rightSideView(TreeNode root) {

Queue <TreeNode> queue=new LinkedList<TreeNode>();
List<Integer> level=new LinkedList<Integer>();

if (root==null) {
    return level;
}
queue.add(root);

while (!queue.isEmpty()) {
    int n=queue.size();
    for (int i = 0; i < n; i++) {
                // TreeNode node=queue.poll();
                TreeNode node = queue.poll();
    if (node.left!=null) {
     
        queue.add(node.left);   
    }
    oll();
    if (node.right!=null) {
     
        queue.add(node.right);   
    }   
                
        if (i==n-1) {
            level.add(node.val);
        }

    }

}
return level;
    }
}
// @lc code=end

