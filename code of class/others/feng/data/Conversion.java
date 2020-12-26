package data;
/*
 * 栈的应用（数的转换）
 */
import java.util.Stack;

public class Conversion {
	public static void conversion(int N,int r) {
		Stack<Integer> stack1=new Stack<Integer>();
		while (N!=0) {
			stack1.push(N%r);
			N=N/r;
			
		}
		
		while (!stack1.isEmpty()) {

			System.out.print(stack1.pop());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conversion(12, 2);
		
	}

}
