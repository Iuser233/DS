package seqlist;



public class Squlist<T> {
	private T[] data;
	private int count;
	private static final int maxSize = 10;

	public Squlist() {			//�޲γ�ʼ��
		
		this(maxSize);	
	}

	public Squlist(int x) {		//�вγ�ʼ��
		if (x<1) {
			System.out.println("�������");
			System.exit(1);
		}
		count = 0;
		data = (T[])new Object [x];
	}

	public boolean add(T x, int pos) {			//���뷽��
		if (pos < 1 || pos > count + 1) {			//1.�ж�pos�����Ƿ�Ϸ�
			System.out.println("pos error");		//���Ϸ��������
			return false;							//��󷵻�false	!!	
		}
		if (isFull()) {								//2.���ж�data�������ǲ�������
			T[] p=(T[])new Object [count*2];									
			for (int i = 0; i < count; i++) {
				p[i]=data[i];
			}
			data=p;
		}
		
		for (int i = count; i >=pos; i--) {			//3.insert������������
			data[i]=data[i-1];
		}
		data[pos-1]=x;								//��x��������λ�õ�ֵ
		count++;									//����+1
		return true;								//����Boolean����	����				
	}

	// ͷ��
		public boolean addtohead(T x) {
			if (isFull()) {								//2.���ж�data�������ǲ�������
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
		// β��
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
				System.out.println("posֵ���Ϸ�");
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
	System.out.println("posֵ����");
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
			System.out.println("posֵ����");
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