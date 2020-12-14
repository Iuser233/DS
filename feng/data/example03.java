package data;
//顺序表的建立（思路：先构造方法，在往方法里添加数据实现自己想要的）

public class example03 {
private int[] data ;
private int count ;
private int maxsize = 10;  //
//初始化
public example03() { 
	count = 0;
	data = new int[maxsize]; 
	
	
}
//一、定义插入方法	
public 	  boolean add(int obj,int pos) {
	if(pos<1 || pos>count+1) {   //向里插入count的范围+1
		System.out.println("pos值不合法");
		return false;
		
	}
	//判断数组是否满
	if( isFull()) {
		System.out.println("is Full");
		int[] p  =  new int[count*2];
		for(int i = 0; i< count;i++) { //把原来的数一个个放到扩大后的里面
			
			p[i] = data[i]; //p只是起了辅助作用
			data = p;
		}
	}
		
		//（1）插入
		for(int i = count; i >= pos;i--) {
			data[i] =  data[i-1];  //data往后移动（如data3=data2中data2取代了data3的位置，data3变成了data4）
		}


        data[pos-1]=obj;		//插入obj,pos-1是我要插入的位置
		count++;
		return true;
			
		
}
    //是否满
	private boolean isFull() {
		
		return count == data.length;
	
}
	
	//表的大小
	public int count() { 
		return count;
	}
	//清空顺序表
	public boolean clear() {                                   
		count=0;
		return true;
	}
	
	//顺序表的正序
	
	//二、定义删除的构造方法
	public boolean remove(int pos) {
		if(isEmpty()) {
			System.out.println("顺序表为空，无法执行操作");
			
		}
		else {
			if(pos<1 || pos>count) { //删除的话count的范围是count
				System.out.println("pos值不合法");
			}}

			for(int i = pos; i <= count ; i++) {//pos是我要删除的位置
				data[i-1] = data[i];	//往前移如data3取代了data2的位置,data2被干掉了
			}
			
			count--;
			return true;
		}
	//是否为空
		public boolean isEmpty() {
			return count == data.length;
		
		}
		 
		
	
	//三、顺序表的查找	
	  public int find(int obj) {
		  if(isEmpty()) {
			  System.out.println("顺序表为空");
			  return -1;
		  }
		  else {
			  for(int i = 0; i<count;i++) {
				  if(data[i] == obj) {
					  //obj是我要查的位置，一个一个的查
				  
				  return i+1;
				  }
			  }
		  }
		  return -1;
		  
		  
	  }
      //输出
	  public void printAll() {
			for (int i = 0; i < count; i++) {
				System.out.print(data[i] + " ");
			}
			System.out.println(" ");
			
		}
	  //获取
	  public int get(int pos) {
			if (pos < 1 || pos > count) {
				throw new IndexOutOfBoundsException("pos is error");

			}
			return data[pos - 1];

		}
	
	public static void main(String[] args) {
       example03 list1 = new example03();//实例对象
       for(int i = 1; i<=6;i++) {
    	   list1.add(i*2, i);
       }
       System.out.println("原先的顺序表");
    list1.printAll();
    
    
    
       System.out.println("删除后的顺序表");
	list1.remove(1);
	list1.printAll();
	
		System.out.println("查找元素的位序为："+list1.find(4));
	
		System.out.println("插入后的顺序表");
	list1.add(3, 2); //在第二个里插入3
	list1.printAll();
	
	System.out.println(list1.clear());
	
		

	}
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}
	

}
