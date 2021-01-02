package seqlist;

import java.awt.Label;

public class text2 {
public static<T extends Comparable> void MergeList_sq(Squlist<T> LA,Squlist<T> LB,Squlist<T> LC) {
	

int i=1,j=1,k=1;
while(i<=LA.size()&&j<=LB.size()) {
	if (LA.get(i).compareTo(LB.get(j))<=0) {
		LC.add(LA.get(i),k);
		i++;
	}
	else {
		LC.add(LB.get(j), k);
		j++;		
	}
	k++;
}while (i<=LA.size()) {
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
public static void main (String[] args) {
	int i,j,k=0;
	int[]a= {12,23,35,49,56};
	int []b= {10,15,20};
	Squlist<Integer> La=new Squlist<Integer>();
	Squlist<Integer> Lb=new Squlist<Integer>();
	Squlist<Integer> Lc=new Squlist<Integer>();
	for (int o = 0; o < a.length; o++) {
		La.add(a[o],o+1);
	}
	System.out.println("顺序表a中的元素为：");
	La.nextOder();
	for (int p = 0; p < b.length; p++) 
		Lb.add(b[p], p+1);
	System.out.println("顺序表b中的数据元素为：");
		Lb.nextOder();
	MergeList_sq(La, Lb, Lc);
	System.out.println("顺序表c中的元素数据为：");
	Lc.nextOder();
}
}