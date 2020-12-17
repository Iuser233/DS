import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

import jdk.internal.jshell.tool.resources.l10n;

/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树
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
/*
判断两棵树是否相同  当且仅当两棵树结构及其对应的值也相同
1.DFS
a.两棵树都为空
b.有一颗树为空
c.两棵树都不为空时先判断它们的根节点是否一样，如果不相同，说明这两棵树不同
否则在对这个节点的左右子树依次进行比较。


*/
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p==null&&q==null) {         //如果两棵树都为空
        return true;                //相同
    }else if (p==null||q==null) {   //有一颗树为空
        return false;               //不同
    }else{
        Queue <TreeNode> queue1=new LinkedList<TreeNode>();//建立两个队列用来放邻接点
        Queue <TreeNode> queue2=new LinkedList<TreeNode>();
        queue1.offer(p);                                      //入队
        queue2.offer(q);
        while (!queue1.isEmpty()&&!queue2.isEmpty()) {
            TreeNode node1=queue1.poll();//将入队·的节点出对
            TreeNode node2=queue2.poll();
            if (node1.val!=node2.val) {     //1.判断它们的值是否相同
                return false;
            }
            TreeNode left1=node1.left;      //2.再对它们的左右子树进行判断
            TreeNode rigjt1=node1.right;
            TreeNode left2=node2.left;
            TreeNode right2=node2.right;
            if (left1==null^left2==null) {//^异或运算符必须同时为正或同时为假才是ture否则为false
                return false;               //2.1如果它们的左子树仅有一个为空，则形状不同
            }
            if (rigjt1==null^right2==null) { //2.1如果它们的右子树仅有一个为空，则形状不同
                return false;   
            
            }
            if (left1!=null) {              //如果左子树不为空则进队。。。
                queue1.offer(left1);
            }
            if (rigjt1!=null) {             //以此类推
                queue1.offer(rigjt1);   
            }
            if (left2!=null) {
                queue2.offer(left2);
            }            
            if (right2!=null) {
                queue2.offer(right2);
            }
        }
        return queue1.isEmpty()&&queue2.isEmpty();  //最后比较完了所有节点在判断似乎不是两个队列都为空，是的说明两棵树完全相同
        
    }
    }
}

// @lc code=end

