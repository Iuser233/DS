package cn.itcast.chapter02.example25;
/**
 * 为数组的元素赋值
 */
public class Example25 {
	public static void main(String[] args) {
		int[] arr = new int[4]; // 定义可以存储4个元素的整数类型数组
		arr[0] = 1; // 为第1个元素赋值1
		arr[1] = 2; // 为第2个元素赋值2
		// 依次打印数组中每个元素的值
		System.out.println("arr[0]=" + arr[0]);
		System.out.println("arr[1]=" + arr[1]);
		System.out.println("arr[2]=" + arr[2]);
		System.out.println("arr[3]=" + arr[3]);
	}
}