package biSearchTree;
import java.util.Scanner;


public class text {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	biSearchTree tree=new biSearchTree();
	int a[]= new int []{5,16,54,78,14,1};
	for (int i = 0; i < a.length; i++) {
		tree.insert(a[i]);
	}
	System.out.println("��ѯ: "+tree.search(tree.root, 14));
	System.out.print("ǰ������� ");tree.preorder();
	System.out.print("��������� ");tree.inorder();	
	System.out.print("��������� ");tree.postorder();
	System.out.print("��α����� ");tree.levelorder();
	System.out.print("����Ҷ�ӽڵ�: ");	
	tree.printleaves(tree.root);
	System.out.println();
	System.out.print("���ĸ߶ȣ�");	
	System.out.println(tree.gethight(tree.root));
	tree.del(14, tree.root);
	System.out.print("ɾ��14֮������������ ");tree.inorder();	
	System.out.println("�ڵ������� "+tree.size());	
	
System.out.print("��ת����������α������� ");	
tree.exchange();
tree.levelorder();
tree.inorder();
	 System.out.println("������һ�����֣����ö��Ÿ�����");
	 Scanner sc=new Scanner(System.in);
	    String imput = sc.next();
	    String arr[] = imput.split(",");
	    int num[] = new int[arr.length];
	    for(int i = 0; i<num.length; i++){
	        num[i] = Integer.parseInt(arr[i]);
	    }
	    biSearchTree tree2=new biSearchTree(); 
	for (int i = 0; i < num.length; i++) {
		tree2.insert(num[i]);
	}
	tree2.inorder();
	
	
	
	
	

	
	
	
	
	
	}


}
