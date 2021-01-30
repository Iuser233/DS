import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

import jdk.nashorn.api.tree.Tree;

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
if (root==null) {
    return true;

}

 return issame(root.left, root.right);

    }
    public boolean issame(TreeNode left,TreeNode right) {
        if (left==null&&right==null) {
            return true;
        }else if(left!=null&&right==null){
            return false;

        }else if (left==null&&right!=null) {
            return false;
        }
        else if (right.val!=left.val) {
            return false;
        }
boolean outside= issame(left.left, right.right);
boolean indside=issame(left.right, right.left);
return outside&&indside;


    }
  
}
// @lc code=end

