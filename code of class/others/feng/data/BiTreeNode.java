package data;

public class BiTreeNode {
public int data;
public BiTreeNode lchild,rchild;

	public BiTreeNode(int data, BiTreeNode lchild, BiTreeNode rchild) {
	super();
	this.data = data;
	this.lchild = lchild;
	this.rchild = rchild;
}

	
	
	public BiTreeNode(int data) {
		super();
		this.data = data;
	}



	@Override
	public String toString() { //没有这个find就打印地址,有的话就打印data
		return "BiTreeNode [data=" + data + "]";
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	

}
