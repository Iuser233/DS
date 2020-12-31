package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class MatrixGraph {

	private  int vnums;//�������
	private int[] value;//������Ϣ
	private int edges[][];//�ڽӾ��󣨴洢����
	private int e;//�ߵĸ���
	private boolean []found;//if it is visited
	
	public MatrixGraph(int n) { //��ʼ���ڽӾ���
//	found=false;//not visited
		found=new boolean[n];
		this.vnums=n;//����ĸ���Ϊ�����n
	value=new int [n];//������Ϣ����Ĵ�СΪn
	edges=new int [n][n];//����Ĵ�СΪnxn
	for (int i = 0; i < n; i++) {
		value[i]=i;//��0��1��2��3��Ϊ����ŵ����󶥵���Ϣvalue������ȥ
		}
	}

	public void insertEdges(int t,int x) {//��������Ȩ��
		edges[t][x]=1;
		edges[x][t]=1;
		e++;
	}
	public void BFS( int s) {//�ӵ�i���ڵ�����ݹ����ȱ���ͼ
		int q,j;
		boolean [] visied=new boolean[vnums];
		visied[s]=true;
	Queue<Integer> queue=new LinkedList<Integer>();//ѭ������
	System.out.print(value[s]+" ");//���ʵ�s���ڵ�

	queue.add(s);
	while (!queue.isEmpty()) {
		q=queue.poll();
		for (j = 0; j<vnums ; j++) {
			//���ʵ�i������δ�����ʵĶ���
			if (edges[q][j]==1&&visied[j]==false) {//û�з��ʲ��Ҷ���֮������ϵ
				System.out.print(value[j]+" ");
				visied[j]=true;
				queue.add(j);//��j���������
			}
		}
	}
	}
	public void DFS(int i) {//�ӵ�i����������ݹ��������ȱ���ͼ
		int j;
		System.out.print(value[i]+" ");//���ʵ�i������
		found[i]=true;
		for (j = 0;  j< vnums; j++) {
			if (edges[i][j]==1&&found[j]==false) {
				DFS(j);
			}
		}
	}
	public class closeedge{
		int adjvax;//����
		int lowcost;//?���ϵ�Ȩֵ��
		public closeedge(int v,int i) {//��ʼ��
		adjvax=v;
		lowcost=i;
			// TODO Auto-generated constructor stub
		}
		public  closeedge() {//��װ
			adjvax=0;
			lowcost=0;
			// TODO Auto-generated constructor stub
		}
		}
	int maxsize=100;
	public void MinSpanTree_Prim(int v) {
		int i,k,j;
		closeedge edge;
		ArrayList<closeedge> edges=new  ArrayList<closeedge>(maxsize);
		for (int l = 0; l < maxsize; l++) {
			edge=new closeedge();
			edges.add(l,edge);
		}//��ʼ����������
		
		
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
		System.out.println(" ");
		graph.BFS(1);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
