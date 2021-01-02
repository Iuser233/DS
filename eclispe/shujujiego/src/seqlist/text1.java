package seqlist;

public class text1 {
	public static void main(String[] args) {
		Squlist <Integer> L = new Squlist<Integer>();
		for (int i = 1; i < 5; i++) {
			L.add(i*3,i);
		}
		System.out.println("顺序表中的元素有：");
		L.nextOder();
		L.add(6,5);
		System.out.println("增加第五位元素后的数组：");//增加第五位元素，位6
		L.nextOder();
		L.del(5);
		System.out.println("删除第五位元素后的数组：");//删除第二位元素
		L.nextOder();
		System.out.println("修改第三位元素后的数组：");//将第三位元素改为9
		L.modify(3, 5);
		L.nextOder();
		int m=6;

		System.out.println("元素"+m+"在线性表中的位置是："+L.find(m));
		int a=0;
		a=L.get(4);
		System.out.println("获取第四个位置的元素："+a);
		System.out.println("线性表的长度是："+L.size());
		System.out.println("头插法");
		L.addtohead(2);
		L.nextOder();
		System.out.println("尾插法");
		L.addtotial(5);
		L.nextOder();
//	list1.isEmpty();
	}

}
