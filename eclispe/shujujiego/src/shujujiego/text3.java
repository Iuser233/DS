package shujujiego;

import java.util.Scanner;

public class text3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//���Ӽ����������ֵ����������		
		int[] nums = new int[4];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
//���������е�һ����Ϊ���/��СԪ�أ���for���б���
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
