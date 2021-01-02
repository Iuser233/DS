package shujujiego;

import java.util.Scanner;

public class text5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);
		int[] nums = new int[8];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = inputScanner.nextInt();
		}
//求和
		double sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
//求最大值最小值
		double max = nums[0];
		double min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
			if (min > nums[i]) {
				min = nums[i];
			}
		}

		double ave = 0;
		ave = (sum - max - min) / 6;
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
		System.out.println(ave);

	}

}
