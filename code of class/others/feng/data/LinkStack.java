package data;

/*
 * 链栈
 */

class Node{
	int data;
    Node next;

	public  Node(Node xNode) {
		this.next=xNode;
	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	
	}
	

public class LinkStack {
	private int length;
	private Node top;
	
	public LinkStack() {//初始化
		length = 0;
		top = null;
	}
	//入栈
	public void push(int x) {
		top = new Node(x,top);
		length++;
	}
	//出栈
	public int pop() {
		if(isEmpty()) {
	    throw new IndexOutOfBoundsException("为空");
		}
		int x = top.data;
		top=top.next;
		length--;
		return x;
	}
	//取栈顶数据元素
	public int peek() {
		if(isEmpty()) {
		    throw new IndexOutOfBoundsException("为空");
			}
		return top.data;
	}
	//求出栈中数据元素的个数
	public int Size() {
		return length;
	}
	//判断当前栈是否为空
	public boolean isEmpty() {
		return top==null;
	}
	//范围栈中每个元素并输出
	public void printstack() {
		Node p = top;
		while(p!=null) {
			System.out.print(p.data+" ");
			p=p.next;
		}
	}
	//清空
	public void clear() {
		top=null;
	}
	
   
	public static void main(String[] args) {
	LinkStack stack2 = new LinkStack();
	int a[] = {3,4,5,9};
	for(int i=0; i<a.length;i++) {
		stack2.push(a[i]);
	}
	
	stack2.printstack();
	System.out.println(stack2.pop());
	stack2.printstack();
	}

}
