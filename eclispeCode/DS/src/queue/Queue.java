package queue;
public class Queue {
	final int Maxsize = 5;
	private int[] data;
	private int front,count;
	public Queue() {
		front=0;
		data = new int[Maxsize];
	}
	public void EnQuene(int obj) {// �ڶ��еĶ�β����һ����Ԫ��
	int temp;
	if (count==data.length) {
		int[] p = new int[data.length * 2];
		if (front == data.length - 1) {
			for (int i = 0; i <= front; i++) {
				p[i] = data[i];
			}
			data=p;
	}else {
		count++;
		temp=(front+count)%data.length;
		data[temp]=obj;
	}
	}
	}
	public int size() {// ���������Ԫ�ظ���
		return front % data.length;
	}
	public void nextOrder() {// ���������ÿһ��Ԫ��
		int i, j = front;
		for (i = 1; i <= size(); i++) {
			j = (j + 1) % data.length;
			System.out.print(data[j]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Queue q=new Queue();
		int [] a= {11,12,13,14,15,16};
		for (int i = 0; i < a.length; i++) {
			q.EnQuene(a[i]);
		}
		q.nextOrder();
	}
}