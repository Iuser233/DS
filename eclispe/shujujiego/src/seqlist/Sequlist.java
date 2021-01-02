package seqlist;

import java.awt.TexturePaint;
import java.util.Arrays;

public class Sequlist<T> {
	private T[] data; // ������ݵ�����
	private int count; // ������Ԫ�ظ���
	private static final int maxsize = 10; // ������������
	private static final int Element_Not_Found = -1; // ������������

	public Sequlist() { // 1.��ʼ�����޲�
//		count = 0; // ����Ϊ��
//		data = new int[maxsize]; // ����dateΪ10
		this(maxsize);
	}

	public Sequlist(int n) { // 2.�����в������췽��
		count = 0; // ����Ϊ��
		data =(T[])new Object[n]; // ����dateΪn
	}
	// ����

	// һ��������뷽��
	public boolean add(T x, int pos) { // ����ֵf/t ��x����λ��
		if (pos < 1 && pos > count + 1) { // ��1���ж�pos�ǲ�����Ч
			System.out.println("pos error");
			return false;
		}
		if (isFull()) { // ��2���ж������ǲ�������
//	System.out.println("full");				//����1�򵥴�������
//	return false;
			T[]p =(T[])new Object [count*2] ; // ����������������������data�����ݷŵ�p��
			for (int i = 0; i < count; i++) {
				p[i] = data[i];
			}
			data = p;
		}

		// ��3��������뷽��
		// ��forѭ���������һ��������Ų
		for (int i = count; i >= pos; i--) { // �����һ������ʼ��int i=count������Ų��һֱ��pos��posλ�õ���Ҳ�����ƣ�
		data[i] = data[i - 1]; // �±�
		}
		data[pos - 1] = x;
		count++;
		return true;
	}

	public boolean add(int x) {// ��λ�ã�
data[count]=x;
return true;

	}

	public boolean isFull() { // �ж������ǲ�������
		return count == data.length; // Ԫ�ظ����Ƿ����data����

	}

	public boolean isEnmpty() { // �ж��ǲ��ǿ�
		return count == 0;

	}

	public int size() { // ��Ĵ�С
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
//			System.out.println("˳���Ϊ��");
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
