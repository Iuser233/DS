package cn.itcast.chapter02.example29;
/**
 * for循环遍历数组
 */
public class Example29 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 }; // 定义数组
		// 使用for循环遍历数组的元素
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); // 通过索引访问元素
		}
	}
}