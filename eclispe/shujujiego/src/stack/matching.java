package stack;

public class matching {
public static boolean matching(String s) {
	while (s.contains("()")||s.contains("[]")||s.contains("{}")) {
		s=s.replace("()", "");
		s=s.replace("[]", "");
		s=s.replace("{}", "");
		
	}
	return s.isEmpty();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="[[()()]]";
System.out.println(matching(str1));
//System.out.println(4%4);
	}

}
