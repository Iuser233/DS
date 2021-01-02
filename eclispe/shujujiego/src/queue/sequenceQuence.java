package queue;

public class sequenceQuence {
	final int  MaxSize=10;
	private int[] data;
	private int front,rear;
	/*
	 * front���ǳ���Ԫ�ص�ǰһ��
	 */
	/*
	 * initialize
	 * 
	 */
	public sequenceQuence() {
	front=rear=0;
	data=new int [MaxSize];
		
	}
	/*
	 * ���
	 */
	public void EnQuence(int x){
		if (isFull()) {
			/*
			 * �ж϶����ǲ�������
			 * �ǵĻ�����
			 * ����rearλ�õ����
			 * 1.һ��ʼfront=0
			 * 2.front��=0
			 */
			int[] p=new int[2*MaxSize+2];
			
			if (rear==data.length-1) {
				/*
				 * data[0]����Ԫ��
				 * ��1��ʼ��
				 */
				for (int i = 1; i <=rear; i++) {
					p[i]=data[i];
					
				}
			}else {
				/*
				 * ���в���һ��ʼ�����
				 * �б仯
				 * �Ƚ��ȳ�
				 */
				int i,j=1;
				/*
				 * ��front-max�ŵ��¶�����
				 * 
				 */
				for (i=front+1; i < data.length; i++,j++) {
					p[j]=data[i];
					
				}
				/*
				 * 0-rear����>p
				 */
				for (i = 0; i < rear; i++,j++) {
					p[j]=data[i];
				}
				
				front=0;
				rear=data.length-1;//?????????????????????????????????
			}
			data=p;
		}
		rear=(rear+1)%MaxSize;
		data[rear]=x;
		
	}
	/*
	 * ����
	 */
	public int DeQuence() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("error");
			
		}
		/*
		 * ����ʱ�ƶ�fָ�룬rָ�벻��
		 * ��Ϊ��ѭ�����У����һ��λ�ò���Ԫ��
		 * ����0-5��f=4���ٳ���f=��4+1��%6
		 */
		front=(front+1)%MaxSize;
		return data[front];
		
	}
	public boolean isFull() {
		/*
		 * �ж϶����ǲ�������
		 * �ȿճ������е�һ��λ�ã������СΪlength-1��
		 * @--@
		 * ����
		 */
		return (rear+1)%MaxSize==front;
		
	}
	public boolean isEmpty() {
	/*	�Ƚ�����Ӳ����ٳ���
	 * 	��frontָ��ָ��rearָ��ʱ˵������������Ԫ���Ѿ��������
	 * 	���Զ���Ϊ��
	 */
		return front==rear;
	}
	public int size() {
		return(rear-front+MaxSize)%MaxSize;
	}
	public void printquence() {
		int i,j=front;
		for (i = 1;  i<=size(); i++) {
			j=(j+1)%MaxSize;
			System.out.print(data[j]+" ");
		}
		System.out.println(" ");
	}
	public int getHead() {
		if (isEmpty()) {
			System.out.println("kong");
		}
		return data[(front+1)%MaxSize];
	}
	public void clear() {
		front=rear=0;
	}
	
}
