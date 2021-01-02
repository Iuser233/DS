package cn.itcast.chapter02.example18;
/**
 * continue语句
 */
public class Example18 {
	public static void main(String[] args) {
		int sum = 0; // 定义变量sum，用于记住和
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) { // i是一个偶数，不累加
				continue; // 结束本次循环
			}
			sum += i; // 实现sum和i的累加
		}
		System.out.println("sum = " + sum);
	}
}