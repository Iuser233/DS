package data;
/*
 * 循环队列
 */


public class cycleQueue {
private int[] data;
private int rear,front;
private final int maxSize=4;

//初始化
	public cycleQueue(){
		rear = front=0;
		data = new int[maxSize];
		
	}
//入队	
//	public void EnQueue(int x) {
//		if(isFull()) {
//			int[] p = new int[data.length*2];
//			//rear在队尾时往下放
//			if(rear==(data.length-1)) {
//				for (int i = 0; i<=rear; i++) 
//					p[i] = data[i];
//				}
//				else {
//					//rear在对头时望下放
//					int i,j=1;
//					for(i=front+1;i<data.length;i++,j++) {
//						p[j] = data[i];
//						for(i=0;i<=rear;i++,j++) 
//						p[j] = data[i];
//						front = 0;
//						rear=data.length-1;
//					}
//					data=p;
//					
//				}
//			
//				}
//		rear=(rear+1)%data.length;
//		data[rear] = x;
//				
//		}
	public void EnQueue(int a) {
		if(isFull()) {
			int[] p = new int[data.length*2];
			int x=1; //新空间里的第一个元素
			int y=front+1; //front不放元素（旧空间的第一个元素）
			int z=size();
			for (int i = 1; i <= z; i++) {
				p[x] = data[y%data.length];
				x++;				
				y++;
			}
			data=p;
			front=0;//（让新的空间里的front为零）
			rear=z;
			
		}
		rear=(rear+1)%data.length;
		data[rear] = a;
	}
	
	private boolean isFull() {
		// TODO Auto-generated method stub
		return (rear+1)%data.length==front;
	}
	
	//出队
	public int DeQueue() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("队列已空，无法出队");
			
		}
		front=(front+1)%data.length;
		
		return front;
	}
	
	//取头元素操作（就是取第一个元素）
    public int GetTop() {
    	if(isEmpty()) {
    		throw new IndexOutOfBoundsException("队列已空，无法读取元素");
    	}
    	return data[(front+1)%data.length];
    }
    //队列非空判断
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return front==rear;
	}
	
	//求队列的长度
	public int size() {
		return ((rear-front)+data.length)%data.length;
	}
	
	//遍历队列
	public void nextOrder() {
		int i,j=front;
		for ( i = 1; i <= size(); i++) {
			j=(j+1)%data.length;
			System.out.print(data[j]+" ");
		}
		System.out.println();
	}
	//清空队列
	public void clear() {
		front=rear;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     cycleQueue p = new cycleQueue();
     for (int i = 1; i < 6; i++) {
 		p.EnQueue(i*2);
 		}
     System.out.println("打印原来的循环队列");
     p.nextOrder();
     
     System.out.println("入队");
     p.EnQueue(1);
    
     p.nextOrder();
     
     System.out.println("出队");
     p.DeQueue();
     p.nextOrder();
     
   
     System.out.println("队列的长度"+p.size());
     
    
     
	}

}
