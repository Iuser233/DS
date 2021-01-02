package linklist;


public class Node {
	int data;
	Node next;						//指向下一个node节点，所以用node型
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
		
	}
	public Node (Node x)
	{
		this.next=x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
