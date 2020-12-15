package Graph;

import java.util.LinkedList;
import java.util.Scanner;


public class ADJGraph {
	/*
	 * 邻接表》链表数组
	 * 
	 */
private int vnums;
private LinkedList<Integer> []adj;	//邻接表
private boolean[] founded;//
public  ADJGraph(int v) {
	this.vnums=v;
	adj=new LinkedList[v];//adj这个数组的大小为v，数组的初始化
	founded=new boolean[v];
	for (int i = 0; i < v; i++) {
		adj[i]=new LinkedList<Integer>();
/*
 * 数组中元素的初始化
 * 都放的都是单链表的表头
 */
}	
}
public void insertEdge(int s,int t) {
	adj[s].add(t);
	adj[t].add(s);
	
}
public void DFS() {
	
}

public static void main(String[] args) {
	ADJGraph adjGraph=new ADJGraph(5);
	Scanner sc1=new Scanner(System.in);
	System.out.println("please input e");
	int e=sc1.nextInt();
	System.out.println("please input s and t");
	for (int i = 0; i < e; i++) {
		String str1=sc1.next();
		int s=str1.charAt(0)-48;
		int t=str1.charAt(1)-48;
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
}
