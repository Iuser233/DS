package cn.itcast.chapter02.example08;
/**
 * if...else...语句的使用
 */
public class Example08 {
	public static void main(String[] args) {
		int num = 19;
		if (num % 2 == 0) {
			// 判断条件成立，num被2整除
			System.out.println("num是一个偶数");
		} else {
			System.out.println("num是一个奇数");
		}
	}
}