package cn.itcast.chapter02.example27;
/**
 * 数组越界异常
 */
public class Example27 {
	public static void main(String[] args) {
		int[] arr = new int[4]; // 定义一个长度为4的数组
		System.out.println("arr[0]=" + arr[4]); // 通过角标4访问数组元素
	}
}