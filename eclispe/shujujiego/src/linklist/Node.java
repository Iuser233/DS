package linklist;


public class Node {
	int data;
	Node next;						//ָ����һ��node�ڵ㣬������node��
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
