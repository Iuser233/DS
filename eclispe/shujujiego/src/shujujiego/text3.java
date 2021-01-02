package shujujiego;

import java.util.Scanner;

public class text3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//将从键盘输入的数值放入数组中		
		int[] nums = new int[4];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
//假设数组中第一个数为最大/最小元素，用for进行遍历
		int max = nums[0];
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
			if (min > nums[i]) {
				min = nums[i];
			}
		}

		System.out.println(max);
		System.out.println(min);
	}

}
