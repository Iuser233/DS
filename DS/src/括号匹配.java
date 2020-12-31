import java.util.Stack;

public class ����ƥ�� {
	private static boolean math(String s) {
		Stack<Character> stack=new Stack<Character>();
		int len=s.length();
		for (int i = 0; i < len; i++) {
			char ch=s.charAt(i);
			if (ch=='['||ch=='('||ch=='{') {
				stack.push(ch);
			}else {
				if (stack.isEmpty()) {
					return false;
				}else {
					char ele=stack.pop();
					if (ele =='['&&ch !=']') {
						return false;
					}
					if (ele =='('&&ch !=')') {
						return false;
					}
					if (ele =='{'&&ch !='}') {
						return false;
					}
				}
			}
		}
		
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		String string="{(([{}]))}";
		System.out.println(math(string));
	}
}
