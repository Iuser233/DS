package ����˳����;

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
	//�ݹ�
	public BinaryTreeNode getTreeMin(BinaryTreeNode p) {
		if (p.lchild== null) {
			return p;
		}else {
			return getTreeMin(p.lchild);
		}
	}

	public BinaryTreeNode getTreeMax(BinaryTreeNode p) {//�ǵݹ�
		if (p==null) {
			return null;
		}
		while (p.rchild != null) {
			p = p.rchild;
		}
		return p;
	}

	public BinaryTreeNode search(BinaryTreeNode p, int x) {// �ݹ����
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

	public BinaryTreeNode insert(int x, BinaryTreeNode p) {// �ݹ����
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
	//�ݹ�ɾ��
	public BinaryTreeNode del(int x,BinaryTreeNode p) {
		BinaryTreeNode temp;
		if (p==null) {
			System.out.println("����û�д���");
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
	//�ǵݹ鷽��ɾ��
	public void del(int x) {//��Ҫɾ����x
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
		//�ж�x�����͡��ȴ������������ӵ�
		//p��parent��¼
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
	// ǰ�����
	public void preorder(BinaryTreeNode p) {
		if (p == null) {
			return;
		} else {
			System.out.print(p.data + " ");
			preorder(p.lchild);
			preorder(p.rchild);
		}
	}

	// �������
	public void inorder(BinaryTreeNode p) {
		if (p == null) {
			return;
		} else {
			inorder(p.lchild);
			System.out.print(p.data + " ");
			inorder(p.rchild);
		}
	}

	// �������
	public void postorder(BinaryTreeNode p) {
		if (p == null) {
			return;
		} else {
			postorder(p.lchild);
			postorder(p.rchild);
			System.out.print(p.data + " ");
		}
	}

	// ��α���
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
	//���߶�
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
	//��ӡҶ�ӽڵ�
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
	//ͳ�����нڵ�����
	public int size(BinaryTreeNode p) {
		if (p==null) {
			return 0;
		}else {
			return size(p.lchild)+size(p.rchild)+1;
		}
	}
	//��ת������
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
		System.out.println("����Ԫ�أ�");
		tree.traversal(1);
		System.out.println("�ڵ������");
		System.out.println(tree.size(tree.root));
		System.out.println("Ҷ�ӽڵ㣺");
		tree.printleaves(tree.root);
		System.out.println();
		System.out.println("��С��"+tree.getTreeMin(tree.root));
		System.out.println("���"+tree.getTreeMax(tree.root));
		System.out.println("ɾ���ڵ㣺45");
		tree.del(45, tree.root);
		tree.traversal(1);
		System.out.println("���߶ȣ�"+tree.getHeight(tree.root));
		System.out.println("��ת����");
		tree.invertTree(tree.root);
		tree.traversal(9);
	}
}
