package data;
/*
 * 括号匹配
 */
import java.util.Stack;


public class example04 {
  private static boolean match(String s) {
  Stack<Character> stack = new Stack<Character>();
  int len = s.length();  //定义长度
  for(int i=0;i<len;i++) { //？
	  char ch = s.charAt(i); //放到ch字符型变量里？？
	  if(ch =='(' ||  ch=='[' || ch=='{' ) {
		  stack.push(ch);  //入栈（放入左括号）
	  }
	  else {
		  if(stack.isEmpty()) { //为空时说明没有期待的左括号
			  return false;			  
		  }
		  else {
		       char ele =stack .pop();
		  if(ele == '(' && ch != ')' )
		  return false;
		  
		  if(ele == '[' && ch != ']' )
		  return false;
			
		  if(ele == '{' && ch != '}' );
		  return false; 
		  }
		
		
		  
	  }
	  
  }
return false;
	
	
  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String string = "[]";
	System.out.println(match(string));//？
	}

	

}
