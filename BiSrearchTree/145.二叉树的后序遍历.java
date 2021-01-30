import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

import jdk.nashorn.internal.runtime.regexp.joni.constants.Traverse;

/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
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
  
public List<Integer> postorderTraversal(TreeNode root) {
    List <Integer> result=new LinkedList <Integer> ();
    Traversal(root, result);
    return result;
 }
    public void Traversal(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        Traversal(root.left, result);
        Traversal(root.right, result);
        result.add(root.val);
    }

}

// @lc code=end

