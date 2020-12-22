package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import sun.tools.jar.resources.jar;

public class Mysort {
public static void bubble_sort(int[] a,int n) {
	/*
	 * 冒泡排序：
	 * 主要就是两层循环
	 * 第一层
	 */
	for (int i = 0; i < n; i++) {
		/*
		 * 在内外层之间加一个标签组
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
		System.out.println(Arrays.toString(a));//打印数组a

	}
//	System.out.println(Arrays.toString(a));//打印数组a
	/*如果仅仅是用双层循环来进行排序，当数组排完之后，她还会继续查看是否进行交换，因此浪费了一些空间
	 * 所以加上一个标签tag用来标记
	 * 当内层循环进行了交换时tag=ture
	 * 所以判断交换不为
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
	 * 直接插入排序
	 * 就想抽扑克牌
	 *先将所有数放到一个{ }中，再定义一个空{}，
	 *先随便将一个数放进去，默认为a[0]
	 *在从下标为1，第二个元素的数开始比较,设为temp（后面要将他与前面的元素比大小），比较n-2次所以第一层循环到[1~n)
	 *先比较i-1与temp的大小，直到j=0；
	 *插入的时候要在排完序后进行插入，查到j+1位置上
	 */
	int j=0;
	for (int i = 1; i < n; i++) {//第一层循环 ，先抽一张牌
		int temp=a[i];
		
		for ( j = i-1; j >=0 ; j--) {//在第二层循环中，先将temp与左边排完序的数组进行比较
			if (a[j]>temp) {
				a[j+1]=a[j];
//				a[i]=temp; 插入要在排完之后插
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
	 * shellsort又名缩小增量排序
	 * 划分增量
	 */
//	int increament=n/2;
	int i,j;
	int temp=0;
	for (int increament=n/2;  increament> 0;increament/=2) {
		for ( i = increament; i < n; i++) {
			temp=a[i];
			for (j = i;  j>= increament; j-=increament) {//前后记录位置的增量是increament
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
