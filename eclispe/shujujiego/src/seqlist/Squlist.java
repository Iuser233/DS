package seqlist;



public class Squlist<T> {
	private T[] data;
	private int count;
	private static final int maxSize = 10;

	public Squlist() {			//无参初始化
		
		this(maxSize);	
	}

	public Squlist(int x) {		//有参初始化
		if (x<1) {
			System.out.println("输入错误");
			System.exit(1);
		}
		count = 0;
		data = (T[])new Object [x];
	}

	public boolean add(T x, int pos) {			//插入方法
		if (pos < 1 || pos > count + 1) {			//1.判断pos输入是否合法
			System.out.println("pos error");		//不合法输出错误
			return false;							//最后返回false	!!	
		}
		if (isFull()) {								//2.再判断data的数组是不是已满
			T[] p=(T[])new Object [count*2];									
			for (int i = 0; i < count; i++) {
				p[i]=data[i];
			}
			data=p;
		}
		
		for (int i = count; i >=pos; i--) {			//3.insert方法，往后移
			data[i]=data[i-1];
		}
		data[pos-1]=x;								//将x付给插入位置的值
		count++;									//长度+1
		return true;								//返回Boolean类型	！！				
	}

	// 头插
		public boolean addtohead(T x) {
			if (isFull()) {								//2.再判断data的数组是不是已满
				T[] p=(T[])new Object [count*2];									
				for (int i = 0; i < count; i++) {
					p[i]=data[i];
				}
				data=p;
			
			}
			for (int i = count; i >= 1; i--) {
				data[i] = data[i - 1];

			}
			data[0] = x;
			count++;
			return true;
		}
		// 尾插
		public boolean addtotial(T x) {
			
			T[] p=(T[])new Object [count*2];									
			for (int i = 0; i < count; i++) {
				p[i]=data[i];
			}
			data=p;
		
		
			data[count] = x;

			count++;
			return true;

		}
	public T del(int pos) {
		if (isEmpty()) {
			System.out.println("data is empty");
			return null;
		}else {
			if (pos<1&&pos>count) {
				System.out.println("pos值不合法");
			}
		}
		T x=data[pos-1];
		
		for (int i =pos ; i <= count; i++) {
			data[i-1]=data[i];
		}
		count--;
		return x;
	}

	public boolean modify(int pos , T x) {
if (isEmpty()) {
	System.out.println("data is empty");
	return false;
}
if (pos<1&&pos>count) {
	System.out.println("pos值错误");
	return false;
}
data[pos-1]=x;
return true;

	}

	public int find(T obj) {
		if (isEmpty()) {
			System.out.println("data is empty");
			return -1;}
			for (int i = 0; i < count; i++) {
				if (data[i].equals(obj)) {
					return  i+1;
	}
	
	}
		return -1;
	}

	public T get(int pos) {
		if (isEmpty()) {
			System.out.println("data is empty");
			return null;}
		if (pos<1&&pos>count) {
			System.out.println("pos值错误");
			return null;
		}
		return data[pos-1];
		
		
	}
	
	public boolean isEmpty() {
//if (count==data.length) {
//	return true;
//}else {
//	return
//		false;
//}
		return count == 0;	
	}

	public boolean isFull() {
		
		return count == data.length;
	}

//	public boolean Rankcheck() {
//		
//	}
	public int size() {
return count;
	}

	public void clear() {
count=0;
for (int i = 0; i < count; i++) {
	data[i]=null;
}
	}

	public void nextOder() {
		if (isEmpty()) {
			System.out.println("data is empty");
			}
		
		for (int i = 0; i < count; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println(" ");
	}


}