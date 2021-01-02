package cn.itcast.chapter02.example23;
/**
 * 方法的重载
 */
public class Example23 {
	public static void main(String[] args) {
		// 下面是针对求和方法的调用
		int sum1 = add(1, 2);
		int sum2 = add(1, 2, 3);
		double sum3 = add(1.2, 2.3);
		// 下面的代码是打印求和的结果
		System.out.println("sum1=" + sum1);
		System.out.println("sum2=" + sum2);
		System.out.println("sum3=" + sum3);
	}

	// 下面的方法实现了两个整数相加
	public static int add(int x, int y) {
		return x + y;
	}

	// 下面的方法实现了三个整数相加
	public static int add(int x, int y, int z) {
		return x + y + z;
	}

	// 下面的方法实现了两个小数相加
	public static double add(double x, double y) {
		return x + y;
	}
}