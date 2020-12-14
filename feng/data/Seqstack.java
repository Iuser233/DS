package data;
/*
 * 顺序栈
 */
public class Seqstack {
private int[] data; //创造一个数组存放数据
private int top; //指示栈顶
private final int MaxSize = 10;
public Seqstack() {
	top = -1;  //top初始为-1
	data = new int[MaxSize]; //数组初始化
	
}

//入栈
   public void push(int x) {
	   if(isFull()) {
		   
		   int[] p = new int[top*2];
		   for(int i = 0; i<=top;i++) {
			   p[i] = data[i];
		   }
		   data = p;
	   }
	   top++;
	   data[top] = x; //top是个位置
   }
private boolean isFull() {
	// TODO Auto-generated method stub
	return top == data.length-1; //判断 相等时输出ture 否则为 false;
}
  
//出栈
public int pop() {
	if(isEmpty()) {
		throw new IndexOutOfBoundsException("为空");
		
	}
	int ele = data[top]; //从data里面取top位置的数据
	 top--; //top是栈顶，所以一直指向栈顶
	 return ele;
}

private boolean isEmpty() {
	// TODO Auto-generated method stub
	return top == -1; 
}

//显示栈顶是谁
public int peek() {
	if(isEmpty()) {
		throw new IndexOutOfBoundsException("为空");
	}
	return data[top];
}
	

public void printstack() {
	for(int i = top; i>=0;i--) { //i>=0的意思是减到最后一个
		System.out.print(data[i]+" "); //data[i]意思是访问数组里的每个元素
	}
	System.out.println();
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
  Seqstack stack1 = new Seqstack();
//  for(int i=1;i<6;i++) {
//	  stack1.push(i*2);
//  }
  int []a = {12,45,84,56};
  for(int i = 0; i<a.length;i++) {
	  stack1.push(a[i]);
  }
  
  System.out.println("打印原来的：");
  stack1.printstack();
  
  System.out.println("入栈：");
  stack1.push(1);
  stack1.printstack();
  
  
  System.out.println("出栈："+stack1.pop());
  System.out.println("剩余：");
  stack1.printstack();
  
  
}
}
