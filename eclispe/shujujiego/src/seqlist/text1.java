package seqlist;

public class text1 {
	public static void main(String[] args) {
		Squlist <Integer> L = new Squlist<Integer>();
		for (int i = 1; i < 5; i++) {
			L.add(i*3,i);
		}
		System.out.println("˳����е�Ԫ���У�");
		L.nextOder();
		L.add(6,5);
		System.out.println("���ӵ���λԪ�غ�����飺");//���ӵ���λԪ�أ�λ6
		L.nextOder();
		L.del(5);
		System.out.println("ɾ������λԪ�غ�����飺");//ɾ���ڶ�λԪ��
		L.nextOder();
		System.out.println("�޸ĵ���λԪ�غ�����飺");//������λԪ�ظ�Ϊ9
		L.modify(3, 5);
		L.nextOder();
		int m=6;

		System.out.println("Ԫ��"+m+"�����Ա��е�λ���ǣ�"+L.find(m));
		int a=0;
		a=L.get(4);
		System.out.println("��ȡ���ĸ�λ�õ�Ԫ�أ�"+a);
		System.out.println("���Ա�ĳ����ǣ�"+L.size());
		System.out.println("ͷ�巨");
		L.addtohead(2);
		L.nextOder();
		System.out.println("β�巨");
		L.addtotial(5);
		L.nextOder();
//	list1.isEmpty();
	}

}
