package Graph;

import java.util.LinkedList;
import java.util.Scanner;


public class ADJGraph {
	/*
	 * �ڽӱ���������
	 * 
	 */
private int vnums;
private LinkedList<Integer> []adj;	//�ڽӱ�
private boolean[] founded;//
public  ADJGraph(int v) {
	this.vnums=v;
	adj=new LinkedList[v];//adj�������Ĵ�СΪv������ĳ�ʼ��
	founded=new boolean[v];
	for (int i = 0; i < v; i++) {
		adj[i]=new LinkedList<Integer>();
/*
 * ������Ԫ�صĳ�ʼ��
 * ���ŵĶ��ǵ�����ı�ͷ
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
