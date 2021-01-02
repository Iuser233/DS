package queue;

public class sequenceQuence {
	final int  MaxSize=10;
	private int[] data;
	private int front,rear;
	/*
	 * front总是出队元素的前一个
	 */
	/*
	 * initialize
	 * 
	 */
	public sequenceQuence() {
	front=rear=0;
	data=new int [MaxSize];
		
	}
	/*
	 * 入队
	 */
	public void EnQuence(int x){
		if (isFull()) {
			/*
			 * 判断队列是不是满了
			 * 是的话扩容
			 * 还分rear位置的情况
			 * 1.一开始front=0
			 * 2.front！=0
			 */
			int[] p=new int[2*MaxSize+2];
			
			if (rear==data.length-1) {
				/*
				 * data[0]不存元素
				 * 从1开始放
				 */
				for (int i = 1; i <=rear; i++) {
					p[i]=data[i];
					
				}
			}else {
				/*
				 * 队列不是一开始的情况
				 * 有变化
				 * 先进先出
				 */
				int i,j=1;
				/*
				 * 将front-max放到新队列中
				 * 
				 */
				for (i=front+1; i < data.length; i++,j++) {
					p[j]=data[i];
					
				}
				/*
				 * 0-rear——>p
				 */
				for (i = 0; i < rear; i++,j++) {
					p[j]=data[i];
				}
				
				front=0;
				rear=data.length-1;//?????????????????????????????????
			}
			data=p;
		}
		rear=(rear+1)%MaxSize;
		data[rear]=x;
		
	}
	/*
	 * 出队
	 */
	public int DeQuence() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("error");
			
		}
		/*
		 * 出队时移动f指针，r指针不动
		 * 因为是循环队列，最后一个位置不放元素
		 * 假如0-5，f=4，再出队f=（4+1）%6
		 */
		front=(front+1)%MaxSize;
		return data[front];
		
	}
	public boolean isFull() {
		/*
		 * 判断队列是不是满了
		 * 先空出数组中的一个位置，数组大小为length-1；
		 * @--@
		 * 。。
		 */
		return (rear+1)%MaxSize==front;
		
	}
	public boolean isEmpty() {
	/*	先进行入队操作再出队
	 * 	当front指针指到rear指针时说明队列中所有元素已经出队完毕
	 * 	所以队列为空
	 */
		return front==rear;
	}
	public int size() {
		return(rear-front+MaxSize)%MaxSize;
	}
	public void printquence() {
		int i,j=front;
		for (i = 1;  i<=size(); i++) {
			j=(j+1)%MaxSize;
			System.out.print(data[j]+" ");
		}
		System.out.println(" ");
	}
	public int getHead() {
		if (isEmpty()) {
			System.out.println("kong");
		}
		return data[(front+1)%MaxSize];
	}
	public void clear() {
		front=rear=0;
	}
	
}
