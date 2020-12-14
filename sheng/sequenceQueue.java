
public class sequenceQueue {
	final int Maxsize = 5;
	private int[] data;
	private int front, rear;

	public sequenceQueue() {// 构造一个空队列
		front = rear = 0;
		data = new int[Maxsize];
	}

	public void EnQuene(int obj) {// 在队列的队尾插入一个新元素
		if ((rear + 1) % data.length == front) {
			int[] p = new int[data.length * 2];
			if (rear == data.length - 1) {
				for (int i = 1; i <= rear; i++) {
					p[i] = data[i];
				}
			} else {
				int i, j = 1;
				for (i = front + 1; i < p.length; i++, j++) {
					p[j] = data[i];
				}
				for (i = 0; i <= rear; i++, j++) {
					p[j] = data[i];
				}
				front = 0;
				rear = data.length - 1;
			}
			data = p;
		}
		rear = (rear + 1) % data.length;
		data[rear] = obj;
	}

	public int DeQueue() {//出队
		if (isEmpty()) {
			System.out.println("队空");
			return -1;
		}
		front = (front + 1) % data.length;
		return data[front];
	}

	public int getHead() {// 取队列队头元素
		if (isEmpty()) {
			System.out.println("队空");
			return -1;
		}
		return data[(front + 1) % data.length];
	}

	public int size() {// 求出队列中元素个数
		return (rear - front + data.length) % data.length;
	}

	public boolean isEmpty() {// 判断当前队列是否为空
		return front == rear;
	}

	public void nextOrder() {// 输出队列中每一个元素
		int i, j = front;
		for (i = 1; i <= size(); i++) {
			j = (j + 1) % data.length;
			System.out.print(data[j]+" ");
		}
		System.out.println();
	}

	public void clear() {// 销毁队列
		front = rear = 0;
	}

	public static void main(String[] args) {
		sequenceQueue s=new sequenceQueue();
		int [] a= {11,12,13,14,15,16};
		for (int i = 0; i < a.length; i++) {
			s.EnQuene(a[i]);
		}
		s.nextOrder();
		System.out.println(s.DeQueue());
	}
}
