package singlelist;

public class singlelinkList { // 第一步先定义node类（引用类）
	private int size; // 然后再进行单链表的初始化。。。
	private node head; // 定义单链表表头，大小

	public singlelinkList(int size, node head) {
		super();
		this.size = size;
		this.head = head; // private
	}

	public singlelinkList() { // 初始化无参数的singlelinkList
		size = 0; // size=0
		head = new node(null); // head节点的next域为null！
	}
	/***
there is no parameter	
	**/
//	private singlelinkList (node x) {
//		size=0;
//		head=new node(x);
//	}

	public boolean add(int obj, int pos) {
		if (isEmpty()) {
			return false;

		} else {
			if (pos < 1 || pos > size + 1) {
				System.out.println(" pos is error");

			}
		}
		int num = 1;
		node pNode = head;
		while (num < pos) {
			
		}

	}

	public boolean isEmpty() {
		return size == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
