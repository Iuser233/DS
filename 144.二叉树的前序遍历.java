import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
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
    public List<Integer> preorderTraversal(TreeNode root) {
   //1.定义一个返回值数组result
   List<Integer> result=new LinkedList<Integer>();
   stack <TreeNode> toVisit=new stack <TreeNode>();
if (root==null) {
    return result;
}
toVisit.push(root);
while (toVisit!=null) {
    TreeNode visiting=toVisit.pop();
    result.add(visiting.val);
    if (condition) {
        
    }
}
   
    }
}
// @lc code=end

