package stack;

public class squencestack<T> {
	private T[] data;
	private int top;
	private final int MAXSZIE = 10;

	public squencestack() {
		top = -1;
		data = (T[])new Object[MAXSZIE];

	}

	public squencestack(int n) {
		top = -1;
		data = (T[])new Object [n];

	}

	public void push(T x) {
		if (isFull()) {
			T [] p=(T[])new Object [2*top+2];
			for (int i = 0; i <=top; i++) {
				p[i]=data[i];
				
			}
			data=p;
		}
		
//		top++;
//		data[top]=x;
		data[++top]=x;
		//复杂度分析O（1）
		
	}

	public T pop() { // 返回出栈的数字
if (isEmpty()) {
throw new IndexOutOfBoundsException("error") ;
}
//		int old=data[top];
//		top--;
T old=data[top--];
return old;

	}

	public T peek() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("error") ;
			}
		return data[top];
	}

	public boolean isEmpty() {
		return top == -1;

	}

	public boolean isFull() {
		return top == data.length - 1;

	}

	public void printstack() {
		for (int i = top; i >=0; i--) {
			System.out.print(data[i]+" ");
		}
		System.out.println(" ");
	}

	public void clear() {
		top=-1;

	}
}
