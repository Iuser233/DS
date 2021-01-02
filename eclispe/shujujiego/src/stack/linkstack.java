package stack;

import singlelist.node;

public class linkstack {
//栈顶指针
	private Node top;
//储存栈的长度
	private int  length;
//构造一个空的栈
	public linkstack () {
		length=0;
		top=null;
		
	}
//入栈 input:node p;output:null
	public void push(Node p) {
		top=p.next;
		top=p;
		length++;
		
	}
//出栈  intput:null   output:出栈的元素的数据域
	public int pop() {
		//判断是否为空
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("linkstack is error");
		}
		int old=top.data;
		top=top.next;
		length--;
		//!!返回删除值
		return old;
	}
//取栈顶元素
	public int peek () {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("error");
		}
		return top.data;
	}

	
	//栈中元素个数
	public int size() {
		return length;
	}

//判断当前栈是否为空
	public boolean isEmpty() {
		return top==null;
		
	}
	//访问栈中元素并输出
	public void printstack() {
		Node xNode=top;
	while (xNode.next!=null) {
		System.out.println(xNode.data);
		xNode=xNode.next;
	}
	
	}

	//清零
	public void clear() {
		 top=null;	
	
}
}