package data;
/*
 * 二叉树的实现及遍历
 */
import java.util.LinkedList;

public class BinaryTree{	
		public  BinaryTreeNode root; //根节点
		//创建一个空的二叉树
		public BinaryTree() { //无参
			root = new BinaryTreeNode();
		}
		//创建一课以数据元素x为根节点的二叉树
		public BinaryTree(Object x) {//有参
			
			root = new BinaryTreeNode(x);
		}
		
		//向二叉树插入一个左节点 
		public boolean insertLeft(Object x,BinaryTreeNode parent) {
			if(parent == null) {
				return false;
			}
			BinaryTreeNode p = new BinaryTreeNode(x);//创建一个新节点
			if(parent.lchild==null) { //如果左节点为空时
				parent.lchild = p;
			}
			else {                  //如果存在左节点时
				p.lchild = parent.lchild;
				parent.lchild=p;
			}
			return true;
		}
		//向二叉树插入一个右节点 
		public boolean insertRight(Object x,BinaryTreeNode parent) {
			if(parent==null) {
				return false;
			}
				BinaryTreeNode p = new BinaryTreeNode(x);
				if(parent.rchild==null) {
					parent.rchild=p;
				}
				else {
					p.rchild=parent.rchild;
					parent.rchild = p;
				}
							
			return true;
			
		}
		
		//删除二叉树的左子树
		public boolean deletLeft(BinaryTreeNode parent) {
			if(parent == null) {
				return false;
			}
				else {
					parent.lchild=null;
					return true;
				}
			}
		//删除二叉树的右子树
		public boolean deletRight(BinaryTreeNode parent) {
			if(parent==null) {
				return false;
			}
			else {
				parent.rchild=null;
				return true;
				}			
		}
		//打印叶子节点
		public void printleaves(BinaryTreeNode p) {
			if(p==null) {
				return;
			}
			else {
				if(p.lchild==null && p.rchild==null) {
					
				
				System.out.println("叶子节点有："+p.getData() +" ");
				}
				printleaves(p.lchild);
				printleaves(p.rchild);
			}
		}
		
		
		//先序遍历 （中左右）
		public void preorder(BinaryTreeNode p) {
			if(p==null) {
				return;
			}
			else {
				System.out.print(p.getData() +" "); 
				preorder(p.lchild);
				preorder(p.rchild);
				
			}
		
		}
		//中序遍历（左中右）
		public void inorder(BinaryTreeNode p) {
			if(p==null) {
				return;
			}
			else {
				inorder(p.lchild);
				System.out.print(p.getData()+" ");
				inorder(p.rchild);
					
				}
			
			}
		
		//后序遍历（左右中）
		public void postorder(BinaryTreeNode p) {
			if(p==null) {
				return;
			}
			else {
				postorder(p.lchild);
				postorder(p.rchild);
				System.out.print(p.getData()+" ");
			}
			
		}
		//输出二叉树所有的节点
		public int size(BinaryTreeNode p) {
			if(p==null) {
				return 0;
			}
			else {
				return size(p.lchild)+size(p.rchild)+1;
			}
		}
		public int size() {
			return size(root);
		}
		
		//按指定方式遍历二叉树
		
		public void travesal(int i) {
			switch (i) { 
			case 0:preorder(root);//先序
			System.out.println();
			break;
			case 1:inorder(root);//中序
			System.out.println();
			break;
			case 2:postorder(root);//后序
			System.out.println();
			break;	
				default : lovelorder();//层次
				System.out.println();
				break;
			}
			
			}
		//求二叉树的高度
		public int getHeight(BinaryTreeNode parent) {
			int left , right, max;
			if(parent!=null) {
				left=getHeight(parent.lchild);
				right=getHeight(parent.rchild);
				max= left>right ? left : right;
				
				return max+1;
			}
			else return 0;
		}

		//逐层遍历二叉树
		public void lovelorder() {
			LinkedList<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
			BinaryTreeNode p=root;
			while (p!=null) {
				System.out.print(p.getData()+" ");
				if(p.lchild!=null) {
					
					queue.add(p.lchild);
				}
				if(p.rchild!=null) {
					queue.add(p.rchild);
				}
				p=queue.poll();
			}
			System.out.println();
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BinaryTree tree = new BinaryTree(4);
    BinaryTreeNode parent=tree.root;
    
    
   
    
    tree.insertLeft(3, parent);
    tree.travesal(1); //指定方式遍历（中序）
    System.out.println(); //换行
    
    tree.insertRight(5, parent);
    tree.lovelorder();
    System.out.println();
    
  
    tree.printleaves(tree.root);
    
    System.out.println("结点的个数："+tree.size());
    System.out.println("二叉树的高度："+tree.getHeight(parent));
    
    
    tree.deletLeft(parent);
    tree.inorder(parent);
    System.out.println();
    

    tree.deletRight(parent);
    tree.inorder(parent);

   
    
    
 
	}

}
