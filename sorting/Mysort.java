package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import sun.tools.jar.resources.jar;

public class Mysort {
public static void bubble_sort(int[] a,int n) {
	/*
	 * ð������
	 * ��Ҫ��������ѭ��
	 * ��һ��
	 */
	for (int i = 0; i < n; i++) {
		/*
		 * �������֮���һ����ǩ��
		 */
		boolean tag=false;
		for (int j = 0; j < n-i-1; j++) {
			if (a[j]>a[j+1]) {
				swap(a, j, j+1);
				tag=true;
			}
		}
		if (!tag) {
			break;
		}
		System.out.println(Arrays.toString(a));//��ӡ����a

	}
//	System.out.println(Arrays.toString(a));//��ӡ����a
	/*�����������˫��ѭ�����������򣬵���������֮������������鿴�Ƿ���н���������˷���һЩ�ռ�
	 * ���Լ���һ����ǩtag�������
	 * ���ڲ�ѭ�������˽���ʱtag=ture
	 * �����жϽ�����Ϊ
	 * 
	 */
}
public static void swap(int[]a,int i,int j) {
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}
public static void insert_sort(int[]a ,int n) {
	/*
	 * ֱ�Ӳ�������
	 * ������˿���
	 *�Ƚ��������ŵ�һ��{ }�У��ٶ���һ����{}��
	 *����㽫һ�����Ž�ȥ��Ĭ��Ϊa[0]
	 *�ڴ��±�Ϊ1���ڶ���Ԫ�ص�����ʼ�Ƚ�,��Ϊtemp������Ҫ������ǰ���Ԫ�رȴ�С�����Ƚ�n-2�����Ե�һ��ѭ����[1~n)
	 *�ȱȽ�i-1��temp�Ĵ�С��ֱ��j=0��
	 *�����ʱ��Ҫ�����������в��룬�鵽j+1λ����
	 */
	int j=0;
	for (int i = 1; i < n; i++) {//��һ��ѭ�� ���ȳ�һ����
		int temp=a[i];
		
		for ( j = i-1; j >=0 ; j--) {//�ڵڶ���ѭ���У��Ƚ�temp������������������бȽ�
			if (a[j]>temp) {
				a[j+1]=a[j];
//				a[i]=temp; ����Ҫ������֮���
			}else {
				break;
			}
		}
		a[j+1]=temp;
	}
	System.out.println(Arrays.toString(a));
}
public static void shell_sort(int[]a,int n) {
	/*
	 * shellsort������С��������
	 * ��������
	 */
//	int increament=n/2;
	int i,j;
	int temp=0;
	for (int increament=n/2;  increament> 0;increament/=2) {
		for ( i = increament; i < n; i++) {
			temp=a[i];
			for (j = i;  j>= increament; j-=increament) {//ǰ���¼λ�õ�������increament
				if (a[j-increament]>a[i]) {
					a[i]=a[j-increament];
				}
				else {
					break;
				}
				a[j-increament]=temp;

			}
		}
	}
	System.out.println(Arrays.toString(a));
}
public static void quick_sort(int [] a,int n) {
	
}
protected int parttion(int low,int high) {
	
}

public static void main(String[] args) {
	int[]a= {5,4,3,2,6,5,8,6,4};
	int n=a.length;
//	bubble_sort(a, n);
//	insert_sort(a, n);
	shell_sort(a, n);
	
}
}
