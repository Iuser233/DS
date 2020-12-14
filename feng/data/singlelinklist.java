package data;
//单链表



public class singlelinklist {

		private int size;				//表的大小，这里size为局部变量
		private Node  head ;			//定义一个表头 (Node称为表头 应该也是一种类型)
		//初始化
		public singlelinklist(int size, Node head) {
			super();
			this.size = size; //访问成员变量
			this.head = head;
		}
		
		private static class Node{					//内部类  节点  node是引用类型 
			int data;								//data》学生，姓名，成绩。。。。
			Node next;								//指向下一个node节点，所以用node型
			public Node(int data, Node next) {			
				super();					
				this.data = data;				
				this.next = next;				
				
			}
			public Node (Node x)//初始化
			{
				this.next=x;				//next为x下一个节点
			}
			}
		
		public singlelinklist() {		//构造方法  表的初始化 带头结节点方法
			size=0;						//无参数
			head = new Node(null);		
		}
		
									
		public void addtotial( int x) {		//1.尾插法	
			Node xnode=new Node(x,null);  //创造一个要插入的节点xNode
			Node p=head;					//指针/辅助遍历
			while(p.next!=null)				//下一个不为空
			{
				p=p.next;					//往后挪
				
			}	
			xnode.next = p.next;//这一行的p.next与下一行的不相等
			p.next = xnode;//(xnode.next是xnode的下一位地址)
			size++;
		}
		
		
		public void addtohead( int x) {		//头插法
			Node xnode =new Node(x,null);	//建立一个一个新的节点，data=x，next=null。
		    xnode.next=head.next;
			head.next=xnode;
			
			size++;
		}
	
		
//1.插入法	，添加	
		public boolean add (int x, int pos) {		//插入法 这里的x和上面的x不同，上面Node里的x表data,pos:position位置

			if (pos<1||pos>size+1) {   //判断位置是否合理
				throw new IndexOutOfBoundsException("pos err");	//`!`																														````````````````	
			}
			int num=1; //num是找位置的
			Node p=head;  
			while(num<pos)  
			{
				
				p=p.next;//往后移
				num++;
			}
			Node xNode=new Node(x,null);
			xNode.next = p.next;
			p.next=xNode;
			size++;
			return true;
			
		}
		
		public  boolean  isEmpty() {
			return size==0;
		}

//2.删除		
		public int del(int pos) {					
			if (isEmpty()) {
				System.out.println("linklist is empty");
				return -1;
			}
			int num=1;
			Node pNode=head;
			while(num<pos)
			{
			pNode=pNode.next;
			num++;	
			}
			pNode.next=pNode.next.next;
			return pNode.next.data;		
			
		}
		

		

		public void printAll() {//输出
			Node p=head.next;			//建一个往后打印的节点
			while(p!=null)				//判断pNode是否为空值
			{
				System.out.print(p.data+" ");	//打印数值
			 p=p.next;			//往后挪
			}
		
		System.out.println(" ");
		}
//3.查找		
		public int find (int obj) {
		if(isEmpty())
		{
			System.out.println("linklist is empty");
			return 0;
		}
			Node p=head.next;
		
		int num=1;
		p = head.next;
			while(p!=null) {
				if (p.data!=obj) {
					p=p.next;
					num++;
				}
				else break;
				
				}
			
			return num;
		}
//4.反转
		public void reversal() {
			Node q=head;
			Node p=head.next;
			Node newhead = new Node(null);
			
			while(p != null) {
				q = p;
				p= p.next;//p往后移（不要理解为赋值）
				q.next=newhead.next; 
				newhead.next=q;
			}
			head=newhead;
		}	
		
		
		

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	singlelinklist list1=new singlelinklist();
	for (int i = 1; i < 6; i++) {
		list1.addtotial(i*5);	
	}
	System.out.println("原先的链表");
	list1.printAll();
	
	System.out.println("插入后的链表");
	list1.add(20, 2); //在第二位里插入20
	list1.printAll();
	
	System.out.println("删除链表的第二位");
	list1.del(2);
	list1.printAll();
	
	
//	System.out.println("尾插法后的链表");
//	list1.addtotial(6);
//	list1.printAll();
//	
	
	System.out.println("查找到obj= "+list1.find(15));
	
	System.out.println("反转后");
	list1.reversal();
	list1.printAll();
//	System.out.println(list1.getvalue(2));
//	list1.modify(36, 1);
//	
	
//	list1.getHead();
	
	
	}



	}


