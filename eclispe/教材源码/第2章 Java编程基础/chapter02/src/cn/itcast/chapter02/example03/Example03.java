package cn.itcast.chapter02.example03;
/**
 * 表达式类型自动提升
 */
public class Example03 {
	public static void main(String[] args) {
		byte b1 = 3; // 定义一个byte类型的变量
		byte b2 = 4;
		byte b3 = (byte) (b1 + b2); // 两个byte类型变量相加，赋值给一个byte类型变量
		System.out.println("b3=" + b3);
	}
}