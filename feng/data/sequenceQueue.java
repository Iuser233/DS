package data;
/*
 * 顺序队列（问题：没有扩容，一但加入的数大于MaxSize就不行了）
 */


public class sequenceQueue {
	private int[] data;
	private int front,rear;
	private final int MaxSize=10;
      public sequenceQueue(){
    	front = rear = 0;
    	data = new int[MaxSize];
		
	}
     
	  
	  public void enQueue(int x) {//入队
		  if(isFull()) {
			  System.out.println("Full");
		  }
		  else {
			  rear = (rear+1)%data.length;
			  data[rear] = x; //输入x
		  }
		
	}
	  public boolean isFull() {
    	  return (rear+1)%data.length == front;
      }  
	  
	  public int  deQueue() {  //出队
		  if(isEmpty()) {
			  System.out.println("Empty");
			  return -1;
		  }
		  else {
			  front = (front+1)%data.length;
		  }
		return front;
		
	  }
	  
	  public boolean isEmpty() {
		  return rear == front;
		  
	  }
	  
	  public void printQueue() {
		  int j = front;
		  for (int i = 1; i <= size(); i++) {
			j = (j+1)%data.length;
			System.out.print(data[j]+ " ");
		}
		  System.out.println("");
		
	}
	  
	
	
	private int size() {
		// TODO Auto-generated method stub
		return (rear - front +data.length)%data.length; //算出有几个元素
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    sequenceQueue q = new sequenceQueue();
    
	for (int i = 1; i < 6; i++) {
		q.enQueue(i*2);
		
	}
	System.out.println("打印原先的顺序队列");
    q.printQueue();
    System.out.println("出队");
    q.deQueue();
    q.printQueue();
    System.out.println("入队");
    q.enQueue(1);
    q.printQueue();
    
   System.out.println("顺序列内元素个数："+q.size());
	}

}
