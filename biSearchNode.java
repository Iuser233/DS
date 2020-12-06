package biSearchTree;

public class biSearchNode {
public int data;
public biSearchNode lchild;
public biSearchNode rchild;
public biSearchNode(int data, biSearchNode lchild, biSearchNode rchild) {
	super();
	this.data = data;
	this.lchild = lchild;
	this.rchild = rchild;
}
public biSearchNode( int x ) {
	// TODO Auto-generated constructor stub
	this.data=x;
	lchild=null;
	rchild=null;
	
}
public biSearchNode() {
	// TODO Auto-generated constructor stub
	data=0;
	lchild=null;
	rchild=null;
	
}
@Override
public String toString() {
	return "biSearchNode [data=" + data + "]";
}

}
