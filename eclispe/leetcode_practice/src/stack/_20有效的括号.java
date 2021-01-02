package stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class _20有效的括号 {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="[()][][]";
solution20 s1=new solution20();
System.out.println(s1.isValid(s));

	}

}
class solution20{
	/*
	 * 1.先进行对字符串s个数的判断
	 * 取余为1时直接错误（）{}[]
	 */
	public boolean isValid(String s) {
		int n= s.length();
		if (n%2==1) {
			return false;
		}
		/*
		 * 建立一个hash表 pairs存放）（···的键值对应关系
		 */
		Map<Character, Character> pairs=new HashMap<Character, Character>(){
			{
				put(')', '(');
				put(']', '[');
				put('}', '{');
			}
		};
		/*
		 * deque什么意思不知道>=<
		 * deque 双向端口
		 * 建立了一个链表类型的stack（存放字符串）
		 */
		Deque<Character> stack=new LinkedList<Character>();
		
		for (int i = 0; i < n; i++) {
		/*
		 * char的charAt方法>=<
		 * 应该是将s字符串中的每个字符放到ch中把*=*
		 */
			char ch=s.charAt(i);
			/*
			 * 如果hash表pairs包含字符串ch
			 * 并且？？？？？？？？
			 */
			if (pairs.containsKey(ch)) {
				if (stack.isEmpty()||stack.peek()!=pairs.get(ch)) {
					return false;
				}
				stack.pop();
			}else {
				stack.push(ch);
			}
		}
		return stack.isEmpty();
	}
}
