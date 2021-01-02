package stack;

import java.util.Stack;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
squencestack stack1=new squencestack();
int []a={1,5,65,44,};
for (int i = 0; i < a.length; i++) {
	stack1.push(a[i]);
}
stack1.printstack();
System.out.println(stack1.pop());
stack1.printstack();
	}
	//°ü×°
	Stack<Character> stack2=new Stack<Character>();
	

}
