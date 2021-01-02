package lianbiao;

import java.util.HashSet;
import java.util.Set;

import singlelist.node;

public class singlelinklist {
	 int size;
	  Node head;




public singlelinklist(int size, Node head) {
		super();
		this.size = size;
		this.head = head;
	}

//1.singlelinklist ��ʼ��
	public singlelinklist() {
		size = 0;
		head = new Node(null);

	}

//2.д������ķ���
//1.����
	public boolean add(int x, int pos) {
		// �����ж�
		if (pos < 1 || pos > size + 1) {
			throw new IndexOutOfBoundsException("pos is error");
		}
//	if (isEmpty()) {
//		System.out.println("����Ϊ��");
//	}
		// ����ʵʩ
		int num = 1;
		Node pNode = head;
		while (num < pos) { // while
			pNode = pNode.next;
			num++;
		}
		Node xNode = new Node(x, pNode.next);
		pNode.next = xNode;
		size++;
		return true;

	}

//ͷ�巨
	public boolean addtohead(int x) {
//	int num=1;
		Node pNode = head;
		Node xNode = new Node(x, pNode.next);
		pNode.next = xNode;
		size++;
		return true;
	}

//β�巨
	public boolean addtotail(int x) {
		Node pNode = head;
		while (pNode.next != null) {
			pNode = pNode.next;
		}
		Node xNode = new Node(x, null);
		pNode.next = xNode;
		size++;
		return true;
	}

//ɾ��
	public int del(int pos) {
		if (pos < 1 || pos > size) {
			throw new IndexOutOfBoundsException("pos is error");
		}
		if (isEmpty()) {
			System.out.println("����Ϊ��");
		}
		int num = 1;
		Node pNode = head;
		while (num < pos && pNode != null) {
			pNode = pNode.next;
			num++; // num!
		}
		int old = pNode.next.data;
		pNode.next = pNode.next.next;
		size--;
		return old;

	}

//modify
	public boolean modify(int obj, int pos) {
		if (pos < 1 || pos > size) {
			throw new IndexOutOfBoundsException("pos is error");
		}
		if (isEmpty()) {
			System.out.println("����Ϊ��");
		}
		int num = 1;
		Node pNode = head.next;
		while (num < pos) {
			pNode = pNode.next;
			num++;

		}
		Node xNode = new Node(obj, pNode.next);
		pNode.data = xNode.data;
		return true;
	}

//��
	public int find(int obj) {
		if (isEmpty()) {
			System.out.println("����Ϊ��");
			return -1;
		}
		int num = 1;
		Node pNode = head.next;
		while (pNode != null) {
			if (pNode.data != obj) {
				pNode = pNode.next;
				num++;
			} else
				break;
		}
		if (pNode == null) {
			return -1;
		}
		return num;
	}

//getvalue
	public int getvalue(int pos) {
		if (pos < 1 || pos > size) {
			throw new IndexOutOfBoundsException("pos is error");
		}
		if (isEmpty()) {
			System.out.println("����Ϊ��");
		}
		int num = 1;
		Node pNode = head.next;
		while (num < pos) {
			pNode = pNode.next;
			num++;
		}
		return pNode.data;

	}

	// getsize
	public int getsize() {
		return size;

	}

//�ж�Ϊ��
	public boolean isEmpty() {
		return size == 0;
	}

//��ӡ���
	public void printall() {
		Node pNode = head.next;
		while (pNode != null) {
			System.out.print(pNode.data + " ");
			pNode = pNode.next;
		}
		System.out.println(" ");
//	for (int i = 0; i < size; i++) {
//		System.out.println();
//	}
	}

//��ת
	public Node reverse() {
		Node pNode = head.next;
		Node newheadNode = new Node(null);
		Node qNode;
		while (pNode != null) {
			qNode = pNode;
			pNode = pNode.next;
			qNode.next = newheadNode.next;
			newheadNode.next= qNode;
		}
		head = newheadNode;
		return head;
	}
public void reverse2(int k) {
    if (k<1||k>size) {
		System.out.println("k is error");
	}
	int num=1;
	Node pNode=head;
	Node newheadNode=new Node(null);
	while(num<size+1-k) {
		pNode=pNode.next;
		num++;
	}
	newheadNode.next=pNode.next;
	head=newheadNode;
}


    public boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

// public boolean mergeTwoLists() {
//	
//}

//public boolean hasCircle(singlelinklist list) {
//	 list=list.reverse();
//	
//}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		singlelinklist list1 = new singlelinklist();
//add
		System.out.println(" ����");
		for (int i = 1; i < 6; i++) {
			list1.add(i * 2, i);
		}
		list1.printall();
//addtohead
		System.out.println("addtohead");
		list1.addtohead(1);
		list1.printall();
//addtotial
		System.out.println("addtotail");
		list1.addtotail(5);
		list1.printall();
System.out.println("add");
list1.add(3, 3);
list1.printall();
//list1.add(6,1);
//list1.add(x, pos)
//del
System.out.println("del pos=1");
		list1.del(1);
		list1.printall();
//modify
		System.out.println("modify pos=6");
		list1.modify(3, 6);
		list1.printall();
//find(obj)
		System.out.println("find(obj),obj=6");
		System.out.println("obj��λ���ǣ�"+list1.find(6));
System.out.println("getvalue(pos),pos=3");
		System.out.println(list1.getvalue(3));
		System.out.println("size");
		System.out.println(list1.getsize());
	
		System.out.println("����ԭ����˳����");
		list1.printall();
	list1.reverse();
	System.out.println("reverse");
	list1.printall();
	System.out.println("�����⣺����������е�����5���ڵ�");
	list1.reverse2(5);
	list1.printall();
	System.out.println("�ж��Ƿ���ѭ������");
	if (list1.hasCycle(list1.head)) {
		System.out.println("�л�");
	}else {
		System.out.println("û�л�");
	}
	
	}

}
