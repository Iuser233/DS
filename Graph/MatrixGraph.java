package Graph;

import java.util.LinkedList;
import java.util.Queue;


public class MatrixGraph {

	private  int vnums;//顶点个数
	private int[] value;//顶点信息
	private int edges[][];//邻接矩阵（存储矩阵）
	private int e;//边的个数
	private boolean []found;//if it is visited
	
	public MatrixGraph(int n) { //初始化邻接矩阵
//	found=false;//not visited
		found=new boolean[n];
		this.vnums=n;//顶点的个数为输入的n
	value=new int [n];//定点信息数组的大小为n
	edges=new int [n][n];//矩阵的大小为nxn
	for (int i = 0; i < n; i++) {
		value[i]=i;//将0，1，2，3作为输入放到矩阵顶点信息value数组中去
		}
	}

	public void insertEdges(int t,int x) {
		edges[t][x]=1;
		edges[x][t]=1;
		e++;
	}
	public void BFS( int s) {//从第i个节点出发递归优先遍历图
		int q,j;
		boolean [] visied=new boolean[vnums];
		visied[s]=true;
	Queue<Integer> queue=new LinkedList<Integer>();//循环队列
	System.out.print(value[s]+" ");//访问第s个节点

	queue.add(s);
	while (!queue.isEmpty()) {
		q=queue.poll();
		for (j = 0; j<vnums ; j++) {
			//访问第i个顶点未曾访问的顶点
			if (edges[q][j]==1&&visied[j]==false) {
				System.out.print(value[j]+" ");
				visied[j]=true;
				queue.add(j);//第j个顶点入队
			}
		}
	}
	}
	public void DFS(int i) {//从第i个顶点出发递归的深度优先遍历图
		int j;
		System.out.print(value[i]+" ");//访问第i个顶点
		found[i]=true;
		for (j = 0;  j< vnums; j++) {
			if (edges[i][j]==1&&found[j]==false) {
				DFS(j);
			}
		}
	}
	
	public static void main(String[] args) {
		MatrixGraph graph=new MatrixGraph(5);
		graph.insertEdges(0, 1);
		graph.insertEdges(0, 3);
		graph.insertEdges(0, 4);
		graph.insertEdges(1, 2);
		graph.insertEdges(1, 3);
		graph.insertEdges(2, 4);
		graph.insertEdges(3, 4);
for (int i = 0; i <graph.vnums; i++) {
	for (int j = 0; j < graph.vnums; j++) {
		System.out.print(graph.edges[i][j]);
	}
	System.out.println(" ");
}
		graph.DFS(1);
		System.err.println("");
		graph.BFS(1);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
