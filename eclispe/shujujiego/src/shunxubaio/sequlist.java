package shunxubaio;

import javax.xml.crypto.Data;

import org.w3c.dom.ls.LSException;

public class sequlist {
	private int count;
	private static final int maxsize = 10;
	private int[] data;

	public sequlist() {
		this(maxsize);
//	count=0;
//	data=new int[maxsize];
	}

	public sequlist(int x) {
		if (x < 1) {
			System.out.println("数组个数不能小于一");
			System.exit(1);
		}
		count = 0;
		data = new int[x];

	}

	// 随便插入
	public boolean add(int x, int pos) {
		if (isFull()) {
			int[] p = new int[count * 2];
			for (int i = 0; i < data.length; i++) {
				p[i] = data[i];

			}
			data = p;
		}
		if (pos < 1 || pos > count + 1) {
			System.out.println("pos is eror");
			throw new IndexOutOfBoundsException(" error");
		}
		for (int i = count; i > pos; i--) {
			data[i] = data[i - 1];

		}
		data[pos - 1] = x;
		count++;
		return true;
	}

	// 头插
	public boolean addtohead(int x) {
		if (isFull()) {
			int[] p = new int[count * 2];
			for (int i = 0; i < data.length; i++) {
				p[i] = data[i];

			}
			data = p;
		}
		for (int i = count; i >= 1; i--) {
			data[i] = data[i - 1];

		}
		data[0] = x;
		count++;
		return true;
	}

	// 尾插
	public boolean addtotial(int x) {
		int[] p = new int[count * 2];
		for (int i = 0; i < data.length; i++) {
			p[i] = data[i];
		}
		data = p;
		data[count] = x;

		count++;
		return true;

	}

	// 删除
	public int del(int pos) {
		if (isEmpty()) {
			System.out.println("there is no data");

		}
		int old = 0;
		old = data[pos - 1];
		for (int i = pos; i < count; i++) {
			data[i - 1] = data[i];

		}
		count--;
		return old;

	}

	// 修改
	public void modeify(int newx, int pos) {
		if (pos < 1 || pos > count) {
			System.out.println(" pos is error");
		}
		if (isEmpty())
			System.out.println("empty");
		data[pos - 1] = newx;
	}

	// 查询obj
	public int find( int obj) {
		if (isEmpty()) {
			System.out.println("data is empty");
			return -1;}
			for (int i = 0; i < count; i++) {
				if (data[i]==obj) {
					return  i+1;
	}
	
	}
		return -1;
	}
	//查询pos位置的数
	public int  getvalue(int pos) {
		if (isEmpty()) {
			System.out.println(" 数组为空");
			return -1;
		}
		if (pos<1||pos>count) {
			System.out.println("pos is error");
		}
		return data[pos-1];
	}
	

	// 判断为满
	public boolean isFull() {
		return count == data.length;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public void printAll() {
		for (int i = 0; i < count; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
public void clear() {
	count=0;
}
public int size() {
	return data.length;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sequlist list1 = new sequlist();
		for (int i = 1; i < 6; i++) {
			list1.add(i * 2, i);
		}
		list1.printAll();
		list1.addtohead(5);
		list1.printAll();
		list1.addtotial(88);
		list1.printAll();
		list1.del(7);
		list1.printAll();
		list1.modeify(5, 3);
		list1.printAll();
		int a = list1.find(6);
		System.out.println(a);
		int b=list1.getvalue(3);
		System.out.println(b);
		int c=list1.size();
		System.out.println(c);
		list1.clear();
		list1.printAll();
		
	}

}
