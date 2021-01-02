package cn.itcast.chapter02.example13;
/**
 * do...while循环
 */
public class Example13 {
	public static void main(String[] args) {
		int x = 1; // 定义变量x，初始值为1
		do {
			System.out.println("x = " + x); // 打印x的值
			x++; // 将x的值自增
		} while (x <= 4); // 循环条件
	}
}