package seqlist;

import java.awt.TexturePaint;
import java.util.Arrays;

public class Sequlist<T> {
	private T[] data; // 存放数据的数组
	private int count; // 表里面元素个数
	private static final int maxsize = 10; // 定义域，最大个数
	private static final int Element_Not_Found = -1; // 定义域，最大个数

	public Sequlist() { // 1.初始化，无参
//		count = 0; // 个数为零
//		data = new int[maxsize]; // 定义date为10
		this(maxsize);
	}

	public Sequlist(int n) { // 2.构造有参数构造方法
		count = 0; // 个数为零
		data =(T[])new Object[n]; // 定义date为n
	}
	// 操作

	// 一，定义插入方法
	public boolean add(T x, int pos) { // 返回值f/t 加x和其位置
		if (pos < 1 && pos > count + 1) { // （1）判断pos是不是有效
			System.out.println("pos error");
			return false;
		}
		if (isFull()) { // （2）判断数组是不是满了
//	System.out.println("full");				//方法1简单处理，报错
//	return false;
			T[]p =(T[])new Object [count*2] ; // 方法二增大数组容量，将data中数据放到p中
			for (int i = 0; i < count; i++) {
				p[i] = data[i];
			}
			data = p;
		}

		// （3）定义插入方法
		// 用for循环来将最后一个数往后挪
		for (int i = count; i >= pos; i--) { // 从最后一个数开始，int i=count，往后挪，一直到pos，pos位置的数也往后移，
		data[i] = data[i - 1]; // 下标
		}
		data[pos - 1] = x;
		count++;
		return true;
	}

	public boolean add(int x) {// 无位置；
data[count]=x;
return true;

	}

	public boolean isFull() { // 判断数组是不是满了
		return count == data.length; // 元素个数是否等于data长度

	}

	public boolean isEnmpty() { // 判断是不是空
		return count == 0;

	}

	public int size() { // 表的大小
		return count;
	}

	public int del(int pos) {
		if (isEnmpty()) {
			System.out.println("empty");
			return -1;
		} else {
			if (pos < 1 && pos > count) {
				System.out.println("pos error");
				return -1;
			}

		}
		T result = data[pos - 1];
		for (int i = pos; i < count; i++) {
			data[i - 1] = data[i];

			count--;

		}
		return result;
	}

	public void nextorder() {
		for (int i = 0; i < count; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println(" ");
	}

	public int find(T obj) {
//		int a=0;
//		if (isEnmpty()) {
//			System.out.println("顺序表为空");
//			return -1;
//		}else {
//		for (int i = 0; i < count; i++) 
//			if (data[i] == obj) 
//				a=i+1;				
//		}System.out.println(a);		
//		return a;
	for (int i = 0; i < count; i++) {
		if (data[i]==obj) {
			return i+1;
		}
		
	}
	return -1;
	}

	public T get(int pos) {
		if (pos < 1 && pos > count) {
			throw new IndexOutOfBoundsException("pos is error");

		}
		return data[pos - 1];

	}

	public boolean modify(T pos, int newx) {
return true ;

	}

//	public boolean equals() {
//		return data[i]=obj;
//		
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequlist list1 = new Sequlist();
		for (int i = 1; i < 5; i++) {
			list1.add(i * 5, i);
		}
//		list1.del(2);
//		list1.find(20);

//		int a[]=new int[] {1,2,3,4,5,6}
//		for (int i=1,i>a.)
//		
//list1.add(2,1);
		list1.nextorder();
		list1.get(2);
		list1.nextorder();
		list1.find(20);
		list1.nextorder();

	}

//	@Override
//	public String toString() {									//
//		return "Sequlist [data=" + Arrays.toString(data) + "]";
//	}

}
