package biSearchTree;


public class text {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	biSearchTree tree=new biSearchTree();
	int a[]= new int []{5,16,54,78,14,1};
	for (int i = 0; i < a.length; i++) {
		tree.insert(a[i]);
	}
	System.out.print("ǰ������� ");tree.preorder();
	System.out.print("��������� ");tree.inorder();	
	System.out.print("��������� ");tree.postorder();
	System.out.print("��α����� ");tree.levelorder();
	System.out.print("���нڵ�");	
	tree.printleaves(tree.root);
	System.out.println();
	System.out.print("���ĸ߶ȣ�");	
	System.out.println(tree.gethight(tree.root));
	tree.del(14, tree.root);
	System.out.print("ɾ��14֮������������ ");tree.inorder();	

System.out.println("�ڵ�����"+tree.size());	
	
	
	
	
	
	
	
	
	
	
	}


}
