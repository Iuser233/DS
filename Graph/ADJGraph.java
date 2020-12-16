package Graph;

import java.util.LinkedList;
import java.util.Queue;
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
public void DFS( int s) {
	founded[s]=true;//visited用来记录一个顶点是否被访问
	System.out.println(s+" ");//打印输出
	for (int i = 0; i < adj[s].size(); i++) {
		int w=adj[s].get(i);
		if (!founded[w]) {
			DFS(w);
		}
	}
	
}


public void bfs(int s) {
	// TODO Auto-generated method stub
boolean [] visited=new boolean[vnums];
visited[s]=true;//visited用来记录一个顶点是否被访问过
System.out.println(s+"");
Queue<Integer> queue=new LinkedList<Integer>();//建立一个队列
queue.add(s);
while (queue.size()!=0) {
	int q=queue.poll();//队头元素出队
	for (int i = 0; i < adj[q].size(); i++) {
		int w=adj[q].get(i);
		if (!visited[w]) {
			visited[w]=true;
			System.out.print(w+" ");
			queue.add(w);
		}
	}
}
}

public static void main(String[] args) {
	ADJGraph graph=new ADJGraph(5);
	Scanner sc1=new Scanner(System.in);
	System.out.println("please input e");
	int e=sc1.nextInt();//多少条边
	System.out.println("please input s and t");
	for (int i = 0; i < e; i++) {
		String str1=sc1.next();
		int s=str1.charAt(0)-48;
		int t=str1.charAt(1)-48;
			 graph.insertEdge(s, t);	
		}
	for (int i = 0; i < graph.vnums; i++) {
		System.out.print(graph.adj[i]);
	}
	graph.bfs(0);
	graph.DFS(1);
}
}
