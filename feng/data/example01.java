package data;

public class example01 {
   private int[] data;  //数组存放数据
   final int maxsize=10;
   private int count;
   public example01() {
	   data = new int[maxsize];
	   count=0;
   }
   public example01(int n) {
	   data = new int[n];
	   count=0;
   } 
   public boolean add(int x , int pos) {
	   if(pos<1 || pos>count+1) {
		   System.out.println("pos error");
		   return false;
	   }
	   if(isFull()) {
		   System.out.println("full");
		   return false;
	   }
	   for (int i = count; i >= pos; i--) {
		   data[i] = data[i-1];
	   }
	data[pos - 1]=x;
	count++;
	return true;
   } 
   
   public boolean isFull() {
	   return count == data.length;
   }
   
   public int size() {
	   return count;	   
   }
 public void nextorder() {
	 for(int i = 0; i < count;i++) {
		 System.out.println((data[i] + " "));
	 }
	 System.out.println();
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		example01 list1 = new example01();
        int a[] = new int[] {1,3,5,6,8,9};
        list1.add(2,1);
         // System.out.println(list1);
        list1.nextorder();
	}

}
