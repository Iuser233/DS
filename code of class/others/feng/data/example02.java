package data;

public class example02 {
	public static<T extends Comparable<?>> void MergeList_sq(example03 LA,example03 LB,example03 LC) {
		

		int i=1,j=1,k=1;
		while(i<=LA.size() && j<=LB.size()) {  //错的原因是把&&改成了||
			if (LA.get(i)<LB.get(j)){
				LC.add(LA.get(i),k);
				i++;
			}
			else {
				LC.add(LB.get(j), k);
				j++;		
			}
			k++;
			}
		while (i<=LA.size()) {
			LC.add(LA.get(i), k);
			i++;
			k++;
			
		}
		while(j<=LB.size()) {
			LC.add(LB.get(j), k);
			j++;
			k++;
			
		}

		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=0;
		int[]a= {12,23,35,49,56};
		int []b= {10,15,20};
		example03 La = new example03();
		example03 Lb=new example03();
		example03 Lc=new example03();
		
		for (int o = 0; o < a.length; o++) 
			La.add(a[o],o+1);
		
		System.out.println("顺序表a中的元素为：");
		La.printAll();
		
		
		for (int p = 0; p < b.length; p++) 
			Lb.add(b[p], p+1);
		System.out.println("顺序表b中的数据元素为：");
			Lb.printAll();
		MergeList_sq(La, Lb, Lc);
		System.out.println("顺序表c中的元素数据为：");
		Lc.printAll();
           
	}

}
