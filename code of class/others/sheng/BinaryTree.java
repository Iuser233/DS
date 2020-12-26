import java.util.LinkedList;

public class BinaryTree {
	public BinaryTreeNode root;
	public BinaryTree() {
		root=new BinaryTreeNode();
	}
	public BinaryTree(Object x) {
		root=new BinaryTreeNode(x);
	}
	public boolean insertLeft(Object x,BinaryTreeNode parent) {
		if (parent==null) {
			return false;
		}
		BinaryTreeNode p=new BinaryTreeNode(x);
		if (parent.lChild==null) {
			parent.lChild=p;
		}else {
			p.lChild=parent.lChild;
			parent.lChild=p;
		}
		return true;
	}
	public boolean insertRight(Object x,BinaryTreeNode parent) {
		if (parent==null) {
			return false;
		}
		BinaryTreeNode p=new BinaryTreeNode(x);
		if (parent.rChild==null) {
			parent.rChild=p;
		}else {
			p.rChild=parent.rChild;
			parent.rChild=p;
		}
		return true;
	}
	public boolean deleteLeft(BinaryTreeNode parent) {
		if (parent==null) {
			return false;
		}else {
			parent.lChild=null;
			return true;
		}
	}
	public boolean deleteRight(BinaryTreeNode parent) {
		if (parent==null) {
			return false;
		}else {
			parent.rChild=null;
			return true;
		}
	}
	//前序遍历
	public void preorder(BinaryTreeNode p) {
		if (p==null) {
			return;
		}else {
			System.out.print(p.getData()+" ");
			preorder(p.lChild);
			preorder(p.rChild);
		}	
	}
	//中序遍历
	public void inorder(BinaryTreeNode p) {
		if (p==null) {
			return;
		}else {
			inorder(p.lChild);
			System.out.print(p.getData()+" ");
			inorder(p.rChild);
		}
	}
	//后序遍历
	public void postorder(BinaryTreeNode p) {
		if (p==null) {
			return;
		}else {
			postorder(p.lChild);
			postorder(p.rChild);
			System.out.print(p.getData()+" ");
		}
	}
	public void traversal(int i) {
		switch (i) {
		case 0:
			preorder(root);
			System.out.println();
			break;
		case 1:
			inorder(root);
			System.out.println();
			break;
		case 2:
			postorder(root);
			System.out.println();
			break;
		default:lovelorder();
		System.out.println();
			break;
		}
	}
	public int size(BinaryTreeNode p) {
		if (p==null) {
			return 0;
		}else {
			return size(p.lChild)+size(p.rChild)+1;
		}
	}
	public int size() {
		return size(root);
	}
	//层次遍历
	public void lovelorder() {
		LinkedList<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
		BinaryTreeNode p=root;
		while (p!=null) {
			System.out.print(p.getData()+" ");
			if (p.lChild!=null) {
				queue.add(p.lChild);
			}if (p.rChild!=null) {
				queue.add(p.rChild);
			}
			p=queue.poll();
		}
		System.out.println();
	}
	public int getHeight(BinaryTreeNode parent) {
		//int lh,rh,max;
		if (parent!=null) {
//			lh=getHeight(parent.lChild);
//			rh=getHeight(parent.rChild);
//			max=lh>rh? lh : rh;
//			return max+1;
			return (getHeight(parent.lChild)>getHeight(parent.rChild)?getHeight(parent.lChild):getHeight(parent.rChild))+1;
		}else {
			return 0;
		}
	}
	public void printleaves(BinaryTreeNode p) {
		if (p==null) {
			return;
		}else {
			if (p.lChild==null&&p.rChild==null) {
				System.out.print(p.getData()+" ");
			}
			printleaves(p.lChild);
			printleaves(p.rChild);
		}
	}
	public static void main(String[]args){
		BinaryTree tree=new BinaryTree(5);
		BinaryTreeNode parent=tree.root;
		tree.insertLeft(3, parent);
		tree.insertRight(9, parent);
		parent=parent.lChild;
		tree.insertLeft(15, parent);
		tree.insertRight(26, parent);
		tree.preorder(tree.root);
		System.out.println();
		tree.traversal(2);
		tree.traversal(1);
		System.out.println(tree.size());
		tree.lovelorder();
		tree.printleaves(tree.root);
		System.out.println();
		System.out.println(tree.getHeight(tree.root));
	}
}
