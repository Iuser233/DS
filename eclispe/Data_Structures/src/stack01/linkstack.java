package stack01;

class node {
	 int data;
	 node next;

	public node(int data, node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public node getNext() {
		return next;
	}

	public void setNext(node next) {
		this.next = next;
	}

	private void node() {
		// TODO Auto-generated method stub
		next = null;
	}
}

public class linkstack {
	private node top;
	private int count;

	public linkstack() {
		// TODO Auto-generated constructor stub
		top = null;
		count = 0;

	}

	public void push(int x) {
		top = new node(x, top);
		count++;
	}

	public int pop() {
int d=top.data;
top=top.next;
count--;
return d;

	}
	public int peek() {
		// TODO Auto-generated method stub
return top.data;
	}
private int size() {
	// TODO Auto-generated method stub
return count;

}
private boolean isEmpty() {
	// TODO Auto-generated method stub
return top==null;
}
public void printall() {
	// TODO Auto-generated method stub
node pNode=top;
while (pNode!=null) {
	System.out.println(pNode.data);
	pNode=pNode.next;
}

}
}
