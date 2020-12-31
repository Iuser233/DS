package ¶þ²æË³ÐòÊý;

public class BinaryTreeNode {
	int data;
	BinaryTreeNode lchild,rchild;
	public BinaryTreeNode(int data, BinaryTreeNode lchild, BinaryTreeNode rchild) {
		super();
		this.data = data;
		this.lchild = lchild;
		this.rchild = rchild;
	}
	public BinaryTreeNode() {
		data=0;
		lchild=rchild=null;
	}
	public BinaryTreeNode(int x) {
		super();
		this.data = x;
		lchild=rchild=null;
	}
	@Override
	public String toString() {
		return "BinaryTreeNode [data=" + data + "]";
	}
}
