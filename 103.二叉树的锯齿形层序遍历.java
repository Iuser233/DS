import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
               List<List<Integer>> res = new LinkedList<List<Integer>>();
               Queue <TreeNode> queue= new LinkedList<TreeNode>();
               if (root!=null) {
                
               queue.add(root);   
               }
               boolean isorderleft=true;

               while (!queue.isEmpty()) {
                   //双端队列
                   Deque<Integer> level=new LinkedList<>();
                   int n=queue.size();
                   for (int i = 0; i < n; i++) {
                       TreeNode node=queue.poll();
                       //根据isleftorder
                       if (isorderleft) {
                           level.offerLast(node.val);
                       }else{
                           level.offerFirst(node.val);
                       }
                   if (node.left!=null) {
                       queue.offer(node.left);
                   };
                   if (node.right!=null) {
                       queue.offer(node.right);
                   } 
                   
                   

                   } 
                       res.add(new LinkedList<Integer>(level));
                       isorderleft=!isorderleft;
       
               }
               return res;
           }

}
// @lc code=end
