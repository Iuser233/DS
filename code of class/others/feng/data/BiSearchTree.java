package data;



/*
 * 二叉查找树
 */

public class BiSearchTree {
 public BiTreeNode root;
 
	public BiSearchTree(BiTreeNode root) {
	super();
	this.root = root;
}
	public BiSearchTree() {
		root=null;
	}

public BiTreeNode  find(int x) {
	BiTreeNode p = root; //创建一个指针
	while(p!=null) {
		if(x>p.data) {
			p=p.rchild;  //大于p的插入右孩子
		}
		else if(x<p.data) {
			p=p.lchild;  //小于p的插入左孩子
			
		}
		else {
			return p;
		}
				
	}
	return null; //如果没找到返回空
}

//递归方法插入（自己调用自己）
public BiTreeNode search(BiTreeNode p, int x) {
	BiTreeNode p1=p;
	if(p1==null || p1.data==x) {
		return p1;
		
	}
	else if(x>p1.data) {
		return search(p1.rchild,x);  //x是要插入的
	}else {
		return search(p1.lchild, x);
	}
}

//插入
public void insert(int x) {
	if(root == null) {
		root = new BiTreeNode(x); //第一个没有时，插入的就为“root:根”
		return;
	}
	BiTreeNode p = root;  //p为指针
	while(p!=null) {
		if(x>p.data) {//x是要插入的数，大的插右边，小的插左边
			if(p.rchild==null) {
				p.rchild =new BiTreeNode(x); //右孩子为空时
				return;
			}
			p=p.rchild; //右孩子不为空时
		}
		else {
			if(p.lchild==null) {
				p.lchild=new BiTreeNode(x);
				return;
			}
			p = p.lchild;
		}
	}
}
//删除
//左边找最大
public BiTreeNode findmax(BiTreeNode p) { //
	if(p==null) {
	  return null;
	}
	while(p.lchild != null) {
		p=p.lchild; //一直找到最大
	}
	return p;  //返回最大值
}
//右边找最小
public BiTreeNode findmin(BiTreeNode p) {
	if(p.rchild == null) {
		return p;
	}else {
		return findmin(p.rchild); //右边的第一个就是最小
	}
	
}

public BiTreeNode del(int x , BiTreeNode p) {
	BiTreeNode temp; //保存数
	if(p==null) {
		throw new IndexOutOfBoundsException("error");
	}else if(x<p.data) {
		p.lchild = del(x, p.lchild);//找到要删的数p
		
	}else if(x>p.data) {
		p.rchild = del(x, p.rchild);
	}else {
		if(p.lchild != null && p.rchild != null) {
			temp =findmin(p.rchild);
			p.data = temp.data;
			p.rchild = del(temp.data, p.rchild);
		}else {
			temp = p;
			if(p.lchild ==null) {
				p=p.rchild;
			}else if(p.rchild==null) {
				p=p.lchild;
			}
		}
	}
	return p;
}
//先序遍历 
		public void preorder(BiTreeNode p) {
			if(p==null) {
				return;
			}
			else {
				System.out.print(p.getData() +" "); //访问根节点
				preorder(p.lchild);
				preorder(p.rchild);
				
			}
			
		}
		//中序遍历
				public void inorder(BiTreeNode p) {
					if(p==null) {
						return;
					}
					else {
						inorder(p.lchild);
						System.out.print(p.getData()+" ");
						inorder(p.rchild);							
						}
					
					}
				
public BiTreeNode change(BiTreeNode t) {
	if(t==null) {
		return null;
	}else {
		BiTreeNode lchild = change(t.lchild);
		BiTreeNode rchild = change(t.rchild);
		t.lchild = rchild;
		t.rchild = lchild;
	}
	return t;
	
}
			
				
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 BiSearchTree tree = new BiSearchTree();
 int a[] = {33,44,23,46,12,37};//以二叉树的形式把这些数插好了
 for (int i = 0; i < a.length; i++) {
	 tree.insert(a[i]);
	
}

 
 tree.inorder(tree.root);

 tree.change(tree.root);
 System.out.println();
 
 System.out.println(tree.find(33));
 
 
 
 tree.del(33, tree.root);
 tree.inorder(tree.root);
 System.out.println();
 
 tree.insert(666);
 tree.inorder(tree.root);
 System.out.println();

 tree.search(tree.root, 1);
tree.inorder(tree.root);

	}

}
