package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Mysort {
public static void bubble_sort(int[] a,int n) {
	/*
	 * ð������
	 * ��Ҫ��������ѭ��
	 * ��һ��
	 */
	/*
	 * �ڽ���ð�������ͬʱͳ������������жԹؼ��ֵıȽϴ������ƶ������������ͳ�ƽ����
	 */
	int compare = 0,movement=0;
	for (int i = 0; i < n; i++) {
		/*
		 * �������֮���һ����ǩ��
		 */
		
		compare++;

		boolean tag=false;
		for (int j = 0; j < n-i-1; j++) {
			if (a[j]>a[j+1]) {
				swap(a, j, j+1);
				tag=true;
				movement++;
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
System.out.println("compare  "+compare);
System.out.println("movement  "+movement);

}
public static void swap(int[]a,int i,int j) {
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}
public static void insert_sort(int[]a ,int n) {
	/*
	 * ֱ�Ӳ�������
	 * 啊
	 * ������˿���
	 *�Ƚ��������ŵ�һ��{ }�У��ٶ���һ����{}��
	 *����㽫һ�����Ž�ȥ��Ĭ��Ϊa[0]
	 *�ڴ��±�Ϊ1���ڶ���Ԫ�ص�����ʼ�Ƚ�,��Ϊtemp������Ҫ������ǰ���Ԫ�رȴ�С�����Ƚ�n-2�����Ե�һ��ѭ����[1~n)
	 *�ȱȽ�i-1��temp�Ĵ�С��ֱ��j=0��
	 *�����ʱ��Ҫ�����������в��룬�鵽j+1λ����
	 */
	
	/*
	 * �ڽ���ֱ�Ӳ��������ͬʱͳ������������жԹؼ��ֵıȽϴ������ƶ������������ͳ�ƽ����
	 */
	int compare = 0,movement=0;
	int j=0;
	for (int i = 1; i < n; i++) {//��һ��ѭ�� ���ȳ�һ����
		int temp=a[i];
			for ( j = i-1; j >=0 ; j--) {//�ڵڶ���ѭ���У��Ƚ�temp������������������бȽ�
			compare++;
			if (a[j]>temp) {
				a[j+1]=a[j];
				movement++;				
//				a[i]=temp; ����Ҫ������֮���
			}else {
				break;
		//��Ϊ��ߵļ����Ѿ�������˳����ˣ����temp�ȸտ�ʼ��[i-1]���󣬾�û�н�����Ҫ��ֱ������ѭ��
			}
		}
//		movement++;
		a[j+1]=temp;//j=-1ʱ=-=
	}
	System.out.println(Arrays.toString(a));
	System.out.println("compare  "+compare);
	System.out.println("movement  "+movement);

}
public static void shell_sort(int[]a,int n) {
	/*
	 * shellsort������С��������
	 * ��������
	 */
//	int increament=n/2;
	int compare = 0,movement=0;
	
	int i,j;
	int temp=0;
	for (int increament=n/2;  increament> 0;increament/=2) {
		for ( i = increament; i < n; i++) {
			temp=a[i];
			for (j = i;  j>= increament; j-=increament) {
				compare++;
				//ǰ���¼λ�õ�������increament
				if (a[j-increament]>temp) {
					a[j]=a[j-increament];
					movement++;
				}
				else {
					break;
				}
//				a[j-increament]=temp;

			}
			a[j]=temp;
		}
	}
	System.out.println(Arrays.toString(a));
	System.out.println("compare  "+compare);
	System.out.println("movement  "+movement);
}
//public static void quick_sort(int [] a,int n) {
//	
//}
//protected int parttion(int low,int high) {
//	
//}

public static void select_sort(int[]a,int n) {
	/*
	 * ��ѡ������
	 * ����ѡ���ؼ�����С��Ԫ�ط��ڵ�һ��λ�ã���ѡ����ڶ�С��Ԫ�ط��ڵڶ���Ԫ�أ��Դ�����ֱ��ѡ����n-1��Ԫ��
	 */
	/*
	 * �ڽ��м�ѡ�������ͬʱͳ������������жԹؼ��ֵıȽϴ������ƶ������������ͳ�ƽ����
	 */
	int compare = 0,movement=0;

	if (n<=1) {
		return;
	}
	for (int i = 0; i < n-1; ++i) {
//		compare++;
		int minIndex=i;
		for (int j = i+1; j < n; ++j) {
			compare++;
			if (a[j]<a[minIndex]) {
				minIndex=j;
				
			}
			
		}//����
		movement++;
		int temp=a[i];
	a[i]=a[minIndex];
	a[minIndex]=temp;
	
	}
	System.out.println(Arrays.toString(a));
	System.out.println("compare  "+compare);
	System.out.println("movement  "+movement);
	
}


public static void insertion_sort(int[] A,int n) {
	int compare = 0,movement=0;
	int j;
	for (int i = 1; i < n; i++) {
		compare++;
		int value=A[i];
		for ( j =i; j >0&& A[j-1]>value; j--) {
			A[j]=A[j-1];
			compare++;
			movement++;
		}
		
		A[j]=value;
	}
	System.out.println(Arrays.toString(A));
	System.out.println("compare  "+compare);
	System.out.println("movement  "+movement);
}
public static void selection_sort(int A[],int n) {
	int compare = 0,movement=0;

	for (int i = 0; i <n; i++) {
		int minindex=i;
		compare++;
		for (int j = i+1; j < n ; j++) {
		
			if (A[j]<A[minindex]) {
				minindex=j;
				movement++;
			}
			movement++;
		}

		movement++;
		swap(A, i, minindex);
	}
	System.out.println(Arrays.toString(A));
	System.out.println("compare  "+compare);
	System.out.println("movement  "+movement);
}

public static void main(String[] args) {
//	int[]a= {1,2,3,4,5};
//	int[]a= {5,8,3,6,5};

	int[]a= { 5,4,3,2,1,6};

	int n=a.length;
//	System.out.println("ð������");
////	bubble_sort(a, n);
//	System.out.println("ֱ�Ӳ�������");
//	System.out.println("�������飺"+Arrays.toString(a));
//	insert_sort(a, n);
//	insertion_sort(a, n);
//	System.out.println("ϣ������"+Arrays.toString(a));
//	shell_sort(a, n);
	System.out.println("��ѡ������");
	select_sort(a, n);
//	selection_sort(a, n);
	
	
	
}
}
