package stack;

import java.util.Iterator;
import java.util.Stack;

public class text00 {
	public static boolean match1(String s) {
		Stack<Character> stack1=new Stack<Character>();
for (char c  : s.toCharArray()) {
	if (c=='(') {
		stack1.push(')');
	}else if (c=='(') {
		stack1.push(')');
	} else if (c=='(') {
		stack1.push(')');
	}else if (stack1.isEmpty()||stack1.pop()!=c) {
		return false;
	}
	
}
return stack1.isEmpty();
	}
private static boolean match(String s) {
	/*
	 * ()=char
	 */
	Stack<Character> stack=new Stack<Character>();
	/*֪��
	 * ��֪ѭ������
	 */
	int len=s.length();
	for (int i = 0; i < len; i++) {
		/*
		 * ��char
		 */
		char ch=s.charAt(i);
		if (ch=='('||ch=='['||ch=='{') {
			stack.push(ch);
		}else {
			if (stack.isEmpty()) {
				return false;
			}else {
				/*
				 * ���ջ��Ԫ��
				 */
				char eletop=stack.pop();
				if (eletop=='('&&ch!=')') {
					return false;
				}if (eletop=='['&&ch!=']') {
					return false;
				}if (eletop=='{'&&ch!='}') {
					return false;
				}
			}
		}
		
		
	}
	return stack.isEmpty();
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String string="{})([]";
	System.out.println(match(string));

}
}