package biSearchTree;




public class biSearchTree {
biSearchNode root=null;
//�����޲ι��췽��
public biSearchTree() {
	root =null;
	// TODO Auto-generated constructor stub
}
//�����вι��췽��
public  biSearchTree(int x) {
	root=new biSearchNode(x);
}
//���뷽��
/*
 * 1.�ݹ�
 */

public biSearchNode insert(biSearchNode p,int x) {
	if (p==null) {
		p=new biSearchNode(x);
		return p;			
	}else {
		if (x>p.data) {
			p.rchild=insert(p.rchild, x);
		}else if (x<p.data){
			p.lchild=insert(p.lchild, x);
		
		}
	return p;
	
	}
}
/*
 * 2.�ǵݹ�
 */
public void insert(int x) {
	if (root==null) {
		root=new biSearchNode(x);
		return;
	}
	biSearchNode p=root;
	while (p!=null) {
		if (x>p.data) {
			if (p.rchild==null) {
				p.rchild=new biSearchNode(x);
				return ;
			}
				p=p.rchild;	
			
				
			}
			else {
			if (p.lchild==null) {
				p.lchild=new biSearchNode(x);
				return ;
			}
			
				p=p.lchild;
			
		}	
		}
	}
	

//����
public biSearchNode search(biSearchNode p,int x) {
	biSearchNode p1=p;
	if (p1==null||p1.data==x) {
	return p1;	
	}
	else if (x>p1.data) {
	return search(p1.rchild, x);
	}else {
		return search(p1.lchild, x);
	}
}
//�������
public void preorder(biSearchNode p) {
	// TODO Auto-generated method stub
if (p==null) {

	return ;
}
System.out.print(p.data+" ");
preorder(p.lchild);
preorder(p.rchild);
}
//�������
public void inorder(biSearchNode p) {
	// TODO Auto-generated method stub
if (p==null) {

	return ;
}
inorder(p.lchild);
System.out.print(p.data+" ");
inorder(p.rchild);
}
//�������
public void postorder(biSearchNode p) {
	if (p==null) {
	return ; 
	}
	postorder(p.lchild);
postorder(p.rchild);

System.out.print(p.data+" ");
}
int maxNode=110;

//��α���
public void levelorder() {
	biSearchNode [] queue=new biSearchNode[this.maxNode];
	int front,rear;
	if (this.root==null) {
		return ;
		
	}
	front=-1;
	rear=0;
	queue[rear]=this.root;
	while (front!=rear) {
		front++;
		System.out.print(queue[front].data+" ");
		if (queue[front].lchild!=null) {
			rear++;
			queue[rear]=queue[front].lchild;
		}
		if (queue[front].rchild!=null) {
			rear++;
			queue[rear]=queue[front].rchild;
		}
	}
System.out.println();
}
//��װ
public void inorder() {
	
	inorder(root);
	System.out.println();
}
public void preorder() {
//	
preorder(root);
System.out.println();
}
public void postorder() {
	
	postorder(root);
	System.out.println();
}

//�������Ԫ�غ���СԪ��
//�ǵݹ�
public biSearchNode findMax(biSearchNode p) {
	// TODO Auto-generated method stub
if (p==null) {
	return null;
}
//ѭ��
while (p.rchild!=null) {
	p=p.rchild;
}
return p;
}

//�ݹ�
public biSearchNode findMin(biSearchNode p) {
	// TODO Auto-generated method stub
if (p.lchild==null) {
	return p;
	
}else {
	 return findMin(p.lchild);
}
}

//del
//1.�ݹ�
public biSearchNode del(int x,biSearchNode p) {
	biSearchNode temp;
	if (p==null) {
		System.out.println("empty,fail");
		
	}
	else if (x>p.data) {
		p.rchild=del(x, p.rchild);
		
	}else if (x<p.data) {
		p.lchild=del(x, p.lchild);
	}else {
		if (p.lchild!=null&&p.rchild!=null) {
			temp=findMin(p.rchild);
			p.data=temp.data;
			p.rchild=del(temp.data, p.rchild);
		}
		else {
			temp=p;
			if (p.lchild==null) {
				p=p.rchild;
			}
			else if(p.rchild==null) {
			p=p.lchild;	
			}
		}
	}
return p;	
}
//��߶�
public int gethight(biSearchNode p) {
	int lh,rh,max;
	if (p!=null) {
		lh=gethight(p.lchild);
		rh=gethight(p.rchild);
		max=lh>rh?lh:rh;
		return max+1;
	}else {
		return 0;
	}
}
//����ڵ����
		public int size(biSearchNode p) {
			if(p==null) {
				return 0;
			}
			else {
				return size(p.lchild)+size(p.rchild)+1;
			}
		}
		public int size() {
			return size(root);
		}
		//������������е�Ҷ�ӽڵ�
	
public void printleaves(biSearchNode p) {
	if (p==null) {
		return ;
		
	}
	else  {
		if (p.lchild==null&&p.rchild==null) {
			System.out.print(p.data+" ");
		}
		printleaves(p.lchild);
		printleaves(p.rchild);	
	}	
}
public biSearchNode exchange(biSearchNode root  ) {
	if (root==null) {
		return null;			
	}
	//��Ҷ�ӽڵ㿪ʼ��ת������ת��֮����������������������
	biSearchNode left=exchange(root.lchild);
	biSearchNode right=exchange(root.rchild);	 
	root.lchild=right;
	root.rchild=left;
	return root;
}

public void exchange() {
	exchange(root);
}
}
