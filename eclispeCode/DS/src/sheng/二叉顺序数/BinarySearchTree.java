package 二叉顺序数;

import java.util.LinkedList;

public class BinarySearchTree {
	BinaryTreeNode root;

	public BinarySearchTree(BinaryTreeNode root) {
		super();
		this.root = root;
	}

	public BinarySearchTree() {
		this.root = null;
	}

	public BinaryTreeNode find(int x) {
		BinaryTreeNode p = root;
		while (p != null) {
			if (x > p.data) {
				p = p.rchild;
			} else if (x < p.data) {
				p = p.lchild;
			} else {
				return p;
			}
		}
		return null;
	}
	//递归
	public BinaryTreeNode getTreeMin(BinaryTreeNode p) {
		if (p.lchild== null) {
			return p;
		}else {
			return getTreeMin(p.lchild);
		}
	}

	public BinaryTreeNode getTreeMax(BinaryTreeNode p) {//非递归
		if (p==null) {
			return null;
		}
		while (p.rchild != null) {
			p = p.rchild;
		}
		return p;
	}

	public BinaryTreeNode search(BinaryTreeNode p, int x) {// 递归查找
		BinaryTreeNode p1 = p;
		if (p1 == null || p1.data == x) {
			return p1;
		} else if (x > p1.data) {
			return search(p1.rchild, x);
		} else {
			return search(p1.lchild, x);
		}
	}

	public void insert(int x) {
		if (root == null) {
			root = new BinaryTreeNode(x);
			return;
		}
		BinaryTreeNode p = root;
		while (p != null) {
			if (x > p.data) {
				if (p.rchild == null) {
					p.rchild = new BinaryTreeNode(x);
					return;
				}
				p = p.rchild;
			} else {
				if (p.lchild == null) {
					p.lchild = new BinaryTreeNode(x);
					return;
				}
				p = p.lchild;
			}
		}
	}

	public BinaryTreeNode insert(int x, BinaryTreeNode p) {// 递归插入
		if (p == null) {
			p = new BinaryTreeNode(x);
			return p;
		} else {
			if (x > p.data) {
				p.rchild = insert(x, p.rchild);
			} else if (x < p.data) {
				p.lchild = insert(x, p.lchild);
			}
			return p;
		}
	}
	//递归删除
	public BinaryTreeNode del(int x,BinaryTreeNode p) {
		BinaryTreeNode temp;
		if (p==null) {
			System.out.println("树中没有此数");
			return null;
		}
		else if (x<p.data) {
			p.lchild=del(x, p.lchild);
			
		}else if (x>p.data) {
			p.rchild=del(x, p.rchild);
		}else {
			if (p.lchild!=null&&p.rchild!=null) {
				temp=getTreeMin(p.rchild);
				p.data=temp.data;
				p.rchild=del(temp.data, p.rchild);
//				temp=getTreeMax(p.lchild);
//				p.data=temp.data;
//				p.rchild=del(temp.data, p.rchild);
			}else {
				temp=p;
				if (p.lchild==null) {
					p=p.rchild;
				}else if (p.rchild==null) {
					p=p.lchild;
				}
			}
		}
		return p;
	}
	//非递归方法删除
	public void del(int x) {//找要删除的x
		BinaryTreeNode p=root;
		BinaryTreeNode parent=null;
		while (p!=null&&p.data!=x) {
			parent=p;
			if (x>p.data) {
				p=p.rchild;
			}else {
				p=p.lchild;
			}
		}
		if (p==null) {
			return;
		}
		//判断x的类型。先处理有两个孩子的
		//p，parent记录
		if (p.lchild!=null&&p.rchild!=null) {
			BinaryTreeNode minp=p.rchild;
			BinaryTreeNode minpparent=p;
			while (minp.lchild!=null) {
				minpparent=minp;
				minp=minp.lchild;
			}
			p.data=minp.data;
			p=minp;
			parent=minpparent;
		}
		BinaryTreeNode child;
		if (p.lchild!=null) {
			child=p.lchild;
		}else if (p.rchild!=null) {
			child=p.rchild;
		}else {
			child=null;
		}
		if (parent==null) {
			root=child;
		}else if (parent.lchild==p) {
			parent.lchild=child;
		}else {
			parent.rchild=child;
		}
	}
	// 前序遍历
	public void preorder(BinaryTreeNode p) {
		if (p == null) {
			return;
		} else {
			System.out.print(p.data + " ");
			preorder(p.lchild);
			preorder(p.rchild);
		}
	}

	// 中序遍历
	public void inorder(BinaryTreeNode p) {
		if (p == null) {
			return;
		} else {
			inorder(p.lchild);
			System.out.print(p.data + " ");
			inorder(p.rchild);
		}
	}

	// 后序遍历
	public void postorder(BinaryTreeNode p) {
		if (p == null) {
			return;
		} else {
			postorder(p.lchild);
			postorder(p.rchild);
			System.out.print(p.data + " ");
		}
	}

	// 层次遍历
	public void lovelorder() {
		LinkedList<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		BinaryTreeNode p = root;
		while (p != null) {
			System.out.print(p.data + " ");
			if (p.lchild != null) {
				queue.add(p.lchild);
			}
			if (p.rchild != null) {
				queue.add(p.rchild);
			}
			p = queue.poll();
		}
		System.out.println();
	}

	public void traversal(int i) {
		switch (i) {
		case 0:
			preorder(root);
			System.out.println();
			break;
		case 1:
			inorder(root);
			System.out.println();
			break;
		case 2:
			postorder(root);
			System.out.println();
			break;
		default:
			lovelorder();
			System.out.println();
			break;
		}
	}
	//树高度
	public int getHeight(BinaryTreeNode parent) {
		//int lh,rh,max;
		if (parent!=null) {
//			lh=getHeight(parent.lChild);
//			rh=getHeight(parent.rChild);
//			max=lh>rh? lh : rh;
//			return max+1;
			return (getHeight(parent.lchild)>getHeight(parent.rchild)?getHeight(parent.lchild):getHeight(parent.rchild))+1;
		}else {
			return 0;
		}
	}
	//打印叶子节点
	public void printleaves(BinaryTreeNode p) {
		if (p==null) {
			return;
		}else {
			if (p.lchild==null&&p.rchild==null) {
				System.out.print(p.data+" ");
			}
			printleaves(p.lchild);
			printleaves(p.rchild);
		}
	}
	//统计所有节点总数
	public int size(BinaryTreeNode p) {
		if (p==null) {
			return 0;
		}else {
			return size(p.lchild)+size(p.rchild)+1;
		}
	}
	//翻转二叉树
	public BinaryTreeNode invertTree(BinaryTreeNode root) {
		 if (root == null) {
	            return null;
	        }
	        BinaryTreeNode left = invertTree(root.lchild);
	        BinaryTreeNode right = invertTree(root.rchild);
	        root.lchild = right;
	        root.rchild = left;
	        return root;
	}
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		int a[] = { 45, 24, 27, 53, 12, 82 };
		for (int i = 0; i < a.length; i++) {
			tree.insert(a[i]);
		}
		System.out.println("树中元素：");
		tree.traversal(1);
		System.out.println("节点个数：");
		System.out.println(tree.size(tree.root));
		System.out.println("叶子节点：");
		tree.printleaves(tree.root);
		System.out.println();
		System.out.println("最小："+tree.getTreeMin(tree.root));
		System.out.println("最大："+tree.getTreeMax(tree.root));
		System.out.println("删除节点：45");
		tree.del(45, tree.root);
		tree.traversal(1);
		System.out.println("树高度："+tree.getHeight(tree.root));
		System.out.println("翻转树：");
		tree.invertTree(tree.root);
		tree.traversal(9);
	}
}
