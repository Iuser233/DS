package data;
/*
 * 辅助二叉树
 */
public class BinaryTreeNode {
	 public BinaryTreeNode lchild; //左孩子
	   public BinaryTreeNode rchild;//右孩子
	   private Object data; //数据域
	  
	   public BinaryTreeNode() {//构造函数，创建一个空节点
		   
		   data = null;
		   lchild=null;
		   rchild=null;
	   }
	   
	   public BinaryTreeNode(Object x) {//重载构造函数，创建一个数据值为x的节点
		   data = x;
		   lchild=null;
		   rchild=null;
	   }

	

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	   
	   
	   
	   
}
