import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
 */

// @lc code=start

//   Definition for a binary tree node.
  
 
class Solution {
     class TreeNode {
        int val;
       TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
Map<Integer,Integer> inMap=new HashMap<Integer,Integer>();
   for (int i = 0; i < inorder.length; i++) {
       inMap.put(inorder[i], i);
   }
   TreeNode root=buildTree(preorder, 0,preorder.length-1,inorder,0,inorder.length-1,inMap);
   return root;


}
public TreeNode  buildNode(int[] preorder,int prestart,int preend,int [] inorder,int instart,int inend,Map<Integer, Integer>) {
    if (preorder) {
        
    }
}



}
// @lc code=end

