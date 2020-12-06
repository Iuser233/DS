package biSearchTree;


public class text {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	biSearchTree tree=new biSearchTree();
	int a[]= new int []{5,16,54,78,14,1};
	for (int i = 0; i < a.length; i++) {
		tree.insert(a[i]);
	}
	System.out.print("前序遍历： ");tree.preorder();
	System.out.print("中序遍历： ");tree.inorder();	
	System.out.print("后序遍历： ");tree.postorder();
	System.out.print("层次遍历： ");tree.levelorder();
	System.out.print("所有节点");	
	tree.printleaves(tree.root);
	System.out.println();
	System.out.print("树的高度：");	
	System.out.println(tree.gethight(tree.root));
	tree.del(14, tree.root);
	System.out.print("删除14之后的中序遍历： ");tree.inorder();	

System.out.println("节点总数"+tree.size());	
	
	
	
	
	
	
	
	
	
	
	}


}
