package singlelist;

public class singlelinkList { // ��һ���ȶ���node�ࣨ�����ࣩ
	private int size; // Ȼ���ٽ��е�����ĳ�ʼ��������
	private node head; // ���嵥�����ͷ����С

	public singlelinkList(int size, node head) {
		super();
		this.size = size;
		this.head = head; // private
	}

	public singlelinkList() { // ��ʼ���޲�����singlelinkList
		size = 0; // size=0
		head = new node(null); // head�ڵ��next��Ϊnull��
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
