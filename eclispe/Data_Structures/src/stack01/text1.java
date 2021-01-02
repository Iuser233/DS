package stack01;

import java.util.Stack;

import stack.squencestack;

public class text1 {
	/*
	 * ¿®ª°∆•≈‰
	 */
public static boolean matching(String s) {
	Stack< Character> stack1=new Stack<Character>();
	int n=s.length();
	for (int i = 0; i <n; i++) {
		char ch=s.charAt(i);
		if (ch=='['||ch=='('||ch=='{') {
			stack1.push(ch);
			
	}else {
		if (stack1.isEmpty()) {
			return false;
		}else {
			char ele=stack1.pop();
			if (ele=='}'&&ch!='{') {
				return false;
			}
			if (ele=='['&&ch!=']') {
				return false;
			}if (ele=='('&&ch!=')') {
				return false;
			}
		}
	}
	
		
	}
	return stack1.isEmpty();
}

/*
 *  ˝÷µ◊™ªª
 * 
 */
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
String s2= "[][[])(";
System.out.println(matching(s2));

sequencestack sequencestack1=new sequencestack();
sequencestack1.push(1);
sequencestack1.printstack();
linkstack sLinkstack1=new linkstack();
sLinkstack1.push(5);
sLinkstack1.printall();

conversion(12, 2);
	}

}
