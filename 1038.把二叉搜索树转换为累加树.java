/*
 * @lc app=leetcode.cn id=1038 lang=java
 *
 * [1038] 把二叉搜索树转换为累加树
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
    int sum=0;
//sum 要放在循环外面，里面的话，每一次递归都会重新清零

    public TreeNode bstToGst(TreeNode root) {

if (root==null) {
    return root;
}
    else{
        bstToGst(root.right);
        sum+=root.val;
        root.val=sum;
        bstToGst(root.left);
    }
    return root;

}

}
// @lc code=end

