
public class sequenList {
	final int maxsize=10;
	int [] date;
	int length;
	public sequenList () {
		length=0;
		date=new int[maxsize];
	}
	public sequenList (int n) {
		length = 0;
		date=new int[n];
	}
	public boolean add(int x,int pos) {
		if (isfull()) {
			System.out.println("full");
			return false;
		}
		if (pos<1||pos>length+1) {
			System.out.println("pos值不合法");
			return false;
		}if (length==date.length) {
			int [] p=new int[length*2];
			for (int i = 0; i < length; i++) {
				p[i]=date[i];
				date=p;
			}
			for (int i = length; i >=pos; i--) {
				date[i]=date[i-1];
			}
			}
			date[pos-1]=x;
			length++;
			return true;
		
		
	}
	public int del(int pos) {
		
		if (isEmpty()) {
			System.out.println("Empty");
			return -1;
		}else {
			if (pos<1||pos>length) {
				System.out.println("pos error");
				return -1;
			}
		for (int i = pos; i < length; i++) {
			date[i-1]=date[i];
			}
		}
		length--;
		return date[pos-1];
	}
	public int find(int x) {
		if (isEmpty()) {
			System.out.println("顺序表为空");
			return -1;
		}else {
			for (int i = 0; i < length; i++) {
				if (date[i]==x) {
					return i+1;
				}
			}
		}
		return -1;
	}
	public int value(int pos) {
		if (isEmpty()) {
			System.out.println("顺序表为空");
			return 0;
		}else {
			if (pos<1||pos>length) {
				throw new IndexOutOfBoundsException("pos"+pos+"size:"+length);
			}
			return date[pos-1];
		}
	}
	public boolean modify(int pos,int x) {
		if (isEmpty()) {
			System.out.println("顺序表为空");
			return false;
		}else {
			if (pos<1||pos>length) {
				System.out.println("error");
				return false;
			}
		}
		date[pos-1] = x;
		return true;
	}
	public boolean isEmpty() {
		return length ==0;
	}
	public boolean isfull() {
		return length==date.length;
	}
	public int size() {
		return length;
	}
	public void nextOrder() {
		for (int i = 0; i < length; i++) {
			System.out.print(date[i]+",");	
		}
		System.out.println();
	}
	public void clear() {
		length=0;
	}
	public static void main(String[] args) {
		sequenList s=new sequenList();
		int i;
		int[] a= {2,13,12,15,10,40};
		for (i = 0; i < a.length; i++) 
		s.add(a[i], i+1);
		System.out.println("顺序表元素为：");
		s.nextOrder();
		s.add(25,4);
		System.out.println("插入操作后的顺序表中的数据元素为：");
		s.nextOrder();
		s.del(5);
		System.out.println("删除后表中元素：");
		s.nextOrder();
		i=s.find(12);
		System.out.println("元素12在顺序表中的位序为："+i);
	}

}
