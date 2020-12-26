public class Queue1 {
	final int Maxsize = 5;
	private int[] data;
	private int front,count;
	public Queue1() {
		front=0;
		data = new int[Maxsize];
	}
	public void EnQuene(int obj) {// 在队列的队尾插入一个新元素
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
	public int size() {// 求出队列中元素个数
		return front % data.length;
	}
	public void nextOrder() {// 输出队列中每一个元素
		int i, j = front;
		for (i = 1; i <= size(); i++) {
			j = (j + 1) % data.length;
			System.out.print(data[j]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Queue1 q=new Queue1();
		int [] a= {11,12,13,14,15,16};
		for (int i = 0; i < a.length; i++) {
			q.EnQuene(a[i]);
		}
		q.nextOrder();
	}
}
