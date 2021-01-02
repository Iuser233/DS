package cn.itcast.chapter02.example26;
/**
 * 数组静态初始化
 */
public class Example26 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 }; // 静态初始化
		// 依次访问数组中的元素
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println("arr[3] = " + arr[3]);
	}
}