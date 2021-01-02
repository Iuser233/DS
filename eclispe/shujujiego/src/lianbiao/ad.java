package lianbiao;

import java.awt.List;
import java.awt.TexturePaint;
import java.awt.peer.LabelPeer;

import javax.xml.namespace.QName;

import org.omg.CORBA.PUBLIC_MEMBER;

import singlelist.node;

public class ad { // 定义一个链表（类）
	private int size; // 表的大小
	private Node head; // 定义一个表头

	public ad(int size, Node head) {
		super();
		this.size = size;
		this.head = head;
	}

	private static class Node { // 内部类 节点 node是引用类型
		int data; // data》学生，姓名，成绩。。。。
		Node next; // 指向下一个node节点，所以用node型

		public Node(int data, Node next) {
			super();//reference the parent class object
			this.data = data;
			this.next = next;

		}

		public Node(Node x) {
			this.next = x; // next为x下一个节点next=xnode
		}
	}

	public ad() { // 构造方法 表的初始化 带头结节点方法
		size = 0; // 无参数
		head = new Node(null); // node方法
	}

	public void addtotial(int x) { // 1.尾插法
		Node xnode = new Node(x, null);
		Node p = head; // 指针/辅助遍历
		while (p.next != null) // 下一个不为空
		{
			p = p.next; // 往后挪

		}
		xnode.next = p.next; // 可写可不写可
		p.next = xnode;
		size++;
	}

	public void addtohead(int x) { // 头插法
		Node xnode = new Node(x, null); // 建立一个一个新的节点，data=x，next=null。
		xnode.next = head.next;
		head.next = xnode;
		size++;
	}

	public boolean add(int x, int pos) { // 插入法
//		Node xnode=new Node(x);
		if (pos < 1 || pos > size + 1) {
			throw new IndexOutOfBoundsException("pos err");
		}
		int num = 1;
		Node pNode = head;
		while (num < pos) {
			pNode = pNode.next;
			num++;
		}
		Node xNode = new Node(x, pNode.next);
		pNode.next = xNode;
		size++;
		return true;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int del(int pos) { //
		if (isEmpty()) {
			System.out.println("linklist is empty");
			return -1;
		}
//		else {
//			if (pos<1||pos>size) {
//		throw new IndexOutOfBoundsException("error");
//			}
//		}
		int num = 1;
		Node pNode = head;
		while (num < pos&&pNode.next!=null) {
			pNode = pNode.next;
			num++;
		}
		int old=pNode.next.data;
		pNode.next = pNode.next.next;
//		if (pNode.next.data = null) {
//			System.out.println("empty");
//		}
		return old;

	}

	public void clear() {
		size = 0;
		head.next = null;
	}

	public Node getHead() {
		return head;
	}

	public void printAll() {
		Node pNode = head.next; // 建一个往后打印的节点
		while (pNode != null) // 判断p是否为空值
		{
			System.out.print(pNode.data + " "); // 打印数值
			pNode = pNode.next; // 往后挪
		}

		System.out.println(" ");
	}

	public int find(int obj) {
		if (isEmpty()) {
			System.out.println("linklist is empty");
			return -1;
		}
		Node pNode = head.next;

		int num = 1;
		while (pNode != null) {
			if (pNode.data == obj == false) {
				pNode = pNode.next;
				num++;
			} else break;

		}
		if (pNode == null) {
			return -1;
		}
		return num;
	}
	

	

	public int getvalue(int pos) {
		if (isEmpty()) {
			System.out.println("linklist is empty");
			return -1;
		} else {
			if (pos < 1 && pos > size + 1) {
				System.out.println("pos is error");
				return -1;

			}
			int num = 1;
			Node pNode = head.next;
			while (num < pos) {
				pNode = pNode.next;
				num++;
			}
			return pNode.data;
		}
	}

	public boolean modify(int newobj, int pos) {
		if (isEmpty()) {
			System.out.println(" linklist is empty");

			return false;
		} else {
			if (pos < 1 && pos > size + 1) {
				System.out.println("pos is error");
				return false;

			}
			int num = 1;
			Node pNode = head.next;
			while (num < pos) {
				pNode = pNode.next;
				num++;
			}
			pNode.data = newobj;
			return true;
		}
	}
public void reverse1() {
	
	Node p=head.next;
	Node q;
	 Node newhead =new Node(null);
     while(p!=null) {
	q=p;
     p=p.next;
     q.next=newhead.next;
     newhead.next=q;
     }
     head=newhead;
}
public int size() {
	return size;
}
public static Node  reverse3(Node p) {
	if (p!=null||p.next!=null) {
		return p;
		
	}
	Node newheadNode=reverse3(p.next);
	p.next.next=p;
	p.next=null;
	return newheadNode;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ad list1 = new ad();
		for (int i = 1; i < 6; i++) {
			list1.addtotial(i * 3);
		}
		
		
//		list1.printAll();
//		Node pnNode=reverse3(list1.head.next);
//	while (pnNode!=null) {
//		System.out.print(pnNode.data+" ");
//		pnNode=pnNode.next;
//	}
		list1.printAll();
		list1.add(20, 2);
		list1.printAll();
		list1.reverse1();
		list1.printAll();
//		list1.del(6);
//		list1.printAll();
//		list1.addtotial(6);
//		list1.printAll();
//		System.out.println(list1.find(12));
//		System.out.println(list1.getvalue(3));
//		list1.modify(36, 2);
//		list1.printAll();
//		list1.getHead();

	}
}
