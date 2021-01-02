package linklist;



public class text1 {
public static<T extends Comparable> void MergeList_sq(singlelinklist   LA,singlelinklist LB,singlelinklist LC)
{
	//comparable是一个接口

int i=1,j=1,k=1;
while(i<=LA.size()&&j<=LB.size()) {
	if (LA.getvalue(i)<=(LB.getvalue(j))) {
		LC.add(LA.getvalue(i),k);
		i++;
	}
	else {
		LC.add(LB.getvalue(j), k);
		j++;		
	}
	k++;
}while (i<=LA.size()) {
	LC.add(LA.getvalue(i), k);
	i++;
	k++;
	
}
while(j<=LB.size()) {
	LC.add(LB.getvalue(j), k);
	j++;
	k++;
	
}

}
public static void main (String[] args) {
	int i,j,k=0;
	int[]a= {12,23,35,49,56};
	int []b= {10,15,20};
	singlelinklist La=new singlelinklist();
	singlelinklist Lb=new singlelinklist();
	singlelinklist Lc=new singlelinklist();
	for (int o = 0; o < a.length; o++) {
		La.add(a[o],o+1);
	}
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
