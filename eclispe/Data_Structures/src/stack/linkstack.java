package stack;



public class linkstack {
//ջ��ָ��
	private Node top;
//����ջ�ĳ���
	private int  length;
//����һ���յ�ջ
	public linkstack () {
		length=0;
		top=null;
		
	}
//��ջ input:node p;output:null
	public void push(Node p) {
		top=p.next;
		top=p;
		length++;
		
	}
//��ջ  intput:null   output:��ջ��Ԫ�ص�������
	public int pop() {
		//�ж��Ƿ�Ϊ��
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("linkstack is error");
		}
		int old=top.data;
		top=top.next;
		length--;
		//!!����ɾ��ֵ
		return old;
	}
//ȡջ��Ԫ��
	public int peek () {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("error");
		}
		return top.data;
	}

	
	//ջ��Ԫ�ظ���
	public int size() {
		return length;
	}

//�жϵ�ǰջ�Ƿ�Ϊ��
	public boolean isEmpty() {
		return top==null;
		
	}
	//����ջ��Ԫ�ز����
	public void printstack() {
		Node xNode=top;
	while (xNode.next!=null) {
		System.out.println(xNode.data);
		xNode=xNode.next;
	}
	
	}

	//����
	public void clear() {
		 top=null;	
	
}
}