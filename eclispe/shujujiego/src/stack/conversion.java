package stack;

public class conversion {
public static void conversion(int N,int r) {
	squencestack<Integer> stack1=new squencestack<Integer>();
	while (N!=0) {
		stack1.push(N%r);
		N=N/r;
		
	}
	
	while (!stack1.isEmpty()) {
/*
 * 		stack1.printstack();//stack.printstack?
 * 如果直接输出就一直不会结束
 */
		System.out.print(stack1.pop());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
conversion(12, 2);
	}

}
