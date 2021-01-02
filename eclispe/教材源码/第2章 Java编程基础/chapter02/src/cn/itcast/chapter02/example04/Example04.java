package cn.itcast.chapter02.example04;
/**
 * 变量的作用域
 */
public class Example04 {
	public static void main(String[] args) {
		int x = 12; // 定义了变量x
		{
			int y = 96; // 定义了变量y
			System.out.println("x is " + x); // 访问变量x
			System.out.println("y is " + y); // 访问变量y
		}
		//y = x; // 访问变量x，为变量y赋值
		System.out.println("x is " + x); // 访问变量x
	}
}
