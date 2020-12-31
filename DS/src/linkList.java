
public class linkList {
	int size;
	Node head;
	public linkList() {
		size=0;
		head=new Node(null);
	}
	public static class Node {
		int date;
		Node next;
		public Node(int date, Node next) {
			super();
			this.date = date;
			this.next = next;
		}
		public Node(Node x) {
			this.next=x;
		}
	}
	
	public void addtotail(int x) {//链表尾部加
		Node xNode=new Node(x, null);
		Node p=head;
		while (p.next!=null) {
			p=p.next;
			
		}
		xNode.next=p.next;
		p.next=xNode;
		size++;
	}
	public void addtohead(int x) {//链表开始加
		Node xNode =new Node(x, null);
		xNode.next=head.next;
		head.next=xNode;
		size++;
	}
	public boolean add(int x,int pos) {
		if (pos<1||pos>size+1) {
			throw new IndexOutOfBoundsException("pos error");
		}
		int num =1;
		Node p=head;
		while (num<pos) {
			p=p.next;
			num++;
		}
		Node xNode=new Node(x,p.next);
		p.next=xNode;
		size++;
		return true;
		
	}
//	public void del(int pos) {
//		int num =1;
//		Node p=head;
//		Node q=head.next;
//		while (num<pos) {
//			p=q;
//			p=p.next;
//			num++;
//		}
//		p.next=q.next;
//		
//		size--;
//	}
	public void del(int pos) {
		if (pos<1||pos>size) {
			throw new IndexOutOfBoundsException("pos error");
		}
		Node p=head;
		int num=1;
		while (num<pos) {
			p=p.next;
			num++;
			
		}
		p.next=p.next.next;
		size--;
	}
	public void claer() {
		size=0;
	}
	public  Node getHead() {
		
		return head;
	}
	public int get(int pos) {
		if (pos<1||pos>size) {
			throw new IndexOutOfBoundsException("pos error");
		}
		int num=1;
		Node p=head;
		while (num<=pos) {
			p=p.next;
			num++;
		}
		return p.date;
	}
	public void reverse() {//反转
		Node p=head.next,q=head;
		Node newhead=new Node(null);
		while(p !=null) {
		q=p;
		p=p.next;
		q.next=newhead.next;
		newhead.next=q;
		}
		head=newhead;
	}
	public int find(int x) {
		if(isEmpty()) {
			System.out.println("链表为空");
			return -1;
		}
		int num=1;
		Node p=head.next;
		while(p!=null) {
			if (p.date!=x) {
				p=p.next;
				num++;
			}
			else break;
		}
		if(p==null)
			return -1;
		return num;
	}
	public boolean isEmpty() {
		return size==0;
	}
//	public void reverse1() {
//		if (head==null||head.next==null) {
//			System.out.println(head);
//		}
//		Node p=head;
//		Node q=head.next;
//		Node r=head.next.next;
//		p.next=null;
//		while (r !=null) {
//			q.next=p;
//			p=q;
//			q=r;
//			r=r.next;
//		}
//		q.next=p;
//		
//	}
	
	public static Node getkthfromEndNode(Node head,int k) {
			Node p=head;
			for (int i = 0; i < k; i++) {
				p=p.next;
			}
			while (p!=null) {
				p=p.next;
				head=head.next;
			}
			return head;
	}

	public boolean hasCycle(Node head) {//环形链表 
		if (head==null) {
			return false;
		}
        Node p=head;
        Node q=head;
        while (p !=null&&p.next !=null) {
			p=p.next.next;
			q=q.next;
			if (q==null) {
				return true;
			}
		}
        return false;
    }
	public boolean xunhuan() {
		Node p=head;
		while (p!=null) {
			p=p.next;
		}
		head.next=p;
		return true;
	}
	public void printall() {
		Node pNode=head.next;
		while(pNode!=null) {
			System.out.print(pNode.date+" ");
			pNode=pNode.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		linkList list1=new linkList();
//		for (int i = 1; i < 6; i++) {
//			//list1.addtotail(i*2);
//			list1.addtohead(i*2);
//		}
//		System.out.println("链表数据为：");
//		list1.printall();
//		System.out.println(list1.getHead());
//		System.out.println("插入后链表为：");
//		list1.add(15, 2);
//		list1.printall();
//		System.out.println("删除后链表为：");
//		list1.del(6);
//		list1.printall();
//		System.out.println(list1.get(2));
//		list1.printall();
//		System.out.println("反转链表为：");
//		list1.reverse();
//		list1.printall();
		for (int i = 1; i < 6; i++) {
			list1.add(i,i);
		}
		
		list1.printall();
		//System.out.println(	list1.getkfromEndNode(list1.head, 2));
		list1.head.next=getkthfromEndNode(list1.head, 2);
		list1.printall();
		System.out.println(list1.xunhuan());
		}
}
