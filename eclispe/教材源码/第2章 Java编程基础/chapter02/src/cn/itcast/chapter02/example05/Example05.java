package cn.itcast.chapter02.example05;
/**
 * 赋值运算符中的自动类型转换
 */
public class Example05 {
	public static void main(String[] args) {
		short s = 3;
		int i = 5;
		s += i;
		System.out.println("s = " + s);
	}
}