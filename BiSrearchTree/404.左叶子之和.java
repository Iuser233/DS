import singlelist.node;

/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        int midvalue=0;
        if (root == null) {
            return 0;
        }
       int leftvalue= sumOfLeftLeaves(root.left);
        int rightvalue= sumOfLeftLeaves(root.right);
        if (root.left != null && root.left.left == null && root.left.right == null) {
            midvalue =   root.left.val;
        }
sum=midvalue+rightvalue+leftvalue;
return sum;
    }

}
// @lc code=end
