import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

import jdk.nashorn.api.tree.Tree;

/*
 * @lc app=leetcode.cn id=95 lang=java
 *
 * [95] 不同的二叉搜索树 II
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
    public List<TreeNode> generateTrees(int n) {
        if (n==0) {
            return new LinkedList<TreeNode>();

        }
        return generateTrees(1,n);
    }
    public list<TreeNode> generateTrees(int start,int end){
        List<TreeNode> allTree=new LinkedList<TreeNode>();
        if (start>end) {
            allTree.add(null);
            return allTree;
        }
        for (int i =start; i < end; i++) {
            List<TreeNode> leftTrees=generateTrees(start,i-1);
            List<TreeNode> rightTrees=generateTrees(i+1,end);
            
            for (TreeNode left: leftTrees) {
                for (TreeNode right : leftTrees) {
                    TreeNode currTree = new TreeNode(i);
                    currTree.left=left;
                    currTree.right=right;
                    allTree.add(currTree);
                }
            }
        }
    return allTree;
    }

}
// @lc code=end

